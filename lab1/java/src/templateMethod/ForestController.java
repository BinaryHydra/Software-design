package templateMethod;

public abstract class ForestController extends WoodlandController {

    private int treeCutDownLimitCount = 50;
    private double treeCutDownLimitPercentage = 0.20;
    private double seedPercentage = 0.30;
    private int saplingCount = 0;
    private int halfGrownSaplings = 0;

    public ForestController(int treeCount) {
        super(treeCount);
    }

    @Override
    protected final int cutDown() {
        int choppedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= choppedTreeCount;
        return choppedTreeCount;
    }

    @Override
    protected final void plant(int treeCount) {
        saplingCount+=treeCount/2;
    }

    @Override
    protected final int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = halfGrownSaplings;
        halfGrownSaplings = seedCount;
        return seedCount + saplingCount;
    }
}
