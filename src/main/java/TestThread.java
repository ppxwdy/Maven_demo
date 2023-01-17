class Thread1 extends Thread{
    private Thread t;
    private String threadName;

    Thread1(String name){
        threadName = name;
        System.out.println("Creating the " + threadName);
    }

    public void run(){
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + " counting " + i);
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            System.out.println("the Thread " + threadName + "is interrupted!");
        }
        System.out.println("Thread "  + threadName + "finished.");
    }

    public void start(){
        System.out.println(threadName + "Started!");
        if( t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

public class TestThread {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Thread_1");
        Thread1 t2 = new Thread1("Thread_2");

        t1.start();
        t2.start();
    }

}
