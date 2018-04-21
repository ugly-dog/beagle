public class puff {
    class OneRunnable implements Runnable{

        @Override
        public void run() {
                    for (int i=0;i<30;i++){
                        System.out.println("runnable 1  for:"+i+"times!");
                        try{
                            Thread.sleep(50);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
        }
    }
    class OneThread extends Thread {
        @Override
        public void run() {
           for (int i=0;i<30;i++){
               System.out.println("Thread 1 for:"+i+"times!");


           }
        }
    }
       public  static void main(String[] args) {
        puff sleep=new puff();
        Thread r1=new Thread(sleep.new OneRunnable());
        Thread th1=sleep.new OneThread();
        r1.start();
        th1.start();
       }
}
