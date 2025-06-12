package iniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
  public static void main(String[] args) {

     /*
        SwitchCases: Que serve para gerar casos especificos
        Objetivo: Pedir pro usuario escolher entre os ninjas
     */

    // Pedir para o usuario
    Scanner scan = new Scanner(System.in);


    System.out.println("1 - Naruto Uzumaki");
    System.out.println("2 - Sasuke Uchiha");
    System.out.println("3 - Sakura Haruno");
    System.out.print("Choose a character:");

    // Pedir para escolher uma das opções
    int usersChoice = scan.nextInt();
    System.out.println("You type the number " + usersChoice);

    //Reação ao escolher um personagem
    switch (usersChoice) {
      case 1:
        System.out.println("\nThe user chose Naruto Uzumaki");
        break;
      case 2:
        System.out.println("\nThe user chose Sasuke Uchiha");
        break;
      case 3:
        System.out.println("\nThe user chose Sakura Haruno");
        break;
      default:
        System.out.println("\nYou did not enter a valid response.");
    }

    // Encerrar Scanner
    scan.close();


  }
}
