public class Thread2 implements Runnable{

    @Override
    public void run() {
        try{
            System.out.println("thread2...Runnable");
        }catch (Exception e){
            System.out.println("exception" +e);

        }
    }
}
