import java.util.function.Predicate;

public class PredicateInterface {
	
	public static boolean checkAge(int age){
		return age>18;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=PredicateInterface::checkAge;
		System.out.println(p.test(19));
		
		Predicate<Integer> p1 = p2 -> p2 > 18;
		System.out.println(p1.test(18));
	}

}
