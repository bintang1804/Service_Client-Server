/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.pegawai.service.repository;

import com.bintang.pegawai.service.entity.Pegawai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bintang
 */
@Repository
public interface PegawaiRepository extends JpaRepository<Pegawai, Long> {

    public Pegawai findByPegawaiId(Long pegawaiId);
}
