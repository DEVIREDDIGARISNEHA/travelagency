package com.travelagency.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelagency.model.Package;

public interface PackageRepository extends JpaRepository<Package, Long> {
}