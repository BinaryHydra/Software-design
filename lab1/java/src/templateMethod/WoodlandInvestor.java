package templateMethod;

public abstract class WoodlandInvestor {

    protected int treeCount;

    public WoodlandInvestor(int treeCount) {
        this.treeCount = treeCount;
    }

    public void plantAndGrowTrees(int seedCount, int yearCount) {
        System.out.println("currently there is " + treeCount + " trees in the forest");
        int saplingCount = 0;
        for (int i = 0; i < yearCount; i++) {
            plant(seedCount);
            saplingCount = grow();
        }
        System.out.println("After planting and growing woodland for " + yearCount + " years, there is " + treeCount + " and " + saplingCount + " saplings in the woodland");
    }

    public void cutDownTrees(int treeCount, int yearCount) {
        System.out.println("currently there is " + treeCount + " trees in the forest");
        int cutDownTreeCount = 0;
        int saplingCount = 0;
        for (int i = 0; i < yearCount; i++) {
            cutDownTreeCount = cutDown();
            saplingCount = grow();
        }
        System.out.println("After cutting woodland for " + yearCount + " years, " + cutDownTreeCount + " trees were cut down, there is " +treeCount + " and " + saplingCount + " saplings trees in the woodland");
    }

    protected abstract int cutDown();

    protected abstract void plant(int treeCount);

    protected abstract int grow();
}
