public class Thread2 implements Runnable{
Threading th2;
public  Thread2(Threading th2){
this.th2=th2;
}

    @Override
    public void run() {
        try{
            System.out.println("thread2...Runnable");
            th2.getMultiples(5);
        }catch (Exception e){
            System.out.println("exception" +e);

        }
    }
}
