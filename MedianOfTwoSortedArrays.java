
/* Median of Two Sorted Arrays
        Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
        The overall run time complexity should be O(log (m+n)).

        Example1:
        Input:nums1 = [1,3], nums2 = [2]
        Output:2.00000
        Explanation: merged array = [1,2,3] and median is 2.

        Example2:
        Input:nums1 = [1,2], nums2 = [3,4]
        Output:2.50000
        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

        Constraints:


        nums1.length == m

        nums2.length == n

        0 <= m <= 1000

        0 <= n <= 1000

        1 <= m + n <= 2000

        -106 <= nums1[i], nums2[i] <= 106*/









public class MedianOfTwoSortedArrays {


    public static void main(String args[]) {


        int nums1[] = {1, 2, 3};
        int nums2[] = {4, 5, 6,7,8};
        int m = nums1.length;
        int n = nums2.length;
        int nums3Size = m + n;
        int mid=nums3Size/2;

        int nums3[] = new int[nums3Size];
        float median=0f;
        for (int i = 0; i < m; i++) {

            nums3[i] = nums1[i];
        }

        for (int j = 0; j < n; j++) {

            nums3[j + m] = nums2[j];
        }
        for(int k=0;k<nums3Size;k++){

            System.out.println(  nums3[k] );
        }

        if(nums3Size%2!=0){

            median=nums3[mid];
        }
        else{

           float median1=(nums3[mid]+nums3[mid-1]);

           median=(float)median1/2;

        }
        System.out.println("\n Median is :"+     median);
    }
}
