package array;
//N = 4
//        arr[] = {-1,-2,-3,-4}
//        Output: -1
//        Explanation: Max sub array sum is -1
//        of element (-1)
//        Your Task:
//        The task is to complete the function maxSubarraySum() which returns the sum of subarray with maximum sum.


public class KadaneAlgo {

    static void maxSubArraySum(int[] arr) {
        int max_so_far = Integer.MIN_VALUE, sum = 0;
        int start = 0;
        int end =0;
        for (int i =0; i<arr.length; i++) {
            // 1, 2, 3, -9, 15, 8

            // here we are gonna check every if condition
            sum = sum + arr[i];
            if (max_so_far < sum) {
                max_so_far = sum;
                end = i;
            }
            if (arr[i] == sum){  // if new index value is also the new sum then update start variable
                start = i;
            }
            if (sum < 0)
                sum = 0;
        }
        //        return max_so_far;

        for (int i = start; i<= end; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Index : ["+ start+", "+ end+"]");
        System.out.println();
        System.out.println("Max Sum is : "+ max_so_far);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, -9, 15, 8};
        maxSubArraySum(arr);
//        System.out.println("max sum is : " + maxSubArraySum(arr));
    }
}
