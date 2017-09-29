public class Solution {

    public static void main(String [] args){

        int [] A = {1,2,3};
        Solution a = new Solution();
        System.out.println(a.search(A,1));

    }

    /*
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {

        if(A == null || A.length == 0){
            return -1;
        }

        int start = 0;
        int end = A.length -1;
        while(start + 1 < end){
            int mid = (end - start)/2 + start;
            if(A[start] < A[mid]){
                if(A[start] <= target && target <= A[mid]){
                    end = mid;
                }
                else{
                    start = mid;
                }
            }else{
                if(A[mid] <= target && target <= A[end]){
                    start = mid;
                }
                else{
                    end = mid;
                }
            }
        }

        if(A[start] == target){
            return start;
        }
        if(A[end] == target){
            return end;
        }
        return -1;
    }
}