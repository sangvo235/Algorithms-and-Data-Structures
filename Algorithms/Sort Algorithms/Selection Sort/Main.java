public class Main {

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 2, 3, 9, 1, 8, 4, 7};

        System.out.println("Unsorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);

        System.out.println("Sorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
