package com.thread;
public class YiledTest implements Runnable {

    private String name;

    public YiledTest(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println(name + ":" + i);
            if (i == 30) {
                Thread.yield();   //this thread will be pending, the other thread will be ran. Actually nothing happens.
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
        Thread t1 = new Thread(new YiledTest("t1"));
        Thread t2 = new Thread(new YiledTest("t2"));
        t1.start();
        t2.start();
    }

}