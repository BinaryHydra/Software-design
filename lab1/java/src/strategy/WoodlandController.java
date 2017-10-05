package strategy;

import java.math.BigDecimal;

public class WoodlandController {

    Woodland woodland;
    WoodPriceCalculator woodPriceCalculator;

    public void doFullForestCycle(int seedCount){
        int treesChopped = woodland.cutDown();

        System.out.println(treesChopped + " trees were cut down");
        System.out.println("currently there is " + woodland.getTreeCount() + " trees in the forest");
        int treesCount = woodland.grow();
        System.out.println("After grow there is " + woodland.getTreeCount() + " trees and " + treesCount + " saplings in the forest");
        woodland.plant(seedCount);
        System.out.println(seedCount + " saplings were planted");
        BigDecimal treeValue = woodPriceCalculator.calculatePrice(treesChopped);
        System.out.println("Wood can be sold for " + treeValue + " Eur.");

    }

    public void setWoodland(Woodland woodland) {
        this.woodland = woodland;
    }

    public void setWoodPriceCalculator(WoodPriceCalculator woodPriceCalculator) {
        this.woodPriceCalculator = woodPriceCalculator;
    }
}
