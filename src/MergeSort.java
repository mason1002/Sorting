import java.util.Arrays;

public class MergeSort {

    /**
     * @param data
     * @param left
     * @param right
     * @param reverse
     */
    private static int[] mergeSort(int[] data, int left, int right, boolean reverse) {
        if (left >= right) {
            return data;
        }

        int mid = (left + right) / 2;

        mergeSort(data, left, mid, reverse);
        mergeSort(data, mid + 1, right, reverse);
        merge(data, left, mid, right, reverse);
        return data;
    }

    /**
     * @param data
     * @param left
     * @param mid
     * @param right
     * @param reverse
     */
    private static void merge(int[] data, int left, int mid, int right, boolean reverse) {

        int[] tmp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int n = 0;

        while (i <= mid && j <= right) {
            if (reverse) { // small -> big
                if (data[i] <= data[j]) {
                    tmp[n++] = data[i++];

                } else {
                    tmp[n++] = data[j++];
                }
            } else {
                if (data[i] <= data[j]) {
                    tmp[n++] = data[j++];
                } else {
                    tmp[n++] = data[i++];
                }
            }
        }

        while (i <= mid) {
            tmp[n++] = data[i++];
        }
        while (j <= right){
            tmp[n++] = data[j++];
        }

        for (int k = 0; k < tmp.length; k++){
            data[left + k] = tmp[k];
        }

//        System.out.println(Arrays.toString(data));


    }

    public static void main(String[] args){
        int[] input = {1, 5, 2, 25, 1, 42, 4, 46, 7};


        System.out.println(Arrays.toString(mergeSort(input,
                0, 8, false)));
    }


}
