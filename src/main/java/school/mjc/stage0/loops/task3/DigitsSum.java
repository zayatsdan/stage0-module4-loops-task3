package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        if (t<=0){
            t=t*(-1);
        }
        int sum=0;
        String str1 = String.valueOf(t);
        int size1=str1.length();
        for (int i=0;i<size1;i++){

            sum=sum+(int)str1.charAt(i)-48;
        }
        System.out.println(sum);

    }
}
