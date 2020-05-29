package demo.com.CoreJava.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class HelloJava8 {

	void cunsumerJava() {
		
		List<String> student = Arrays.asList("Pankaj", "Rakesh", "Lokesh");

		// consumer interface which takes single input and return void
		Consumer<String> consumer = (String s) -> {

			System.out.println(s);

		};

		for (String s : student)
			consumer.accept(s);

		// 2 input and int return
		Comparator<String> comp = (String s1, String s2) -> {

			return s1.compareTo(s2);
		};

	}

	public static void main(String[] args) {

	}

}
