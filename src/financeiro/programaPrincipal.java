package financeiro;

import vendas.registroVendas;

public class programaPrincipal {
    public static void main(String[] args) {
        registro funcionario1 = new registro("Joao", 2000, 2, 1);
        funcionario1.status();
        registroVendas comprador1 = new registroVendas("Pedro", "Carro", 70000, 2);
        comprador1.status();
    }
}
