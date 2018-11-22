import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] data, boolean reverse) {

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
        System.out.println(Arrays.toString(data));

    }


    public static void main(String[] args){
        bubbleSort(new int[]{34,25,1,6,354,3,6,7,8,35,2,1,7,3,4,6565,7},true);


    }


}
