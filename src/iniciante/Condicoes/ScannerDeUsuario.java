package iniciante.Condicoes;

import java.util.Scanner;

public class ScannerDeUsuario {
  public static void main(String[] args) {

    /*
      Scanner = É um jeito de trazer o usuario para dentro da aplicação
      Objetivo = O usuario vai criar um ninja, e a gente realiza a validação
     */

    // Inicializa o Scanner
    Scanner scan = new Scanner(System.in);

    //Receber o nome
    System.out.print("What is the ninja's name? ");
    String ninjasName = scan.nextLine();
    System.out.print("The name of the ninja is " +ninjasName + "\n");

    //Receber a idade
    System.out.print("What is the ninja's age? ");
    int ninjasAge = scan.nextInt();
    System.out.println("The age of the ninja is " +ninjasAge);

    // Tratamento de dados
    if (ninjasAge >= 18) {
      System.out.println("This ninja is of age and can go on missions outside the village.");
    } else {
      System.out.println("This ninja is still too young and needs more training.");
    }



    // encerra o Scanner
    scan.close();
  }
}
