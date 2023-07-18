/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.golongan.service.controller;

import com.bintang.golongan.service.service.GolonganService;
import com.bintang.golongan.service.entity.Golongan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Bintang
 */
@RestController
@RequestMapping("/golongan")

public class GolonganController {

    @Autowired
    private GolonganService golonganService;

    @PostMapping("/")
    public Golongan saveGolongan(@RequestBody Golongan golongan) {
        return golonganService.saveGolongan(golongan);
    }

    @GetMapping("/{id}")
    public Golongan findGolonganById(@PathVariable("id") Long golonganId) {
        return golonganService.findGolonganById(golonganId);
    }
}
