package com.enigma.service.impl;

import com.enigma.dto.request.NewTransaksi;
import com.enigma.entity.Rekening;
import com.enigma.entity.Transaksi;
import com.enigma.repository.TransaksiRepo;
import com.enigma.service.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransaksiServiceImpl implements TransaksiService {
    private final TransaksiRepo transaksiRepo;

    @Autowired
    public TransaksiServiceImpl(TransaksiRepo transaksiRepo) {
        this.transaksiRepo = transaksiRepo;
    }

    @Override
    public Transaksi createNewTransaksi(NewTransaksi newTransaksi) {
        Transaksi transaksi = new Transaksi();

//        Rekening rekeningPengirim = new Rekening();
//        rekeningPengirim.setNoRek(newTransaksi.getRekPengirimId());
//        transaksi.setRekPengirim(rekeningPengirim);

        transaksi.setRekPengirim(new Rekening(newTransaksi.getRekPengirimId()));
        transaksi.setRekPenerima(new Rekening(newTransaksi.getRekPenerimaId()));

        transaksi.setJumlah(newTransaksi.getJumlah());
//        transaksi.setCreatedAt(transaksi.getCreatedAt());
        return transaksiRepo.saveAndFlush(transaksi);
    }
}
