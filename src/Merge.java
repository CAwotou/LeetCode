public class Merge {
    public void mergeArry(int nums1[], int m, int nums2[], int n) {
//        int nums[]=new int[m+n];
//        int index=0;
//        int p1=0,p2=0;
//        while (p1<m&&p2<n){
//            if(nums1[p1]<=nums2[p2]){
//                nums[index]=nums1[p1];
//                index++;
//                p1++;
//            }
//            else {
//                nums[index]=nums2[p2];
//                index++;
//                p2++;
//            }
//        }
//       if(p1<m){
//            System.arraycopy(nums1,p1,nums,index,m+n-index);
//       }
//       if(p2<n){
//            System.arraycopy(nums2,p2,nums,index,m+n-index);
//       }

        while (n > 0) {
            if (m == 0 || nums1[m - 1] < nums2[n - 1]) {
                nums1[m + n - 1] = nums2[--n];
            } else {
                nums1[m + n - 1] = nums1[--m];
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static void main(String[] args) {
        Merge test = new Merge();
        int a[] = {1, 2, 3, 0, 0, 0};
        int b[] = {2, 5, 6};
        test.mergeArry(a, 3, b, 3);
    }
}
