package com.enigma.service.impl;

import com.enigma.entity.Rekening;
import com.enigma.repository.RekeningRepository;
import com.enigma.service.RekeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RekeningServiceImpl implements RekeningService {
    private final RekeningRepository rekeningRepository;

    @Autowired
    public RekeningServiceImpl(RekeningRepository rekeningRepository) {
        this.rekeningRepository = rekeningRepository;
    }

    @Override
    public List<Rekening> getListRekening(){
        return rekeningRepository.getAllRekening();
    }

    public Rekening addRekening(Rekening rekening){
        return rekeningRepository.saveRekening(rekening);
    }

    public Rekening getRekeningByNoRek(String noRek){
        return rekeningRepository.getRekeningByNomor(noRek);
    }

    public Rekening deleteRekeningByNoRek(String noRek){
        return rekeningRepository.deleteRekeningByNomor(noRek);
    }
}
