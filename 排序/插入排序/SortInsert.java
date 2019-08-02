package SortCharu;

public class SortInsert {
	/*
	 * 插入排序
	 */
	public void insertSort(int array[]) {
		int boundaryEnd = 0;
		int boundaryStart = 0;
		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] < array[j]) {
					boundaryStart = j;
					boundaryEnd = i;
					insertNewArray(array, boundaryStart, boundaryEnd, array[i]);
				}
			}
		}
	}

	/*
	 * 这个函数的作用是：
	 * 将boundaryStart 与 boundaryEnd -1 之间元素后移一个单位
	 * 然后将目标数字插入到 boundaryStart 位置
	 * 如 2 3 4 1 -> 1 2 3 4
	 */
	public void insertNewArray(int array[], int boundaryStart, int boundaryEnd, int insertNum) {

		for (int j = boundaryEnd - 1; j >= boundaryStart; j--) {
			array[j + 1] = array[j];
		}
		array[boundaryStart] = insertNum;
	}
}
