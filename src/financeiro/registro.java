package financeiro;
public class registro {
    String funcionario;
    float salario;
    int faltas;
    int compensacoes;

    public registro(String funcionario, float salario, int faltas, int compensacoes) {
        this.funcionario = funcionario;
        this.salario = salario;
        this.faltas = faltas;
        this.compensacoes = compensacoes;
    }

    public void status(){
        System.out.println("O nome do funcionário é " + this.funcionario);
        System.out.println("O seu salario é R$" + this.salario);
        System.out.println("Faltas nesse mês " + this.faltas);
        System.out.println("Mas teve " + this.compensacoes + " dias compensados");
    }
}
