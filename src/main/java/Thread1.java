import java.io.IOException;

public class Thread1 extends Thread{
    Threading th;
    public  Thread1(Threading th){
    this.th=th;
    }

    public void run(){
        try{
            System.out.println("Threading..1");
            th.getMultiples(3);

        }catch (Exception e){
            System.out.println("exceptiion"+e);
        }
    }
}
