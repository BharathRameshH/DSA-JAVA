public class Evenorodd {
    public static void main(String[] args) {
        int number = 7;

        evenorOdd(number);
    }

    public static void evenorOdd(int num) {

        if (num % 2 == 0) {
            System.out.println(num + "is Even");
        } else {
            System.out.println(num + "is odd");
        }
    }

}
