import java.util.Arrays;

public class ShellSort {

    /**
     * @param data
     * @param reverse
     */
    private static void shellSort(int[] data, boolean reverse) {
        if (data.length == 1) return;

        for (int d = data.length / 2; d >= 1; d /= 2) { //组大小
            for (int k = 0; k < d; k++) { //多少组
                for (int n = d + k; n < data.length; n += d) {
                    int cur = n;
                    while (cur - d >= 0) { //插入排序
                        int tmp = 0;
                        if (reverse) {
                            if (data[cur] <= data[cur - d]) {
                                tmp = data[cur];
                                data[cur] = data[cur - d];
                                data[cur - d] = tmp;
                            }
                        } else {
                            if (data[cur] >= data[cur - d]) {
                                tmp = data[cur];
                                data[cur] = data[cur - d];
                                data[cur - d] = tmp;
                            }
                        }
                        cur -= d;
                    }

                }
            }
        }
    }

    public static void main(String[] args){
        int[] input = {3,2,7,9,1,5,4,8,6};
        shellSort(input, true);
        System.out.println(Arrays.toString(input));
    }
}