/*Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

X centena(s)  Y dezena(s) K unidade(s) 

Entrada:
-numero cheio

Processo:
-centena= numero cheio/100
-dezena=  ((numero cheio - (centena * 100)) /10 
-unidade=  ((numero cheio - (centena* 100)- dezena * 10 ))) / 1 */
import java.util.Scanner;

public class Uni3Exe15 {
    public static void main(String[] args) {
    Scanner teclado = new java.util.Scanner(System.in);

//Entrada
System.out.print("Informe um numero=");
int numero  = teclado.nextInt();
while (numero <0 ||numero >999){
    System.out.println("o numero deve ser menor que 1000 e maior que -1 = ");
numero =  teclado.nextInt();
}


//Processo
int centena= numero /100;
int dezena=  (numero  - (centena * 100)) /10 ;
int unidade=  ((numero - (centena  * 100)- (dezena * 10 ))) / 1;

//Saida

System.out.print(centena +  " Centena (s) " + dezena + " Dezena (s)" + unidade +  " Unidade(s)");

teclado.close();


    }
}
