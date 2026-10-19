public class TestaArray {
    public static void main(String[] args) {
        // 1. Declara um array de Carro com 3 posições
        Carro[] garagem = new Carro[3];

        // 2. Cria 3 carros diferentes e coloca no array
        garagem[0] = new Carro("Fiat", "Uno", 2015);
        garagem[1] = new Carro("Volkswagen", "Gol", 2018);
        garagem[2] = new Carro("Chevrolet", "Onix", 2022);

        // 3. Percorre o array com for-each e mostra os dados
        for (Carro carro : garagem) {
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Modelo: " + carro.getModelo());
            System.out.println("Ano: " + carro.getAno());
            System.out.println("-------------------");
        }
    }
}
