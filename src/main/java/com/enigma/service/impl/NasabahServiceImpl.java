package com.enigma.service.impl;

import com.enigma.entity.Nasabah;
import com.enigma.repository.NasabahRepository;
import com.enigma.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class NasabahServiceImpl implements NasabahService  {

    private final NasabahRepository nasabahRepository;

    @Autowired
    public NasabahServiceImpl(NasabahRepository nasabahRepository){
        this.nasabahRepository = nasabahRepository;
    }
    @Override
    public Nasabah RegisterNewNasabah(Nasabah nasabah) {
        return nasabahRepository.save(nasabah);
    }

    @Override
    public List<Nasabah> GetListNasabah(){
        return nasabahRepository.getAll();
    }

    @Override
    public Nasabah GetListNasabahById(int id) {
        return nasabahRepository.getId(id);
    }

    @Override
    public Nasabah DeleteNasabahById(int id){
        return nasabahRepository.deleteId(id);
    }

}
