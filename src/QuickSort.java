import java.util.Arrays;

public class QuickSort {

    /**
     * @param data
     * @param left
     * @param right
     * @param reverse
     */
    public static void quicksort(int[] data, int left, int right, boolean reverse) {
        if (left >= right) return;

        int index = getIndex(data, left, right, reverse);
        quicksort(data, left, index - 1, reverse);
        quicksort(data, index + 1, right, reverse);
    }

    /**
     * 将待排序片段调整顺序,获得"中间数据"的正确索引
     *
     * @param data
     * @param left
     * @param right
     * @param reverse
     * @return
     */
    private static int getIndex(int[] data, int left, int right, boolean reverse) {
        int cur = data[left];
        int i = left;
        int j = right;

        while (i < j) {
            if (reverse) {
                while (data[j] > cur && i < j) {
                    --j;
                }
                data[i] = data[j];
                while (data[i] <= cur && i < j) {
                    ++i;
                }
                data[j] = data[i];
            } else {
                while (data[j] < cur && i < j) {
                    --j;
                }
                data[i] = data[j];
                while (data[i] >= cur && i < j) {
                    ++i;
                }
                data[j] = data[i];

            }
        }
        data[i] = cur;
        return i;

    }

    public static void main(String[] args) {
        int[] input = {231, 4, 52, 2, 67, 54, 7, 2, 532, 7, 8, 3};
        quicksort(input, 0, input.length - 1, false);
        System.out.println(Arrays.toString(input));
    }

}
