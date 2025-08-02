package array.facil;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx1 = m - 1;
        int idx2 = n - 1;
        int actIdx = nums1.length - 1;

        while(idx1 >= 0 && idx2 >= 0) {
            if (nums1[idx1] > nums2[idx2]) {
                nums1[actIdx] = nums1[idx1];
                idx1--;
            } else {
                nums1[actIdx] = nums2[idx2];
                idx2--;
            }
            actIdx--;
        }   
        while (idx2 >= 0) {
            nums1[actIdx] = nums2[idx2];
            idx2--;
            actIdx--;
        }
    }
}
