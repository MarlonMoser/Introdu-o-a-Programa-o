/*Suponha que um caixa disponha apenas de notas de 100, 10 e 1 reais.
Considerando que alguém está pagando uma compra, faça um programa que determine
e escreva o número mínimo de notas que o caixa deve fornecer como troco.
Escreva também o número de cada tipo de nota a ser fornecido como troco.
Suponha que o sistema monetário não utilize centavos.

Entradas:
-valor pago pelo cliente
-valor  da compra

Processos:
- trocado=dinheiro - valor da compra
-nota de 100= troco /100;
-nota de 10= (troco- (nota de 100 *100)) /10 
-moeda de 1 = (troco - (cem * 100) - (dez * 10))/1 ;


 */
import java.util.Scanner;

public class Uni3Exe16 {
public static void main(String[] args) {
Scanner teclado=  new Scanner(System.in);

//Entradas


System.out.print("Valor da compra = ");
int compra = teclado.nextInt();

System.out.print("dinheiro pago pelo cliente = ");
int dinheiro = teclado.nextInt();
while(dinheiro < compra) {
    System.out.println("o pagamento deve ser maior que  a compra");
    dinheiro = teclado.nextInt();
   }
    //Processos

    int trocado = dinheiro - compra;
    int cem = trocado / 100;
    int dez = (trocado - (cem * 100)) / 10;
    int um = (trocado - (cem * 100) - (dez * 10));

     // Saída
     System.out.println("O trocado do cliente e de " + trocado + " R$");
     System.out.println(cem + " nota(s) de  cem, " + dez + " nota(s) de dez " + um + " moedas de um real.");
     
     teclado.close();

 } 





    }

