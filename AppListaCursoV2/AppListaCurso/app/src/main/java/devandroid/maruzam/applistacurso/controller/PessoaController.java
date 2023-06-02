package devandroid.maruzam.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.maruzam.applistacurso.model.Pessoa;
import devandroid.maruzam.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;//4
    SharedPreferences.Editor listaVip;//9
    public static final String NOME_PREFERENCES = "pref_listavip";//5

    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);//6,8
        listaVip = preferences.edit();//11


    }//6


    @NonNull
    @Override
    public String toString() {


        Log.d("MVC_Controller", "Controller Iniciada...");

        return super.toString();

    }


    public void salvar(Pessoa outraPessoa) {
        Log.d("MVC_Controller", "Salvo: " + outraPessoa.toString());

        listaVip.putString("primeiroNome", outraPessoa.getPromeiroNome());
        listaVip.putString("sobreNome", outraPessoa.getSobreNome());
        listaVip.putString("nomeCurso", outraPessoa.getCursoDesejado());
        listaVip.putString("telefoneContato", outraPessoa.getTelefoneContato());
        listaVip.apply();//10

    }

    public Pessoa buscar(Pessoa outraPessoa) {

        outraPessoa.setPromeiroNome(preferences.getString("primeiroNome", "NA"));
        outraPessoa.setSobreNome(preferences.getString("sobreNome", "NA"));
        outraPessoa.setCursoDesejado(preferences.getString("nomeCurso", "NA"));
        outraPessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA"));//13
        return outraPessoa;//13

    }  //1

    public void limpar() {

        listaVip.clear();
        listaVip.apply();


    }//2
}