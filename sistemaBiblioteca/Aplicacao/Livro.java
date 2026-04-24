package sistemaBiblioteca.Aplicacao;

public class Livro {
    private String titulo; 
    private String autor;
    private Boolean disponivel;
    
    public Livro(String titulo, String autor, Boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public boolean emprestar(){
       return disponivel = false;
    }

    public boolean devolver(){
       return disponivel = true;
    }

    public void exibirInfo(){
        System.out.println("Informações do livro" );
        System.out.println("Nome: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Diponivel: " + disponivel);
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Boolean getDisponivel() {
        return disponivel;
    }
    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
