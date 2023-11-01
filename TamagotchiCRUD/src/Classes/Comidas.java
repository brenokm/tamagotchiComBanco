package Classes;

public class Comidas {

    private int id_comida;
    private String nome_comida;
    private String tipo_comida;
    private int piora_sono_comida;
    private int melhora_saude_comida;
    private int melhora_energia_comida;
    private int melhora_fome_comida;
    private int melhora_estadoM_comida;

    public Comidas() {
    }

    public Comidas(int id_comida, String nome_comida, String tipo_comida, int piora_sono_comida, int melhora_saude_comida, int melhora_energia_comida, int melhora_fome_comida, int melhora_estadoM_comida) {
        this.id_comida = id_comida;
        this.nome_comida = nome_comida;
        this.tipo_comida = tipo_comida;
        this.piora_sono_comida = piora_sono_comida;
        this.melhora_saude_comida = melhora_saude_comida;
        this.melhora_energia_comida = melhora_energia_comida;
        this.melhora_fome_comida = melhora_fome_comida;
        this.melhora_estadoM_comida = melhora_estadoM_comida;
    }

    public int getId_comida() {
        return id_comida;
    }

    public void setId_comida(int id_comida) {
        this.id_comida = id_comida;
    }

    public String getNome_comida() {
        return nome_comida;
    }

    public void setNome_comida(String nome_comida) {
        this.nome_comida = nome_comida;
    }

    public String getTipo_comida() {
        return tipo_comida;
    }

    public void setTipo_comida(String tipo_comida) {
        this.tipo_comida = tipo_comida;
    }

    public int getPiora_sono_comida() {
        return piora_sono_comida;
    }

    public void setPiora_sono_comida(int piora_sono_comida) {
        this.piora_sono_comida = piora_sono_comida;
    }

    public int getMelhora_saude_comida() {
        return melhora_saude_comida;
    }

    public void setMelhora_saude_comida(int melhora_saude_comida) {
        this.melhora_saude_comida = melhora_saude_comida;
    }

    public int getMelhora_energia_comida() {
        return melhora_energia_comida;
    }

    public void setMelhora_energia_comida(int melhora_energia_comida) {
        this.melhora_energia_comida = melhora_energia_comida;
    }

    public int getMelhora_fome_comida() {
        return melhora_fome_comida;
    }

    public void setMelhora_fome_comida(int melhora_fome_comida) {
        this.melhora_fome_comida = melhora_fome_comida;
    }

    public int getMelhora_estadoM_comida() {
        return melhora_estadoM_comida;
    }

    public void setMelhora_estadoM_comida(int melhora_estadoM_comida) {
        this.melhora_estadoM_comida = melhora_estadoM_comida;
    }

   

}
