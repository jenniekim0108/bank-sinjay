package com.enigma.service;

import com.enigma.entity.Rekening;

import java.util.List;
import java.util.ArrayList;

public interface RekeningService {
    List<Rekening> getListRekening();
    Rekening addRekening(Rekening rekening);
    Rekening getRekeningByNoRek(String noRek);
    Rekening deleteRekeningByNoRek(String noRek);
}
