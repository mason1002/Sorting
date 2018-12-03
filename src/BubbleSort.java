import java.util.Arrays;

public class BubbleSort {

    /**
     * @param data
     * @param reverse
     */
    private static void bubbleSort(int[] data, boolean reverse) {

        if (data.length == 1) {
            return;
        }

        for (int i = 0; i < data.length - 1; i++) {

            int tmp = 0;

            for (int j = 0; j < data.length - i - 1; j++) {
                if (reverse) {
                    if (data[j] >= data[j + 1]) {
                        tmp = data[j];
                        data[j] = data[j + 1];
                        data[j + 1] = tmp;
                    }
                } else {
                    if (data[j] <= data[j + 1]) {
                        tmp = data[j + 1];
                        data[j + 1] = data[j];
                        data[j] = tmp;
                    }

                }
            }

        }
    }


    public static void main(String[] args){
        int[] input = {2,41,25,562,6,25,27,56,67,34,52,25,7,54,54,123,14};
        bubbleSort(input, false);
        System.out.println(Arrays.toString(input));

    }


}
