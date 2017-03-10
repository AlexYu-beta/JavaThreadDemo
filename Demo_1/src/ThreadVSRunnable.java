/**
 * Created by alex on 3/10/17.
 * In this demo, we can find that sharing a same member is not available in threads which are created by
 * extending Thread but can be available in those which are created by implementing Runnable
 */
class Thread_Thread extends Thread{

    private int count=10;
    private String name;

    public Thread_Thread(String name){
        this.name=name;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+name+" is running, count= "+count--);
            try {
                sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread_Runnable implements Runnable{

    private int count=10;

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("Thread "+Thread.currentThread().getName()+" is running, count= "+count--);
            try {
                Thread.sleep((int)Math.random()*10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadVSRunnable {

    public static void main(String args[]){
        Thread_Thread thread_thread_1=new Thread_Thread("A");
        Thread_Thread thread_thread_2=new Thread_Thread("B");
        Thread_Runnable thread_runnable_1_Runnable_Obj=new Thread_Runnable();
        System.out.println("the result of sharing a same member by extending Thread:");
        thread_thread_1.start();
        thread_thread_2.start();
        System.out.println("the result of sharing a same member by implementing Runnable:");
        new Thread(thread_runnable_1_Runnable_Obj,"C").start();
        new Thread(thread_runnable_1_Runnable_Obj,"D").start();
    }
}
