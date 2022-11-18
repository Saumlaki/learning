package ru.saumlaki.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findBeer(View view) {
        TextView brands = (TextView) findViewById(R.id.brands);

        Spinner beerColor = (Spinner) findViewById(R.id.color);
        String color = String.valueOf(beerColor.getSelectedItem());
        StringBuilder sb = new StringBuilder();
        for (String brand : beerExpert.getBrands(color)) {

            sb.append(brand).append('\n');
        }

        brands.setText(sb);
    }
}