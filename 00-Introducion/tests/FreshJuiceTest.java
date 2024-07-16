public class FreshJuiceTest {

	public enum FreshJuiceSize {
		SMALL, MEDIUM, LARGE
	};

	FreshJuiceSize size;

	public static void main(String[] args) {

		FreshJuiceTest juice = new FreshJuiceTest();

		juice.size = FreshJuiceTest.FreshJuiceSize.LARGE;

		System.out.println("Tamanho: " + juice.size);
	}
} 