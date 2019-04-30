package com.thread;
public class JoinTest implements Runnable {

    private String name;

    public JoinTest(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(name + ":" + i);
            if (i == 30) {
                Thread.yield();
            }
        }
    }

    /**
     * 暂停当前正在执行的线程对象，并执行其他线程。
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Thread t1 = new Thread(new JoinTest("t1"));
        Thread t2 = new Thread(new JoinTest("t2"));
        Thread t3 = new Thread(new JoinTest("t3"));
     
        t1.start();
        t3.start();
        t1.join();    //the thread will waiting until the it finished.
        t2.start();
        
   // sun.misc.Unsafe a = new  sun.misc.Unsafe();
    
    }

}