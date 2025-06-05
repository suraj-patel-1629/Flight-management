package com.example.payment_servcie.service;

import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.stereotype.Service;

public class StripeService {
  public boolean processPayment(double amount, String currency, String description) {
    try {
      PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
          .setAmount((long) (amount * 100)) // Stripe needs amount in cents
          .setCurrency(currency)
          .setDescription(description)
          .build();

      PaymentIntent intent = PaymentIntent.create(params);

      return "succeeded".equals(intent.getStatus()) || "requires_capture".equals(intent.getStatus());
    } catch (StripeException e) {
      e.printStackTrace();
      return false;
    }
  }
}
