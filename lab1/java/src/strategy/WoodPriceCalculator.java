package strategy;

import java.math.BigDecimal;

public interface WoodPriceCalculator {

    BigDecimal calculatePrice(int treeCount);
}
