package com.masantello.designpatterns.creationalpatterns.factory;

public interface AbstractFactory {

    FixedIncomeAssetType getAssetTypeCode(String assetTypeCode);
}
