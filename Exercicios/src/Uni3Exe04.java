/*Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
 Entradas: as notas, não pode aceitar se for maior que 10 ou menorrr que  0;

 Processos:
 -media = todas as notas /10
 se a nota  for menor que 6 esta reporvado, senão passou de  ano

 */
import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni3Exe04 {

    public static void main(String[]args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    //Entradas
     System.out.println("incira a Nota 1");
     double nota1 = teclado.nextDouble();
     while  (nota1 < 0 || nota1 > 10 ){
        System.out.println("nota 1 deve estar entre 1 e 10");
     nota1= teclado.nextDouble();
     }
     System.out.println("incira a Nota 2");
     double nota2 = teclado.nextDouble();
     while  (nota2 < 0 || nota2 > 10 ){
        System.out.println("nota 2 deve estar entre 1 e 10");
     nota2= teclado.nextDouble();
     }
     System.out.println("incira a Nota 3");
     double nota3 = teclado.nextDouble();
     while  (nota3 < 0 || nota3 > 10 ){
        System.out.println("nota 3 deve estar entre 1 e 10");
     nota3= teclado.nextDouble();
     }

     //Processo
     double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / 10;
     if (media < 6){
        System.out.println("reprovado com media menor que 6 sendo: " + df_2.format(media));
     } else{
     System.out.println("aprovado com media ponderada de :" + df_2.format(media));
     }
     teclado.close();
    }      
    }

    

