package templateMethod;

public class JungleController extends WoodlandController {
    private int treeCutDownLimitCount = 100;
    private double treeCutDownLimitPercentage = 0.40;
    private double seedPercentage = 0.50;
    private int saplingCount = 0;

    public JungleController(int treeCount) {
        super(treeCount);
    }

    protected int cutDown() {
        int chopedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= chopedTreeCount + 10;
        return chopedTreeCount;
    }

    @Override
    protected void plant(int treeCount) {
        saplingCount+=treeCount;
    }

    @Override
    protected int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = seedCount;
        return seedCount + saplingCount;
    }
}
