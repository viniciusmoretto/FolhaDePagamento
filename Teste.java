public class Teste {
    public static void main(String[] args) throws Exception {
        
        Financeiro fin = new Financeiro();
        Empresa empresa1 = new Empresa(fin);
        
        Professor prof1 = new Professor("Dizido", "471852963-9", "582741963-70", 50, 20, true);
        Motorista mot1 = new Motorista("Tiuzus", "741875485-5", "859165156-70", 100, 24, 500);
        
        empresa1.addFuncionario(prof1);
        empresa1.addFuncionario(mot1);
        
        System.out.println("Salario 1: " + empresa1.financeiro.salarioLiquido(prof1) + " / Cargo: " + prof1.getCargo());
        System.out.println("Salario 2: " + empresa1.financeiro.salarioLiquido(mot1) + " / Cargo: " + mot1.getCargo());
        
        Financeiro fin2 = empresa1.financeiro;
        
        System.out.println("");
        
        for(int i = 0;i < fin2.salarios.size();i++){
            double salario = fin2.salarios.get(i);
            Funcionario fun = empresa1.funcionario.get(i);
            System.out.println("Salario " + i + ": " + salario + " / Cargo: " + fun.getCargo());
        }
        System.out.println("Salario Total: " + empresa1.financeiro.totalSalario());
    }
}