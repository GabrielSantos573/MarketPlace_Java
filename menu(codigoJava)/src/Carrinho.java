import java.util.Scanner;

public class Carrinho {
    private Produto compra;
    private Cliente comprador;
    private String formaPagamento;
    private int senha;
    private float toltal;

    public float getToltal() {
        return toltal;
    }
    public void setToltal(float toltal) {
        this.toltal = toltal;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public Produto getCompra() {
        return compra;
    }
    public void setCompra(Produto compra) {
        this.compra = compra;
    }
    public Cliente getComprador() {
        return comprador;
    }
    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    Scanner scanner = new Scanner(System.in);

    public void Pedido(Cliente c, Produto p){
        this.setCompra(p);
        this.setComprador(c);
        this.setToltal(p.getPreco());
        System.out.println("-----------CARRINHO-------------");
        System.out.println("CLiente:"+c.getNome());
        System.out.println("CPF:"+c.getCpf());
        System.out.println("Produto: "+p.getNome());
        System.out.println("TOTAL:"+p.getPreco()+"$");
        int opcPagamento;
        do {
            System.out.println("-----------PAGAMENTO-----------");
            System.out.println("INFORME A FORMA DE PAGAMENTO:");
            System.out.println("(1) Crédito - 2(Débito)");
            opcPagamento = scanner.nextInt();
            switch (opcPagamento) {
                case 1:
                    this.setFormaPagamento("Crédito");
                    break;

                case 2:
                    this.setFormaPagamento("Débito");
                    break;
            
                default:
                System.out.println("OPÇÕES EXISTENTES(1/2)");
                    break;
            }
        } while (opcPagamento != 1 && opcPagamento != 2);

        do {
            System.out.println("SENHA DO CARTÃO:");
            this.setSenha(scanner.nextInt());
            if (this.getSenha() < 6) {
                System.out.println("A senha deve ter 6 digitos!");
            } else {
                System.out.println("SENHA ACEITA!");
                System.out.println("OBRIGADO POR COMPRAR CONOSCO!");
            }
        } while (this.getSenha() < 6);
    }
}
