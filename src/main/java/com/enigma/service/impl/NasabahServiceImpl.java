package com.enigma.service.impl;

import com.enigma.entity.Nasabah;
import com.enigma.repository.CustomNasabahRepo;
import com.enigma.repository.NasabahRepo;
import com.enigma.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NasabahServiceImpl implements NasabahService  {

//    private final NasabahRepository nasabahRepository;
    private final NasabahRepo repo;
    private final CustomNasabahRepo customRepo;

    @Autowired
//    public NasabahServiceImpl(NasabahRepository nasabahRepository){
//        this.nasabahRepository = nasabahRepository;
//    }
    public NasabahServiceImpl(NasabahRepo repo, CustomNasabahRepo customRepo){
        this.repo = repo;
        this.customRepo = customRepo;
    }
    @Override
    public Nasabah RegisterNewNasabah(Nasabah nasabah) {
//        return nasabahRepository.save(nasabah);
        return repo.saveAndFlush(nasabah);
        //saveandflush bawaan dari JPA, langsung menyimpan dan flush(mengirim data) ke database
    }

//    @Override
//    public List<Nasabah> GetListNasabah() {
//        return null;
//    }

    @Override
    public List<Nasabah> GetListNasabah(int page){
//        return nasabahRepository.getAll();
//        untuk melakukan sorting berdasarkan nama secara ascending
        Page<Nasabah> pagingData = repo.findAll(PageRequest.of(page, 2, Sort.Direction.ASC, "name"));
        return pagingData.getContent();
    }

    @Override
    public Nasabah GetListNasabahById(String id) {
//        return nasabahRepository.getId(id);
        return repo.findById(id).orElse(null);
    }

    @Override
    public void DeleteNasabahById(String id){
//        return nasabahRepository.deleteId(id);
        try{
            repo.deleteById(id);
        } catch(EmptyResultDataAccessException e){
            System.out.println("Delete tidak berhasil, Id " + id + " tidak ditemukan");
        }

    }

    @Override
    public List<Nasabah> GetListNasabahByAddress(String address) {
        return repo.findByAddress(address);
    }

    @Override
    public List<Nasabah> GetListNasabahByCif(String cif) {
        return customRepo.findByCif(cif);
    }


}
