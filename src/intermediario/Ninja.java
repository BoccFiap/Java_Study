package intermediario;

public class Ninja {

  String name;
  int age;
  String village;


  // Criar um metodo publico personalizado

  /*
    O metodo VOID nao retorna nenhum valor
   */
  public void SharinganActivated() {
    System.out.println("The Sharingan has been activated.\n");
  }

  /*
    O metodo String, Int, Boolean.. precisa retornar ele mesmo
   */
  public String IamANinja(){
    return "Hi, I am a ninja";
  }

  public int YearsToBecomeHokage(int minimumAgeToBecomeHokage){
      return minimumAgeToBecomeHokage - age;
  }

}
