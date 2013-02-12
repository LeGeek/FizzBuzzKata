
public class FizzBuzz {

	static public String returnAnwser(int i) {
		if (i <= 0 || i > 100) throw new IndexOutOfBoundsException();
		
		if (i % 15 == 0) return "FizzBuzz";
		if (i % 3 == 0) return "Fizz";
		if (i % 5 == 0) return "Buzz";

		return Integer.toString(i);
	}
	
	public static void main(String args[]) {
		String Answers = ""; 
		for (int i = 1; i < 101; ++i) {
			Answers += FizzBuzz.returnAnwser(i) + '\n';
		}
		System.out.println (Answers);
	}
	
}
