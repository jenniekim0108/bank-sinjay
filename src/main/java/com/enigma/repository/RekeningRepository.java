package com.enigma.repository;

import com.enigma.entity.Nasabah;
import com.enigma.entity.Rekening;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RekeningRepository {
    private List<Rekening> listRekening = new ArrayList<>();

    public Rekening saveRekening(Rekening rekening) {
        listRekening.add(rekening);
        return rekening;
    }

    public List<Rekening> getAllRekening() {
        return listRekening;
    }

    public Rekening getRekeningByNoRek(String NomorRekening){
        for(Rekening rek : listRekening){
            if(rek.getNoRek().equals(NomorRekening)){
                return rek;
            }
        }
        return null;
    }

    public Rekening deleteRekeningByNomor(String NomorRekening){
        for(Rekening rek: listRekening){
            if(rek.getNoRek().equals(NomorRekening)){
                listRekening.remove(rek);
            }
        }
        return null;
    }

}
