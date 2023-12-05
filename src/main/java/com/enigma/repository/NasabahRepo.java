package com.enigma.repository;

import com.enigma.entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.awt.print.Pageable;
import java.util.List;

//interface parent interface pake extends
//interface parent class pake implements
    public interface NasabahRepo extends JpaRepository<Nasabah, String>, PagingAndSortingRepository<Nasabah, String>, JpaSpecificationExecutor<Nasabah> {
    List<Nasabah> findByAddress(String address);
//    untuk menambahkan page
//    List<Nasabah> findByAddress(String address, Pageable page);

}
