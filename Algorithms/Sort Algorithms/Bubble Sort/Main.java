public class Main {

    private static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        int arr[] = {5, 6, 2, 3, 9, 1, 8, 4, 7};

        System.out.println("Unsorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        bubbleSort(arr);

        System.out.println("Sorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}