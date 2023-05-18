class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        int index=0;
        int min=0;
        String result="";
        if(len1>len2){
            index=len1;
            min=len2;
        }else {
            index=len2;
            min=len1;
        }
        
        for(int i=0;i<index;i++){
            
            if(i>=min){
                if(min==len1){
                    result+=word2.charAt(i);
                }else{
                     result+=word1.charAt(i);
                }
            }
            else{
               result+=word1.charAt(i);
               result+=word2.charAt(i);
               
            }
            
            
        }
        return result;
    }
}