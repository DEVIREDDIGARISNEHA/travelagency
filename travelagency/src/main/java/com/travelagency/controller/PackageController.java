package com.travelagency.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelagency.model.Package;
import com.travelagency.repository.PackageRepository;

@RestController
@RequestMapping("/api/packages")
public class PackageController {

    @Autowired
    private PackageRepository packageRepository;

    // GET all packages
    @GetMapping
    public List<Package> getAllPackages() {
        return packageRepository.findAll();
    }

    // POST new package
    @PostMapping
    public Package createPackage(@RequestBody Package pkg) {
        return packageRepository.save(pkg);
    }

    // GET package by id
    @GetMapping("/{id}")
    public Package getPackageById(@PathVariable Long id) {
        return packageRepository.findById(id).orElse(null);
    }
}