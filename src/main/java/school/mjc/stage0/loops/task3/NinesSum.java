package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if(lengthOfLastNumber>0) {
            int sum = 9;
            for (int counter = 1; counter < lengthOfLastNumber; counter++) {
                int current = 9;
                for (int counter1 = 1; counter1 <= counter; counter1++) {
                    current = current * 10 + 9;
                }
                sum = sum + current;
            }
            System.out.println(sum);
        }else {
            System.out.println(0);
        }

    }
}
