import java.util.Scanner;

public class Cliente {

    Scanner input = new Scanner(System.in);

    private String email;
    private String senha;
    private String nome;
    private int idade;
    private String cpf;
    private String cep;
    private String sexo;
    private String telefone;

    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void Cadastrar(){
        System.out.println("--------CADASTRO-----------");
        System.out.println("Nome completo: ");
        this.setNome(input.nextLine());

        do {
            System.out.println("Idade: ");
            this.setIdade(input.nextInt());
            if (this.getIdade() <18) {
                System.out.println("O USUÁRIO TEM QUE SER MAIOR DE IDADE!");
            } else {
                System.out.println("IDADE ACEITA!");
            }  
        } while(this.getIdade() <18);
        
        input.nextLine();

        do {
            System.out.println("CPF: ");
            this.setCpf(input.nextLine());
            if (this.getCpf().length() != 11) {
                System.out.println("O CPF DEVE CONTER 11 DIGITOS!");
            } else {
                System.out.println("CPF ACEITO!");
            }
        } while (this.getCpf().length() != 11);
        
        do {
            System.out.println("CEP: ");
            this.setCep(input.nextLine());
            if (this.getCep().length() != 8) {
                System.out.println("O CEP DEVE CONTER 8 DIGITOS!");
            } else {
                System.out.println("CEP ACEITO!");
            }
        } while (this.getCep().length() != 8);
        
        
        do {
            System.out.println("SEXO: ");
            System.out.println("(M) Masculino \n (F) Feminino \n (X) Outros");
            String opcSexo = input.nextLine();

            switch (opcSexo) {
                case "M":
                    this.setSexo("Masculino");
                    break;

                case "F":
                    this.setSexo("Feminino");
                break;

                case "X":
                    this.setSexo("LGBTQIA+");
                break;
            
                default:
                    System.out.println("Escolha uma das opções existentes(M/F/X)");
                    break;
            }
        } while (this.getSexo() != "Masculino" && this.getSexo() != "Feminino" && this.getSexo() != "LGBTQIA+");
   

        do {
            System.out.println("Telefone:");
            this.setTelefone(input.nextLine());
            

            if (this.getTelefone().length() != 11) {
                System.out.println("O telefone dece conter 11 digitos(INCLUINDO O DDD)");
            } else {
                System.out.println("TELEFONE ACEITO!");
            }

        } while (this.getTelefone().length() != 11);

        System.out.println("----Acesso a sua conta----");

        System.out.println("exemplo@teste.com");
        System.out.println("Email:");
        this.setEmail(input.nextLine());
        this.setEmail(this.getEmail().replaceAll("\\s", ""));

        System.out.println("Senha: ");
        this.setSenha(input.nextLine());
        this.setSenha(this.getSenha().replaceAll("\\s", ""));
            
    }

}
