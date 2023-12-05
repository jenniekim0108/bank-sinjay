package com.enigma.repository;

import com.enigma.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaksiRepo extends JpaRepository<Transaksi,String> {

}
