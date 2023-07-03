package pessoas;

public class Aluno extends Pessoa {
    public String Situacao;
    public double Media;   
    
    
    public void SalvarAluno(double media){
        salvarPessoa();
        
        Media = media;
        if (media >= 7){
            Situacao = "Aprovado";
        } else {
            Situacao = "Reprovado";
        }
    }

    public String exibirAluno(){
        return Media + Situacao;
    }

    public String alunosTurma(String turma){
        String alunos;

        switch(turma){
            case "301":
            alunos = "\n-Victor Hugo\n-Nina\n-Pietro";
            break;
            case "201":
            alunos = "\n-Jorge\n-Ana\n-Bruce";
            break;
            case "101":
            alunos = "\n-Pietra\n-Sálvio\n-Clark";

            default: 
            alunos = "turma inexistente";
            break;
        }
        return alunos;
        }

    }

