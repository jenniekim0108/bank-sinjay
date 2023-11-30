package com.enigma.controller;

import com.enigma.dto.response.CommonResponse;
import com.enigma.entity.Nasabah;
import com.enigma.service.NasabahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nasabah")
public class NasabahController {

    private final NasabahService nasabahService;

    @Autowired
    public NasabahController(NasabahService nasabahService){
        this.nasabahService = nasabahService;
    }

    @GetMapping
    public ResponseEntity<CommonResponse<List<Nasabah>>> findAllNasabah(){
        List<Nasabah> ns = nasabahService.GetListNasabah();
        CommonResponse<List<Nasabah>> response = new CommonResponse<>("Successfully shown all Nasabah", HttpStatus.OK.value(),ns);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommonResponse<Nasabah>> getNasabahById(@PathVariable Integer id){
        Nasabah ns =  nasabahService.GetListNasabahById(id);
        CommonResponse<Nasabah> response = new CommonResponse<>("Succesfully shown Nasabah by Id", HttpStatus.OK.value(),ns);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping
    //requestbody digunakan untuk menangkap data di body
    public ResponseEntity<CommonResponse<Nasabah>> createNewNasabah(@RequestBody Nasabah nasabah){
        Nasabah ns = nasabahService.RegisterNewNasabah(nasabah);
        CommonResponse<Nasabah> response = new CommonResponse("Succesfully create new Nasabah", HttpStatus.OK.value(), ns);
        //Response Entity adalah representasi class response http pada spring http
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

//    @GetMapping("/delete/{id}")
    @DeleteMapping("/{id}")
    public ResponseEntity<CommonResponse<Nasabah>> deleteNasabah(@PathVariable Integer id){
        Nasabah ns = nasabahService.DeleteNasabahById(id);
        CommonResponse<Nasabah> response = new CommonResponse<>("Succesfully deleted corresponding nasabah", HttpStatus.OK.value(),ns);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }
}
