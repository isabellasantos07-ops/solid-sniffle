public class TestaArray {
    public static void main(String[] args) {
        // Array de 3 carros (igual ao exercício 1)
        Carro[] garagem = new Carro[3];

        garagem[0] = new Carro("Fiat", "Uno", 2015);
        garagem[1] = new Carro("Volkswagen", "Gol", 2018);
        garagem[2] = new Carro("Chevrolet", "Onix", 2022);

        // 1. Pega a referência do primeiro carro e guarda em outra variável
        Carro meuCarro = garagem[0];

        // 2. Muda o ano usando a nova variável
        meuCarro.setAno(2025);

        // 3. Mostra o ano acessando direto pelo array
        System.out.println("Ano do carro na posição 0: " + garagem[0].getAno());

        // 4. Explicação:
        // meuCarro e garagem[0] apontam para o MESMO objeto na memória.
        // Por isso, quando alteramos o ano por meio de meuCarro, o valor
        // também muda quando lemos pelo array (é o mesmo carro).
    }
}