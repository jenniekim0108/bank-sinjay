package com.enigma.service;

import com.enigma.entity.Nasabah;
import java.util.List;

public interface NasabahService {
    Nasabah RegisterNewNasabah(Nasabah nasabah);
//    List<Nasabah> GetListNasabah();

    List<Nasabah> GetListNasabah(int page);

    Nasabah GetListNasabahById(String id);
    void DeleteNasabahById(String id);

    List<Nasabah> GetListNasabahByAddress(String address);
    List<Nasabah> GetListNasabahByCif(String cif);
}
