package EXAMEN_16MPRIMO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Examen16mPrimo {

	public static void main(String[] args) {
		
		System.out.println("Buenos días CEINMARK, soy Luis Portilla");
		System.out.println("Introduce un núñmero primo");

	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce un número: ");
	        int numero = scanner.nextInt();

	        if (esPrimo(numero)) {
	            System.out.println(numero + " es un número primo.");
	            List<Integer> divisores = obtenerDivisores(numero);
	            System.out.print("Divisores de " + numero + ": ");
	            for (int divisor : divisores) {
	                System.out.print(divisor + " ");
	            }
	        } else {
	            System.out.println(numero + " no es un número primo.");
	            List<Integer> divisores = obtenerDivisores(numero);
	            System.out.print("Divisores de " + numero + ": ");
	            for (int divisor : divisores) {
	                System.out.print(divisor + " ");
	            }
	        }

	        scanner.close();
	    }

	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(numero); i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static List<Integer> obtenerDivisores(int numero) {
	        List<Integer> divisores = new ArrayList<>();
	        for (int i = 1; i <= numero; i++) {
	            if (numero % i == 0) {
	                divisores.add(i);
	            }
	        }
	        return divisores;
	    }
}



