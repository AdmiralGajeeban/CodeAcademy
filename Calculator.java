// A basic calculator that will return key mathmatical opertaions from two input numbers.
//Gajeeban Thavendran 04.04.20

    public class Calculator {

        int a;
        int b;

        //Constructor
        public Calculator(int thisa, int thisb) {
            a = thisa;
            b = thisb;
        }

        //Addition method
        public int add(int a, int b) {
            int total = a + b;
            return total;
        }

        //Subtraction method
        public int subtract(int a, int b) {
            int total = a - b;
            return total;
        }

        //Multiplication method
        public int multiply(int a, int b) {
            int product = a * b;
            return product;
        }

        //Division method
        public int divide(int a, int b) {
            int divide = a / b;
            return divide;
        }

        //Modulo method
        public int modulo(int a, int b) {
            int modulo = a % b;
            return modulo;
        }

        //Main Method
        public static void main(String[] args) {

            Calculator myCalculator = new Calculator(5, 7);
            int sum = myCalculator.add(myCalculator.a, myCalculator.b);
            System.out.println(sum);

            int minus = myCalculator.subtract(myCalculator.a, myCalculator.b);
            System.out.println(minus);

            int product = myCalculator.multiply(myCalculator.a, myCalculator.b);
            System.out.println(product);

            int divide = myCalculator.divide(myCalculator.a, myCalculator.b);
            System.out.println(divide);

            int modulo = myCalculator.modulo(myCalculator.a, myCalculator.b);
            System.out.println(modulo);

        }
    }

