package br.com.arneidev.reflectionstabela;
public class AppTabela {
    public static void main(String[] args){
        Class tabela = TabelaNome.class;
        System.out.println("Nome da Classe: "+tabela);
        System.out.println("Anotação e nome tabela: "+tabela.getDeclaredAnnotation(Tabela.class));
    }
}
