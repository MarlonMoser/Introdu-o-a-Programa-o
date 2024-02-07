/* Uma loja de calçados está concedendo 12% de desconto nos produtos.
Escreva um programa para calcular e exibir o valor de desconto a ser
dado num par de sapatos e quanto deve custar o produto com o desconto.
O preço do par de sapatos deve ser informado pelo usuário.
Como resultado, o programa deverá exibir as seguintes mensagens:

O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx

Entradas: 
-valor do par de sapatos;

Processo
-desconto: (valor do  sapato * 12 ) / 100
-o valor que ficou no  final: valor  do  parde sapatos - desconto


 */

 import java.util.Scanner;
 import java.text.DecimalFormat;
 
 public class Uni3Exe02 {
   public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);
     DecimalFormat df_2 = new DecimalFormat("0.00");
 
     // Entrada
     System.out.print("Informe o preço do par de sapatos: ");
     double preco = teclado.nextDouble();
 
     //  Processo
     double vlrdesconto = preco * 12 / 100;
     double precofinal = preco - vlrdesconto;
 
     // Saída
     System.out.println("O valor do desconto é de R$ " + df_2.format(vlrdesconto));
     System.out.println("O preço do par de sapatos com desconto é R$ " + df_2.format(precofinal));
 
     teclado.close();
   }
 }