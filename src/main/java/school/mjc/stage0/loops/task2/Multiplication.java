package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;
        System.out.println("current heap size: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free heap size: "+Runtime.getRuntime().freeMemory());
        while (count != multiplyByAndToInclusive) {
            System.out.println("current heap size: "+Runtime.getRuntime().totalMemory());
            System.out.println("Free heap size: "+Runtime.getRuntime().freeMemory());
            System.out.println(count * multiplyByAndToInclusive);
            ++count;
        }
        System.out.println("current heap size: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free heap size: "+Runtime.getRuntime().freeMemory());
    }
}
