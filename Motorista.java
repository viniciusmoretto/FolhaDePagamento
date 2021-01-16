public class Motorista extends Pessoa implements Funcionario { 
    private double valorDia;
    private int diasTrabalhados;
    private double descontoFolha;
    private double gastoGasolina;
    private String cargo = "Motorista";
    
    public Motorista(String nome, String rg, String cpf, double valorDia, int diasTrabalhados, double gastoGasolina){
        super(nome, rg, cpf);
        this.valorDia = valorDia;
        this.diasTrabalhados = diasTrabalhados;
        this.gastoGasolina = gastoGasolina;
    }
    
    @Override
    public double salarioBruto(){
       return valorDia * diasTrabalhados;
    }
    
    public double descontoFolha(){
       return ((salarioBruto() * 0.08) - gastoGasolina);
    }
    
    public String getCargo(){
        return this.cargo;
    }
}