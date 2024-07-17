public class InstanceVariable {

	// Propriedade ou atributo visivel para qualquer classe filha
	public String name;

	// Propriedade ou atributo visivel somente para esta classe
	private double salary;

	// Construtor da classe
	public InstanceVariable (String employeeName) {
		name = employeeName;
	}

	public void setSalary(double employeeSalary) {
		salary = employeeSalary;
	} 

	public void printEmployee() {
		System.out.println("Nome: " + name);
		System.out.println("Salario: " + salary);
	}

	public static void main(String[] args) {

		InstanceVariable employee = new InstanceVariable("Milenna");

		employee.setSalary(1.500);
		employee.printEmployee();
	}
}