package br.edu.ifpb;

/**
 *
 * @author luan_
 */
public class TesteCatalogo {
    public static void main( String[] args){
        Catalogo catalogo = new Catalogo();
        
        Livro liv1 = new Livro("Teste1");
        Livro liv2 = new Livro("Teste2");
        Livro liv3 = new Livro("Teste3");
        
        catalogo.add(liv1); catalogo.add(liv2); catalogo.add(liv3);  //Adicionando os 3 livros no catalogo.
        
        System.out.println("Catalogo: ");
        catalogo.listar(); //Listando os livros do catalogo.
        System.out.println("\n");
        
        catalogo.remover("Teste2"); //Removendo o segundo livro.
        
        System.out.println("Catalogo após a remoção: ");
        catalogo.listar(); //Listando os livros do catalogo após a remoção.
        System.out.println("\n");
        
        catalogo.busca("Teste2"); //Fazendo a busca pelo livro "teste2"
    }
}
