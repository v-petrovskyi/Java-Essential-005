import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 4, 5, 7};
        System.arraycopy(arr, 3, arr, 2, 3);
        System.out.println(Arrays.toString(arr));

        arr = Arrays.copyOf(arr, 10);
        System.out.println(arr.length);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
        System.out.println(Arrays.toString(arr));

    }

}

