import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
	public static void print(int x){
		System.out.println("X is "+x);
		
	}
	
	public static void message(String messgage){
		System.out.println("Hi "+messgage);
	}
	
	public static void addList(List<Integer> list){
		int sum=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c=ConsumerInterface::message;
		c.accept("varun");
		
		Consumer<Integer> c1=ConsumerInterface::print;
		c1.accept(5);
		
		List<Integer> l=new ArrayList();
		l.add(100);
		l.add(200);	
		l.add(300);
		l.add(400);
		
		Consumer<List<Integer>> c2 = ConsumerInterface::addList;
		c2.accept(l);
		
	}

}
