package com.scaler.paymentservice.Service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private GatewaySelector gatewaySelector;
    public PaymentService(GatewaySelector gatewaySelector) {
        this.gatewaySelector = gatewaySelector;
    }
    public String createPaymentLink(){
        return gatewaySelector.getPaymentGateway().createPaymentLink();
    }
}
