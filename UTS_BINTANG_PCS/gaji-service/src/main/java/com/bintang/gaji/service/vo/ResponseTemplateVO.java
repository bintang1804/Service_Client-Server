/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.gaji.service.vo;

import com.bintang.gaji.service.entity.Gaji;
import com.bintang.gaji.service.entity.Pegawai;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bintang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {

    private Gaji gaji;
    private Pegawai pegawai;
}
