package cn.xplanet.coding.thread.concurrency;

import java.util.concurrent.Semaphore;

/**
 * 
 * Semaphore - 线程请求可用的许可才能执行
 * 
 * @author Administrator
 * @version 1.0.0 SemaphoreTest.java 2015-3-12 下午5:42:54
 */
public class SemaphoreTest {

	Semaphore binary = new Semaphore(1);
	  
    public static void main(String args[]) {
        final SemaphoreTest test = new SemaphoreTest();
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
      
        new Thread(){
            @Override
            public void run(){
              test.mutualExclusion(); 
            }
        }.start();
        
        new Thread(){
        	@Override
        	public void run(){
        		test.mutualExclusion(); 
        	}
        }.start();
      
    }
  
    private void mutualExclusion() {
        try {
            binary.acquire();

            //mutual exclusive region
            System.out.println(Thread.currentThread().getName() + " inside mutual exclusive region");
            Thread.sleep(1000);

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        } finally {
        	System.out.println(Thread.currentThread().getName() + " outside of mutual exclusive region");
            binary.release();
        }
    }


}
