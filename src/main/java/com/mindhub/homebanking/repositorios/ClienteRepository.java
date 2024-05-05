package com.mindhub.homebanking.repositorios;

import com.mindhub.homebanking.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
