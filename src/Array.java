import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array1 = new int[]{11, 5, 7, 8};
        System.out.println(Arrays.toString(changeArray(array1)));
    }

    private static int[] changeArray(int[] original){
        int x = original[original.length - 1];
        System.arraycopy(original, 0, original, 1, original.length - 1);
        original[0] = x;
        return original;
    }
}
