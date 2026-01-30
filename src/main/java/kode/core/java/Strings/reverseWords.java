package kode.core.java.Strings;

public class reverseWords {

    public static void main(String[] args) {
        String str ="My name is vivek kodepaka";

        char[] ch = str.toCharArray();
        int start=0;
        for(int i=0;i<=ch.length;i++){
            if((i==ch.length)||(ch[i]==' ') ){
                reverseString(ch,start,i-1);
                start=i+1;
            }
        }
        System.out.println(new String(ch));
    }

    public static void reverseString(char[] ch , int start,int end){

        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end]=temp;

            start++;
            end--;
        }
    }
}
