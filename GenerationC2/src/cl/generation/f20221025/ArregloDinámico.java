package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinámico {

	public static void main(String[] args) {
		// Arraylist
		// es un arreglo dinámico con la ventaja que no debes necesariamente declarar el
		// tamaño
		// ArrayList<TipoDeDato> nombre_array = ArrayList<TipoDato>();
		// para importar todo de una es control+shift+o
		ArrayList<String> grupo2 = new ArrayList<String>();
		// agregar valor
		grupo2.add("Vale");
		grupo2.add("Diego");
		grupo2.add("Ariel");
		grupo2.add("Fran");
		grupo2.add("Nathalie");
		System.out.println(grupo2);
		// tamaño arraylist
		System.out.println(grupo2.size());
		// si es size es dinámico y length estático
		// obtener un elemento dentro del arreglo
		System.out.println(grupo2.get(3));
		// eliminar un elemento del array
		grupo2.remove(3);
		System.out.println(grupo2);
		// recorrer el ArrayList
		for (int i = 0; i < grupo2.size(); i++)
			System.out.println("grupo 2: " + grupo2.get(i));
		System.out.println("++++++++++");
		// for iterador
		for (String grupo : grupo2) {
			System.out.println(grupo);
			
			
			ArrayList<Integer> numeros = new ArrayList<Integer>();
			numeros.add(2);
			numeros.add(3);
			numeros.add(4);
			numeros.add(5);
			
			for(Integer numero :numeros) {
				System.out.println(numero);
			}

		}
	}

}
