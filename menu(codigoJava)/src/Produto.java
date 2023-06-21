//import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private String nome;
    private String marca;
    private float preco;
    private String tamanhos;
    private String categoria;
    private String genero;

    Scanner scanner = new Scanner(System.in);

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTamanhos() {
        return tamanhos;
    }
    public void setTamanhos(String tamanhos) {
        this.tamanhos = tamanhos;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void registraProduto(){
            System.out.println("-------------------");         
            System.out.println("REGISTRO DE PRODUTO");             
            System.out.println("-------------------");

            do {
                System.out.print("Digite o nome do produto: ");
                setNome(scanner.nextLine());
                if (this.getNome().length() < 3) {
                    System.out.println("O NOME NÃO PODE TER MENOS DE 3 DIGITOS!");
                } else {
                    System.out.println("Nome aceito!");
                }
            } while (this.getNome().length() < 3);
        

            int opc;
            do {
                System.out.println("Qual a categoria do produto:");
                System.out.println("(1) ESPORTE");
                System.out.println("(2) CASUAL");
                System.out.println("(3) BOTAS");  
                opc = scanner.nextInt();
                switch (opc) {
                    case 1:
                        this.setCategoria("Esporte");
                        break;

                    case 2:
                        this.setCategoria("Casual");
                        break;

                    case 3:
                        this.setCategoria("Botas");
                        break;
                
                    default:
                        System.out.println("DIGITE UMA DAS OPÇÕES(1/2/3)");
                        break;
                        
                }
            } while (opc != 1 && opc != 2 && opc != 3);

            scanner.nextLine();
            int opcMarca;
            do {
                System.out.println("Marca:");
                System.out.println("(1) NIKE");
                System.out.println("(2) ADIDAS");
                System.out.println("(3) OAKLEY");
                System.out.println("(4) UNDER ARMOUR");
                System.out.println("(5) MIZUNO");
                System.out.println("(6) PUMA");
                opcMarca=scanner.nextInt();
                switch (opcMarca) {
                    case 1:
                        this.setMarca("NIKE");
                        break;

                    case 2:
                        this.setMarca("ADIDAS");
                        break;

                    case 3:
                        this.setMarca("OAKLEY");
                        break;

                    case 4:
                        this.setMarca("UNDER ARMOUR");
                        break;

                    case 5:
                        this.setMarca("MIZUNO");
                        break;

                    case 6:
                        this.setMarca("PUMA");
                        break;
                    
                    default:
                        System.out.println("DIGITE UMA DAS OPÇÕES EXISTENTES(1-6)");
                        break;
                            
                            
                    }
            } while (opcMarca != 1 && opcMarca != 2 && opcMarca != 3 && opcMarca != 4 && opcMarca != 5 && opcMarca != 6);

            scanner.nextLine();
            String opcGenero;
            do {
                System.out.println("Genero do Calçado(M/F):");
                opcGenero=scanner.nextLine();
                switch (opcGenero) {
                    case "M":
                        this.setGenero("Masculino");
                        break;

                    case "F":
                        this.setGenero("Feminino");
                        break;
                
                    default:
                    System.out.println("Digite uma das opções(M/F)");
                        break;
                }
            } while (getGenero() != "Masculino" && getGenero() != "Feminino");

            System.out.println("Informe os tamanhos(38-43):");
            setTamanhos(scanner.nextLine());
 
            do {

                
                System.out.println("PREÇO:");
                this.setPreco(scanner.nextFloat());
                if (this.getPreco() < 100f || this.getPreco() > 10000f) {
                    System.out.println("PREÇOS ACEITOS:100$ - 10.000$");
                } else {
                    System.out.println("Preço aceito!");
                }
            } while(this.getPreco() < 100f || this.getPreco() > 10000f);

            System.out.println("Produto registrado com sucesso!\n");
            scanner.nextLine();
    }                
}
        
    


