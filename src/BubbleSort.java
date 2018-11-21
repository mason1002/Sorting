public class BubbleSort {

    public static void sort(int[] data, boolean reverse) {

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

        System.out.println(sort(, true));
    }


}
