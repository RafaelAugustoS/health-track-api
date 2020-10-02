package br.com.fiap.tds;

/**Classe para usuario.
 * @author Rafael Augusto e Gabriel Caiana
 * @version 1.0
 * @since Release 01 da aplicação
 */

public class Usuario extends Pessoa implements iclud {
    private String email;
    private String senha;
    private Integer plano;

    @Override
    public void incluir() {

    }

    @Override
    public boolean excluir() {
        return false;
    }

    @Override
    public boolean consultar() {
        return false;
    }

    public static void main(String[] args){
        Alimento alimento = new Alimento();

        alimento.incluir();
        alimento.consultar();
    }
}
