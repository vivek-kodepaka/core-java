package kode.core.java.Strings;

public class ReverseString {
    public static void main(String[] args) {


        //o(n2)  sp O(N)
       /* String revStr="";
        int lastchar = str.length()-1;
        for(int i=0;i<str.length();i++){
            revStr=revStr + str.charAt(lastchar);
            lastchar--;
        }
        System.out.println(revStr);*/

        //two pointer
        String str= "kodepaka-vivek";
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start++;
            end--;
        }
        System.out.println(new String(ch));




    }
}
