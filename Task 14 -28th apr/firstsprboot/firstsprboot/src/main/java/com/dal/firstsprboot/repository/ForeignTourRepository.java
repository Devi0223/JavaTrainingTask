package com.dal.firstsprboot.repository;

import com.dal.firstsprboot.entity.ForeignTour;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ForeignTourRepository extends JpaRepository<ForeignTour, Long>{

}
