package com.example.praxis.myapplication;

/**
 * Created by Praxis on 10/02/2016.
 */

public abstract class Tablas {

    private static final String LLAVE_PRIMARIA = "INTEGER PRIMARY KEY AUTOINCREMENT";
    private static final String TEXTO = "TEXT";

    public abstract class TABLA1{
        public static final String TABLE ="tabla1";
        public static final String ID = "_id";
        public static final String ATRIBUTO1= "atributo1";
        public static final String ATRIBUTO2= "atributo2";
        public static final String ATRIBUTO3= "atributo3";
        public static final String ATRIBUTO4= "atributo4";
        public static final String ATRIBUTO5= "atributo5";
        public static final String ATRIBUTO6= "atribut6";
        public static final String ATRIBUTO7= "atributo7";
        public static final String ATRIBUTO8= "atributo8";
        public static final String ATRIBUTO9 ="atributo9";
        public static final String ATRIBUTO10= "atributo10";
        public static final String ATRIBUTO11= "atributo11";
        public static final String ATRIBUTO12= "atributo12";
    }

    public abstract class USUARIO{
        public static final String TABLE ="usuario";
        public static final String ID = "_id";
        public static final String NOMBRE= "atributo1";
        public static final String APELLIDO_PATERNO= "atributo2";
        public static final String APELLIDO_MATERNO= "atributo3";
    }


}
