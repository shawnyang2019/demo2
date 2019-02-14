package com.fiberhome.demo.threads;

/**
 * @author vv
 * @since 2019/2/13
 */
public class PrintTask implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println("+++");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
