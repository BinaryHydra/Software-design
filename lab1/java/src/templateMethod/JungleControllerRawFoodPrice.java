package templateMethod;

import java.math.BigDecimal;

public class JungleControllerRawFoodPrice extends JungleController {

    public JungleControllerRawFoodPrice(int treeCount) {
        super(treeCount);
    }

    private final PriceCalculator calc = new PriceCalculator();

    @Override
    protected BigDecimal calculatePrice(int treeCount) {
        return calc.calculateRawPrice(treeCount);
    }
}
