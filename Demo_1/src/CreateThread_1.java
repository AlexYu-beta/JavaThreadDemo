/**
 * Created by alex on 3/10/17.
 * This demo implements creating a thread by extending class Thread
 */
public class CreateThread_1 extends Thread{

    private String name;

    public CreateThread_1(String name){
        this.name=name;
    }

    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+name+" is running:  "+ i);
            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]){
        CreateThread_1 thread_1=new CreateThread_1("A");
        CreateThread_1 thread_2=new CreateThread_1("B");
        thread_1.start();
        thread_2.start();
    }
}
