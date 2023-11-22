package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        
        int f1;
        int f2=1;
        for(int fx=0;fx<=lastFibonacci; fx=f2+f1){
            f1=f2;
            f2=fx;
            System.out.println(fx);
        }

        
    }
}
