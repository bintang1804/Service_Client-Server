/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.pengembalian.service.service;


import com.bintang.pengembalian.service.entity.Pengembalian;
import com.bintang.pengembalian.service.repository.PengembalianRepository;
import com.bintang.pengembalian.service.vo.ResponseTemplateVO;
import com.bintang.pengembalian.service.vo.ResponseTemplateVOPinjam;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Bintang
 */
@Service
public class PengembalianService {
    @Autowired
    private SimpleDateFormat formatTanggal;
    
    @Autowired
    private PengembalianRepository pengembalianRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Pengembalian savePengembalian(Pengembalian pengembalian) throws ParseException{
         
        ResponseTemplateVOPinjam peminjaman = restTemplate.getForObject("http://localhost:8001/peminjaman/"
                +pengembalian.getPeminjamanId(), ResponseTemplateVOPinjam.class);
        String tglSekarang = formatTanggal.format(new Date());
        long terlambat = kurangTanggal(tglSekarang,peminjaman.getPeminjaman().getTglKembali());
        double denda = terlambat * 500;
        pengembalian.setTerlambat((int)terlambat);
        pengembalian.setTglDiKembalikan(tglSekarang);
        pengembalian.setDenda(denda);
        return pengembalianRepository.save(pengembalian);
    }
    
    public ResponseTemplateVO getPengembalian(Long pengembalianId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Pengembalian pengembalian = pengembalianRepository.findByPengembalianId(pengembalianId);
        ResponseTemplateVOPinjam peminjaman = restTemplate.getForObject("http://localhost:8001/peminjaman/"
                +pengembalian.getPeminjamanId(), ResponseTemplateVOPinjam.class);
        vo.setPengembalian(pengembalian);
        vo.setPeminjaman(peminjaman.getPeminjaman());
        return vo;
    }

    private long kurangTanggal(String tglAwal, String tglAkhir) throws ParseException {
//         SimpleDateFormat formatTanggal = new SimpleDateFormat("dd/MM/yyyy");
       Date tgl1 = formatTanggal.parse(tglAwal);
       Date tgl2 = formatTanggal.parse(tglAkhir);
       long selisih = tgl1.getTime() - tgl2.getTime();
       long selisihhari = selisih / (24 * 60 * 60 * 1000);
       return selisihhari;
    }
    
    public List<Pengembalian> getAllPengembalian(){
        return pengembalianRepository.findAll();
    }
    
    public void deletePengembalian(Long pengembalianId){
       pengembalianRepository.deleteById(pengembalianId);
    }
    
    public Pengembalian updatePengembalian(Pengembalian pengembalian){
        return pengembalianRepository.save(pengembalian);
    }
}
