package kode.core.java.Strings;

public class Main {

    //Student is mutable class

    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(10);
       // s.setName(new StringBuilder("1234567890"));
        s.setName("1234567890");
        Main m = new Main();
        Thread t = new Thread(()->{
            String name1 = s.name;
            m.validate(name1);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name1);
        });

        Thread t2 = new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            s.setName(s.getName() + "kode");
            System.out.println(s.getName());
        });
        t.start();
        t2.start();

    }

    void validate(String name){
        if(name.length() == 10){
            return;
        }
        throw  new RuntimeException("enter valid string");
    }

}
