/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosdeordenacion;

import java.util.Arrays;

/**
 *
 * @author igorr
 */
public class AlgoritmosDeOrdenacion {

    int[] lista1 = {57, 34, 22, 54, 13, 54, 87, 46, 11, 14, 111, 32, 62, 43, 71, 56, 24, 17, 92, 43, 27, 14};

    public void ordenacionBurbuja(int[] numeros) {
        //el metodo recibe el array de numeros
        //y ordenara mediante el algoritmo de la burbuja
        for (int j = 1; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - j; i++) {

                if (numeros[i] > numeros[i + 1]) {
                    //si se cumple se intercambian los valores
                    int auxiliar = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = auxiliar;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosDeOrdenacion ejercicios = new AlgoritmosDeOrdenacion();

        System.out.println("lista sin ordenar: " + Arrays.toString(ejercicios.lista1));

        ejercicios.ordenacionBurbuja(ejercicios.lista1);
        System.out.print("lista  ordenada: " + Arrays.toString(ejercicios.lista1));

    }

}
