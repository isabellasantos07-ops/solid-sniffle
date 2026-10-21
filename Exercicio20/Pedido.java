import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    public void adicionarItem(ItemPedido novoItem) {
        int index = itens.indexOf(novoItem);  // usa equals (pelo código)
        if (index >= 0) {
            // Já existe: aumenta a quantidade
            ItemPedido existente = itens.get(index);
            existente.setQuantidade(existente.getQuantidade() + novoItem.getQuantidade());
        } else {
            itens.add(novoItem);
        }
    }

    public boolean removerItem(int codigo) {
        ItemPedido busca = new ItemPedido(codigo, "", 0, 0);
        return itens.remove(busca);
    }

    public double calcularTotalPedido() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void exibirResumoOrdenado() {
        // Ordena do maior subtotal para o menor
        itens.sort((a, b) -> Double.compare(b.getSubtotal(), a.getSubtotal()));

        System.out.println("=== Resumo do Pedido ===");
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
        System.out.println("Total do pedido: R$ " + calcularTotalPedido());
    }
}