package org.losremedios.prog.ut4.actividades.act6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int pos=3;
        char [] a = {'H','o','l','a'};
        char crt='o';
        char [] c = {'M','e','t','o','d','o','s'};
        String [] cadena = {"Cohe","Moto","Barco","Avion","Tanque"};

        imprimeLongitudCadena(a); //Apartado 1


        System.out.println("Caracter dando la posicion: ");
        System.out.println(caracterEnPosicionEmpezandoEn1(a,pos)); //Apartado 2

        System.out.println("Ocurrencias de un caracter dado: ");
        System.out.println(cuentaOcurrenciasDeUnCaracter(c,crt)); //Apartado 3

        System.out.println("Antes del metodo: " + Arrays.toString(cadena));
        imprimeCadenasEnOrdenAlfabético(cadena);


    }

    //TODO: imprimeLongitudCadena

    static void imprimeLongitudCadena (char[] array){
        System.out.println("La longitud del array es: " + array.length);
    }

    //TODO: caracterEnPosicionEmpezandoEn1 dada la posición devolver el caracter que ocupa esa posición contando desde 1

    static char caracterEnPosicionEmpezandoEn1 (char[] array, int pos){
        return array[pos-1];
    }

    //TODO: cuentaOcurrenciasDeUnCaracter

    static int cuentaOcurrenciasDeUnCaracter (char[] array, char elemento) {
        int cont = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == elemento) {
                cont++;
            }
        }

        return cont;
    }

    //TODO: imprimeCadenasEnOrdenAlfabético imprime en orden alfabético las cadenas dadas por un array de cadenas,
    // sin tener en cuenta si son mayúsculas o minúsculas.

    static void imprimeCadenasEnOrdenAlfabético (String[]array){

        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);

        for (String i:array) {

            System.out.println(i);
        }
    }

}
