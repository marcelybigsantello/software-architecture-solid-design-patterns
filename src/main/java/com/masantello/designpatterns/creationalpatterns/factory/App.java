package com.masantello.designpatterns.creationalpatterns.factory;

import com.masantello.designpatterns.creationalpatterns.factory.models.EventsAgenda;
import com.masantello.designpatterns.creationalpatterns.factory.models.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<EventsAgenda> eventsAgendaList = new ArrayList<>();
        eventsAgendaList.add(new EventsAgenda(1, "LCA", "Amortização", LocalDate.of(2026, 10, 20), LocalDate.of(2026, 10, 30), 300f, Status.EXPECTED));
        eventsAgendaList.add(new EventsAgenda(2, "LCA", "Pagamento", LocalDate.of(2026, 10, 25), LocalDate.of(2026, 11, 10), 300f, Status.EXPECTED));
        eventsAgendaList.add(new EventsAgenda(3, "LCA", "Amortização", LocalDate.of(2026, 10, 30), LocalDate.of(2026, 11, 15), 300f, Status.EXPECTED));

        AbstractFactory factory = FactoryProducer.getFactory("LetrasCredito");
        if (factory == null) {
            throw new IllegalArgumentException("This factory does not exist!");
        }
        factory.getAssetTypeCode("LCA").retrieveEventsAgenda(eventsAgendaList);
        factory.getAssetTypeCode("LCA").hasFgcProtection();
    }
}
