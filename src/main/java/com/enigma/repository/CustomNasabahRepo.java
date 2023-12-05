package com.enigma.repository;

import com.enigma.entity.Nasabah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface CustomNasabahRepo {
    List<Nasabah> findByCif(String cif);
}
