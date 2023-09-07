package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if(printToInclusive >= 2) {
            System.out.println(2);
        } 
        int i = 3;
        while(i < printToInclusive) {
            int j = 2;
            boolean natural = false; 
            while(j < i){
                if(i % j == 0){
                    //not prime.
                    natural = true;
                    break;
                } else {
                    j++;
                }
            }
            if(!natural){
                System.out.println(i);
            }
            i++;
        }
    }
}
