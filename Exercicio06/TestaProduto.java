import java.util.ArrayList;
import java.util.List;

public class TestaProduto {
    public static List<Produto> filtrarPorPrecoMaximo(List<Produto> produtos, double precoMaximo) {
        List<Produto> filtrados = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getPreco() <= precoMaximo) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto(1, "Caneta", 2.50));
        produtos.add(new Produto(2, "Caderno", 15.90));
        produtos.add(new Produto(3, "Mochila", 89.90));
        produtos.add(new Produto(4, "Lápis", 1.20));
        produtos.add(new Produto(5, "Borracha", 0.80));

        List<Produto> baratos = filtrarPorPrecoMaximo(produtos, 20.0);

        System.out.println("Produtos até R$ 20:");
        for (Produto p : baratos) {
            System.out.println(p);
        }
    }
}