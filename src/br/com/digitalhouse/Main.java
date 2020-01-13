package br.com.digitalhouse;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProfessorTitular profTitular1 = new ProfessorTitular();
        ProfessorTitular profTitular2 = new ProfessorTitular();
        ProfessorAdjunto profAdj1 = new ProfessorAdjunto();
        ProfessorAdjunto profAdj2 = new ProfessorAdjunto();
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Aluno aluno1 = new Aluno("Fernanda", "Costa", 00113012020);
        Aluno aluno2 = new Aluno("Amanda", "Ramos", 00213012020);
        Aluno aluno3 = new Aluno("Priscila", "Liberato", 00313012020);
        Aluno aluno4 = new Aluno("Marcia", "Silva", 00413012020);
        Aluno aluno5 = new Aluno("Lais", "Mascarenhas", 00513012020);

        profTitular1.setNomeProfessor("Jessica");
        profTitular1.setSobrenomeProfessor("Corrêa");
        profTitular1.setTempoProfessor(5);
        profTitular1.setCodProfessor(001);
        profTitular1.setEspecialidade("Java");

        profTitular2.setNomeProfessor("Carla");
        profTitular2.setSobrenomeProfessor("Corrêa");
        profTitular2.setTempoProfessor(1);
        profTitular2.setCodProfessor(002);
        profTitular2.setEspecialidade("Java");

        profAdj1.setNomeProfessor("João");
        profAdj1.setSobrenomeProfessor("Silva");
        profAdj1.setTempoProfessor(3);
        profAdj1.setCodProfessor(003);
        profAdj1.setTempoProfessor(3);

        profAdj2.setNomeProfessor("Joaquim");
        profAdj2.setSobrenomeProfessor("Santos");
        profAdj2.setTempoProfessor(4);
        profAdj2.setCodProfessor(004);
        profAdj2.setTempoProfessor(4);

        curso1.setNomeCurso("Full Stack");
        curso1.setCodCurso(20001);
        curso1.setQtdMaxAlunos(3);
        curso1.setProfTitular(profTitular1);
        curso1.setProfAjdunto(profAdj1);
        curso1.setAlunos((List<Aluno>) aluno1);
        curso1.setAlunos((List<Aluno>) aluno2);

        curso2.setNomeCurso("Android");
        curso2.setCodCurso(20002);
        curso2.setQtdMaxAlunos(2);
        curso2.setProfTitular(profTitular2);
        curso2.setProfAjdunto(profAdj2);
        curso2.setAlunos((List<Aluno>) aluno3);
        curso2.setAlunos((List<Aluno>) aluno4);
        curso2.setAlunos((List<Aluno>) aluno5);

    }
}
