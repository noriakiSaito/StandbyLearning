package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}