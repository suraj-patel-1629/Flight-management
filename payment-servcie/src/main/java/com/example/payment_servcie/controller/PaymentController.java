package com.example.payment_servcie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.payment_servcie.model.Payment;
import com.example.payment_servcie.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/payment")
public class PaymentController {

  @Autowired
  private PaymentService paymentservice;

  @GetMapping("/paymentbyid")
  public ResponseEntity<Payment> paymentDetail(@RequestParam Long id) {
    return ResponseEntity.ok(paymentservice.getPaymentDetail(id));
  }

  @GetMapping("/getallpayment")
  public ResponseEntity<List<Payment>> allPaymentDetails() {
    List<Payment> details = paymentservice.getAllPaymentDetail();
    return ResponseEntity.ok(details);
  }
}
