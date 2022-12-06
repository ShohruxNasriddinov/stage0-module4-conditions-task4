package school.mjc.stage0.conditions.task4;

public class TernaryAssignment {
    public void assignAndPrintBasedOnWhichBigger(int first, int second) {
        int maxNum = first>second?first:second;
        System.out.println(first==maxNum?10:-10);
    }
}
