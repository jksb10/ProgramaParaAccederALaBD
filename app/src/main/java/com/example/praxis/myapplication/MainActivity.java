package com.example.praxis.myapplication;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String AUTHORITY = "com.example.praxis.pruebasqlite/tabla1";//specific for our our app, will be specified in maninfed
    public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Uri clientesUri =  CONTENT_URI;

        ContentResolver cr = getContentResolver();


/*
        Cursor c = getContentResolver().query( Uri.parse("content://" + AUTHORITY + "/" + Tablas.USUARIO.TABLE), null,
                Tablas.USUARIO.NOMBRE + "= ?", new String[]{
                        ((EditText)findViewById(R.id.nombre)).getText().toString()
                }, null);
        Usuario usuario = new Usuario();
        if (c.moveToFirst()) {
            do {
                usuario.setId(c.getInt(c.getColumnIndexOrThrow(Tablas.USUARIO.ID)));
                usuario.setNombre(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.NOMBRE)));
                usuario.setApellidoPaterno(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.APELLIDO_PATERNO)));
                usuario.setApellidoMaterno(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.APELLIDO_MATERNO)));
            } while (c.moveToNext());
        }

        Log.e("TAG: ", usuario.getNombre());
        Log.e("TAG: ", usuario.getApellidoPaterno());
        Log.e("TAG: ", usuario.getApellidoMaterno());
*/
    }


    public void onConsultar(View view){
        Uri clientesUri =  CONTENT_URI;

        ContentResolver cr = getContentResolver();



        Cursor c = getContentResolver().query( Uri.parse("content://" + AUTHORITY + "/" + Tablas.USUARIO.TABLE), null,
                Tablas.USUARIO.NOMBRE + "= ?", new String[]{
                        ((EditText)findViewById(R.id.nombre)).getText().toString()
                }, null);



        Usuario usuario = new Usuario();
        if (c.moveToFirst()) {
            do {
                usuario.setId(c.getInt(c.getColumnIndexOrThrow(Tablas.USUARIO.ID)));
                usuario.setNombre(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.NOMBRE)));
                usuario.setApellidoPaterno(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.APELLIDO_PATERNO)));
                usuario.setApellidoMaterno(c.getString(c.getColumnIndexOrThrow(Tablas.USUARIO.APELLIDO_MATERNO)));
                Toast.makeText(this,"Nombre: " + usuario.getNombre() + " " + usuario.getApellidoPaterno()
                + " " + usuario.getApellidoMaterno(),Toast.LENGTH_LONG).show();
            } while (c.moveToNext());
        }

    }
}
