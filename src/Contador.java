import java.util.Locale;
import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    
    Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Digite o primeiro valor:");
    int param1 = terminal.nextInt();
    
    System.out.println("Digite o segundo valor:");
    int param2 = terminal.nextInt();
    terminal.close();

    try {
      contar(param1, param2);
    } catch(ParametrosInvalidosException e) {
      System.out.println("O primeiro parâmetro precisa ser menor do que o segundo parâmetro");
    }
  }

  static void contar(int param1, int param2) throws ParametrosInvalidosException {
    if(param1 > param2 || param1 == param2){
      throw new ParametrosInvalidosException();

    } else {

      int iteracoes = param2 - param1;
      for(int i = 1; i <= iteracoes; i++){
        System.out.println("Imprimindo o número " + i);
      }
    }
  }

}
