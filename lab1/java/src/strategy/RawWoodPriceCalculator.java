package strategy;

import java.math.BigDecimal;

public class RawWoodPriceCalculator implements WoodPriceCalculator
{
    private final static BigDecimal priceMultiplier = new BigDecimal("1000");

    @Override
    public BigDecimal calculatePrice(int treeCount) {
        return priceMultiplier.multiply(BigDecimal.valueOf(treeCount));
    }
}
