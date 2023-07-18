/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.pengembalian.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bintang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Peminjaman {
    private Long peminjamanId;
    private Long bukuId;
    private Long anggotaId;
    private String tglPinjam;
    private String tglKembali;
}
