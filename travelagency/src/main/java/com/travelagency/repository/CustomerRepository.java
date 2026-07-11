package com.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelagency.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}