import java.util.ArrayList;

public class Financeiro implements Salario{
    double salarioTotal;
    ArrayList<Double> salarios = new ArrayList();
    
    public void addSalario(double salario){
        this.salarios.add(salario);
    }
    
    public ArrayList<Double> listaSalario(){
        return salarios;
    }
    
    public double totalSalario(){
       for(double salarios:this.salarios){
           this.salarioTotal += salarios;
       }
       return this.salarioTotal;
    }
    
    public double salarioLiquido(Funcionario funcionarioRecebe){
        double salarioLiquidoo = funcionarioRecebe.salarioBruto() - funcionarioRecebe.descontoFolha();
        salarios.add(salarioLiquidoo);
        return salarioLiquidoo;
    }
}