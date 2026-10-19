import java.util.ArrayList;

public class TestaFuncionario {
    public static Funcionario buscarPorMatricula(ArrayList<Funcionario> lista, int matricula) {
        for (Funcionario f : lista) {
            if (f.getMatricula() == matricula) {
                return f;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario(101, "Maria", 3000));
        funcionarios.add(new Funcionario(102, "João", 2500));
        funcionarios.add(new Funcionario(103, "Ana", 4000));
        funcionarios.add(new Funcionario(104, "Pedro", 2800));

        Funcionario encontrado = buscarPorMatricula(funcionarios, 103);
        if (encontrado != null) {
            encontrado.setSalario(encontrado.getSalario() * 1.10);
            System.out.println("Novo salário de " + encontrado.getNome() + ": " + encontrado.getSalario());
        }
    }
}