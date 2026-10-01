
public class MinimumDemo {

    public static <T extends Number> T findMin(T[] arr) {
        T min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].doubleValue() < min.doubleValue()) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Integer[] arr = {40, 20, 10, 50, 30};

        System.out.println("Minimum = " + findMin(arr));

        Double[] arr2 = {4.5, 2.3, 8.1, 1.2};

        System.out.println("Minimum = " + findMin(arr2));
    }
}
