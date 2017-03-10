/**
 * Created by alex on 3/10/17.
 * This demo implements creating a thread by implementing the interface Runnable
 */
public class CreateThread_2 implements Runnable{

    private String name;

    public CreateThread_2(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+name+" is running:  "+ i);
            try {
                Thread.sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        Thread thread1=new Thread(new CreateThread_2("A"));
        Thread thread2=new Thread(new CreateThread_2("B"));
        thread1.start();
        thread2.start();
    }
}
