package escola;
import pessoas.Aluno;

public class Chamada {

    public String Turma;

    public Chamada(String mensagem, String turma){
        String texto = "Olá turma" + turma + " " + mensagem;
        System.out.print(texto);
        Turma = turma;

        selecionarTurma();
        selecionarAlunos();
    }

    public void selecionarTurma(){
        String texto = "Turma " + Turma + " selecionada \n";
        System.out.println(texto);
    }
    
    public void selecionarAlunos(){
        Aluno aluno = new Aluno();
        System.out.println(aluno.alunosTurma(Turma));
    }
}
