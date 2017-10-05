package templateMethod;

import java.math.BigDecimal;

public class PriceCalculator {

    private final static BigDecimal rawPriceMultiplier = new BigDecimal("1000");
    private final static BigDecimal dryPriceMultiplier = new BigDecimal("2500");


    public BigDecimal calculateRawPrice(int treeCount) {
        if (treeCount < 100) {
            return rawPriceMultiplier.multiply(BigDecimal.valueOf(treeCount));
        }
        return rawPriceMultiplier.multiply(BigDecimal.valueOf(treeCount)).multiply(BigDecimal.valueOf(1.2f));
    }

    public BigDecimal calculateDryPrice(int treeCount) {
        if (treeCount < 200) {
            return dryPriceMultiplier.multiply(BigDecimal.valueOf(treeCount));
        }
        return dryPriceMultiplier.multiply(BigDecimal.valueOf(treeCount)).multiply(BigDecimal.valueOf(1.4f));
    }
}
