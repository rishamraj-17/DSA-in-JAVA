// Insertion sort in Java

import java.util.Arrays;

class InsertionSort {

  void insertionSort(int array[], int n) {
    int i, key, j;
    for (i = 1; i < n; i++) {
        key = array[i];
        j = i - 1;

        // Move elements of array[0..i-1], that are greater than key, to one position ahead of their current position
        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j = j - 1;
        }
        array[j + 1] = key;
    }
}
  // Driver code

  public static void main(String args[]) {

    int[] data = { 9, 5, 1, 4, 3 };

    InsertionSort is = new InsertionSort();

    is.insertionSort(data);

    System.out.println("Sorted Array in Ascending Order: ");

    System.out.println(Arrays.toString(data));

  }

}
