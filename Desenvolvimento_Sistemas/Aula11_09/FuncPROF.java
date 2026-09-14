package Funcionarios;
public class FuncPROF extends Funcionarios{
    private String disciplina;

    public FuncPROF(String nome, double Salario, String disciplina){
        super(nome, Salario);
        this.disciplina=disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }
    public void setDisciplina(String disciplina){
        this.disciplina=disciplina;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Disciplina: ");
    }
}




