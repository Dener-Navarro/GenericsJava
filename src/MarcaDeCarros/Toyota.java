package MarcaDeCarros;

import carros.ICarros;

public class Toyota implements ICarros<String> {

    private String nome;
    private String modelo;

    public Toyota(String modelo) {
        this.nome = "Toyota";
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando um carro Toyota " + getModelo());
    }

    @Override
    public void frear() {
        System.out.println("Freando um carro Toyota " + getModelo());
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getModelo() {
        return modelo;
    }
}
