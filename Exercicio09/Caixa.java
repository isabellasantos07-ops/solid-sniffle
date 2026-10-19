public class Caixa<T> {
    private T conteudo;

    public void guardar(T elemento) {
        this.conteudo = elemento;
    }

    public T retirar() {
        return conteudo;
    }
}