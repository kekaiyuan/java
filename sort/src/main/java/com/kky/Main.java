package com.kky;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author 柯凯元
 * @date 2023-10-12 15:45
 */
public class Main {

    public static void main(String[] args) {
        Function<int[], int[]> bubbleSort = SortUtil::bubbleSort;

        Map<String, Function<int[], int[]>> sortMethodMap = new HashMap<String, Function<int[], int[]>>() {{
            put("冒泡排序", SortUtil::bubbleSort);
            put("堆排序", SortUtil::heapSort);
            put("归并排序", SortUtil::mergeSort);
            put("快速排序", SortUtil::quickSort);
            put("希尔排序", SortUtil::shellSort);
        }};
        int[] array = new int[20];
        for (int i = 0; i < 10; i++) {

        }
        int[] array2 = new int[]{4, 3, 2, 1};
        int[] result = SortUtil.insertSort(array2);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

}
