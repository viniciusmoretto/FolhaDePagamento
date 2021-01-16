public class Professor extends Pessoa implements Funcionario {
    private double valorDia;
    private int diasTrabalhados;
    private double descontoFolha;
    private boolean passeOnibus;
    private String cargo = "Professor";
    
    public Professor(String nome, String rg, String cpf, double valorDia, int diasTrabalhados, boolean passeOnibus){
        super(nome, rg, cpf);
        this.valorDia = valorDia;
        this.diasTrabalhados = diasTrabalhados;
        this.passeOnibus = passeOnibus;
    }
    
    @Override
    public double salarioBruto(){
       return valorDia * diasTrabalhados;
    }
    
    public double descontoFolha(){
       this.descontoFolha = (salarioBruto() * 0.08);
       if(this.passeOnibus == true){
            this.descontoFolha = descontoFolha + (salarioBruto() * 0.06);
       }
       return this.descontoFolha;
    }
    
    public String getCargo(){
        return this.cargo;
    }
}