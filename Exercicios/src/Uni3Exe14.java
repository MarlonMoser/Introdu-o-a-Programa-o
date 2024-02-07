/*  Descreva um programa que a partir da distância percorrida e do tempo gasto por um motorista durante uma viagem de 
final de semana, calcule a velocidade média e a quantidade de combustível gasto na 
viagem, sabendo que o automóvel faz 12 km por litro.

Entrada:
-distancia
-tempo

Processo:
-velocidade= distancia /  tempo;
-gasto = distancia / 12;

*/
import java.text.DecimalFormat;
import java.util.Scanner;
public class Uni3Exe14 {
    public static void main(String[] args) {
    Scanner teclado = new java.util.Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //Entradas
 
System.out.print("Distância  percorida pelo  motorista em Km = ");
double distancia = teclado.nextDouble();

System.out.print("horas do percurso = ");
double tempo = teclado.nextDouble();

//Processos

double velocidade = distancia /tempo ;
double combgasto = distancia /12 ;

//Saida

System.out.println("A Velocidade media  foi  de = "+ df_2.format(velocidade));
System.out.print("Foi gasto = " + df_2.format(combgasto) + " R$ em combustível");

teclado.close();

    }


    
}
