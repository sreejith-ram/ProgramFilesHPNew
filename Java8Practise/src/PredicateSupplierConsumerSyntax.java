import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateSupplierConsumerSyntax {

	public static void main(String[] args) {
		Consumer<String> display= s-> System.out.println(s);
		display.accept("Employee");
		display.accept("Details");
		
		Supplier<String> prints=()->{return "Employee Details";};
		System.out.println(prints.get());
		
		Predicate<Integer> output =i->(i<=12);
		System.out.println(output.test(12));

	}

}
