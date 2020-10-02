package br.com.fiap.tds;

public class Alimento implements iclud {
    private String nomeAlimento;
    private String descricao;
    private Double calorias;

    /** Método para incluir alimento
     * @return void */

    @Override
    public void incluir() {
        this.nomeAlimento = "Pão";

    }

    /** Método para excluir alimento
     * @return Boolean */

    @Override
    public boolean excluir() {
        return false;
    }

    /** Método para consultar aliemnto
     * @return Boolean */

    @Override
    public boolean consultar(){
        System.out.println("Aliemnto: "+this.nomeAlimento);
        return true;
    }
}
