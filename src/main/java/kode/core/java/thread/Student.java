package kode.core.java.thread;

public class Student extends Thread{

    @Override
    public void run() {
        System.out.println("in Student run");
    }
}
