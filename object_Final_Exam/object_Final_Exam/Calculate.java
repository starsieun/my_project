package object_Final_Exam;

public class Calculate {
	private int[] oddArray, evenArray, dateArray;
	private int oddPlusResult, evenPlusResult, oddMiddleNum, evenMiddleNum, monthDate;

	public Calculate() {
		dateArray = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 각달의 최고일수 배열
	}

	public void divideArray(int[] array) {
		int oddCount = 0;

		for (int count = 0; count < 10; count++) {
			if (array[count] % 2 == 1) {
				oddCount++;
			}
		}

		oddArray = new int[oddCount];
		evenArray = new int[10 - oddCount]; // 홀수 짝수 갯수만큼 배열길이 선언

		int i = 0;
		int oddTmp = 0;
		int evenTmp = 0;

		while (i < 10) {

			if (array[i] % 2 == 1) {
				oddArray[oddTmp] = array[i];
				oddTmp++;
			} else {
				evenArray[evenTmp] = array[i];
				evenTmp++;
			}

			i++; // 각 배열에 값 넣어주기
		}
	}

	public void calculate() {
		for (int i = 0; i < oddArray.length; i++) {
			oddPlusResult = oddPlusResult + oddArray[i];
		}

		for (int i = 0; i < evenArray.length; i++) {
			evenPlusResult = evenPlusResult + evenArray[i];
		} // 홀수, 짝수 더한값 변수에 넣기

		for (int i = 0; i < oddArray.length; i++) {
			for (int j = i; j < oddArray.length; j++) // 첫번째 배열의 값이 두번째 배열보다
			{ // 작으면 자리를 바꿈
				if (oddArray[i] < oddArray[j]) // 순서대로 다음의 배열과 비교하여 작은경우에
				{ // 자리를 바꿈
					int temp = oddArray[i];
					oddArray[i] = oddArray[j];
					oddArray[j] = temp;
				}
			}
		}

		for (int i = 0; i < evenArray.length; i++) {
			for (int j = i; j < evenArray.length; j++) // 첫번째 배열의 값이 두번째 배열보다
			{ // 작으면 자리를 바꿈
				if (evenArray[i] < evenArray[j]) // 순서대로 다음의 배열과 비교하여 작은경우에
				{ // 자리를 바꿈
					int temp = evenArray[i];
					evenArray[i] = evenArray[j];
					evenArray[j] = temp;
				}
			}
		}

		oddMiddleNum = oddArray[oddArray.length / 2];
		evenMiddleNum = evenArray[evenArray.length / 2]; // 중간값 변수에 담기

		int tmp;

		if (oddMiddleNum > evenMiddleNum) {
			tmp = (oddMiddleNum - evenMiddleNum) % 12;
		} else {
			tmp = (evenMiddleNum - oddMiddleNum) % 12;
		}

		monthDate = dateArray[tmp - 1]; // 홀수 짝수 합의 차를 통해 그 달의 최고일수 변수에 담기
	}

	public int getOddPlusResult() {
		return oddPlusResult;
	}

	public int getEvenPlusResult() {
		return evenPlusResult;
	}

	public int getOddMiddleNum() {
		return oddMiddleNum;
	}

	public int getEvenMiddleNum() {
		return evenMiddleNum;
	}

	public int getMonthDate() {
		return monthDate;
	}
}