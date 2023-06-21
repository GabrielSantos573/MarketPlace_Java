
  //-CRIAR UM ARRAY LIST NA CLASSE DAO E TER UM RETORN PRA ELA NA EXECUTORA.(OLHAR MATERIAL DE APOIO)

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int option;
    private String buscaProduto;

    public String getBuscaProduto() {
        return buscaProduto;
    }

    public void setBuscaProduto(String buscaProduto) {
        this.buscaProduto = buscaProduto;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    Scanner scanner = new Scanner(System.in);
    public ArrayList<Produto> produtos = new ArrayList<Produto>();
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    public ArrayList<Carrinho> carrinhos = new ArrayList<Carrinho>();

    

    void menuHome(){

        do{

            Produto p1 = new Produto();
            Produto p2 = new Produto();
            
            Cliente c1 = new Cliente();
            Cliente c2 = new Cliente();
            
            Carrinho ca1 = new Carrinho();
            Carrinho ca2 = new Carrinho();
            Carrinho ca3 = new Carrinho();


            System.out.println("-------------------");
            System.out.println("MARKETPLACE - HOME");
            System.out.println("-------------------");
            System.out.println();
            System.out.println("CRIAR CONTA: (1) - REGISTRO PRODUTO(2) - ENCERRAR (99)");
            System.out.println();
            System.out.println("(3) Buscar produtos - (4)CARRINHO");
            System.out.println();
            System.out.println("Produtos em destaque:");
            System.out.println();
            System.out.println("MIZUNO PRO-X");
            System.out.println("NIKE AIR FORCE 01");
            System.out.println("OAKLEY STRATUS");
            System.out.println();
            System.out.println("Produtos mais vendidos:");
            System.out.println();
            System.out.println("MIZUNO PRO-X");
            System.out.println("NIKE AIR FORCE 01");
            System.out.println("OAKLEY STRATUS");
            System.out.println();
            System.out.println("Top 3 vendedores:");
            System.out.println();
            System.out.println("MIZUNO PRO-X");
            System.out.println("NIKE AIR FORCE 01");
            System.out.println("OAKLEY STRATUS");
            setOption(scanner.nextInt());
            System.out.println();

            switch(option){
                case 1:
                    c1.Cadastrar();
                    c2.Cadastrar();

                    clientes.add(c1);
                    clientes.add(c2);

                    for (Cliente cliente : clientes) {
                        System.out.println("---------Cliente-----------");
                        System.out.println("Nome:"+cliente.getNome());
                        System.out.println("Email:"+cliente.getEmail());
                        System.out.println("Idade:"+cliente.getIdade());
                        System.out.println("CPF:"+cliente.getCpf());
                        System.out.println("CEP:"+cliente.getCep());
                        System.out.println("SEXO:"+cliente.getSexo());
                        System.out.println("Telefone:"+cliente.getTelefone());
                    }

                    //clientes.remove(1);
                break;
                
                case 2:
                    p1.registraProduto();
                    p2.registraProduto();

                    produtos.add(p1);
                    produtos.add(p2);

                    for (Produto produto : produtos) {
                        System.out.println("--------Produto-----------");
                        System.out.println("Nome:"+produto.getNome());
                        System.out.println("Marca:"+produto.getMarca());
                        System.out.println("Preço:"+produto.getPreco());
                        System.out.println("Categoria:"+produto.getCategoria());
                        System.out.println("Tamanhos:"+produto.getTamanhos());
                        System.out.println("Genero:"+produto.getGenero());
                    }

                    //produtos.remove(1);
                break;

                case 3:
                    scanner.nextLine();
                    System.out.println("---------BUSCA DE PRODUTOS--------");
                    System.out.println("Pesquisa: ");
                    this.setBuscaProduto(scanner.nextLine());
                    int i=0;
                    for (Produto produto : produtos) {
                        if(produto.getNome().equals(getBuscaProduto()) ){
                            System.out.println(produto.getNome()+" esta na lista.");
                            System.out.println("INDEX: "+i);

                            produto = produtos.get(i);
                            System.out.println("--------Produto PESQUISADO-----------");
                            System.out.println("Nome:"+produto.getNome());
                            System.out.println("Marca:"+produto.getMarca());
                            System.out.println("Preço:"+produto.getPreco());
                            System.out.println("Categoria:"+produto.getCategoria());
                            System.out.println("Tamanhos:"+produto.getTamanhos());
                            System.out.println("Genero:"+produto.getGenero());
                            break;
                        }
                        i++;
                    }
                    

                break;

                case 4:
                    int j=0;
                    for (Produto produto : produtos) {
                        System.out.println("--------Produto-----------");
                        System.out.println("("+j+")");
                        System.out.println("Nome:"+produto.getNome());
                        System.out.println("Marca:"+produto.getMarca());
                        System.out.println("Preço:"+produto.getPreco());
                        System.out.println("Categoria:"+produto.getCategoria());
                        System.out.println("Tamanhos:"+produto.getTamanhos());
                        System.out.println("Genero:"+produto.getGenero());
                        j++;
                    }
                    System.out.println("Qual produto deseja comprar?");
                    int opcCompra = scanner.nextInt();

                    scanner.nextLine();

                    int g=0;
                    System.out.println("DIGITE SEU CPF:");
                    String buscaCpf = scanner.nextLine();
                    
                    for (Cliente cliente : clientes) {
                        if (cliente.getCpf().equals(buscaCpf)) {
                            System.out.println(cliente.getCpf()+" ECONTRADO");
                            System.out.println("Index: "+g);

                            cliente = clientes.get(g);
                            System.out.println("---------Cliente-----------");
                            System.out.println("Nome:"+cliente.getNome());
                            System.out.println("Email:"+cliente.getEmail());
                            System.out.println("Idade:"+cliente.getIdade());
                            System.out.println("CPF:"+cliente.getCpf());
                            System.out.println("CEP:"+cliente.getCep());
                            System.out.println("SEXO:"+cliente.getSexo());
                            System.out.println("Telefone:"+cliente.getTelefone());
                            break;
                        } 
                        g++;
                    }
                    
                    
                    if (opcCompra == 1 && g == 1) {
                        ca1.Pedido(c1, p1);
                        carrinhos.add(ca1);

                        for (Carrinho carrinho : carrinhos) {
                            System.out.println("Comprador:"+carrinho.getComprador());
                            System.out.println("Compra:"+carrinho.getCompra());
                            System.out.println("Pagamento:"+carrinho.getToltal());
                            System.out.println("Pagamento:"+carrinho.getFormaPagamento());
                        }

                        //carrinhos.remove(0);

                    } else if(opcCompra ==2 && g ==2){
                        ca2.Pedido(c2, p2);
                        carrinhos.add(ca2);

                        for (Carrinho carrinho : carrinhos) {
                            System.out.println("Comprador:"+carrinho.getComprador());
                            System.out.println("Compra:"+carrinho.getCompra());
                            System.out.println("Pagamento:"+carrinho.getToltal());
                            System.out.println("Pagamento:"+carrinho.getFormaPagamento());
                        }
                    }else if (opcCompra == 2 && g == 1) {
                        ca3.Pedido(c1, p2);
                        carrinhos.add(ca3);

                        for (Carrinho carrinho : carrinhos) {
                            System.out.println("Comprador:"+carrinho.getComprador());
                            System.out.println("Compra:"+carrinho.getCompra());
                            System.out.println("Pagamento:"+carrinho.getToltal());
                            System.out.println("Pagamento:"+carrinho.getFormaPagamento());
                        }
                    }
                break;
            }

        }while(option != 99);
            
    }
    
}
