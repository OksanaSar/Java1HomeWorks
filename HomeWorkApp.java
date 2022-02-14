public class HomeWorkApp {
	public static void main(String[] args) {
		PrintThreeWords();
		checkSumSign();
		printColor ();
		compareNumbers();
	}

	static void PrintThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}

	static void checkSumSign() {
		int a = 20,b = 30;
		System.out.println(a + b >= 0? "Positive sum" : "Negative sum");
	}

	static void printColor() {
		int value = -3;
		if (value <= 0) {
			System.out.println("Red");
		}
		else if (value > 0 && value <= 100) {
			System.out.println("Yellow");
		}
		else {
			System.out.println("Green");
		}
	}
	static void compareNumbers() {
		int a = 2, b = 2;
		System.out.println (a >= b? "a >= b" : "a < b");
	}
}