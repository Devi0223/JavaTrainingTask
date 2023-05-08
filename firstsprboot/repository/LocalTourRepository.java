package com.dal.firstsprboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dal.firstsprboot.entity.LocalTour;

@Repository
public interface LocalTourRepository extends JpaRepository<LocalTour, Long> {

}
