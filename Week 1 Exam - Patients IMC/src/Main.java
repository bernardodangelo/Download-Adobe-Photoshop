import java.util.Scanner;
import entities.Paciente;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		Paciente paciente1 = new Paciente(70.5, 1.75);
		Paciente paciente2 = new Paciente(90.0, 1.80);
		Paciente paciente3 = new Paciente(60.0, 1.60);
		
		System.out.println("Paciente 1:");
		System.out.println("IMC: " + paciente1.calcularIMC());
		System.out.println("Diagnóstico: " + paciente1.diagnostico());
		
		System.out.println();
		
		System.out.println("Paciente 2:");
		System.out.println("IMC: " + paciente2.calcularIMC());
		System.out.println("Diagnóstico: " + paciente2.diagnostico());
		
		System.out.println();
		
		System.out.println("Paciente 3:");
		System.out.println("IMC: " + paciente3.calcularIMC());
		System.out.println("Diagnóstico: " + paciente3.diagnostico());
		
		sc.close();
		
	}

}
