
/* Descreva um programa que calcula o volume de uma lata de óleo. Fórmula:

Entrada: 
-raio
-altura

Metodo:

volume:=:\Pi*raio^2*altura 

*/ 
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe09 {

public static void main(String[] args) {
Scanner teclado =  new java.util.Scanner(System.in);
DecimalFormat df_4 = new DecimalFormat("0.0000");

//Entradas
System.out.println("Qual e o  Raio da lata de óleo  : ");
double raio  = teclado.nextDouble();
System.out.println("Qual e a  altura da lata de  óleo :");
double altura = teclado.nextDouble();

//Processo

double volume = (Math.PI * Math.pow(raio, 2)) * altura ;

//Saida

System.out.println("O volume da lata de óleo  é = " + df_4.format(volume) + "cm³");





teclado.close();

}
    
}
