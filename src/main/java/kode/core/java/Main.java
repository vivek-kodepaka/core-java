package kode.core.java;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("kode.core.java.ClassLoadingEx$ClassLoadingEx_inner");

       // double pi = ClassLoadingEx.pi;
        //ClassLoadingEx classLoadingEx = new ClassLoadingEx();

       // ClassLoadingEx.ClassLoadingEx_inner classLoadingEx_inner = new ClassLoadingEx().new ClassLoadingEx_inner();

        Class.forName("kode.core.java.Implen");
    }
}
