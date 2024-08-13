class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
           int totalSubarrays = n * (n + 1) / 2;
        long[] ans = new long[totalSubarrays];
        int k = 0;

        // Calculate all subarray sums
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                ans[k++] = sum;
            }
        }

        // Sort the array of subarray sums
        Arrays.sort(ans);

        // Calculate the sum from `left` to `right`
        long result = 0;
        for (int i = left - 1; i < right; i++) {
            result += ans[i];
            result %= 1000000007; // To ensure the result fits within the bounds
        }
        
        return (int) result;
    }
}