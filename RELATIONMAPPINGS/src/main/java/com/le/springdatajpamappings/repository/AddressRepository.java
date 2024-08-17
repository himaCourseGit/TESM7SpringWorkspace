package com.le.springdatajpamappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.le.springdatajpamappings.Entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
