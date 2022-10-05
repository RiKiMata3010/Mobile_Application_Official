package com.example.assignment_01_mobiledevelopment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.about:
                openAboutActivity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void openAboutActivity(){
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView out = findViewById(R.id.output);
        out.setText("Convert");
        Button btn = findViewById(R.id.submitButton);
        EditText input = findViewById(R.id.numHours);
        EditText input2 = findViewById(R.id.hourRate);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View view){
                String txt = input.getText().toString();
                String res = txt;
                out.setText(res);
            }
        });
    }
}