/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.golongan.service.service;

import com.bintang.golongan.service.entity.Golongan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;
import com.bintang.golongan.service.repository.GolonganRepository;

/**
 *
 * @author Bintang
 */
@Service
public class GolonganService {

    @Autowired
    private GolonganRepository golonganRepository;

    
    public Golongan saveGolongan(Golongan golongan) {
        return golonganRepository.save(golongan);

    }

    public Golongan findGolonganById(Long golonganId) {
        return golonganRepository.findByGolonganId(golonganId);
    }
}
