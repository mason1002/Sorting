import java.util.Arrays;

public class StraightInsertionSort {

    /**
     * @param data    array that needs to be sorted
     * @param reverse small->big (true) / big -> small (false)
     */
    private static int[] straightInsertionSort(int[] data, boolean reverse) {
        if (data.length == 1) {
            return data;
        }

        int tmp;

        for (int i = 1; i < data.length; i++) {
            tmp = data[i];
            int n = i - 1;
            for (; n >= 0; n--) {
                if (reverse) {
                    if (data[n] >= tmp) {
                        data[n + 1] = data[n]; //将大于当前值的数后移一位
                    } else {
                        break;
                    }
                } else {
                    if (data[n] <= tmp) {
                        data[n + 1] = data[n]; //将小于当前值的数后移一位
                    } else {
                        break;
                    }
                }
            }
            data[n + 1] = tmp;
        }

        return data;

    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,4,12,46,45,7,78,8,964,54,75,36,52,14};

        System.out.println(Arrays.toString(straightInsertionSort(input, false)));
    }


}
