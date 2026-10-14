package com.masantello.dependencyinversion.exercise;

import java.time.LocalDate;

public interface PaymentMethod {

    void payBill(float amount);
    void retrieveStatement(LocalDate startDate, LocalDate endDate);
}
