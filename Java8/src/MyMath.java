
public class MyMath {

	public boolean checker(PerformOperation op, int num) {
		return op.test(num);
	}
	
	public PerformOperation isOdd() {
		return n -> n % 2 != 0;
	}

	

	public PerformOperation isPrime() {
		return n -> {
			if(n <= 1){
				return false;
			}
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0){
					return false;
				}
			}
			return true;
		};
	}

	public PerformOperation isPalindrome() {

		return n -> {
			String s = Integer.toString(n);
			StringBuilder sb = new StringBuilder(s);
			System.out.println("Orginal " + s.toString() + " Reverser: " + sb.reverse());
			return Integer.toString(n).equalsIgnoreCase(sb.reverse().toString());
		};
	}

}
