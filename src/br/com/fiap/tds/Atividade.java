package br.com.fiap.tds;

import java.util.Date;

public class Atividade implements iclud {
    private Date data;
    private String hora;
    private String desc;
    private Float caloria;

    /** Método para incluir atividade
     * @return void */

    @Override
    public void incluir() {

    }

    /** Método para excluir atividade
     * @return Boolean */

    @Override
    public boolean excluir() {
        return false;
    }

    /** Método para consultar atividade
     * @return Boolean */

    @Override
    public boolean consultar() {
        return false;
    }
}
