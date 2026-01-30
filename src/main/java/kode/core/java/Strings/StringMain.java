package kode.core.java.Strings;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringMain {

    String name;
    public static void main(String[] args) {
       /* StringTokenizer stringTokenizer = new StringTokenizer("Hello kodepaka ");
        System.out.println(stringTokenizer.countTokens());

        StringTokenizer stringTokenizer1 = new StringTokenizer("Hello-kodepaka-vivek","-");
        System.out.println(stringTokenizer1.countTokens());
//        while(stringTokenizer1.hasMoreTokens()){
//            System.out.println(stringTokenizer1.nextToken());
//        }
        while(stringTokenizer1.hasMoreElements()){
           // System.out.println(stringTokenizer1.nextElement());
        }*/

     /*   String s = new String("Hello-kodepaka-vivek");
        Arrays.stream(s.split("-")).forEach(sa-> System.out.println(sa));*/

        StringMain stringMain = new StringMain();
        stringMain.name = "vivek";
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(stringMain.name);
        });

        Thread t2 = new Thread(()->{
            stringMain.name+=" kode";
            System.out.println(stringMain.name);
        });

        t1.start();
        t2.start();
    }
}
