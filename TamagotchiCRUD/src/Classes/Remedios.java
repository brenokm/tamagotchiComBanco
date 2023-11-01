package Classes;


public class Remedios {
   
    private int id_remedio;
    private String nome_remedio;
    private String tipo_remedio;
    private int melhora_estadoM_remedio;
    private int melhora_saude_remedio;
    

    public Remedios() {
    }

    public Remedios(int id_remedio, String nome_remedio, String tipo_remedio, int melhora_estadoM_remedio, int melhora_saude_remedio) {
        this.id_remedio = id_remedio;
        this.nome_remedio = nome_remedio;
        this.tipo_remedio = tipo_remedio;
        this.melhora_estadoM_remedio = melhora_estadoM_remedio;
        this.melhora_saude_remedio = melhora_saude_remedio;
    }

    public int getId_remedio() {
        return id_remedio;
    }

    public void setId_remedio(int id_remedio) {
        this.id_remedio = id_remedio;
    }

    public String getNome_remedio() {
        return nome_remedio;
    }

    public void setNome_remedio(String nome_remedio) {
        this.nome_remedio = nome_remedio;
    }

    public String getTipo_remedio() {
        return tipo_remedio;
    }

    public void setTipo_remedio(String tipo_remedio) {
        this.tipo_remedio = tipo_remedio;
    }

    public int getMelhora_estadoM_remedio() {
        return melhora_estadoM_remedio;
    }

    public void setMelhora_estadoM_remedio(int melhora_estadoM_remedio) {
        this.melhora_estadoM_remedio = melhora_estadoM_remedio;
    }

    public int getMelhora_saude_remedio() {
        return melhora_saude_remedio;
    }

    public void setMelhora_saude_remedio(int melhora_saude_remedio) {
        this.melhora_saude_remedio = melhora_saude_remedio;
    }

   
}
