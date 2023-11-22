package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    public void printAlphabet() {
        int counter='a';
        while (counter<='z'){
            char x= (char) counter;
            System.out.println(x);
            counter++;
        }
    }
}
