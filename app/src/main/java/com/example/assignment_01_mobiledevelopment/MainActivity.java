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
    }
    public void Calculate(View view) {
        EditText no_of_hours = (EditText) findViewById(R.id.no_of_hours);
        EditText hourly_rate = (EditText) findViewById(R.id.hourly_rate);
        EditText results = (EditText) findViewById(R.id.output);
        EditText tax_results = (EditText) findViewById(R.id.tax_output);


        double hours = Integer.parseInt(no_of_hours.getText().toString());
        double rate = Integer.parseInt(hourly_rate.getText().toString());

        double tax_result;
        double result;

        if (hours < 40) {
            result = hours * rate;
        } else {
            result = (double) ((hours - 40) * rate * 1.5 + 40 * rate);
        }
        tax_result = result * 0.18;

        results.setText("Total Pay : " + result);
        tax_results.setText("Total Tax : " + tax_result);
    }
}