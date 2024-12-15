package com.scaler.paymentservice.Service;

public class GatewaySelector {
    //logic to select suitable gateway
    private StripePG stripe;
    private RazorpayPG razorpay;

    public GatewaySelector(StripePG stripe, RazorpayPG razorpay) {
        this.stripe = stripe;
        this.razorpay = razorpay;
    }
    public PaymentGateway getPaymentGateway() {
        // logic to choose most suitable payment gateway
        return stripe;
        }
}
