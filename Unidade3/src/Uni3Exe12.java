/* Uma empresa tem para um funcionário os seguintes dados: o nome, o número de horas trabalhadas psicológicas e o número de dependentes. 
A empresa paga R$ 10,00 por hora (valor para cálculo do salário trabalho) e R$ 60,00 por dependente 
(valor para cálculo do salário família) e são feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 5% sobre o salário de trabalho para o imposto de renda. 
Descreva um programa que informe o nome, o salário bruto e o salário líquido do funcionário.

Entradas: 
-Nome completo
-horas trabalhadas psicológicas
-o número de dependentes

Processos:
-salario = horas * 10
-saldepen = dependente * 60
-salario bruto = salario + saldepen
-salario liquido = ((8,5 * salario ) + (5 * salario) / 100) - salario bruto;
*/
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
public static void main(String[] args) {
 Scanner teclado = new java.util.Scanner(System.in);
 DecimalFormat df_2 = new DecimalFormat("0.00");

 //Entrada
System.out.print("Insira o Nome do funcionario = ");
String funcionario = teclado.next();

System.out.print("Quantas horas trabalhadas tem o funcionario = ");
double horasTrabalhadas = teclado.nextDouble();

System.out.print("Quantos dependentes tem o funcionario = ");
double dependentes = teclado.nextDouble();


//Processos

double salario = horasTrabalhadas * 10;
double saladepen = dependentes * 60 ;
double bruto = salario + saladepen ;
double inss = (salario * 5) / 100;
double desconto = (salario * 8.5 ) /100 ;
double liquido = bruto - inss - desconto;

//Saida

System.out.println("Funcionarrio = " +  funcionario);
System.out.println("Salario Bruto = " +  " R$"+ df_2.format(bruto));
System.out.println("Salario Liquido = " + " R$" + df_2.format(liquido) );

teclado.close();

}
}
