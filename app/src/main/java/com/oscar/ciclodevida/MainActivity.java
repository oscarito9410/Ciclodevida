package com.oscar.ciclodevida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarMensaje("onCreate");
    }

    private void mostrarMensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mostrarMensaje("OnStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mostrarMensaje("OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mostrarMensaje("OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mostrarMensaje("onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mostrarMensaje("onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mostrarMensaje("onDestroy");
    }
}
