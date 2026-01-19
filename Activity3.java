public class AllOperationsDemo {
    public static void main(String[] args) {
        int numA = 15;
        int numB = 25;
        int numC = 10;
        int numD = 3;
        int numE = 4;
        int numF = 10;
        int numG = 2;

        // Addition
        int totalA = numA + numB;        // 15 + 35 = 50
        System.out.println("Total A (Addition) is: " + totalA);

        // Subtraction
        int totalB = totalA - numC;      // 50 - 10 = 40
        System.out.println("Total B (Subtraction) is: " + totalB);

        // Multiplication
        int totalC = totalB * numD;      // 40 * 3 = 120
        System.out.println("Total C (Multiplication) is: " + totalC);

        // Division
        int totalD = totalC / numE;      // 120 / 4 = 30
        System.out.println("Total D (Division) is: " + totalD);

        // Modulus (remainder)
        int totalE = totalD % numF;      // 30 % 10 = 0
        System.out.println("Total E (Modulus) is: " + totalE);

        // Another Addition example (to include numG)
        int totalF = totalE + numG;      // 0 + 2 = 2
        System.out.println("Total F (Final Addition) is: " + totalF);
    }
}
