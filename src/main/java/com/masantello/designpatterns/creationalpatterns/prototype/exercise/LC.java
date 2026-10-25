package com.masantello.designpatterns.creationalpatterns.prototype.exercise;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public abstract class LC implements Cloneable {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private String tickerSymbol;
    private float unitPrice;
    private Integer quantity;
    private String operationCode;
    private String assetTypeCode;
    private String assetTypeNumber;

    private String partAccountNumber;
    private String partSimplifiedName;
    private String partCompleteName;

    private String counterPartAccountNumber;
    private String counterPartSimplifiedName;
    private String counterPartCompleteName;

    private LocalDate maturityDate;

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getPartAccountNumber() {
        return partAccountNumber;
    }

    public void setPartAccountNumber(String partAccountNumber) {
        this.partAccountNumber = partAccountNumber;
    }

    public String getPartSimplifiedName() {
        return partSimplifiedName;
    }

    public void setPartSimplifiedName(String partSimplifiedName) {
        this.partSimplifiedName = partSimplifiedName;
    }

    public String getPartCompleteName() {
        return partCompleteName;
    }

    public void setPartCompleteName(String partCompleteName) {
        this.partCompleteName = partCompleteName;
    }

    public String getCounterPartAccountNumber() {
        return counterPartAccountNumber;
    }

    public void setCounterPartAccountNumber(String counterPartAccountNumber) {
        this.counterPartAccountNumber = counterPartAccountNumber;
    }

    public String getCounterPartSimplifiedName() {
        return counterPartSimplifiedName;
    }

    public void setCounterPartSimplifiedName(String counterPartSimplifiedName) {
        this.counterPartSimplifiedName = counterPartSimplifiedName;
    }

    public String getCounterPartCompleteName() {
        return counterPartCompleteName;
    }

    public void setCounterPartCompleteName(String counterPartCompleteName) {
        this.counterPartCompleteName = counterPartCompleteName;
    }

    public String getAssetTypeCode() {
        return assetTypeCode;
    }

    public void setAssetTypeCode(String assetTypeCode) {
        this.assetTypeCode = assetTypeCode;
    }

    public String getAssetTypeNumber() {
        return assetTypeNumber;
    }

    public void setAssetTypeNumber(String assetTypeNumber) {
        this.assetTypeNumber = assetTypeNumber;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "tickerSymbol='" + tickerSymbol + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", operationCode='" + operationCode + '\'' +
                ", assetTypeCode='" + assetTypeCode + '\'' +
                ", assetTypeNumber='" + assetTypeNumber + '\'' +
                ", partAccountNumber='" + partAccountNumber + '\'' +
                ", partSimplifiedName='" + partSimplifiedName + '\'' +
                ", partCompleteName='" + partCompleteName + '\'' +
                ", counterPartAccountNumber='" + counterPartAccountNumber + '\'' +
                ", counterPartSimplifiedName='" + counterPartSimplifiedName + '\'' +
                ", counterPartCompleteName='" + counterPartCompleteName + '\'' +
                ", maturityDate=" + dtf.format(maturityDate) +
                '}';
    }

    @Override
    protected LC clone() throws CloneNotSupportedException {
        return (LC) super.clone();
    }
}
