package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
         if(second>first&&first!=0&&second!=0) {
                for (int devaider = second; devaider >= 1; devaider--) {
                    if (second % (devaider - 1) == 0) {
                        if (first % (devaider - 1) == 0) {
                            System.out.println(devaider - 1);
                            break;
                        }
                    }
                }
            } else if (first>second&&first!=0&&second!=0) {
                for (int devaider = first; devaider >= 1; devaider--) {
                    if (first % (devaider - 1) == 0) {
                        if (second % (devaider - 1) == 0) {
                            System.out.println(devaider - 1);
                            break;
                        }
                    }
                }
            }else if(first==second||second==0) {
                System.out.println(first);
            }
            else{
                System.out.println(second);
            }
    }
}
