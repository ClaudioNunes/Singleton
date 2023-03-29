import java.awt.color.ICC_ColorSpace;

public class Aluno {

    private String Nome;
    private int Idade;

    private static Aluno _aluno;

    public static Aluno getInstancia()
    {
       if (_aluno == null)
       {
           _aluno = new Aluno();
       }
       return _aluno;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public int getIdade() {
        return Idade;
    }
    public void setIdade(int idade) {
        Idade = idade;
    }
    private Aluno() {
    }
}