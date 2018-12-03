import java.util.Arrays;

public class SelecitonSort {

    /**
     * @param data
     * @param reverse
     */
    private static void selectionSort(int[] data, boolean reverse){
        if (data.length == 1) return;
        for (int i = 0; i < data.length; i++){
            int tmp = data[i];
            int index = i;
            for (int j = i; j < data.length; j++){
                if (reverse){
                    if (tmp >= data[j]){
                        tmp = data[j]; //最小值
                        index = j;
                    }
                } else {
                    if (tmp <= data[j]){
                        tmp = data[j]; //最大值
                        index = j;
                    }
                }
            }

            data[index] = data[i];
            data[i] = tmp;
        }

    }

    public static void main(String[] args){
        int[] input = {1,5,3,7,9};
        selectionSort(input, true);
        System.out.println(Arrays.toString(input));

    }
}
