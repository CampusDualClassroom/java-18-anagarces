package com.campusdual.classroom;

import com.campusdual.util.Utils;

import static com.campusdual.util.Utils.integer;


public class Exercise18 {

	public static void main(String[] args) {

		System.out.println("Introduce el tamaño del array:");
		int valores = integer(); //le pedimos al usuario que introduzca un valor y lo almacenamos en elementos
		int[] nuevoArray = createAndInitializeArray(valores); //llamamos al metodo con el nuevo valor introducido
		showInlineArray(nuevoArray); //mostramos los elementos del array
	}

		public static int[] createAndInitializeArray (int size){
		//inicializamos el array a partir de 1
			int[] intArray = new int[size];
			for (int i = 0; i < size; i++) {
				intArray[i] = i+1;
			}
			return intArray;
		}

		public static void showInlineArray ( int[] array){
			for (int i = 0; i < array.length; i++) { //recorremos el array
				System.out.print("numero"+array[i]);
				if(i < array.length - 1){  //comprobamos si i es el ultimo elemento, si no, añadimos un espacio
					System.out.print(" ");
				}
			}
		}
	}