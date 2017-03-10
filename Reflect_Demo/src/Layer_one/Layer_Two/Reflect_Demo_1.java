package Layer_one.Layer_Two;

/**
 * Created by alex on 3/10/17.
 * here is the start of studying reflection mechanism in Java
 * this is a simple demo that implements getting package name and class name of an object
 *
 */
public class Reflect_Demo_1 {
    public static void main(String args[]){
        Reflect_Demo_1 reflect_demo_1=new Reflect_Demo_1();
        System.out.println(reflect_demo_1.getClass().getName());
    }
}
