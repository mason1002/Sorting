import java.util.Arrays;

public class StraightInsertionSort {

    /**
     * @param data    array that needs to be sorted
     * @param reverse small->big (true) / big -> small (false)
     */
    public static void straightInsertionSort(int[] data, boolean reverse) {
        if (data.length == 1) {
            return;
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

        System.out.println(Arrays.toString(data));

    }

    public static void main(String[] args) {
        straightInsertionSort(new int[]{4,2,5,1,3,235,6,47,5,8,46,346,346,563,6,35,561,78,7}, true);

    }


}
