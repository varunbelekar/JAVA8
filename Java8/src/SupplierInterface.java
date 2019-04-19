import java.util.function.Supplier;

import com.varun.model.Person;

interface supply{
	public Person getPerson();
}

public class SupplierInterface {
	
	public static Person getPerson(){
		return new Person(7,"varun","belekar");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Using Method Reference*/
		Supplier<Person> s=SupplierInterface::getPerson;
		System.out.println(s.get());
		
		Supplier<Person> s1=()->new Person(8,"ar","tk");
		System.out.println(s1.get());
		
	}

}
