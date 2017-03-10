package Layer_one.Layer_Two;

import java.io.Serializable;

/**
 * Created by alex on 3/10/17.
 * this simple demo implements getting the super class and the implemented interfaces of this class
 */
public class Reflect_Demo_3 implements Serializable{


    public static void main(String args[]) throws Exception {
        Class<?> class1=Class.forName("Layer_one.Layer_Two.Reflect_Demo_3");
        //get the super class of this class
        Class<?> class1_super=class1.getSuperclass();
        System.out.println("the super class of this class is: "+class1_super.getName());
        //get all the implemented interfaces of this class
        Class<?> interfaces[]=class1.getInterfaces();
        for(int i=0;i<interfaces.length;i++){
            System.out.println((i+1)+" : "+interfaces[i].getName());
        }
    }

}
