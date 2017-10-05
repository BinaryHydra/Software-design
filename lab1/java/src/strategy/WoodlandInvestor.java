package strategy;

public class WoodlandInvestor {
    Woodland woodland;

    public final void plantAndGrowTrees(int seedCount, int yearCount) {
        System.out.println("currently there is " + woodland.getTreeCount() + " trees in the woodland");
        int sapplingCount = 0;
        for (int i = 0; i < yearCount; i++) {
            woodland.plant(seedCount);
            sapplingCount = woodland.grow();
        }
        System.out.println("After planting and growing woodland for " + yearCount + " years, there is " + woodland.getTreeCount() + " and " + sapplingCount + " saplings in the woodland");
    }

    public final void cutDownTrees(int treeCount, int yearCount) {
        System.out.println("currently there is " + woodland.getTreeCount() + " trees in the woodland");
        int cutDownTreeCount = 0;
        int sapplings = 0;
        for (int i = 0; i < yearCount; i++) {
            cutDownTreeCount = woodland.cutDown();
            sapplings = woodland.grow();
        }
        System.out.println("After cutting woodland for " + yearCount +  " years, " + cutDownTreeCount + " trees were cut down, there is " + woodland.getTreeCount() + " and " + sapplings + " saplings trees in the woodland");
    }

    public void setWoodland(Woodland woodland) {
        this.woodland = woodland;
    }
}
