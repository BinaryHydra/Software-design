package strategy;

import java.math.BigDecimal;

public class DryWoodPriceCalculator implements WoodPriceCalculator {

    private final static BigDecimal priceMultiplier = new BigDecimal("2500");

    @Override
    public BigDecimal calculatePrice(int treeCount) {
        return priceMultiplier.multiply(BigDecimal.valueOf(treeCount));
    }
}
