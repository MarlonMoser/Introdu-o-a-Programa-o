/*Uma pessoa foi até uma casa de câmbio trocar dólares por reais. Para isto ela entregou um valor em dólares para o atendente. Considerando que o atendente tem a 
cotação do dólar, descreva um programa para calcular quantos reais o atendente deve devolver para a pessoa. 

Entradas: dolarres entregue

Metodo:
 -cotação= dolar * 5,29
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
public static void main(String[]args) {
Scanner teclado= new java.util.Scanner(System.in); 
DecimalFormat df_2= new DecimalFormat("0.00");

// Entradas

System.out.println("quantidade de dolares entregue ao atendente" );
double dolares = teclado.nextDouble();

// Metodo

double cotacao= dolares * 5.29;

//Saida

System.out.println("Recebe :" + df_2.format(cotacao) + "Reais");

teclado.close();

}

    
}
