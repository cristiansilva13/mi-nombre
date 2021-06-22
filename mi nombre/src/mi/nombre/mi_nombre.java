/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.nombre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author XAVIER
 */

public class mi_nombre {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String a;
		String b;
		System.out.println("ingresar nombre");
		a = bufEntrada.readLine();
		System.out.println(" ingresar apellido");
		b = bufEntrada.readLine();
		System.out.println("hola mi nombre es "+a);
		System.out.println("Mi apellido es  "+b);
	}


}
    
    
