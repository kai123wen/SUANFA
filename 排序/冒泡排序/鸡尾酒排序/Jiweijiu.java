package Sortjiweijiu;

public class Jiweijiu {
	/*
	 * ���� 2 3 4 5 6 1 ���ֵ����У������ʹ�� ��ͳ��ð������ ����Ȼ��Ƚ� n(n-1)/2 �� ��Ȼ�����ܹ�����1����С�ģ����ǵ�����ִ��ʱ
	 * ���ǻ��𲽵ıȽϣ������Ҫ�Ľ�����õķ����������� �Ƚ�һ�ֺ��ٷ���Ƚ�һ��
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

		System.out.println("ִ�д�����" + count);
	}
}
