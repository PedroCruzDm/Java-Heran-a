// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    Veiculo carroEletrico = new Veiculo("Tesla", "Tesla", 2022, "Eletrico");
    Veiculo v1 = new Veiculo("Fusca", "Volkswagen", 1980, "Gasolina"){
    };

      //EXIBIR OS COMPORTAMENTOS //
      v1.acelerar();
      v1.frear();
      v1.tipodecombustivel();
    
      carroEletrico.acelerar();
      carroEletrico.frear();
      carroEletrico.tipodecombustivel();
    
 }
}

