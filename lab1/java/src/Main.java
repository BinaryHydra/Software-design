import strategy.DryWoodPriceCalculator;
import strategy.Forest;
import strategy.Jungle;
import strategy.Woodland;
import templateMethod.*;

public class Main {
    public static void main(String[] args) {
        doTemplateMethod();
        System.out.println("###################################");
        doStrategy();
    }

    private static void doTemplateMethod() {
        // WoodlandController woodland = new ForestController(100) ;
        templateMethod.WoodlandController woodlandCtr = new ForestControllerDryWoodPrice(100) ;

        /* WoodlandInvestor woodlandInvestor = new ForestInvestor(10);
        woodlandInvestor.plantAndGrowTrees(100, 5);
        woodlandInvestor.cutDownTrees(200, 5);*/
        doForestCycles(5, woodlandCtr);

    };

    private static void doStrategy() {
        strategy.WoodlandController woodlandCtr = new strategy.WoodlandController();
        woodlandCtr.setWoodland(new Forest(100));
        woodlandCtr.setWoodPriceCalculator(new DryWoodPriceCalculator());
        /*strategy.WoodlandInvestor woodlandInvestor = new strategy.WoodlandInvestor();
        woodlandInvestor.setWoodland(new Jungle(100));
        woodlandInvestor.setWoodland(new Forest(100));
        woodlandInvestor.plantAndGrowTrees(100, 5);
        woodlandInvestor.cutDownTrees(200, 5);
*/
        doForestCycles(5, woodlandCtr);

    }


    private static void doForestCycles(int cycleCount, templateMethod.WoodlandController woodland) {
        for (int i = 0; i < cycleCount; i++) {
            woodland.doFullForestCycle(10);
            System.out.println("--------");
        }
    }


    private static void doForestCycles(int cycleCount, strategy.WoodlandController woodland) {
        for (int i = 0; i < cycleCount; i++) {
            woodland.doFullForestCycle(10);
            System.out.println("--------");
        }
    }
}
