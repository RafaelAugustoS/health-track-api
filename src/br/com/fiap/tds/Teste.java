package br.com.fiap.tds;

public class Teste implements AtividadeDAO {
    public static void main(String[] args){
        String[] dados = AtividadeDAO.getAll();
        for(String dado : dados){
            System.out.println(dado);
        }
    }
}
