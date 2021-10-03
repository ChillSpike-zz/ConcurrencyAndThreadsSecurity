import java.io.IOException;

public class Thread1 extends Thread{
    public void run(){
        try{
            System.out.println("Threading..1");
        }catch (Exception e){
            System.out.println("exceptiion"+e);
        }
    }
}
