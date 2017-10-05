package strategy;

public class Jungle implements Woodland {

    private int treeCutDownLimitCount = 100;
    private double treeCutDownLimitPercentage = 0.40;
    private double seedPercentage = 0.50;
    private int saplingCount = 0;
    private int treeCount;

    public Jungle(int treeCount){
        this.treeCount = treeCount;
    }

    public int cutDown() {
        int chopedTreeCount = Math.min((int) (treeCount * treeCutDownLimitPercentage), treeCutDownLimitCount);
        treeCount -= chopedTreeCount + 10;
        return chopedTreeCount;
    }

    @Override
    public void plant(int treeCount) {
        saplingCount+=treeCount;
    }

    @Override
    public int grow() {
        int seedCount = (int)(treeCount * seedPercentage);
        treeCount += saplingCount;
        saplingCount = seedCount;
        return seedCount + saplingCount;
    }

    @Override
    public int getTreeCount() {
        return treeCount;
    }
}
