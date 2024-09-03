public class LargestElementinarray {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 6, 7 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("greatest");
            }
        }
    }

}
