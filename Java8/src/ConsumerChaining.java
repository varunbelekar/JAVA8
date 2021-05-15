import java.util.function.Consumer;

public class ConsumerChaining {
	public static void main(String[] args) {
		Consumer<Integer> squareOf = integer -> System.out.println("squaring integer : " + integer * integer);
		Consumer<Integer> doubleOf = integer -> System.out.println("doubling integer : " + integer * 2);
		
		squareOf.andThen(doubleOf).accept(5);
	}
}
