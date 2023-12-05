package com.enigma.service;

import com.enigma.dto.request.NewRekening;
import com.enigma.entity.Rekening;

import java.util.List;
import java.util.ArrayList;

public interface RekeningService {
//    List<Rekening> getListRekening(int page);
    List<Rekening> getListRekening();
    Rekening addRekening(NewRekening rekening);
    Rekening getRekeningByNoRek(String noRek);
    Rekening deleteRekeningByNoRek(String noRek);
}
