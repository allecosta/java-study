public class Variable {

	public void ageTest() {
		int age = 1;
		age = age + 19;

		System.out.println("Minha idade é: " + age + " anos.");
	}

	public static void main(String[] args) {
		
		Variable age = new Variable();

		age.ageTest();
	}
}