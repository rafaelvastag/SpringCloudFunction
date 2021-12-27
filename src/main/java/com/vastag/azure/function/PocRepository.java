package com.vastag.azure.function;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vastag.azure.function.entities.PoCEntity;

@Repository
public interface PocRepository extends JpaRepository<PoCEntity, Long> {

}
