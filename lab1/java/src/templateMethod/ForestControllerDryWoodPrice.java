package templateMethod;

import java.math.BigDecimal;

public class ForestControllerDryWoodPrice extends ForestController {

    public ForestControllerDryWoodPrice(int treeCount) {
        super(treeCount);
    }

    private final PriceCalculator calc = new PriceCalculator();

    @Override
    protected BigDecimal calculatePrice(int treeCount) {
        return calc.calculateDryPrice(treeCount);
    }
}

