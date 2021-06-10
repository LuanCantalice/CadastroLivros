package br.edu.ifpb;
import java.util.ArrayList;
/**
 *
 * @author luan_
 */
public class Catalogo {
    ArrayList<Livro> livros = new ArrayList();
    
    public void add(Livro titulo){
        livros.add(titulo);
    }
    public void remover(String titulo){
        for(int i = 0; i<livros.size(); i++){
            Livro livro = livros.get(i);
            if(livro.getTitulo().equals(titulo)){
                livros.remove(livro);
                break;
            }
        }
    }
    public void busca(String titulo){
        for(Livro livro: livros){
            if(livro.getTitulo().equals(titulo)){
                System.out.println("Livro encontrado!");
                break;
            }
            else{
                System.out.println("Livro não encontrado!");
                break;
            }
        }
    }
    public void listar(){
        for(Livro l: livros){
            System.out.println(l);
        }
    }
}
    