package list.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String name, double price, int quantity){
        itens.add(new Item(name, price, quantity));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itens){
            if(i.getName().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itens.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        for (Item i : itens){
            valorTotal += i.getQuantity() * i.getPrice();
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(itens);
    }

}
