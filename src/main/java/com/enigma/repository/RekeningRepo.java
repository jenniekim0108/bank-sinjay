package com.enigma.repository;

import com.enigma.entity.Rekening;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RekeningRepo extends JpaRepository<Rekening, String> {

}
