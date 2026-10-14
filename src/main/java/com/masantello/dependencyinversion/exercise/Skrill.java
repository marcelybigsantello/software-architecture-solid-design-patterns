package com.masantello.dependencyinversion.exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Skrill implements PaymentMethod {

    private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @Override
    public void payBill(float amount) {
        System.out.println("[Skrill] Paying the bill of " + String.format("%.2f", amount));
    }

    @Override
    public void retrieveStatement(LocalDate startDate, LocalDate endDate) {
        System.out.println("[Skrill] Here's your statement between " +sdf.format(startDate)+ " and " + sdf.format(endDate));
    }
}
