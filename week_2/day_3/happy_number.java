class Solution {
    public boolean isHappy(int n) {
        int num = n ;
        while(num!=1 && num!=4){
            int sum = 0 ;
        while(num>0){
        int r = num%10 ;
        sum+= (r*r) ;
        num = num/ 10;
        }
        num = sum ;
        }
        if(num==1) return true ;
        return false ;}}
