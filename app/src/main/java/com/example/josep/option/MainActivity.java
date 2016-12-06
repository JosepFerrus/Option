package com.example.josep.option;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu option){

    getMenuInflater().inflate(R.menu.option,option);
        return true;
    }
public boolean onOptionsItemSelected(MenuItem item){
    switch (item.getItemId()){
        case R.id.help:
            Toast.makeText(getApplicationContext(),"Ahora te ayudo",Toast.LENGTH_SHORT).show();
            return true;


        case R.id.help2_1:
            Toast.makeText(getApplicationContext(),"Ahora acudira un experto a ayudarte",Toast.LENGTH_SHORT).show();
            return true;
        case R.id.help2_2:
            Toast.makeText(getApplicationContext(),"Esta vez no te reseteo el movil tienes suerte",Toast.LENGTH_SHORT).show();
            return true;

        case R.id.help3:
            Toast.makeText(getApplicationContext(),"Ahora ira alguien en practicas ayudarte",Toast.LENGTH_SHORT).show();
            return true;

        default:
            return false;
    }
}

}
