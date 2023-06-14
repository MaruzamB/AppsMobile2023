package devandroid.maruzam.applistacurso.view;

import static devandroid.maruzam.applistacurso.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import devandroid.maruzam.applistacurso.R;
import devandroid.maruzam.applistacurso.controller.CursoController;
import devandroid.maruzam.applistacurso.controller.PessoaController;
import devandroid.maruzam.applistacurso.model.Curso;
import devandroid.maruzam.applistacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    PessoaController controller;
    CursoController cursoController;
    Pessoa pessoa;
    Pessoa outraPessoa;
    List<Curso> listaDeCurso;

    EditText editPrimeiroNome;
    EditText editSobreNome;
    EditText editCursoDesejado;
    EditText editTelefoneContato;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

        controller = new PessoaController(MainActivity.this);//7
        controller.toString();

        cursoController = new CursoController();

        listaDeCurso = cursoController.getListaDeCursos();

        outraPessoa = new Pessoa();
        controller.buscar(outraPessoa);

        editPrimeiroNome = findViewById(R.id.editPrimeiroNome);
        editSobreNome = findViewById(R.id.editSobrenome);
        editCursoDesejado = findViewById(R.id.editCursoDesejado);
        editTelefoneContato = findViewById(R.id.editTelefoneContato);

        editPrimeiroNome.setText(outraPessoa.getPromeiroNome());
        editSobreNome.setText(outraPessoa.getSobreNome());
        editCursoDesejado.setText(outraPessoa.getCursoDesejado());
        editTelefoneContato.setText(outraPessoa.getTelefoneContato());

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editPrimeiroNome.setText("");
                editSobreNome.setText("");
                editCursoDesejado.setText("");
                editTelefoneContato.setText("");

                controller.limpar();

            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                outraPessoa.setPromeiroNome(editPrimeiroNome.getText().toString());
                outraPessoa.setSobreNome(editSobreNome.getText().toString());
                outraPessoa.setCursoDesejado(editCursoDesejado.getText().toString());
                outraPessoa.setTelefoneContato(editTelefoneContato.getText().toString());

                Toast.makeText(MainActivity.this, "Dados Salvos: " + outraPessoa.toString(), Toast.LENGTH_LONG).show();

/*

                listaVip.putString("primeiroNome", outraPessoa.getPromeiroNome());
                listaVip.putString("sobreNome", outraPessoa.getSobreNome());
                listaVip.putString("nomeCurso", outraPessoa.getCursoDesejado());
                listaVip.putString("telefoneContato", outraPessoa.getTelefoneContato());
                listaVip.apply();
                RETIRAR
*/

                controller.salvar(outraPessoa);
            }
        });

        Log.i("POOAndroid", outraPessoa.toString());


    }
}