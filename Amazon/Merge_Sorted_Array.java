public class Merge_Sorted_Array {
    public static void Merge(int nums1[], int nums2[], int n, int m) {
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                k--;
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            i--;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 3, 5, 7, 0, 0, 0, 0 };
        int arr2[] = { 2, 4, 6, 8 };
        Merge(arr1, arr2, 4, 4);
        System.out.println("Sorted Merged Array :");
        for (int n : arr1) {
            System.out.print(n + "\t");
        }
    }
}
