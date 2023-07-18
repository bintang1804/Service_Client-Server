/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.karyawan.service.repository;

import com.bintang.karyawan.service.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Bintang
 */
@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {

    public Karyawan findByKaryawanId(Long karyawanId);
}
