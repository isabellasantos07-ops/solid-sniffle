public class TestaEstudante {
    // Método de cópia profunda
    public static Estudante[] clonarTurma(Estudante[] original) {
        Estudante[] copia = new Estudante[original.length];

        for (int i = 0; i < original.length; i++) {
            // Cria um objeto novo com os mesmos valores
            copia[i] = new Estudante(original[i].getNome(), original[i].getNota());
        }
        return copia;
    }

    public static void main(String[] args) {
        Estudante[] turma = new Estudante[2];
        turma[0] = new Estudante("Ana", 8.5);
        turma[1] = new Estudante("Bruno", 7.0);

        Estudante[] turmaClonada = clonarTurma(turma);

        // Altera a nota só na turma clonada
        turmaClonada[0].setNota(10.0);

        System.out.println("Nota original de Ana: " + turma[0].getNota());      // continua 8.5
        System.out.println("Nota clonada de Ana: " + turmaClonada[0].getNota()); // 10.0
    }
}