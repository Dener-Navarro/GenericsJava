package MarcaDeCarros;

import java.util.ArrayList;
import java.util.List;
import carros.ICarros;

public class App {

    public static void main(String[] args) {

        List<ICarros<String>> listaCarros = new ArrayList<>();
        listaCarros.add(new Toyota("Corolla"));
        listaCarros.add(new Ford("KA"));

        for (ICarros<String> carro : listaCarros) {
            System.out.println("Marca: " + carro.getNome());
            System.out.println("Modelo: " + carro.getModelo());
            carro.acelerar();
            carro.frear();
            System.out.println();
        }
    }
}
