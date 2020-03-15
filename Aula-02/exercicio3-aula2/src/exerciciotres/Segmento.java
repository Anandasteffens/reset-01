package exerciciotres;

public enum Segmento {
    ALIMENTACAO ("Alimentação"),
    HIGIENE ("Higiene"),
    LIMPEZA ("Limpeza");

    private String descricao;

    Segmento (String descricao){
        this.descricao=descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}
