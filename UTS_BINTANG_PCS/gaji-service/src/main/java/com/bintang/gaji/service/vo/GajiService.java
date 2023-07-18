/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.vo;

import com.bintang.gaji.service.entity.Gaji;
import com.bintang.gaji.service.entity.Pegawai;
import com.bintang.gaji.service.repository.GajiRepository;
import com.bintang.gaji.service.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.bintang.gaji.service.repository.GajiRepository;


/**
 *
 * @author Bintang
 */
@Service
public class GajiService {

    @Autowired
    private GajiRepository gajiRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Gaji saveGaji(Gaji gaji) {
        return gajiRepository.save(gaji);
    }

    public ResponseTemplateVO getGaji(Long gajiId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Gaji gaji = 
                gajiRepository.findByGajiId(gajiId);
        Pegawai pegawai = restTemplate.getForObject("http://localhost:8090/pegawai/"
                + gaji.getPegawaiId(), Pegawai.class);
        vo.setGaji(gaji);
        vo.setPegawai(pegawai);
        return vo;
    }

    
}
