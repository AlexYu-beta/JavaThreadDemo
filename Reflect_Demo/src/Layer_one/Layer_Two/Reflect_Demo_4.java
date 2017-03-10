package Layer_one.Layer_Two;

import java.lang.reflect.Constructor;

/**
 * Created by alex on 3/10/17.
 * this demo simply implements getting all the constructors of an object
 * and instantiating an object from a certain class
 */
class User{
    private int age;
    private String name;

    public User(){
        super();
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }

    public User(String name){
        super();
        this.name=name;
    }

    public User(int age,String name){
        super();
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Reflect_Demo_4 {
    public static void main(String args[]) throws Exception {
        Class<?> class1=null;
        class1=Class.forName("Layer_one.Layer_Two.User");
        //method A: instantiate by the default constructor and set the member values by setters
        User user=(User)class1.newInstance();
        user.setAge(18);
        user.setName("Xiao Fu");
        System.out.println(user);
        //method B: get all the constructors and set the member values by constructors
        Constructor<?> constructorList[]=class1.getConstructors();
        for(int i=0;i<constructorList.length;i++){
            //get all the parameters needed for the constructors
            Class<?> classList[]=constructorList[i].getParameterTypes();
            System.out.print("constructors["+i+"](");
            for(int j=0;j<classList.length;j++){
                if(j==classList.length-1){
                    System.out.print(classList[j].getName());
                }else{
                    System.out.print(classList[j].getName()+',');
                }
            }
            System.out.println(")");
        }
    }
}
