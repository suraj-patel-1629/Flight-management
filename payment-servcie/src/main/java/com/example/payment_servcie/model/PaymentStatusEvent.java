package com.example.payment_servcie.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentStatusEvent {
  private Long bookingId;
  private boolean paymentSuccessfull;

}
