import java.util.*;

public class Empresa {
    ArrayList <Funcionario> funcionario = new ArrayList();
    Financeiro financeiro = new Financeiro();
    
    public Empresa(Financeiro financeiro){
        this.financeiro = financeiro;
    }
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionario.add(funcionario);
    }
    
    public ArrayList<Funcionario> listaFuncionario(){
        return funcionario;
    }
}