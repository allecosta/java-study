public class Constant {

	// Variavel, propriedade ou atributo salary, é do tipo double, estatica e privada.
	private static double salary;

	// Variavel, propriedade ou atributo DEPARTAMENT, é uma constante.
	public static final String DEPARTAMENT = "Development";

	public static void main(String[] args) {

		salary = 996.79;

		System.out.println("Salario: " + salary);
		System.out.println("Departamento: " + DEPARTAMENT);
	}
}