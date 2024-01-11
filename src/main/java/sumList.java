import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class sumList {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 14};
		//getSubArray(intArr);

		testSum();
	}

	public static void testSum(){
		List<Integer> integerList = Arrays.asList(1, 1,16,54, 4, 67);
		Integer intSum = integerList.stream().reduce(0, (a,b) -> a + b);
		System.out.println(intSum);
	}
	public static List<Integer> getSubArray(int[] intArr) {

		int len = intArr.length;
		int sum = 15;
		List<Integer> newList = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				int newSum = intArr[i] + intArr[j] + intArr[len - j];
				if (newSum == sum) {
					newList.add(intArr[i]);
					newList.add(intArr[j]);
					newList.add(intArr[i]);
					System.out.println(newList);

				} else {
					//
				}
			}
			}
			return newList;
		}
	}