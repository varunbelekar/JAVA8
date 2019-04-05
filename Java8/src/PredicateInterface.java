import java.util.function.Predicate;

public class PredicateInterface {
	
	public static boolean checkAge(int age){
		return age>18;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=PredicateInterface::checkAge;
		System.out.println(p.test(19));
		
		/*Predicate<Integer> predicate=p -> p>18;
		System.out.println(predicate.test(10));
		*/
	}

}
