package MarcaDeCarros;

import carros.ICarros;

public class Ford implements ICarros<String> {

    private String nome;
    private String modelo;

    public Ford(String modelo) {
        this.nome = "Ford";
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando um carro Ford " + getModelo());
    }

    @Override
    public void frear() {
        System.out.println("Freando um carro Ford " + getModelo());
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
