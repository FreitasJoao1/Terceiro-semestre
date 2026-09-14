package Funcionarios;
public class FuncTEC extends Funcionarios {
    private String setor;

    public FuncTEC(String nome, double salario, String setor){
        super(nome, salario);
        this.setor=setor;
    }

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor=setor;
    }

    @Override 
    public void exibirDados(){
        super.exibirDados();
        System.out.println("O setor: "+setor);

    }

}
