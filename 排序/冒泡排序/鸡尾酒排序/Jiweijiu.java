package Sortjiweijiu;

public class Jiweijiu {
	/*
	 * 对于 2 3 4 5 6 1 这种的数列，如果再使用 传统的冒泡排序， 就仍然会比较 n(n-1)/2 次 虽然我们能够看到1是做小的，但是当程序执行时
	 * 还是会逐步的比较，因此需要改进，最好的方法就是正向 比较一轮后，再反向比较一轮
	 */
	public void jiweijiuSort(int array[]) {
		int count = 0;
		int temp = 0;
		boolean sorted = false;
		for (int i = 0; i < array.length / 2; i++) {
			sorted = false;

			for (int j = i; j < array.length - i - 1; j++) {
				count++;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = true;
				}
			}
			for (int j = array.length - i - 1; j > i; j--) {
				count++;
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
					sorted = true;
				}
			}

			if (sorted == false) {
				break;
			}
		}

		System.out.println("执行次数：" + count);
	}
}
