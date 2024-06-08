public class Main {

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) 
        {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (arr[j] < pivot) 
            {
                i++;
                // swap(arr[i], arr[j]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap(arr[i+1], arr[high]);
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String args[]) {
        int arr[] = {5, 6, 2, 3, 9, 1, 8, 4, 7};

        System.out.println("Unsorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}