public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { -3, -5, -6 };
        int n = arr.length;

        System.out.println(maxSubarraySum(arr, n));
    }

    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long maxSum = Integer.MIN_VALUE;
        long currSum = 0;
        for (int num : arr) {
            if (currSum < 0) {
                currSum = 0;
            }
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }
        return Math.max(maxSum, 0);
    }
}
