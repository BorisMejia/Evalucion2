package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreUsuario;
        Integer horasTrabajo;
        Integer valorHoraTrabajo;
        Integer sueldo, nomina;
        Double calculoNomina, totalNomina;
        Byte opcionElejida;


            do {
                System.out.println("--------------------");
                System.out.println("-----Bienvenido-----");
                System.out.println("--------------------");
                System.out.println("1-- Ingresar el numero de horas trabajadas y la tarifa por hora:");
                System.out.println("2-- Pagar nomina ");
                System.out.println("3-- Salir");
                System.out.println("--------------------");
                System.out.print("Elije una de las anteriores opciones: ");
                opcionElejida = teclado.nextByte();

                switch (opcionElejida) {
                    case 1:
                        System.out.print("Ingrese la cantidad de horas laboradas: ");
                        horasTrabajo = teclado.nextInt();

                        System.out.print("Cual es el precio de la hora laborada: ");
                        valorHoraTrabajo = teclado.nextInt();

                        sueldo = horasTrabajo * valorHoraTrabajo;
                        System.out.println("Señor usuario usted este mes ha generado un total de $" +sueldo);

                        break;
                    case 2:
                        System.out.print("Ingrese su nombre: ");
                        nombreUsuario=teclado.next();

                        System.out.print("Salario a pagar de nomina: ");
                        nomina = teclado.nextInt();

                        calculoNomina=nomina*0.08;

                        totalNomina=nomina-calculoNomina;
                        System.out.println("Señor "+nombreUsuario);
                        System.out.println("El valor total a pagar de nomina es: $"+totalNomina);
                        break;
                    case 3:

                        break;
                    default:
                        System.out.println("Ingrese un numero correcto ");
                        System.out.println("Recuerde que las opciones son del 1 al 3");
                        break;
                }
                System.out.println("--------------------");
                System.out.println("-----Bienvenido-----");
                System.out.println("--------------------");
                System.out.println("1-- Ingresar el numero de horas trabajadas y la tarifa por hora:");
                System.out.println("2-- Pagar nomina ");
                System.out.println("3-- Salir");
                System.out.println("--------------------");
                System.out.print("Elije una de las anteriores opciones: ");
                opcionElejida = teclado.nextByte();


        } while (opcionElejida != 3) ;
        System.out.println("Usted salio del programa");

        }
    }
