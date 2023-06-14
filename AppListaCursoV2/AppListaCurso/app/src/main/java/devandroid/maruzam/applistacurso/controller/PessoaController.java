package devandroid.maruzam.applistacurso.controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.maruzam.applistacurso.model.Pessoa;
import devandroid.maruzam.applistacurso.view.MainActivity;

public class PessoaController {

    SharedPreferences preferences;
    SharedPreferences.Editor listaVip;
    public static final String NOME_PREFERENCES = "pref_listavip";

    public PessoaController(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaVip = preferences.edit();

    }
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
        outraPessoa.setTelefoneContato(preferences.getString("telefoneContato", "NA"));
        return outraPessoa;//13

    }

    public void limpar() {

        listaVip.clear();
        listaVip.apply();

    }
}