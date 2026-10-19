public class TestaEstante {
    public static void main(String[] args) {
        Livro[] estante = new Livro[5];

        // Só preenche as posições 0, 2 e 4
        estante[0] = new Livro("Dom Casmurro", 256);
        estante[2] = new Livro("O Pequeno Príncipe", 96);
        estante[4] = new Livro("Harry Potter", 320);
        // posições 1 e 3 ficam null

        for (int i = 0; i < estante.length; i++) {
            if (estante[i] != null) {
                System.out.println("Título: " + estante[i].getTitulo());
                System.out.println("Páginas: " + estante[i].getPaginas());
            } else {
                System.out.println("Posição " + i + " está vazia.");
            }
            System.out.println("-------------------");
        }
    }
}