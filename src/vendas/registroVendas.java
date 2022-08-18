package vendas;
public class registroVendas {
    String comprador;
    String produto;
    int valor;
    int desconto;

    public registroVendas(String comprador, String produto, int valor, int desconto) {
        this.comprador = comprador;
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }

    public void status(){
        System.out.println("Comprador: " + this.comprador);
        System.out.println("Produto: " + this.produto);
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Desconto: " + this.desconto + "%");
    }
}
