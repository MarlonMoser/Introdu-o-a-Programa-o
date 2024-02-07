/* Descreva um programa que fornece uma temperatura em °C informe
 o seu valor em °F. 
 
 Entradas: 
 -Graus Celcius 

 Processo:

 °F = (9/5) * °C + 32
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
public static void main(String[] args) {
Scanner teclado = new java.util.Scanner(System.in);
DecimalFormat df_2 = new DecimalFormat("0.00");

//Entradas
System.out.println(" Qual e a temperatura em °C");
double cel = teclado.nextDouble();

//Processo
double fare = (9.0/5.0) * cel + 32 ;

//Saida

System.out.println("A temperatura e de " + df_2.format(fare) +" fahrenheit");

teclado.close();

}
}
/* coloquei um mais uma casa decimal na divisão, pois se eu  deixar inteiro
vai deixar o resultado errado*/  
