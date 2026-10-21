import java.util.ArrayList;

public class TestaListaCliente {
    public static void main(String[] args) {
        ArrayList<Cliente> lista = new ArrayList<>();
        lista.add(new Cliente("111", "Ana"));
        lista.add(new Cliente("222", "Bruno"));
        lista.add(new Cliente("333", "Carla"));

        // Cliente de busca com mesmo CPF, mas nome diferente
        Cliente clienteBusca = new Cliente("222", "Bruno Silva");

        System.out.println("contains: " + lista.contains(clienteBusca));
        System.out.println("indexOf: " + lista.indexOf(clienteBusca));
        // Como equals compara só o CPF, os métodos encontram o cliente.
    }
}