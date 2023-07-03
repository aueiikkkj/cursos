package pessoas;

public class Pessoa{
    public String Nome;
    private int Idade;

    public Pessoa(){
        System.out.println("Olá Senhor ");
    }

    protected void salvarPessoa(){
        Nome = "Victor Hugo";
        Idade = 17;
    }
    public void registrar(){
        salvarPessoa();
    }
    public String exibirPessoa(){
        return Nome + Idade;
    }

}