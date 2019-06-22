
public class JiweijiuSort {
	// 鸡尾酒排序
	public void jiweiSort(int array[]) {
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("交换次数:" + (i+1));
			boolean isSorted = true;
			int temp = 0;
			int j;
			for (j = i; j < array.length - i - 1; j++) {
				//开始正向逐个比较大小
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					isSorted = false;
				}
			}
			isSorted = true;
			for (int k=j;k>0;k--) {
				//开始反向逐个比较
				if(array[k] < array[k-1]) {
					temp = array[k];
					array[k] = array[k-1];
					array[k-1] = temp;
					isSorted = false;
				}
			}
			if(isSorted) {
				break;
			}
			
		}
		printArray(array);
	}
	public void printArray(int array[]){
		for (int i=0;i<array.length;i++){
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
