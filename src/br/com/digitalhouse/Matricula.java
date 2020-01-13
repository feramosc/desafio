package br.com.digitalhouse;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Matricula {
    private Aluno aluno;
    private Curso curso;
    private Date dtMatricula;

    private String dataFormatada;
    private int auxMatricula = 001;
    private String numMatricula;

    public Matricula(Aluno aluno, Curso curso){
        this.aluno = aluno;
        this.curso = curso;
        dtMatricula = new Date();

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = dateFormat.format(dtMatricula);

        numMatricula = auxMatricula + dataFormatada;
        auxMatricula++;
    }
}
