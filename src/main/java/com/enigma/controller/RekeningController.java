package com.enigma.controller;

import com.enigma.dto.response.CommonResponse;
import com.enigma.entity.Rekening;
import com.enigma.service.RekeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/rekening")
public class RekeningController {
    private final RekeningService rekeningService;

    @Autowired
    public RekeningController(RekeningService rekeningService) {
        this.rekeningService = rekeningService;
    }

    @GetMapping
    public ResponseEntity<CommonResponse<List<Rekening>>> getAllRekening(){
        List<Rekening> rek = rekeningService.getListRekening();
        CommonResponse<List<Rekening>> response = new CommonResponse<>("Succesfully shown all Rekening", HttpStatus.OK.value(), rek);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CommonResponse<Rekening>> tambahRekening(@RequestBody Rekening rekening){
        rekeningService.addRekening(rekening);
        CommonResponse<Rekening> response = new CommonResponse<>("Succesfully add new Rekening", HttpStatus.OK.value(), rekening);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{noRek}")
    public ResponseEntity<CommonResponse<Rekening>> getRekeningByNomor(@PathVariable String noRek){
        Rekening rek = rekeningService.getRekeningByNoRek(noRek);
        CommonResponse<Rekening> response = new CommonResponse<>("Succesfully shown correspondent Rekening", HttpStatus.OK.value(), rek);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/{noRek}")
    public ResponseEntity<CommonResponse<Rekening>> deleteRekeningByNomor(@PathVariable String noRek){
        Rekening rek = rekeningService.deleteRekeningByNoRek(noRek);
        CommonResponse<Rekening> response = new CommonResponse<>("Succesfully deleted correspondent Rekening", HttpStatus.OK.value(), rek);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
