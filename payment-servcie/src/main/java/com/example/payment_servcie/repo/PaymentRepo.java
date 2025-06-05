package com.example.payment_servcie.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.payment_servcie.model.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Long> {

}
