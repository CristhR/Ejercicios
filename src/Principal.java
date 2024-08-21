import java.util.Scanner;

//ejercicio en clase sobre notas de estudiantes

public class Principal {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("A cuantos estudiantes se va a evaluar?: ");
		int totalEstudiantes = s.nextInt();
		
		String[] listaEstudiantes = new String[totalEstudiantes];
		int[] notaEstudiantes = new int[totalEstudiantes];
		
		System.out.println("Ingrese los nombres de los estudiantes con su respectiva nota: ");
		
		for (int i = 0; i < totalEstudiantes; i++) {
		    System.out.print((i + 1) + ". Ingrese nombre del estudiante: ");
		    listaEstudiantes[i] = s.next();
		    System.out.print("Ingrese nota de " + listaEstudiantes[i] + ": ");
		    notaEstudiantes[i] = s.nextInt();
		}
		
		for (int i = 0; i < totalEstudiantes; i++) {
		    System.out.println(listaEstudiantes[i] + " sacó: " + notaEstudiantes[i]);
		}

		
		s.close();
	}
}
