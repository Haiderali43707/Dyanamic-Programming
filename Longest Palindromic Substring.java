class Solution {
    public String longestPalindrome(String s) {
        
        int n = s.length(); // string ki length nikali
        boolean[][] dp = new boolean[n][n]; // boleean aaray banaya taki usme pallendromuc string ko true rakh ske and non ko false rakh ske 
        
        String ans = "";  // answer return karane k lie
        int len = 0;
        
        for(int g = 0 ; g < n ; g++) // this is the gap betweeen extreeemees start and end
        {
            
            for(int i = 0 , j = g ; j < dp[0].length ; i++, j++)  // i aur j diagonals hau jo hamne banye hai 
            {
                
                if(g == 0) // gap 0 hua to means zero 1 length strings
                {
                    dp[i][j] = true;
                }else if(g == 1) // agr gap 1 hua to matlb 2 length strings and we check for them
                {
                    if(s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                else    // iska matlb gap 3 se zyada hua to phir hum character check karenge aur dekhenge k uss diagonal k adjacent me true hai ya ni 
                {
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = false;
                    }
                }
                
                if(dp[i][j]){
                    int l = g+1;  // agr hame length nikalni hote to hum bss l return kr dete 
                    if(l > len){
                        ans = s.substring(i,j+1);
                    }
                }
            }
        }
        
        return ans;
    }
}
