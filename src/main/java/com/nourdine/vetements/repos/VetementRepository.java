package com.nourdine.vetements.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nourdine.vetements.entities.Vetement;

public interface VetementRepository extends JpaRepository<Vetement, Long> {

}
