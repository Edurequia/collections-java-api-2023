package list.java.Application;

import list.java.list.OperacoesBasicas.CarrinhoDeCompras;
import list.java.list.OperacoesBasicas.ListaTarefa;

public class Program {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        System.out.println("---------------CARRINHO DE COMPRAS------------------");

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Computador", 2000.0, 3);
        carrinhoDeCompras.adicionarItem("Teclado", 300.0, 2);
        carrinhoDeCompras.adicionarItem("Mouse", 150.0, 5);
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("teclado");
        carrinhoDeCompras.exibirItens();


        System.out.println("O valor total dos itens é: " + carrinhoDeCompras.calcularValorTotal());

    }
}
