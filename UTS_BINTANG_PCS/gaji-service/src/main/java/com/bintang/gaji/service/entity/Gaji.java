/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private Long pegawaiId;
    private Long tanggal;
    private Long gapok;
    private Long tunj_anak;
    private Long tunj_istri;
    private Long gaji_bersih;

    public long getGapok() {
        return gapok;
    }

    public long getGajiBersih() {
        gaji_bersih = gapok + tunj_anak + tunj_istri;
        return gaji_bersih;
    }

}
