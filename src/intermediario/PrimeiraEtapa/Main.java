package intermediario.PrimeiraEtapa;

public class Main {
  public static void main(String[] args) {

    // Objeto 1
    Uzumaki Naruto = new Uzumaki();
    Naruto.name = "Naruto Uzumaki";
    Naruto.village = "Aldeia da folha";
    Naruto.age = 17;
    Naruto.SageModeactivated();

    // Objeto 2
    Uchiha Sasuke = new Uchiha();
    Sasuke.name = "Sasuke Uchicha";
    Sasuke.village = "Aldeia da Folha";
    Sasuke.age = 16;
    Sasuke.SharinganActivated();

    // Objeto 3
    Haruno Sakura = new Haruno();
    Sakura.name = "Sakura Haruno";
    Sakura.village = "Aldeia da Folha";
    Sakura.age = 15;
    Sakura.ActivateHealing();

    // Objeto 4
    Hyuga Hinata = new Hyuga();
    Sakura.name = "Hinata Hyuga";
    Sakura.village = "Aldeia da Folha";
    Sakura.age = 16;
    Hinata.ActivateByakugan();

    Boruto Boruto = new Boruto();
    Boruto.name = "Boruto Hyuga Uzumaki";
    Boruto.village = "Aldeia da folha";
    Boruto.age = 9;

    Boruto.SageModeactivated();
    Boruto.ActivateJourgan();
    Boruto.ActivateKarma();



    //Apicando Metodos aos meus objetos
    /*
    String callingMethod = Hinata.IamANinja();
    System.out.println(callingMethod);

    int howMuchtimeIsLeft = Sasuke.YearsToBecomeHokage(50);
    System.out.print( Hinata.name+ " you have: " +Hinata.age+ " so at least: " +howMuchtimeIsLeft+ " Years left to become Hokage");
    */

  }
}
