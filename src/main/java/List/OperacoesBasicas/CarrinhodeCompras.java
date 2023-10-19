package main.java.List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhodeCompras {
    private List<CarrinhodeCompras> carrinhodeCompras = new ArrayList<>();

    public CarrinhodeCompras() {
        this.carrinhodeCompras = carrinhodeCompras;
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhodeCompras.add( new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        carrinhodeCompras.remove(nome);
    }
    public double calculaValorTotal(){

    }
    public void exibirItens(){
        System.out.println(carrinhodeCompras.size());
    }
}
