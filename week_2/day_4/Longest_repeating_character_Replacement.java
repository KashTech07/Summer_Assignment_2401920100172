class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26] ;
        int maxfreq = 0 ;
        int ans = Integer.MIN_VALUE ;
        int j = 0 ; 
        for(int i = 0 ; i<s.length() ; i++){
        char c = s.charAt(i) ;
        freq[c - 'A']++ ; 
        maxfreq = Math.max(maxfreq , freq[c-'A']) ;
        while(i-j+1-maxfreq>k){
            freq[s.charAt(j)-'A']-- ;
            j++ ;
        }
        ans = Math.max(ans , i-j+1) ;
        }
        return ans ;}}
