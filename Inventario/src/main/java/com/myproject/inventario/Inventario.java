/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myproject.inventariotienda;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class InventarioTienda {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();

        ArrayList<String> listaNumeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);



        while (true) {

            System.out.println("\nInventario de Tienda:");

            System.out.println("1. Agregar producto: ");

            System.out.println("2. Buscar productos: ");

            System.out.println("3. Mostrar todos los productos:");

            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");



            int opcion = scanner.nextInt();

            scanner.nextLine(); // Limpiar el buffer del scanner



            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el nombre del producto: ");

                    String nombre = scanner.nextLine();

                    System.out.print("Ingrese el precio: ");

                    String precio = scanner.nextLine();



                    if (!listaNombres.contains(nombre)) {

                        listaNombres.add(nombre);

                        listaNumeros.add(precio);

                        System.out.println("Producto agregado correctamente.");

                    } else {

                        System.out.println("El producto ya existe en la tienda.");

                    }

                    break;

                case 2:

                    System.out.print("Ingrese el nombre del producto a buscar: ");

                    String nombreBusqueda = scanner.nextLine();



                    if (listaNombres.contains(nombreBusqueda)) {

                        int indice = listaNombres.indexOf(nombreBusqueda);

                        String numeroEncontrado = listaNumeros.get(indice);

                        System.out.println("Precio del producto: " + numeroEncontrado);

                    } else {

                        System.out.println("Producto no encontrado.");

                    }

                    break;

                case 3:

                    System.out.println("Lista de productos:");

                    for (int i = 0; i < listaNombres.size(); i++) {

                        System.out.println("Procucto: " + listaNombres.get(i) + " - Precio: " + listaNumeros.get(i));

                    }

                    break;

                case 4:

                    System.out.println("Saliendo del programa.");

                    scanner.close();

                    System.exit(0);

                default:

                    System.out.println("Opción inválida. Intente de nuevo.");

            }

        }

    }

}
    
