package strategy;

public class Forest implements Woodland {

    private int treeCutDownLimitCount = 50;
    private double treeCutDownLimitPercentage = 0.20;
    private double seedPercentage = 0.30;
    private int saplingCount = 0;
    private int halfGrownSaplings = 0;
    private int treeCount;

    public Forest(int treeCount){
        this.treeCount = treeCount;
    }

    @Override
    public int cutDown() {
        int chopedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= chopedTreeCount;
        return chopedTreeCount;
    }

    @Override
    public void plant(int treeCount) {
        saplingCount+=treeCount/2;
    }

    @Override
    public int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = halfGrownSaplings;
        halfGrownSaplings = seedCount;
        return seedCount + saplingCount;
    }

    @Override
    public int getTreeCount() {
        return treeCount;
    }
}
