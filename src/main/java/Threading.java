public class Threading{
    public static void main(String[] args) {
    int n=10;
    Threading thr=new Threading();
    for(int i=0;i<n;i++){

        Thread1 t1=new Thread1(thr);
        t1.start();

        Thread t2=new Thread(new Thread2(thr));
        t2.start();
    }


    }

    synchronized void getMultiples(int num) {
        for(int i=0;i<=5;i++){
            System.out.println(num * i);
            try{
                Thread.sleep(450);

            }catch (Exception e){

                System.out.println("exception"+e);
            }
        }
    }
}
