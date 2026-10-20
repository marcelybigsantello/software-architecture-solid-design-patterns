package com.masantello.designpatterns.creationalpatterns.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("LetrasCredito")) {
            return new LetrasCreditoFactory();
        } else if (factory.equalsIgnoreCase("CertificadoRecebiveis")) {
            return new CertificadoRecebiveisFactory();
        }
        return null;
    }
}
