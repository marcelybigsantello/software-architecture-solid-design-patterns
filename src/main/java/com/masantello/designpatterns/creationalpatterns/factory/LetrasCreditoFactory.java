package com.masantello.designpatterns.creationalpatterns.factory;

public class LetrasCreditoFactory implements AbstractFactory {

    @Override
    public FixedIncomeAssetType getAssetTypeCode(String assetTypeCode) {
        if (assetTypeCode.equalsIgnoreCase("LCA")) {
            return new LCA();
        } else if (assetTypeCode.equalsIgnoreCase("LCI")) {
            return new LCI();
        } else if (assetTypeCode.equalsIgnoreCase("LC")) {
            return new LC();
        }

        return null;
    }
}
