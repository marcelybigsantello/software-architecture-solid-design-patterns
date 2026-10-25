package com.masantello.designpatterns.creationalpatterns.prototype.exercise;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        LC lca = new LCA();
        lca.setAssetTypeCode("LCA");
        lca.setAssetTypeNumber("LCA6780");
        lca.setTickerSymbol("LCA6780");
        lca.setUnitPrice(4000.90f);
        lca.setQuantity(1000);
        lca.setOperationCode("202610231456001234");
        lca.setPartAccountNumber("31605");
        lca.setPartSimplifiedName("XP");
        lca.setPartCompleteName("XP S.A.");
        lca.setMaturityDate(LocalDate.of(2028, 10, 25));

        System.out.println(lca);

        LC lca2 = lca.clone();
        lca2.setAssetTypeNumber("LCA6781");
        lca2.setTickerSymbol("LCA6781");
        lca2.setOperationCode("202610231456006723");

        System.out.println(lca2);

    }
}
