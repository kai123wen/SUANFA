package SortXuanze;

public class SortSelect {
	/*
	 * 选择排序
	 */
	public void selectSort(int array[]) {

		int minNumIndex = 0;
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			minNumIndex = findMinNumIndex(array, i);
			temp = array[i];
			array[i] = array[minNumIndex];
			array[minNumIndex] = temp;
		}
	}

	/*
	 *  获取到未排序序列中最小值的索引
	 */
	public int findMinNumIndex(int array[], int boundaryStart) {
		int minNumIndex = boundaryStart;
		int minNum = array[boundaryStart];
		for (int i = boundaryStart; i < array.length; i++) {
			if (array[i] < minNum) {
				minNumIndex = i;
				minNum = array[i];
			}
		}
		return minNumIndex;
	}
}
