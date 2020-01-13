package br.com.digitalhouse;

import java.util.List;

public class Curso {
    private String nomeCurso;
    private int codCurso;
    private int qtdMaxAlunos;
    private List<Aluno> alunosList;
    private ProfessorTitular profTitular;
    private ProfessorAdjunto profAjdunto;
    private int qtdAlunos = 0;

    public String getNomeCurso(){
        return nomeCurso;
    }
    public int getCodCurso(){
        return codCurso;
    }
    public int getQtdMaxAlunos(){
        return qtdMaxAlunos;
    }
    public List<Aluno> getAlunosList() {
        return alunosList;
    }
    public ProfessorTitular getProfTitular() {
        return profTitular;
    }
    public ProfessorAdjunto getProfAjdunto() {
        return profAjdunto;
    }

    public void setNomeCurso(String nomeCurso){
        this.nomeCurso = nomeCurso;
    }
    public void setCodCurso(int codCurso){
        this.codCurso = codCurso;
    }
    public void setQtdMaxAlunos(int qtdMaxAlunos) {
        this.qtdMaxAlunos = qtdMaxAlunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunosList = alunos;
    }
    public void setProfTitular(ProfessorTitular profTitular) {
        this.profTitular = profTitular;
    }
    public void setProfAjdunto(ProfessorAdjunto profAjdunto) {
        this.profAjdunto = profAjdunto;
    }

    //um curso será igual a outro se seus códigos de curso forem iguais

    public boolean adicionarAluno(Aluno aluno){
        if (qtdMaxAlunos <= qtdAlunos) {
            aluno = new Aluno(aluno.getNomeAluno(), aluno.getSobrenomeAluno(), aluno.getCodAluno());
            alunosList.add(aluno);
            qtdAlunos++;
            System.out.println("Matricula realizada com sucesso!");
            return true;

        } else {
            System.out.print("Matricula não realizada, não há vagas!");
            return false;
        }
    }

    public void excluirAluno(Aluno aluno){
        alunosList.remove(aluno);
        qtdAlunos--;
    }
}
