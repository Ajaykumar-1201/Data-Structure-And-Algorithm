class Solution {
    public String reverseOnlyLetters(String s) {
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            while( !( (ch[i]>='a'&&ch[i]<='z')  || (ch[i]>='A'&&ch[i]<='Z') ) ){
                i++;
                if(i>=j) break;
            }
             while( !( (ch[j]>='a'&&ch[j]<='z')  || (ch[j]>='A'&&ch[j]<='Z') ) ){
                 j--;
                 if(j<=i) break;
             }
             if(i<=j){
                 char temp=ch[i];
                 ch[i]=ch[j];
                 ch[j]=temp;
                 i++;
                 j--;
             }
        }
        return String.valueOf(ch);
        
        
    }
}
