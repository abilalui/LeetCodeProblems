import java.util.Arrays;

public class MergeSort {

    static int[] num1 = {0};
    static int[] num2 = {1};

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums1Counter = 0;
        int nums2Counter = 0;

        while ( nums1Counter < nums1.length ) {

            if ( n <= 0 )
                break;

            if ( nums1[nums1Counter] <= nums2[nums2Counter] ) {
                nums1Counter++;
            } else {
                nums1[nums1Counter + n] = nums1[nums1Counter];
                nums1[nums1Counter] = nums2[nums2Counter];
                nums1Counter++;
                nums2Counter++;
            }
        }
        for ( int i = nums2Counter; i <= n; i++ ) {
            if ( n <= 0 )
                break;
            nums1[m -n +i] = nums2[i];
        }


    }

    public static void main ( String[] args) {

        MergeSort ms = new MergeSort();
        //ms.merge( num1, 0, num2, 1);

        //System.out.println(Arrays.toString( num1 ));
    }
}
