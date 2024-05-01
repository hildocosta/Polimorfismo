package Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;
import Entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {

		// Configura o idioma padrão para entrada de dados
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		// Metodo Instanciar Classe Employee
		List<Employee> list = new ArrayList<>();

		System.out.print(" Enter the number of employees: ");
		int funcionario = scanner.nextInt();

		// Metodo For para ler repetidamente os Funcionarios
		for (int i=1; i <= funcionario; i++) {
			System.out.println(" Employee #" + i + " data:");
			System.out.print(" Outsourced (y/n)?");
			char ch = scanner.next().charAt(0);

			System.out.print(" Name: ");
			scanner.nextLine();
			String name = scanner.nextLine();

			System.out.print(" Hours: ");
			int hours = scanner.nextInt();

			System.out.print(" Value per hour: ");
			double valuePerHour = scanner.nextDouble();

			if (ch == 'y') {
				System.out.print(" Additional charge: ");
				double additionalCharge = scanner.nextDouble();

				// Metodo para instaciar o funcionario terceirizado
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

				// Metodo para adicionar na Lista
				list.add(emp);
			}

			else {

				// Metodo para instaciar o funcionario
				Employee emp = new Employee(name, hours, valuePerHour);

				// Metodo para adicionar na Lista
				list.add(emp);

			}

		}
		
		
		System.out.println();
		System.out.println(" PAYMENTS: ");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		

		scanner.close();

	}

}
