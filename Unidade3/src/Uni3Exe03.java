/*Um motorista deseja abastecer seu tanque de combustível. Escreva um programa para ler o preço do litro da gasolina e o valor do pagamento e exibir quantos litros ele
 conseguiu colocar no tanque.
 
 Entradas: 
 -valor do litro
 -pagamento do cliente
 Metodo:
 -totalLit= valor do litro/ pagamento do cliente
 Saida:
  -a quantidade de litros abastecida 
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe03 {

    public static void main(String[]args){
    Scanner teclado= new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

//Entradas
System.out.println("Incira o valor do Litro de gasolina");
double valorgas= teclado.nextDouble();
System.out.println("Incira a o valor a pagar");
double valorpago= teclado.nextDouble();

//Metodo / Saida
double totalLit= valorpago / valorgas;
if (valorgas > valorpago){
    System.out.println("Saldo Insuficiente");
} else {
    System.out.println("O tanque foi abastecido com: " + df_2.format(totalLit) + "litros");
}
teclado.close();

    }

}
