package com.example;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Cuando","tuve","yo","te","tuve,","te","mantuve","y","te","di"};  //Un array de Strings.
        String result = "";                                                                 //Array vacío.
        for( String item : array){          //Buche forEach, que pone cada elemento del 1º array en el vacío
            result += item + " ";           //junto con un espacio.
        }
        System.out.println(result);
    }
}