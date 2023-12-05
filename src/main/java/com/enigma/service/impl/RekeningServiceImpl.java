package com.enigma.service.impl;

import com.enigma.dto.request.NewRekening;
import com.enigma.entity.Nasabah;
import com.enigma.entity.Rekening;
import com.enigma.repository.RekeningRepo;
import com.enigma.repository.RekeningRepository;
import com.enigma.service.NasabahService;
import com.enigma.service.RekeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Component
public class RekeningServiceImpl implements RekeningService {
    private final RekeningRepository rekeningRepository;
    private final RekeningRepo rekeningRepo;
    private final NasabahService nasabahService;

    @Autowired
    public RekeningServiceImpl(RekeningRepository rekeningRepository, RekeningRepo rekeningRepo, NasabahService nasabahService) {
        this.rekeningRepository = rekeningRepository;
        this.rekeningRepo = rekeningRepo;
        this.nasabahService = nasabahService;
    }

    @Override
    public List<Rekening> getListRekening(){
        return rekeningRepo.findAll();
    }

//    @Override
//    public List<Rekening> getListRekening(int page) {
//        return null;
//    }


    public Rekening addRekening(NewRekening newRekening){
        Rekening rekening1= new Rekening();
        Nasabah nasabah = nasabahService.GetListNasabahById(newRekening.getNasabahId());
        rekening1.setNoRek(newRekening.getNoRek());
        rekening1.setJenisRek(newRekening.getJenis());
        if(newRekening.getSaldo()<50000){
            throw new ResponseStatusException(HttpStatus.BAD_GATEWAY, "Minimal saldo 50 ribu yaa");
        }
        rekening1.setSaldo(newRekening.getSaldo());
        rekening1.setNasabah(nasabah);
        return rekeningRepo.saveAndFlush(rekening1);
    }

    public Rekening getRekeningByNoRek(String noRek){
        return rekeningRepository.getRekeningByNomor(noRek);
    }

    public Rekening deleteRekeningByNoRek(String noRek){
        return rekeningRepository.deleteRekeningByNomor(noRek);
    }
}
