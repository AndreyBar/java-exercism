class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int length = (int) Math.log10(numberToCheck) + 1;
		int sum = 0;
		int temp = numberToCheck;
		for (int i = 0; i < length; i++) {
			int lastDigit = temp % 10;
			sum += Math.pow(lastDigit, length);
			temp = temp / 10;
		}
		return sum == numberToCheck;
	}
}
