package org.example;

import java.util.Scanner;

public class Peluchitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreProducto="";
        Double precioUnitarioNuevoPeluche=0.0,nuevoPrecioUnitarioPeluche=0.0, precioUnitarioConIva=0.0,precioIva=0.0;
        Byte opcionElejida;

        System.out.println("***************************************************************************************");
        System.out.println("***********************************||Menu||********************************************");
        System.out.println("***************************************************************************************");
        System.out.println("1-- Agregar el nombre y precio unitrio de un nuevo peluche: ");
        System.out.println("2-- Caalcular el costo de venta definido como el precio unitario del peluche + 19% IVA");
        System.out.println("3-- Mostrar la información del nuevo peluche (nombre, precio y precio venta)");
        System.out.println("4-- Editar el precio unitario de un nuevo peluche");
        System.out.println("5-- Salir");
        System.out.println("***************************************************************************************");
        System.out.println("***************************************************************************************");
        System.out.print("Elije una de las anteriores opciones: ");
        opcionElejida= teclado.nextByte();
        if (opcionElejida !=1 || opcionElejida>5){
            System.out.println("Ingrese un valor correcto");
            System.out.println("Recuerde que las opciones son del 1 al 5");

        }else {
        do {

            switch (opcionElejida){
                case 1:
                    System.out.print("Agrega el nombre del nuevo peluche: ");
                    nombreProducto= teclado.next();
                    System.out.print("Agrega el precio unitario del nuevo peluche: ");
                    precioUnitarioNuevoPeluche=teclado.nextDouble();
                    break;
                case 2:
                    precioIva = precioUnitarioNuevoPeluche*0.19;
                    precioUnitarioConIva = precioUnitarioNuevoPeluche+precioIva;
                    System.out.println("El precio unitario del peluche + el IVA es: $"+precioUnitarioConIva);
                    if(precioUnitarioConIva==0.0){
                        System.out.println("Debe ingresar el precio del peluche en la opcion 1");
                    }
                    break;
                case 3:
                    System.out.println("El nombre del nuevo peluche es: "+nombreProducto);
                    System.out.println("El precio del peluche sin IVA es: $"+precioUnitarioNuevoPeluche);
                    System.out.println("El precio del peluche con IVA es: $"+precioUnitarioConIva);
                    break;
                case 4:
                    System.out.print("Cambia el precio unitario del peluche: ");
                    nuevoPrecioUnitarioPeluche= teclado.nextDouble();
                    System.out.println("El nuevo precio unitario del peluche es: $"+nuevoPrecioUnitarioPeluche);
                    break;
                default:
                    System.out.println("Ingrese un numero correcto");
                    break;

            }
                System.out.println("***************************************************************************************");
                System.out.println("***********************************||Menu||********************************************");
                System.out.println("***************************************************************************************");
                System.out.println("1-- Agregar el nombre y precio unitrio de un nuevo peluche: ");
                System.out.println("2-- Caalcular el costo de venta definido como el precio unitario del peluche + 19% IVA");
                System.out.println("3-- Mostrar la información del nuevo peluche (nombre, precio y precio venta)");
                System.out.println("4-- Editar el precio unitario de un nuevo peluche");
                System.out.println("5-- Salir");
                System.out.println("***************************************************************************************");
                System.out.println("***************************************************************************************");
                System.out.print("Elije una de las anteriores opciones: ");
                opcionElejida= teclado.nextByte();

        }while (opcionElejida!=5);
        System.out.println("Saliste del programa");

      }
    }
}
