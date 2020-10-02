package br.com.fiap.tds;

public interface AtividadeDAO {
    public static String[] getAll(){
        String[] atividades = {"Bicicleta", "Correr", "Academia", "Aeróbica", "Natação", "Yoga", "Spinning", "Step", "Jump", "Crossfit", "Zumba"};
        return atividades;
    }
}
