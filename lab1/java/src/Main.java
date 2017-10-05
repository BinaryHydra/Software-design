import strategy.Forest;
import strategy.Jungle;
import strategy.Woodland;
import templateMethod.ForestController;
import templateMethod.JungleController;
import templateMethod.WoodlandController;

public class Main {
    public static void main(String[] args) {
        doTemplateMethod();
        System.out.println("###################################");
        doStrategy();
    }

    private static void doTemplateMethod() {
        // WoodlandController woodland = new ForestController(100) ;
        templateMethod.WoodlandController woodlandCtr = new JungleController(100) ;

        doForestCycles(5 ,woodlandCtr);
    };

    private static void doStrategy() {
        // WoodlandController woodland = new ForestController(100) ;
        strategy.WoodlandController woodlandCtr = new strategy.WoodlandController();
        //woodlandCtr.setWoodland(new Forest(100));
        woodlandCtr.setWoodland(new Jungle(100));

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
