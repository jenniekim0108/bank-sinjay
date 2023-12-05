package com.enigma.repository;

import com.enigma.entity.Nasabah;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.*;
import java.util.List;

@Repository
public class CustomNasabahRepoImpl implements CustomNasabahRepo {

    @Autowired
    private final NasabahRepo repo;

    public CustomNasabahRepoImpl(NasabahRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Nasabah> findByCif(String cif) {
        Specification<Nasabah> spec = new Specification<Nasabah>() {
            @Override
            public Predicate toPredicate(Root<Nasabah> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                Predicate p = criteriaBuilder.equal(root.get("cif"), cif);
                root.fetch("lstRekening", JoinType.INNER);
                return query.where(p).getRestriction();
            }
        };
        return repo.findAll(spec);
    }
}
