/*Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato montado 
pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.
Entradas:
-comida do cliente (kg)

Processos:
-(0,750 * quantidade de kg) * 25

 */
import java.util.Scanner;

public class Uni3Exe06 {
public static void main (String[]args){
    Scanner teclado= new Scanner(System.in);

    //Entradas
    System.out.println("Coloque a quantidade de KG do alimento");
    double kg= teclado.nextDouble();

    //Processos 
    double valorpagar = (kg - 0.75 ) * 25;

    //Saida

    System.out.println("o valor do prato do cliente e de: " + valorpagar + "Reais");

    teclado.close();








}

    



}
