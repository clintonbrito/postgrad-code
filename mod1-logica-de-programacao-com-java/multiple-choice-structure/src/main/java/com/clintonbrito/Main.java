package com.clintonbrito;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int numero;

    do {
      System.out.println("Escolha uma opção: ");
      System.out.println("1 - Cadastrar aluno: ");
      System.out.println("2 - Cadastrar notas: ");
      System.out.println("3 - Listar alunos e nota: ");
      System.out.println("0 - Sair: ");

      while (!entrada.hasNextInt()) {
        System.out.println("Por favor, insira um número correto.");
        entrada.next();
      }

      numero = entrada.nextInt();

      switch (numero) {
        case 1:
          System.out.println("Vamos cadastrar aluno");
          break;
        case 2:
          System.out.println("Vamos cadastrar nota");
          break;
        case 3:
          System.out.println("Listar alunos");
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida. Por favor, insira um número entre 0 e 3.");
      }
    } while (numero < 0 || numero > 3);
  }
}