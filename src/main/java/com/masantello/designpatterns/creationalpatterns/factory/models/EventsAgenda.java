package com.masantello.designpatterns.creationalpatterns.factory.models;

import java.time.LocalDate;

public class EventsAgenda {

    private Integer eventCode;
    private String tickerSymbolCode;
    private String eventDescription;
    private LocalDate eventDate;
    private LocalDate settlementDate;
    private float amount;
    private Status status;

    public EventsAgenda() {
    }

    public EventsAgenda(Integer eventCode, String tickerSymbolCode, String eventDescription, LocalDate eventDate, LocalDate settlementDate, float amount, Status status) {
        this.eventCode = eventCode;
        this.tickerSymbolCode = tickerSymbolCode;
        this.eventDescription = eventDescription;
        this.eventDate = eventDate;
        this.settlementDate = settlementDate;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "EventsAgenda {" +
                "eventCode=" + eventCode +
                ", tickerSymbolCode='" + tickerSymbolCode + '\'' +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventDate=" + eventDate +
                ", settlementDate=" + settlementDate +
                ", amount=" + amount +
                ", status=" + status +
                '}';
    }
}
