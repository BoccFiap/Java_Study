package intermediario;

public class Ninja {

  String name;
  int age;
  String village;


  // Criar um metodo publico personalizado

  /*
    O metodo VOID nao retorna nenhum valor
   */
  //public void <MetodoVoid>(){}


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
