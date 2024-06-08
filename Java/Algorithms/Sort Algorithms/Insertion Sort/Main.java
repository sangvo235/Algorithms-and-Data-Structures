public class Main {

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;

        }

    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 2, 3, 9, 1, 8, 4, 7};

        System.out.println("Unsorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("Sorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
