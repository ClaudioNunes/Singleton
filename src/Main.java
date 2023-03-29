// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Aluno aluno = Aluno.getInstancia();

        aluno.setNome("Leila");
        aluno.setIdade(20);

        Aluno aluno1 = Aluno.getInstancia();

        System.out.println(aluno1.getNome());

        aluno1.setNome("Elisangela");

        System.out.println(aluno.getNome());

        }
    }

