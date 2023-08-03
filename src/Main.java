import java.util.Arrays;

public class Main {
    static int[] reversArray(int[] arr) {
        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            out[i] = arr[arr.length - 1 - i];
        }
        return out;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reversArray(new int[]{1, 2, 3, 4, 5, 6})));
    }
}