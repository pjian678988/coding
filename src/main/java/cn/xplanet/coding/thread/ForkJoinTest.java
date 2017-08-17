package cn.xplanet.coding.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * @since 1.7
 */
public class ForkJoinTest {
	private static double[] d;

	private class ForkJoinTask extends RecursiveTask<Integer> {
		private int first;
		private int last;

		public ForkJoinTask(int first, int last) {
			this.first = first;
			this.last = last;
		}

		protected Integer compute() {
			int subCount;
			if (last - first < 10) {
				subCount = 0;
				for (int i = first; i <= last; i++) {
					if (d[i] < 0.5)
						subCount++;
				}
			} else {
				int mid = (first + last) >>> 1;
				ForkJoinTask left = new ForkJoinTask(first, mid);
				left.fork();
				ForkJoinTask right = new ForkJoinTask(mid + 1, last);
				right.fork();
				subCount = left.join();
				subCount += right.join();
			}
			return subCount;
		}
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start random : ");
		d = createArrayOfRandomDoubles();
		System.out.println("end random : " + (System.currentTimeMillis()-start));
		start = System.currentTimeMillis();
		int n = new ForkJoinPool().invoke(new ForkJoinTest().new ForkJoinTask(0, 99999));
		System.out.println("Found " + n + " values");
		System.out.println("end fork : " + (System.currentTimeMillis()-start));
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
