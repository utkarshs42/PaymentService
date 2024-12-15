package com.scaler.paymentservice.Service;

import org.springframework.stereotype.Service;

@Service
public class StripePG implements PaymentGateway{
    @Override
    public String createPaymentLink() {
        return null;
    }
}
