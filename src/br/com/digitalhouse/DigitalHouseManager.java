package br.com.digitalhouse;

import java.util.List;
import br.com.digitalhouse.Curso;

public class DigitalHouseManager {
    private List<Aluno> alunosList;
    private List<Professor> professoresList;
    private List<Curso> cursosList;
    private List<Matricula> matriculasList;

    public void registrarCurso(String nomeCurso, int codCurso, int qtdMaxAluno){
        List<Curso> curso = (List<Curso>) new Curso();
        curso = (List<Curso>) new Curso();
        cursosList.add((Curso) curso);
    }

    public void excluirCurso(int codCurso) {
        for (int i = 0; i < alunosList.size(); i++) {
            if (alunosList.get(i).getCodAluno() == codCurso) {
                cursosList.remove(i);
            }
        }
    }

    public void registrarProfAdj(String nomeProfAdj, String sobrenomeProfAdj, int codProf, int qtdHoras){
        List<ProfessorAdjunto> professorAdj = (List<ProfessorAdjunto>) new ProfessorAdjunto();
        //professorAdj = (List<ProfessorAdjunto>) new ProfessorAdjunto();
        professoresList.add((Professor) professorAdj);
    }

    public void registrarProfTitular(String nomeProfTitular, String sobrenomeProfTitular, int codProf, String especialidade){
        List<ProfessorTitular> professorTitular = (List<ProfessorTitular>) new ProfessorTitular();
        //professorTitular = (List<ProfessorTitular>) new ProfessorTitular();
        professoresList.add((Professor) professorTitular);
    }

    public void excluirProf(int codProf) {
        for (int i = 0; i < professoresList.size(); i++) {
            if (professoresList.get(i).getCodProfessor() == codProf) {
                professoresList.remove(i);
            }
        }
    }

    public void matricularAluno(String nomeAluno, String sobrenomeAluno, int codAluno){
        List<Aluno> aluno = (List<Aluno>) new Aluno(nomeAluno, sobrenomeAluno, codAluno);
        alunosList.add((Aluno) aluno);
    }

    public void matricularAluno(int codAluno, int codCurso){
        for (int i = 0; i < cursosList.size(); i++) {
            if (cursosList.get(i).getCodCurso() == codCurso) {
                for (int ii = 0; ii < alunosList.size(); ii++) {
                    if (alunosList.get(ii).getCodAluno() == codAluno) {
                        Curso curso = new Curso();
                        Aluno aluno = new Aluno(alunosList.get(ii).getNomeAluno(), alunosList.get(ii).getSobrenomeAluno(), alunosList.get(ii).getCodAluno());
                        curso.adicionarAluno(aluno);
                    }
                }
            }
        }
    }

    public void alocarProf(int codCurso, int codProfTitular, int codProfAdj) {
        for (int i = 0; i < professoresList.size(); i++) {
            if (professoresList.get(i).getCodProfessor() == codProfTitular) {
                for (int ii = 0; ii < professoresList.size(); ii++) {
                    if (professoresList.get(i).getCodProfessor() == codProfAdj) {
                        Curso curso = new Curso();
                        ProfessorTitular profTitular = new ProfessorTitular();
                        curso.setProfTitular(profTitular);
                        ProfessorAdjunto profAdj = new ProfessorAdjunto();
                        curso.setProfAjdunto(profAdj);
                    }
                }
            }
        }
    }
}
