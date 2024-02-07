/* Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml e garrafa de 2 litros. 
Se um comerciante compra uma determinada quantidade de cada formato, faça um programa para calcular quantos litros de refrigerante ele comprou.
Entradas:
lata de 350
garafa de 600 
garafa de 2 litros

Processo:
(0.35 * quantidade) + (0.60 * quantidade) + (2 * quantidade) */
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe07 {
public static void main(String[]args){
Scanner teclado= new Scanner(System.in);
DecimalFormat df_3 = new DecimalFormat("0.000");

//Entradas

System.out.println("incira a quantidade de latas de 350ml compradas");
double lata=  teclado.nextDouble();
System.out.println("incira a quantidade de garrafas de 600ml compradas");
double garafa1=  teclado.nextDouble();
System.out.println("incira a quantidade de garrafa de 2 litros compradas");
double garafa2=  teclado.nextDouble();

//Preocessos

double totalLitros= (0.350 * lata) + (0.600 * garafa1 ) + ( 2.0 * garafa2);

//SAIDA

System.out.println("a quantidade de litros comprados foi de : " + df_3.format(totalLitros) + "litros");

teclado.close();


}
    

}
