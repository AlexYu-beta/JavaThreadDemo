import java.util.ArrayList;

/**
 * Created by alex on 3/10/17.
 */
class SubThread implements Runnable{

    private String name;
    private ArrayList<Integer> numberArray;
    private int order;

    public SubThread(String name,int order){
        this.name=name;
        this.order=order;
        this.numberArray=new ArrayList<>();
    }

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            numberArray.add(order*10+i);
        }
        showArray();
    }

    private void showArray(){
        System.out.println("the elements of sub-thread "+name+" is:");
        for(int i:numberArray){
            System.out.println(i);
        }
    }

    public ArrayList<Integer> getNumberArray() {
        return numberArray;
    }
}

public class CreateThread_3 implements Runnable{

    private String name;
    private ArrayList<Integer> numberArray;

    public CreateThread_3(String name){
        this.name=name;
        this.numberArray=new ArrayList<>();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            Thread thread=new Thread(new SubThread("sub-thread "+i,i));
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        showArray();
    }

    private void showArray(){
        System.out.println("the elements of main-thread "+name+" is:");
        for(int i:numberArray){
            System.out.println(i);
        }
    }

    private void fetchData(SubThread subThread){
        this.numberArray.addAll(subThread.getNumberArray());
    }

    public static void main(String args[]){
        Thread main_thread=new Thread(new CreateThread_3("main-thread"));
        main_thread.start();
        try {
            main_thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
