package Classes;


public class Brinquedos {
 
    private int id_brinquedo;
    private String nome_brinquedo;
    private int piora_sono_brinquedo;
    private int piora_higiene_brinquedo;
    private int piora_energia_brinquedo;
    private int piora_fome_brinquedo;
    private int melhora_saude_brinquedo;
    private int melhora_estadoM_brinquedo;
    

    public Brinquedos() {
    }

    public Brinquedos(int id_brinquedo, String nome_brinquedo, int piora_sono_brinquedo, int piora_higiene_brinquedo, int piora_energia_brinquedo, int piora_fome_brinquedo, int melhora_saude_brinquedo, int melhora_estadoM_brinquedo) {
        this.id_brinquedo = id_brinquedo;
        this.nome_brinquedo = nome_brinquedo;
        this.piora_sono_brinquedo = piora_sono_brinquedo;
        this.piora_higiene_brinquedo = piora_higiene_brinquedo;
        this.piora_energia_brinquedo = piora_energia_brinquedo;
        this.piora_fome_brinquedo = piora_fome_brinquedo;
        this.melhora_saude_brinquedo = melhora_saude_brinquedo;
        this.melhora_estadoM_brinquedo = melhora_estadoM_brinquedo;
    }

    public int getId_brinquedo() {
        return id_brinquedo;
    }

    public void setId_brinquedo(int id_brinquedo) {
        this.id_brinquedo = id_brinquedo;
    }

    public String getNome_brinquedo() {
        return nome_brinquedo;
    }

    public void setNome_brinquedo(String nome_brinquedo) {
        this.nome_brinquedo = nome_brinquedo;
    }

    public int getPiora_sono_brinquedo() {
        return piora_sono_brinquedo;
    }

    public void setPiora_sono_brinquedo(int piora_sono_brinquedo) {
        this.piora_sono_brinquedo = piora_sono_brinquedo;
    }

    public int getPiora_higiene_brinquedo() {
        return piora_higiene_brinquedo;
    }

    public void setPiora_higiene_brinquedo(int piora_higiene_brinquedo) {
        this.piora_higiene_brinquedo = piora_higiene_brinquedo;
    }

    public int getPiora_energia_brinquedo() {
        return piora_energia_brinquedo;
    }

    public void setPiora_energia_brinquedo(int piora_energia_brinquedo) {
        this.piora_energia_brinquedo = piora_energia_brinquedo;
    }

    public int getPiora_fome_brinquedo() {
        return piora_fome_brinquedo;
    }

    public void setPiora_fome_brinquedo(int piora_fome_brinquedo) {
        this.piora_fome_brinquedo = piora_fome_brinquedo;
    }

    public int getMelhora_saude_brinquedo() {
        return melhora_saude_brinquedo;
    }

    public void setMelhora_saude_brinquedo(int melhora_saude_brinquedo) {
        this.melhora_saude_brinquedo = melhora_saude_brinquedo;
    }

    public int getMelhora_estadoM_brinquedo() {
        return melhora_estadoM_brinquedo;
    }

    public void setMelhora_estadoM_brinquedo(int melhora_estadoM_brinquedo) {
        this.melhora_estadoM_brinquedo = melhora_estadoM_brinquedo;
    }

}