package com.mindhub.homebanking.repositorios;

import com.mindhub.homebanking.models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan,Long> {
    Loan findByName(String name);
    boolean existsById(Long id);
    Loan findById(long id);
}
