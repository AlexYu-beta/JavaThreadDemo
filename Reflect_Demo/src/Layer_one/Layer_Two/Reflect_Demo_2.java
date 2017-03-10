package Layer_one.Layer_Two;

/**
 * Created by alex on 3/10/17.
 * this simple demo instantiates a normal Class to a specified object in three ways
 */
public class Reflect_Demo_2 {
    public static void main(String args[])throws Exception{
        Class<?> class1=null;
        Class<?> class2=null;
        Class<?> class3=null;
        //method one
        class1=Class.forName("Layer_one.Layer_Two.Reflect_Demo_1");
        //method two
        class2=new Reflect_Demo_1().getClass();
        //method three
        class3=Reflect_Demo_1.class;

        System.out.println("the class name of class1 is: "+class1.getName());
        System.out.println("the class name of class2 is: "+class2.getName());
        System.out.println("the class name of class3 is: "+class3.getName());
    }
}
