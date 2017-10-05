package templateMethod;

public class ForestController extends WoodlandController {

    private int treeCutDownLimitCount = 50;
    private double treeCutDownLimitPercentage = 0.20;
    private double seedPercentage = 0.30;
    private int saplingCount = 0;
    private int halfGrownSaplings = 0;

    public ForestController(int treeCount) {
        super(treeCount);
    }

    @Override
    protected int cutDown() {
        int chopedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= chopedTreeCount;
        return chopedTreeCount;
    }

    @Override
    protected void plant(int treeCount) {
        saplingCount+=treeCount/2;
    }

    @Override
    protected int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = halfGrownSaplings;
        halfGrownSaplings = seedCount;
        return seedCount + saplingCount;
    }
}
