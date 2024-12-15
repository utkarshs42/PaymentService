package com.scaler.paymentservice.Controllers;

import com.scaler.paymentservice.Service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public String createpaymentlink(){
         return paymentService.createPaymentLink();
    }
}
