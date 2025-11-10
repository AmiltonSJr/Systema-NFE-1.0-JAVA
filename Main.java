import java.util.Scanner;

public class Main{
    
    
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("--- Sistema NFE ---");
       
        System.out.println();
        
        System.out.println("Escolha uma das opçoes abaixo.");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - NFE");
        System.out.println("3 - Sair");
        int opcoes = input.nextInt();
        input.nextLine();
        
        System.out.println();
        
        
        
        
        
        if(opcoes == 1){
        System.out.println("  -- Cadastros --");
        System.out.println("1-Cadastro de Clientes");
        System.out.println("2-Cadastro de Transportadoras");
        System.out.println("3-Cadastro de Vendedor");
        int escolha = input.nextInt();
            input.nextLine();
         
        
            if(escolha == 1){
            System.out.print("Nome: ");
             String nomeCliente = input.nextLine();
            
            System.out.println();
            
            System.out.print("Telefone: ");
             String telefoneCliente = input.nextLine();
            
            System.out.println();
            
            System.out.print("Logradouro:");
             String enderecoCliente = input.nextLine();
            
            System.out.println();
            
            System.out.print("Numero:");
             int numeroCliente = input.nextInt();
            
            System.out.println();
            
            System.out.print("Bairro: ");
             String bairroCliente = input.nextLine();
            input.nextLine();
            
       
            }
       
            else if(escolha == 2){
                 System.out.print("Nome: ");
                 String nomeTransportadora = input.nextLine();
                 
                 System.out.println();
                 
                 System.out.print("Telefone: ");
                 String telefoneTransportadora = input.nextLine();
                 
                 System.out.println();
                 
                 System.out.print("Endereço: ");
                 String enderecoTransportadora = input.nextLine();
                 
                 System.out.println();
                 
                 System.out.print("Numero: ");
                 int numeroTransportadora = input.nextInt();
                 
                 System.out.println();
                 
                 System.out.print("Bairro: ");
                 String bairroTranportadora = input.nextLine();
                 
                 
            }
            else if(escolha == 3){
                 System.out.print("Nome: ");
                 String nomeVendedor = input.nextLine();
                 
                 System.out.println();
                 
                 System.out.print("Numero cadastro: ");
                 int numeroVendedor = input.nextInt();
                 
                 System.out.println();
                 
                 System.out.print("Telefone: ");
                 String telefoneVendedor = input.nextLine();
                 input.nextLine();
                 
                 
            
            }
            else{
                System.out.print("Opção invalida.");
            }
        
        } 
    }
}
