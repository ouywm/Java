import java.util.Arrays;

public class Aa {
    public static void main(String[] args) {
        Integer[] array1 = {10, 20, 30};
        Integer[] array2 = {40, 50, 60};
        Integer[] totalArray = new Integer[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            totalArray[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            totalArray[array1.length + i] = array2[i];
        }
        Arrays.sort(totalArray);
        for (int i = 0; i < totalArray.length; i++) {
            System.out.print(totalArray[i] + " ");
        }
    }
}
