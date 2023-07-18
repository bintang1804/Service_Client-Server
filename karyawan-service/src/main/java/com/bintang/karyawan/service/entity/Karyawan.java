/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.karyawan.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bintang
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Karyawan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long karyawanId;
    private String karyawanNama;
    private String karyawanAlamat;

}
