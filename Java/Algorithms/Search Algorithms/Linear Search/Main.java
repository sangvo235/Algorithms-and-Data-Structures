public class Main {

    public static void main(String[] args) {

        int[] array = { 2, 7, 3, 10, 9, 1, 5 };

        int index = linearSearch(array, 11);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

}