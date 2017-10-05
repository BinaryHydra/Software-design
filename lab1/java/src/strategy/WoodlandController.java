package strategy;

public class WoodlandController {

    Woodland woodland;

    public void doFullForestCycle(int seedCount){
        int treesChopped = woodland.cutDown();

        System.out.println(treesChopped + " trees were cut down");
        System.out.println("currently there is " + woodland.getTreeCount() + " trees in the forest");
        int treesCount = woodland.grow();
        System.out.println("After grow there is " + woodland.getTreeCount() + " trees and " + treesCount + " saplings in the forest");
        woodland.plant(seedCount);
        System.out.println(seedCount + " saplings were planted");
    }

    public void setWoodland(Woodland woodland) {
        this.woodland = woodland;
    }
}
