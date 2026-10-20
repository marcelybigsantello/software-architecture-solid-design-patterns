package com.masantello.designpatterns.creationalpatterns.factory;

import com.masantello.designpatterns.creationalpatterns.factory.models.EventsAgenda;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.List;

public class LC implements FixedIncomeAssetType {

    private LocalDate maturityDate;

    @Override
    public void retrieveEventsAgenda(List<EventsAgenda> events) {
        System.out.println("Retrieving "+ this.getClass().getSimpleName() +" Events Agenda");
        for (EventsAgenda event : events) {
            System.out.println(event);
        }
    }

    @Override
    public void calculateSpread(String rating, LocalDate maturityDate) {
        System.out.println("Calculating SPREAD rate from a LC ...");
    }

    @Override
    public void defineMaturityDate(LocalDate maturityDate) {
        if (maturityDate.isBefore(LocalDate.now())
                || maturityDate.isAfter(LocalDate.of(2100, 1, 1))) {
            throw new DateTimeException("Erro ao definir a data de vencimento do ativo " + this.getClass().getSimpleName());
        }
        this.maturityDate = maturityDate;
    }

    @Override
    public boolean hasFgcProtection() {
        System.out.println(this.getClass().getSimpleName() + " has FGC protection!");
        return true;
    }
}
