package com.masantello.designpatterns.creationalpatterns.factory;

import com.masantello.designpatterns.creationalpatterns.factory.models.EventsAgenda;
import com.masantello.designpatterns.creationalpatterns.factory.models.Status;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<EventsAgenda> eventsAgendaList = new ArrayList<>();
        eventsAgendaList.add(new EventsAgenda(1, "LCA", "Amortização", LocalDate.of(2026, 10, 20), LocalDate.of(2026, 10, 30), 300f, Status.EXPECTED));
        eventsAgendaList.add(new EventsAgenda(2, "LCA", "Pagamento", LocalDate.of(2026, 10, 25), LocalDate.of(2026, 11, 10), 400.50f, Status.EXPECTED));
        eventsAgendaList.add(new EventsAgenda(3, "LCA", "Pagamento", LocalDate.of(2026, 10, 30), LocalDate.of(2026, 11, 15), 5000.90f, Status.EXPECTED));

        AbstractFactory factory = FactoryProducer.getFactory("LetrasCredito");
        if (factory == null) {
            throw new IllegalArgumentException("This factory does not exist!");
        }

        var assetTypeCode = "LCA";
        if (factory.getAssetTypeCode("LCA") == null) {
            var errorMessage = String.format("This asset type code '%s' does not exist yet.", assetTypeCode);
            throw new IllegalArgumentException(errorMessage);
        }
        factory.getAssetTypeCode("LCA").hasFgcProtection();
        factory.getAssetTypeCode("LCA").defineMaturityDate(LocalDate.parse("20/10/2028", DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        factory.getAssetTypeCode("LCA").retrieveEventsAgenda(eventsAgendaList);

        var unknownAssetTypeCode = "teste";
        if (factory.getAssetTypeCode(unknownAssetTypeCode) == null) {
            var errorMessage = String.format("This asset type code '%s' does not exist yet.", unknownAssetTypeCode);
            throw new IllegalArgumentException(errorMessage);
        }
        factory.getAssetTypeCode("teste").hasFgcProtection();
    }
}
