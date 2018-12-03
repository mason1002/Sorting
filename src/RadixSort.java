import java.util.ArrayList;
import java.util.Arrays;

public class RadixSort {

    private static final int DIGIT = 10;

    /**
     * @param data
     * @param reverse
     */
    private static void radixSort(int[] data, boolean reverse) {
        if (data.length == 1) return;

        int max = 0;
        for (int i = 0; i < data.length; i++) { //finding the max
            if (max < data[i]) max = data[i];
        }

        System.out.println("The max number is: " + max);

        int radix = 1;
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>(DIGIT);
        for (int i = 0; i < DIGIT; i++) {
            numbers.add(i, new ArrayList<>());
        }
        while (max > radix) {
            for (int i = 0; i < data.length; i++) {
                int index = (data[i] / radix) % DIGIT;
                ArrayList<Integer> list = numbers.get(index);
                list.add(data[i]);
                numbers.set(index, list);
            }

            resetOrder(data, numbers, reverse);
            radix = radix * DIGIT;
        }
    }

    /**
     * 重新调整数组顺序
     *
     * @param data
     * @param numbers
     * @param reverse
     */
    private static void resetOrder(int[] data, ArrayList<ArrayList<Integer>> numbers, boolean reverse) {
        int n = 0;
        if (reverse) {
            for (int i = 0; i < numbers.size(); i++){
                ArrayList<Integer> list = numbers.get(i);
                while (list.size() > 0){
                    data[n++] = list.get(0);
                    list.remove(0);
                }
            }
        } else {
            for (int i = numbers.size() - 1; i >= 0; i--){
                ArrayList<Integer> list = numbers.get(i);
                while (list.size() > 0){
                    data[n++] = list.get(0);
                    list.remove(0);
                }
            }
        }

    }

    public static void main(String[] args){
        int[] input = {1,34,5,23,66,23,3,6,734,23,15,6,7,25};
        radixSort(input, false);
        System.out.println(Arrays.toString(input));

    }

}
