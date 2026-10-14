package com.masantello.dependencyinversion.exercise;

import java.time.LocalDate;

//The high level module
public class PaymentController {

    private final PaymentMethod paymentMethod;

    public PaymentController(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void payBill(float amount) {
        this.paymentMethod.payBill(amount);
    }

    public void retrieveStatement(LocalDate startDate, LocalDate endDate) {
        this.paymentMethod.retrieveStatement(startDate, endDate);
    }

}
