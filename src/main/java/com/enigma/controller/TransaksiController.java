package com.enigma.controller;

import com.enigma.dto.request.NewTransaksi;
import com.enigma.dto.response.CommonResponse;
import com.enigma.entity.Transaksi;
import com.enigma.service.TransaksiService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/trx")
public class TransaksiController {
    private final TransaksiService transaksiService;

    public TransaksiController(TransaksiService transaksiService) {
        this.transaksiService = transaksiService;
    }

    @PostMapping
    public ResponseEntity<CommonResponse<Transaksi>> createNewTransaksi(@RequestBody NewTransaksi newTransaksi){
        Transaksi newTrx = transaksiService.createNewTransaksi(newTransaksi);
        CommonResponse<Transaksi> response = new CommonResponse<>("Success create new transaction", HttpStatus.OK.value(), newTrx);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }
}
