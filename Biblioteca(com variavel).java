package biblioteca;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do livro:");
        String nome = scan.nextLine();
        
        System.out.println("Digite o nome do autor:");
        String autor = scan.nextLine();
  
        System.out.println("Digite o Genero:");
        String genero = scan.nextLine();
        
        System.out.println("Digite o nome da editora: ");
        String editora = scan.nextLine();
        
        Livros a = new Livros(nome,autor,genero,editora);
    
        System.out.println("\n \n NOME DO LIVRO: "+a.getNome()+"\n NOME DO AUTOR: "+ a.getAutor()+"\n O SEU GENERO É : "+ a.getGenero()+"\n A EDITORA É: "+ a.getEditora() );
    
    }
    
