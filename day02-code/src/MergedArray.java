import java.util.Arrays;

public class MergedArray {
    public static void main(String[] args) {
        Integer[] array01 = {10, 20, 30};
        Integer[] array02 = {40, 50, 60};
        // 创建合并数组
        Integer[] totalArray = new Integer[array01.length + array02.length];
        // 将array01中的元素填充至合并数组
        for (int i = 0; i < array01.length; i++) {
            totalArray[i] = array01[i];
        }
        // 将数组2中的元素填充至合并数组
        for (int i = 0; i < array02.length; i++) {
            // array01.length + i延伸下标，扩容合并数组
            totalArray[array01.length + i] = array02[i];
        }
        Arrays.sort(array01);
        // 遍历合并数组
        for (int i = 0; i < totalArray.length; i++) {
            System.out.print(totalArray[i] + " ");
        }
    }
}
