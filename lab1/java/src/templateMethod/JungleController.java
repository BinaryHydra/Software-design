package templateMethod;

public abstract class JungleController extends WoodlandController {
    private int treeCutDownLimitCount = 100;
    private double treeCutDownLimitPercentage = 0.40;
    private double seedPercentage = 0.50;
    private int saplingCount = 0;

    public JungleController(int treeCount) {
        super(treeCount);
    }

    protected final int cutDown() {
        int choppedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= choppedTreeCount + 10;
        return choppedTreeCount;
    }

    @Override
    protected final void plant(int treeCount) {
        saplingCount+=treeCount;
    }

    @Override
    protected final int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = seedCount;
        return seedCount + saplingCount;
    }
}
