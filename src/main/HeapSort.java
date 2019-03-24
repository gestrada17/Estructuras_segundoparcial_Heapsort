
package main;

import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort {
    private int n;
    //Queue<Integer> cola = new PriorityQueue<Integer>();

    public void heap(int array[]) {
        n = array.length-1;
        for (int i = n/2; i >= 0; i--) {
            maxheap(array, i);
        }
    }

    public void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void maxheap(int array[], int i) {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= n && array[left] > array[i]) {
            max = left;
        }
        if (right <= n && array[right] > array[max]) {
            max = right;
        }
        if (max != i) {
            swap(array, i, max);
            maxheap(array, max);
        }
    }

    public void sort(int array[]) {
        heap(array);
        for (int i = n; i > 0; i--) {
            swap(array,0, i);
            n -= 1;
            maxheap(array, 0);
        }
        System.out.print("ARREGLO: ");
        if(array.length > 15) {
            for(int i = 0; i < 15; i++) {
                System.out.print(array[i]+", ");
            }
        } else {
            for(int i = 0; i < array.length; i++) {
                System.out.print(array[i]+", ");
            }
        }
    }
}