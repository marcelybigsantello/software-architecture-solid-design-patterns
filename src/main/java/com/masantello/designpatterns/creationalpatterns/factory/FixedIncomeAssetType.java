package com.masantello.designpatterns.creationalpatterns.factory;

import com.masantello.designpatterns.creationalpatterns.factory.models.EventsAgenda;

import java.time.LocalDate;
import java.util.List;

public interface FixedIncomeAssetType {

    void retrieveEventsAgenda(List<EventsAgenda> events);
    void calculateSpread(String rating, LocalDate maturityDate);
    void defineMaturityDate(LocalDate maturityDate);
    boolean hasFgcProtection();

}
