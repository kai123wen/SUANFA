package Sort;

public class Maopao {
	public void firstSortArray(int array[]) {
		int temp = 0;
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				count++;
				if (array[j] > array[j + 1]) {

					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("执行次数："+count);
	}

	public void secondSortArray(int array[]) {
		int temp = 0;
		int count = 0;
		boolean sorted = false;
		for (int i = 0; i < array.length - 1; i++) {
			sorted = false;
			for (int j = 0; j < array.length - i - 1; j++) {
				count++;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = true;
				}
			}
			if (sorted == false) {
				break;
			}
		}
		System.out.println("执行次数："+count);
	}

//	这个函数就是要解决 如 3 2 4 5 6 这样的序列的排序问题
//	这里最重要的就是 找到无序区的边界
	public void thirdSortArray(int array[]) {
		int temp = 0;
		int count = 0;
		int boundaryTemp = 0;
		int boundary = array.length;
		boolean sorted = false;

		for (int i = 0; i < boundary - 1; i++) {
			sorted = false;
			for (int j = 0; j < boundary - 1; j++) {
				count++;
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					sorted = true;
					boundaryTemp = j;
				}
			}
			boundary = boundaryTemp;
			
			if (sorted == false) {
				break;
			}
		}
		System.out.println("执行次数："+count);
	}
}
