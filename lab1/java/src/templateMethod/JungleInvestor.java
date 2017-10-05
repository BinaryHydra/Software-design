package templateMethod;

public class JungleInvestor extends WoodlandInvestor {

    private int treeCutDownLimitCount = 100;
    private double treeCutDownLimitPercentage = 0.40;
    private double seedPercentage = 0.50;
    private int saplingCount = 0;

    public JungleInvestor(int treeCount) {
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
