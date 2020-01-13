package br.com.digitalhouse;

public class Aluno {
    private String nomeAluno;
    private String sobrenomeAluno;
    private int codAluno;

    public Aluno (String nomeAluno, String sobrenomeAluno, int codAluno) {
        this.nomeAluno = nomeAluno;
        this.sobrenomeAluno = sobrenomeAluno;
        this.codAluno = codAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }
    public String getSobrenomeAluno() {
        return sobrenomeAluno;
    }
    public int getCodAluno() {
        return codAluno;
    }

    public void setNomeAluno(String nomeAluno){
        this.nomeAluno = nomeAluno;
    }

    public void setSobrenomeAluno(String sobrenomeAluno){
        this.sobrenomeAluno = sobrenomeAluno;
    }

    public void setCodAluno(int codAluno){
        this.codAluno = codAluno;
    }
    //um aluno será igual ao outro se seus códigos de aluno forem iguais
}

