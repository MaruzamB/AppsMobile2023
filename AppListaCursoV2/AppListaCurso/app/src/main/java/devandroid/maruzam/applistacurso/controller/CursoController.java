package devandroid.maruzam.applistacurso.controller;

import java.util.ArrayList;
import java.util.List;

import devandroid.maruzam.applistacurso.model.Curso;

public class CursoController {

    private List listCursos;

    public List getListaDeCursos(){

        listCursos = new ArrayList<Curso                                >();

        listCursos.add (new Curso("Java"));
        listCursos.add (new Curso("PHP"));
        listCursos.add (new Curso("Python"));
        listCursos.add (new Curso("JavaScript"));
        listCursos.add (new Curso("HTML"));
        listCursos.add (new Curso("C#"));
        listCursos.add (new Curso("Kotlin"));
        listCursos.add (new Curso("Cobol"));

        return listCursos;

   }

   public ArrayList<String> dadosSpinner(){

       ArrayList<String> dados = new ArrayList<>();

       for (int i = 0; i < getListaDeCursos().size() ; i++) {

           Curso objeto = (Curso) getListaDeCursos().get(i);
           dados.add(objeto.getCursoDesejado());

       }
       return dados;

   }

}
