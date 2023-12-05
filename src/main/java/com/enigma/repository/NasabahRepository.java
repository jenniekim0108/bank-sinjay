package com.enigma.repository;
import com.enigma.entity.Nasabah;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class NasabahRepository {
    private List<Nasabah> listNasabah = new ArrayList<>();

    public Nasabah save(Nasabah nasabah) {
        //membuat id auto increment
//        nasabah.setId(listNasabah.size() + 1);
        nasabah.setIsActive(true);
        listNasabah.add(nasabah);
        return nasabah;
    }

    public List<Nasabah> getAll(int page) {
        return listNasabah;
    }

    public Nasabah getId(String targetId) {
//        for (int i = 0; i < listNasabah.size(); i++) {
//            Nasabah ns = listNasabah.get(i);
//            Integer currentId = ns.getId();
//            if (currentId == targetId) {
//                return ns;
//            }
//        }
        for(Nasabah ns : listNasabah){
            if (ns.getId().equals(targetId)){
                return ns;
            }
        }
        return null;
    }

    public Nasabah deleteId(String targetId){
        for(Nasabah ns : listNasabah){
            if(ns.getId() == targetId){
                listNasabah.remove(ns);
                return ns;
            }
        }
        return null;
    }
}
