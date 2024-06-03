package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Loan;

import java.util.List;

public class LoanDTO {

    private long id;

    private String loanName;

    private double maxAmount;

    private List<Integer> payments;

    public LoanDTO(Loan loan) {
        this.id = loan.getId();
        this.loanName = loan.getName();
        this.maxAmount = loan.getMaxAmount();
        this.payments = loan.getPayments();
    }

    public long getId() {
        return id;
    }

    public String getLoanName() {
        return loanName;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public List<Integer> getPayments() {
        return payments;
    }

    public static LoanDTO fromLoan(Loan loan) {
        return new LoanDTO(loan);
    }
}