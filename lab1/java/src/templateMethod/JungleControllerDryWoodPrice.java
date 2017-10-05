package templateMethod;

import java.math.BigDecimal;

public class JungleControllerDryWoodPrice  extends JungleController{

    private final PriceCalculator calc = new PriceCalculator();

    public JungleControllerDryWoodPrice(int treeCount) {
        super(treeCount);
    }

    @Override
    protected BigDecimal calculatePrice(int treeCount) {
        return calc.calculateDryPrice(treeCount);
    }
}
