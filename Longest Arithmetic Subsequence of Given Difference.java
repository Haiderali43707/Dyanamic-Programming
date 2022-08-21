class Solution {
   
        public int longestSubsequence(int[] arr, int d) {
        Map<Integer,Integer> map = new HashMap<>();
        int n=arr.length;
            int max=0;
            for(int i=0;i<n;i++)
            {
                int target=arr[i]-d;
                int currsum=map.getOrDefault(target,0)+1;
                map.put(arr[i],currsum);
                max=Math.max(max,currsum);
            }
            return max;
    }
    }

