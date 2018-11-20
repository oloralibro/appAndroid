package com.paugonzalezmarti.www.simpleoloralibro;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        //Instanciem els elements
        EditText user = findViewById(R.id.etCorreo);
        EditText passwd = findViewById(R.id.etPassword);
        Button log = findViewById(R.id.btnLoguear);

        //Instanciem i carreguem les dades del JSON
        String json = "users.json";
        JSONObject jObject = null; //Obtenemos el JSON global
        try {
            jObject = new JSONObject(json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONArray jArrayUsers = jObject.getJSONArray("usuaris"); //Obtenim el array de usuarios
        } catch (JSONException e) {
            e.printStackTrace();
        }
        try {
            JSONArray jArrayPaswd = jObject.getJSONArray("contrasenyes"); //Obtenim el array de contraseñas
        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}
