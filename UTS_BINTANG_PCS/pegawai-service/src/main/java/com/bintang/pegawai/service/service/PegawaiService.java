/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.pegawai.service.service;

import com.bintang.pegawai.service.entity.Pegawai;
import com.bintang.pegawai.service.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Bintang
 */
@Service
public class PegawaiService {

    @Autowired
    private PegawaiRepository pegawaiRepository;

    public Pegawai savePegawai(Pegawai pegawai) {
        return pegawaiRepository.save(pegawai);

    }

    public Pegawai findPegawaiById(Long pegawaiId) {
        return pegawaiRepository.findByPegawaiId(pegawaiId);
    }
}
