public class TestaCliente {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("12345678900", "Maria");
        Cliente cli2 = new Cliente("12345678900", "Maria");

        System.out.println("cli1 == cli2: " + (cli1 == cli2));
        System.out.println("cli1.equals(cli2): " + cli1.equals(cli2));

        // equals() padrão compara se são o mesmo objeto na memória (referência).
        // Como são dois objetos diferentes, retorna false, mesmo com dados iguais.
    }
}