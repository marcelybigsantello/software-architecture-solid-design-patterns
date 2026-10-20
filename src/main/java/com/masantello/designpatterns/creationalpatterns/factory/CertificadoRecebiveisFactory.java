package com.masantello.designpatterns.creationalpatterns.factory;

public class CertificadoRecebiveisFactory implements AbstractFactory {

    @Override
    public FixedIncomeAssetType getAssetTypeCode(String assetTypeCode) {
        if (assetTypeCode.equalsIgnoreCase("CRA")) {
            return new CRA();
        } else if (assetTypeCode.equalsIgnoreCase("CRI")) {
            return new CRI();
        } else if (assetTypeCode.equalsIgnoreCase("CR")) {
            return new CR();
        }

        return null;
    }
}
