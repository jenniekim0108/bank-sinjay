package com.enigma.service;

import com.enigma.entity.Nasabah;
import java.util.List;

public interface NasabahService {
    Nasabah RegisterNewNasabah(Nasabah nasabah);
    List<Nasabah> GetListNasabah();
    Nasabah GetListNasabahById(int id);
    Nasabah DeleteNasabahById(int id);
}
