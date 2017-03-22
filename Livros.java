
package biblioteca;

public class Livros {
   private String nome;
   private String autor;
   private String genero;
   private String editora;
 
   //construtor
   Livros (String n, String a, String g, String e){
       nome = n;
       autor = a;
       genero = g;
       editora = e;
   }
   
   public String getNome(){
       return nome;
   }
   public void setNome(String n){
       nome = n;
   }
   
   
   public String getAutor(){
       return autor;
   }
   public void setAutor(String n){
       autor = n;
   }
   
   
   public void setGenero(String n){
       genero = n;
   }
   public String getGenero(){
       return genero;
   }
   
   
   public void setEditora(String n){
       editora = n;
   }
   public String getEditora(){
       return editora;
   }
   
}
