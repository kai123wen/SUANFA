package SortCharu;

public class SortInsert {
	/*
	 * ��������
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
	 * ��������������ǣ�
	 * ��boundaryStart �� boundaryEnd -1 ֮��Ԫ�غ���һ����λ
	 * Ȼ��Ŀ�����ֲ��뵽 boundaryStart λ��
	 * �� 2 3 4 1 -> 1 2 3 4
	 */
	public void insertNewArray(int array[], int boundaryStart, int boundaryEnd, int insertNum) {

		for (int j = boundaryEnd - 1; j >= boundaryStart; j--) {
			array[j + 1] = array[j];
		}
		array[boundaryStart] = insertNum;
	}
}
