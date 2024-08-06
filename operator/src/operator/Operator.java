package operator;

public class Operator {
	public static void main(String[] args) {

		// arethmetic operator
		int a = 10;
		int b = 5;

		System.out.println("Addition: " + (a + b)); // 15
		System.out.println("Subtraction: " + (a - b)); // 5
		System.out.println("Multiplication: " + (a * b)); // 50
		System.out.println("Division: " + (a / b)); // 2
		System.out.println("Modulus: " + (a % b)); // 0

		// Relational Operators

		System.out.println("a is equal to b: " + (a == b)); // false
		System.out.println("a is not equal to b: " + (a != b)); // true
		System.out.println("a is greater than b: " + (a > b)); // true
		System.out.println("a is less than b: " + (a < b)); // false
		System.out.println("a is greater than or equal to b: " + (a >= b)); // true
		System.out.println("a is less than or equal to b: " + (a <= b)); // false

		// Unary Operators
		int c = 10;

		System.out.println("c: " + c); // 10
		System.out.println("++c: " + ++c); // 11
		System.out.println("c++: " + c++); // 11
		System.out.println("c: " + c); // 12
		System.out.println("--c: " + --c); // 11
		System.out.println("c--: " + c--); // 11
		System.out.println(": " + c); // 10
		System.out.println("Unary minus: " + -c);// -10

		// Bitwise Operators

		System.out.println("a & b: " + (a & b)); // 1 (0001 in binary)
		System.out.println("a | b: " + (a | b)); // 7 (0111 in binary)
		System.out.println("a ^ b: " + (a ^ b)); // 6 (0110 in binary)
		System.out.println("~a: " + (~a)); // -6 (two's complement of 0101)
		System.out.println("a << 1: " + (a << 1));// 10 (1010 in binary)
		System.out.println("a >> 1: " + (a >> 1));// 2 (0010 in binary)
		System.out.println("a >>> 1: " + (a >>> 1));// 2 (0010 in binary)

	}
}
