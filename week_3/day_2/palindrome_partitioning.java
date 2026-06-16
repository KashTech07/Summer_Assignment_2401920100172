class Solution {
    public List<List<String>> partition(String s) {
       ArrayList<String> list = new ArrayList<>() ;
       List<List<String>> ans = new ArrayList<>() ;
       backtrack(list , ans , s ,0) ;
       return ans ;}

       static void backtrack(ArrayList<String> list , List<List<String>> ans , String s , int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(list)) ;
            return ;
        }
        StringBuilder sb = new StringBuilder() ;
        for(int i = index ; i<s.length() ; i++){
            sb.append(s.charAt(i)) ;
            if(isPalin(sb.toString())){
                list.add(sb.toString()) ;
                backtrack(list , ans , s, i+1) ;
                list.remove(list.size()-1) ;
            }
        }
       }

       static boolean isPalin(String s){
        int i = 0 ;
        int j = s.length()-1 ;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false ;
            i++ ;
            j-- ;
        }
        return true ;
       }}
