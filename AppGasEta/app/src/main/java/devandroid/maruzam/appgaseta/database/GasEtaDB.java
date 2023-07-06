package devandroid.maruzam.appgaseta.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION =1;

    Cursor cursor;

    SQLiteDatabase db;

    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sqlTabelaCombustivel
                = "CREATE TABLE Combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "nomeCombustivel TEXT, " +
                "precoCombustivel REAL, " +
                "resultado TEXT)";

        db.execSQL(sqlTabelaCombustivel);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //TODO: criar métodos para implementar um CRUD
    //c = Create criar o banco de dados e as tabelas
    //create database nome_banco_de_dadod.db ()SQL
    //create table(SQL)

    // R Retrieve recuperrar os dados salvos das tabelas
    // Select * from table (SQl)

    // Update = alterar os dados que ja existem em uma  tabela
    // Update from table (SQL)

    // D = Deletar so dados/registros de uma table
    //Delete from(SQL)

}
