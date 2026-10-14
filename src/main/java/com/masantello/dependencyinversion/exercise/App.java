package com.masantello.dependencyinversion.exercise;

import java.time.LocalDate;
import java.util.Locale;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        PaymentController controller = new PaymentController(new Payoneer());

        controller.payBill(200f);
        controller.retrieveStatement(LocalDate.of(2026, 1, 1), LocalDate.now());
    }
}
