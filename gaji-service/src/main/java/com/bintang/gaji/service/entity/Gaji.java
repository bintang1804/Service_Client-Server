/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

public class Gaji {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gajiId;
    private Long karyawanId;
    private Long golonganId;
    private String gajiTanggal;
    private Long tunjanganAnak;
    private Long tunjanganSuamiIstri;
    private Long totalGaji;

}
