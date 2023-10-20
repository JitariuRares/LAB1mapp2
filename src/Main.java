import java.util.Arrays;

public class Main {
    public static int nrMax(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    public static int nrMin(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }

    public static int calculateSumMaxima(int[] numere) {
        int totalSum=0;
        int minNum=numere[0];
        for(int i=0; i<numere.length; i++){
            totalSum+=numere[i];
            if(numere[i]<minNum){
                minNum=numere[i];
            }
        }
        return totalSum-minNum;
    }

    public static int calculateSumMinima(int[] numere) {
        int totalSum=0;
        int maxNum=numere[0];
        for(int i=0; i<numere.length; i++){
            totalSum+=numere[i];
            if(numere[i]>maxNum){
                maxNum=numere[i];
            }
        }
        return totalSum-maxNum;
    }
    public static void testNrMax() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 17;
        int result = Main.nrMax(numbers);
        assert expected == result;

        // Test pentru cazul neașteptat
        int[] numbers2 = {5, 2, 9, 4, 1};
        int unexpected = 10; // 10 este maximul, dar testăm cazul greșit
        int resultUnexpected = Main.nrMax(numbers2);
        assert unexpected != resultUnexpected;
    }

    public static void testNrMin() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 3;
        int result = Main.nrMin(numbers);
        assert expected == result;

        // Test pentru cazul neașteptat
        int[] numbers2 = {5, 2, 9, 4, 1};
        int unexpected = 5; // 5 este minimul, dar testăm cazul greșit
        int resultUnexpected = Main.nrMin(numbers2);
        assert unexpected != resultUnexpected;
    }

    public static void testCalculateSumMaxima() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 42; // 4 + 8 + 10 + 17
        int result = Main.calculateSumMaxima(numbers);
        assert expected == result;

        // Test pentru cazul neașteptat
        int[] numbers2 = {5, 2, 9, 4, 1};
        int unexpected = 16; // Suma maximă este 16, dar testăm cazul greșit
        int resultUnexpected = Main.calculateSumMaxima(numbers2);
        assert unexpected != resultUnexpected;
    }

    public static void testCalculateSumMinima() {
        int[] numbers = {4, 8, 3, 10, 17};
        int expected = 25; // 4 + 3 + 10 + 8
        int result = Main.calculateSumMinima(numbers);
        assert expected == result;

        // Test pentru cazul neașteptat
        int[] numbers2 = {5, 2, 9, 4, 1};
        int unexpected = 22; // Suma minimă este 22, dar testăm cazul greșit
        int resultUnexpected = Main.calculateSumMinima(numbers2);
        assert unexpected != resultUnexpected;
    }

    public static void main(String[] args) {
        int[] numere = {4, 8, 3, 10, 17};
        testNrMax();
        testNrMin();
        testCalculateSumMaxima();
        testCalculateSumMinima();

        int max = nrMax(numere);
        System.out.println("Numarul maxim: " + max);

        int min = nrMin(numere);
        System.out.println("Numarul minim: " + min);

        int sumaMaxima = calculateSumMaxima(numere);
        System.out.println("Suma maxima a n-1 numere: " + sumaMaxima);

        int sumaMinima = calculateSumMinima(numere);
        System.out.println("Suma minima a n-1 numere: " + sumaMinima);
    }


}
