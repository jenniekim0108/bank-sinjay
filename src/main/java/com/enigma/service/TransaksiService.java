package com.enigma.service;

import com.enigma.dto.request.NewTransaksi;
import com.enigma.entity.Transaksi;

public interface TransaksiService {
    Transaksi createNewTransaksi(NewTransaksi transaksi);
}
