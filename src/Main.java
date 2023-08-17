public class Main {
    public static void main(String[] args) {

        int firstNumber = 12;
        int secondNumber = 30;

        int commonfactor = calculateGreatestCommonDivisor(12, 30);
        System.out.println("The highest common divisor for " + firstNumber + " and " + secondNumber + " is " + commonfactor);
    }

        public static int calculateGreatestCommonDivisor(int firstNumber, int secondNumber) {
            if ((firstNumber < 10) || (secondNumber < 10)) {
                return -1;
            }
            int hcf = 1;

            for (int highestCommonDivisor = 1; highestCommonDivisor <= Math.min(firstNumber, secondNumber); highestCommonDivisor++) {
                if ((firstNumber % highestCommonDivisor == 0) && (secondNumber % highestCommonDivisor == 0)) {
                    hcf = highestCommonDivisor;
                }
            }
            return hcf;
        }
    }
