package ejercicios_logicos;
import java.util.Scanner;

public class Ejercicios_logicos {

    public static void main(String[] args) {
//////////Contador con limite
//        System.out.println("Ingrese el limite hasta el que quieres contar: ");
//        Scanner teclado = new Scanner(System.in);
//        int limite = teclado.nextInt();
//        int cont = 1;
//        while (cont <= limite){
//            System.out.println(cont);
//            cont ++;
//        }

//////////Escribir palabras hasta infinitas hasta escribir salir
//            System.out.println("Ingresa una nueva palabra: ");
//            Scanner teclado =  new Scanner (System.in);
//            String palabra = teclado.nextLine();
//            
//            while (!palabra.equalsIgnoreCase("salir")){ //IgnoreCase es para ignorar si es mayuscula o  minuscula
//                System.out.println("La palabra es: " + palabra);
//                System.out.println("Ingresa una nueva palabra: ");
//                palabra = teclado.nextLine();
//            }

////////// Inscripción Maratón
//        System.out.println("Ingrese el DNI de la persona: ");
//        Scanner teclado = new Scanner (System.in);
//        String dni = teclado.nextLine();
//        
//        System.out.println("Ingrese el nombre de la persona: ");
//        String nombre = teclado.nextLine();
//        
//        System.out.println("Ingrese la edad de la persona: ");
//        Scanner teclado2 = new Scanner (System.in);
//        int edad = teclado2.nextInt();
//        
//        while(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
//            if (edad >= 6 && edad <= 10){
//                System.out.println("La categoría es: Menores A");
//            }
//            else{
//                if(edad >= 11 && edad <= 17){
//                    System.out.println("La categoría es: Menores B");
//                }
//                else{
//                    if(edad >=18 && edad <= 30){
//                        System.out.println("La categoría es: Juveniles");
//                    }
//                    else{
//                        if(edad>= 31 && edad <= 50){
//                            System.out.println("La categoría es: Adultos");
//                        }
//                        else{
//                            if(edad >=50){
//                                System.out.println("La categoría es: Mayores");
//                            }
//                            else{
//                                System.out.println("La persona no cuenta con la edad indicada.");
//                            }
//                        }
//                    }
//                }
//            }
//        System.out.println("Ingrese el DNI de la persona: ");
//        dni = teclado.nextLine();
//        System.out.println("Ingrese el nombre de la persona: ");
//        nombre = teclado.nextLine();
//        System.out.println("Ingrese la edad de la persona: ");
//         edad = teclado2.nextInt();
//        }

//////////Ejercicio Vectores
        String vector[ ] = new String [8];
        vector[0] = "Alejandro";
        vector[1] = "Ludmila";
        vector[2] = "Gabriel";
        vector[3] = "Rosa";
        vector[4] = "Luisina";
        vector[5] = "Daniel";
        vector[6] = "Loky";
        vector[7] = "Lumel";
        
        for (int i=0; i<vector.length; i++) {
            System.out.println("En la posición: " + (i+1) + " está el nombre: " + vector[i]);
        }
        
    }    
}