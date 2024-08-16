abstract class Carro {
    protected String modelo;
    protected String marca;
    protected int ano;

    public Carro (String modelo, String marca, int ano){
    this.modelo = modelo;
    this.marca = marca;
    this.ano = ano;
    }

    /* Método de abstracao */
    public abstract void acelerar();

    public abstract void frear();
}
