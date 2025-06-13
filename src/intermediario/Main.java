package intermediario;

public class Main {
  public static void main(String[] args) {

    // Criar um ninja
    Ninja Naruto = new Ninja();


    Naruto.name = "Naruto Uchiha";
    Naruto.village = "Aldeia da folha";
    Naruto.age = 17;

    // Criar o Sasuke
    Ninja Sasuke = new Ninja();
    Sasuke.name = "Sasuke Uchicha";
    Sasuke.village = "Aldeia da Folha";
    Sasuke.age = 16;

    //Apicando Metodos aos meus objetos
    Sasuke.SharinganActivated();
    String callingMethod = Sasuke.IamANinja();
    System.out.println(callingMethod);

    int howMuchtimeIsLeft = Sasuke.YearsToBecomeHokage(50);
    System.out.print( Sasuke.name+ " you have: " +Sasuke.age+ " so at least: " +howMuchtimeIsLeft+ " Years left to become Hokage");


    // Criar a Sakura
    Ninja Sakura = new Ninja();
    Sakura.name = "Sakura Haruno";
    Sakura.village = "Aldeia da Folha";
    Sakura.age = 15;


  }
}
