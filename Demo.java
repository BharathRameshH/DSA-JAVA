//Examples For creating class and object

class Calculator {

    int a;

    public int add(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}

public class Demo {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 6;

        Calculator calc = new Calculator();

        int r = calc.add(num1, num2);
        System.out.println(r);
    }
}
