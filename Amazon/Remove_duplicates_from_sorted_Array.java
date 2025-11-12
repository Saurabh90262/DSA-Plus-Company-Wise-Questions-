public class Remove_duplicates_from_sorted_Array {
    public static int remove(int[] arr) {
        // Two Pointer approach
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 4, 5 };
        int idx = remove(arr);
        System.out.println("Final Array after removal of duplicates is :");
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i]);
        }
    }
}
