package com.packt.repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.domain.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
