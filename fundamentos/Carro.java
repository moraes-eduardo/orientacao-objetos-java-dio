package fundamentos;

// classe
public class Carro {

    // atributos
    String cor;
    String modelo;
    int capacidadeTanque;

    // construtor
    Carro(){

    }

    // sobrecarga
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidade(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidade(){
        return capacidadeTanque;
    }
    
    double totalValor(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }
}