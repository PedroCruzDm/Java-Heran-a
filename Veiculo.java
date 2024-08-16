class Veiculo extends Carro {
  private String tipodecombustivel;

  public Veiculo(String modelo, String marca, int ano, String tipodecombustivel){
    super(modelo,marca, ano);
    this.tipodecombustivel = tipodecombustivel;
  }

  public void acelerar(){
    System.out.println("Acelerando o veículo");
  }
  public void frear(){
    System.out.println("Freando o veículo");
  }
  public void tipodecombustivel(){
    System.out.println("o tipo de combustivel é: " + tipodecombustivel);
  };

  /* carro elétrico */
class CarroEletrico extends Carro{
  private String tipodecombustivel;

  public CarroEletrico (String modelo, String marca, int ano, String tipodecombustivel){
    super(modelo,marca, ano);
    this.tipodecombustivel = tipodecombustivel;
  }

  public void acelerar(){
    System.out.println("Acelerando o veículo");
  }
  public void frear(){
    System.out.println("Freando o veículo");
  }
  public void tipodecombustivel(){
    System.out.println("o tipo de combustivel é: " + tipodecombustivel);
  }
};
}
