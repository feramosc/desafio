package br.com.digitalhouse;

public class Professor {
    private String nomeProfessor;
    private String sobrenomeProfessor;
    private int tempoProfessor = 0;
    private int codProfessor;

    public String getNomeProfessor(){
        return nomeProfessor;
    }

    public String getSobrenomeProfessor(){
        return sobrenomeProfessor;
    }

    public int getTempoProfessor(){
        return tempoProfessor;
    }

    public int getCodProfessor(){
        return codProfessor;
    }

    public void setNomeProfessor(String nomeProfessor){
        this.nomeProfessor = nomeProfessor;
    }

    public void setSobrenomeProfessor(String sobrenomeProfessor){
        this.sobrenomeProfessor = sobrenomeProfessor;
    }

    public void setTempoProfessor(int tempoProfessor){
        this.tempoProfessor = tempoProfessor;
    }

    public void setCodProfessor(int codProfessor){
        this.codProfessor = codProfessor;
    }

    //um prof será igual ao outro se seus cod forem iguais
}


