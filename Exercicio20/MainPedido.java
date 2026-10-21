public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.adicionarItem(new ItemPedido(1, "Camiseta", 49.90, 2));
        pedido.adicionarItem(new ItemPedido(2, "Calça", 89.90, 1));
        pedido.adicionarItem(new ItemPedido(1, "Camiseta", 49.90, 1)); // mesmo código → aumenta quantidade
        pedido.adicionarItem(new ItemPedido(3, "Tênis", 199.90, 1));

        System.out.println("--- Antes de remover ---");
        pedido.exibirResumoOrdenado();

        pedido.removerItem(2); // remove a calça

        System.out.println("\n--- Depois de remover a calça ---");
        pedido.exibirResumoOrdenado();
    }
}