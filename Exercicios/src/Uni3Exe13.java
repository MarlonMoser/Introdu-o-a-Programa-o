/*Numa loja de materiais de construção, um azulejo estampado 
custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma parede (em metros), e depois escreva o valor gasto 
com a compra de azulejos. Considere que um metro quadrado
 é formado por 9 azulejos.
 
 Entrada:
 -altura da parede
- largura da  parede

Processo
-  area da parede: altura * largura
- azulejos= area  * 9.0
- gasto igual = azulejos * 12.50

 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni3Exe13 {


    public static void main(String[] args) {
    Scanner teclado = new java.util.Scanner(System.in);
    DecimalFormat df_2=  new DecimalFormat("0.00");

    //Entradas

    System.out.println("Qual e a altura da parede: ");
    double altura = teclado.nextDouble();

    System.out.println("Qual e a largura da parede: ");
    double largura = teclado.nextDouble();

    //Processos
     
    double area= altura * largura;
    double azulejos =  area  * 9.0;
    double gastou  = azulejos * 12.50 ;

    //Saida

    System.out.println("A área da parede e de = " + df_2.format(area));
    System.out.println("A quantidade de azulejos comprados foi de  = " + df_2.format(azulejos));
    System.out.println("a quantidade gasta foi de  = " + df_2.format(gastou));

    teclado.close();




    }
}
