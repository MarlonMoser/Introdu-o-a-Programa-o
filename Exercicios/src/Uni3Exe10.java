/* Descreva um programa que leia o comprimento dos catetos de um triângulo retângulo e calcule o comprimento da hipotenusa.

Entradas:
-cateto 1 
-cateto 2
 
Processo:
hipotenusa^2=cateto1^2+cateto2^2
Hipotenusa2 = √Hipotenusa

 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
public static void main(String[] args) {
Scanner teclado= new java.util.Scanner(System.in);
DecimalFormat df_2 = new DecimalFormat("0.00");  

//Entradas
System.out.println("Qual e o cateto 1 = ");
double cateto1 = teclado.nextDouble();
System.out.println("Qual e o cateto 2 = ");
double cateto2 = teclado.nextDouble();

//Processos

double hipo2 = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
double hipo = Math.sqrt(hipo2);

//Saida

System.out.println(" Hipotenuza é = " + df_2.format(hipo));


teclado.close();





}
}