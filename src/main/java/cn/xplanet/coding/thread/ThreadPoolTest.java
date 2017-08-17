package cn.xplanet.coding.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
	private static double[] d;

	private class ThreadPoolExecutorTask implements Callable<Integer> {
		private int first;
		private int last;

		public ThreadPoolExecutorTask(int first, int last) {
			this.first = first;
			this.last = last;
		}

		public Integer call() {
			int subCount = 0;
			for (int i = first; i <= last; i++) {
				if (d[i] < 0.5) {
					subCount++;
				}
			}
			return subCount;
		}
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
        d = createArrayOfRandomDoubles();
        ThreadPoolExecutor tpe = new ThreadPoolExecutor(4, 4, Long.MAX_VALUE, TimeUnit.SECONDS, new LinkedBlockingQueue());
        Future[] f = new Future[4];
        int size = d.length / 4;
        for (int i = 0; i < 3; i++) {
            f[i] = tpe.submit(new ThreadPoolTest().new ThreadPoolExecutorTask(i * size, (i + 1) * size - 1));
        }
        f[3] = tpe.submit(new ThreadPoolTest().new ThreadPoolExecutorTask(3 * size, d.length - 1));
        int n = 0;
        for (int i = 0; i < 4; i++) {
            n += (int)f[i].get();
        }
        System.out.println("Found " + n + " values");
    }
	
	public static double[] createArrayOfRandomDoubles(){
		int capacity = 100000;
		double[] d = new double[capacity];
		for(int i=0; i<capacity;i++){
			d[i] = Math.random();
		}
		return d;
	}
}
