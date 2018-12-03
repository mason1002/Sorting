import java.util.Arrays;

public class HeapSort {

    private static int[] heapSort(int[] data, boolean reverse) {
        if (data.length == 1) {
            return data;
        }

        for (int i = 0; i < data.length; i++) {
            buildHeap(data, 0, data.length - 1 - i, reverse);
            int tmp = data[0];
            data[0] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }

        return data;
    }

    private static void buildHeap(int[] data, int beginIndex, int endIndex, boolean reverse) {

        if (beginIndex > endIndex) {
            return;
        }
        for (int i = (endIndex + beginIndex - 1) / 2; i >= beginIndex; i--) {
            int cur = i;
            if (reverse) {
                // 发生交换之后需要检查孙子节点、重孙子。。
                while (2 * cur + 1 <= endIndex) {
                    int biggerChildIndex = 2 * cur + 1;
                    if (biggerChildIndex + 1 <= endIndex) {
                        if (data[biggerChildIndex] < data[biggerChildIndex + 1]) {
                            biggerChildIndex += 1;
                        }
                    }
                    //找到最大子节点，如果比当前节点大，就交换
                    if (data[i] < data[biggerChildIndex]) {
                        int tmp = data[i];
                        data[i] = data[biggerChildIndex];
                        data[biggerChildIndex] = tmp;
                        //准备检查孙子节点
                        cur = biggerChildIndex;

                    } else {
                        break;
                    }

                }
            } else {
                //小顶堆，用来从大到小排序
                while (2 * cur + 1 <= endIndex) {
                    int smallerChildIndex = 2 * i + 1;
                    if (smallerChildIndex + 1 <= endIndex) {
                        if (data[smallerChildIndex] > data[smallerChildIndex] + 1) {
                            smallerChildIndex = smallerChildIndex + 1;
                        }
                    }
                    //找到最小子节点，如果比当前节点小，就交换
                    if (data[i] > data[smallerChildIndex]) {
                        int tmp = data[i];
                        data[i] = data[smallerChildIndex];
                        data[smallerChildIndex] = tmp;
                        cur = smallerChildIndex;
                    } else {
                        break;
                    }
                }
            }
        }

//        System.out.println(Arrays.toString(data));
    }


    public static void main(String[] args) {
        int[] input = {251,2412552,23,2,43,1,6,43,52,6,7,45,3,1};
        System.out.println(Arrays.toString(heapSort(input, false)));

    }
}
