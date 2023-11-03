package Example;

public class ChildClass extends ParentClass{



    public static void main(String[] args) {
        ChildClass c = new ChildClass();
        c.marry();
        staticExample();

        ParentClass p = new ParentClass();
        p.marry();
    }

    public void marry(){
        System.out.println("Red Girl");
    }

    public static void staticExample(){
        System.out.println("Child class static method");
    }
}
