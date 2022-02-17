package com.kky;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class SortUtil {

    /**
     * 冒泡排序
     */
    public static int[] bubbleSort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        for (int i = 1; i < length; i++) {
            boolean flag = true;
            for (int j = 0; j < length - i; j++) {
                if (array[j] < array[j + 1]) {
                    swap(array, j, j + 1);
                    if (flag) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                break;
            }
        }
        return array;
    }

    /**
     * 希尔排序
     */
    public static int[] shellSort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                int j = i - step;
                int temp = array[i];
                while (j >= 0 && array[j] > temp) {
                    array[j + step] = array[j];
                    j -= step;
                }
                array[j + step] = temp;
            }
        }
        return array;
    }

    /**
     * 递归式归并排序
     */
    public static int[] mergeSort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        int[] result = new int[length];
        mergeSort(array, result, 0, length - 1);
        return array;
    }

    private static void mergeSort(int[] array, int[] result, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        int start1 = start;
        int start2 = mid + 1;
        mergeSort(array, result, start1, mid);
        mergeSort(array, result, start2, end);
        int i = start;
        while (start1 <= mid && start2 <= end) {
            result[i++] = array[start1] < array[start2] ? array[start1++] : array[start2++];
        }
        while (start1 <= mid) {
            result[i++] = array[start1++];
        }
        while (start2 <= end) {
            result[i++] = array[start2++];
        }
        for (int j = start; j <= end; j++) {
            array[j] = result[j];
        }
    }

    public static int[] quickSort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        quickSort(array, 0, length - 1);
        return array;
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = array[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && array[j] >= mid) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }
            while (i < j && array[i] < mid) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }
        }
        array[i] = mid;
        quickSort(array, left, i - 1);
        quickSort(array, i + 1, right);
    }

    public static int[] heapSort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        buildMaxHeap(array, length);
        for (int i = length - 1; i > 0; i--) {
            swap(array, 0, i);
            length--;
            heapify(array, 0, length);
        }
        return array;
    }

    private static void buildMaxHeap(int[] array, int length) {
        for (int i = length / 2; i >= 0; i--) {
            heapify(array, i, length);
        }
    }

    private static void heapify(int[] array, int root, int length) {
        if (root > length) {
            return;
        }
        int left = root * 2 + 1, right = left + 1;
        int maxIndex = root;
        if (right < length && array[right] > array[maxIndex]) {
            maxIndex = right;
        }
        if (left < length && array[left] > array[maxIndex]) {
            maxIndex = left;
        }
        if (maxIndex != root) {
            swap(array, root, maxIndex);
            heapify(array, maxIndex, length);
        }
    }

    public static int[] Sort(int[] sourceArray) {
        int length = sourceArray.length;
        int[] array = Arrays.copyOf(sourceArray, length);
        return array;
    }

    /**
     * 交换数组中的两个元素
     */
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

    }
}
