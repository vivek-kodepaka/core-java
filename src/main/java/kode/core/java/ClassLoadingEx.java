package kode.core.java;

public class ClassLoadingEx {
    static double pi = 3.14;
    static {
        System.out.println("inside outer static block");
    }

    {
        System.out.println("inside outer instance block");
    }

    ClassLoadingEx(){
        System.out.println("inside outer Constructor");
    }


    public class ClassLoadingEx_inner{
        static {
            System.out.println("inside inner static block");
        }

        {
            System.out.println("inside inner instance block");
        }

        ClassLoadingEx_inner(){
            System.out.println("inside inner  Constructor");
        }
    }
}
