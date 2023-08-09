class Solution {


    public boolean binarySearch( int[] array, int num ) {

        int med = ( array.length - 1) / 2;
        int low = 0;
        int high = array.length - 1;

        while ( low <= high ) {


            if (array[med] == num) {
                return true;
            } else if ( array[med] > num ) {
                high = med - 1;
                med = ( low + high ) / 2;
            } else {
                low = med + 1;
                med = ( low + high) / 2;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int mid = ( matrix.length - 1) / 2;
        int low = 0;
        int high = matrix.length - 1;

        while ( low <= high ) {

            if ( matrix[mid][ matrix[mid].length -1 ] == target  ) {
                return true;
            } else if ( matrix[mid][ matrix[mid].length -1 ] < target ) {
                low = mid + 1;
                mid = ( low + high ) / 2;
            } else if ( matrix[mid][ 0 ] > target ) {
                high = mid - 1;
                mid = ( low + high ) / 2;
            } else {
                return  binarySearch( matrix[mid], target );
            }
        }

        return false;
    }




    public static void main( String[] args ) {

        Solution s = new Solution();

        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int[] arr = {10, 11, 16, 20};

        System.out.println( s.searchMatrix( matrix, 16));
        //System.out.println( s.binarySearch( arr, 16 ));
    }
}