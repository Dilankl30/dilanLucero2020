/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.dilanlucero2020;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class DilanLucero2020 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float[] puntSema = new float[7];

        int i = 0;
        float dato = 0;

        do {
            System.out.println("ingrese el dia");

            dato = entrada.nextFloat();

            if (dato > 0) {
                puntSema[i] = dato;
                i++;

            } else {
                System.out.println("ingrese un valor no negativo");
            }

        } while (i < 7);

        Scanner op = new Scanner(System.in);

        System.out.println("1 total promedio de la semana");
        System.out.println("2 dias y sus promedios ");
        System.out.println("promedio mas alto y bajo");
        System.out.println("primeo 4 dias y ultimos 4 dias");

        int opcion = op.nextInt();
        float suma = 0;
        float prom = 0;
        for (int j = 0; j < 7; j++) {
            suma = puntSema[j] + suma;
        }
        prom = suma / 7;

        float promA = 0;
        float promB = 0;

        for (int j = 0; j < 7; j++) {

            if (puntSema[j] > promA) {
                promA = promA + 1;

            }
            if (puntSema[j] < promA) {
                promB = promB + 1;

            }
        }

        switch (opcion) {
            case 1:

                System.out.println("puntuacion total de la semana:" + prom);

                break;

            case 2:
                System.out.println(" EL dia por encima del promedio es:" + promA + "el dia por abajo del promedio es:" + promB);
                break;
            default:
        }
    }
}
