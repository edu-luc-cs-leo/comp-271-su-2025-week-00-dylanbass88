import java.util.Arrays;

public class Realistic {

    static int[] arr = { 10, -5, 11, 2 };

    public static int getSmallest() {
        int smallest_index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[smallest_index]) {
                smallest_index = i;
            }
        }

        int result = arr[smallest_index];
        int[] temporary = new int[arr.length - 1];

        for (int i = 0; i < smallest_index; i++) {
            temporary[i] = arr[i];
        }
        for (int i = smallest_index + 1; i < arr.length; i++) {
            temporary[i - 1] = arr[i];
        }

        arr = temporary;
        return result;
    }

    public static void add(int value) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = value;
        arr = newArr;
    }

    public static void main(String[] args) {
        System.out.printf("\n\nArray before removal of smallest element: %s", Arrays.toString(arr));
        System.out.printf("\nSmallest element found: %d", getSmallest());
        System.out.printf("\nArray after removal of smallest element: %s", Arrays.toString(arr));

        add(99);
        System.out.printf("\nArray after adding new value 99: %s\n\n", Arrays.toString(arr));
    }
}
