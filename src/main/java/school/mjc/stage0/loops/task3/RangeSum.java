package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int temp=0;
        while (firstBoarder<=secondBoarder){
                temp=temp+(firstBoarder++);
            }
        System.out.println(temp);
    }
}
