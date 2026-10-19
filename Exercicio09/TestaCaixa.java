public class TestaCaixa {
    public static void main(String[] args) {
        Caixa<String> caixaTexto = new Caixa<>();
        caixaTexto.guardar("Olá, mundo!");
        System.out.println(caixaTexto.retirar());

        Caixa<Double> caixaValor = new Caixa<>();
        caixaValor.guardar(150.75);
        System.out.println(caixaValor.retirar());

        // A linha abaixo daria erro de compilação (tipo incompatível):
        // caixaTexto.guardar(123);
    }
}