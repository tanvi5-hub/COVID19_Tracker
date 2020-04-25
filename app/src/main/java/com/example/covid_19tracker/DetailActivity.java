package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountryName, tvCases, tvTodayCases, tvTotalDeaths, tvTodayDeaths, tvRecovered, tvActive, tvCritical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position", 0);

        getSupportActionBar().setTitle("Details of " + AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        tvCountryName = findViewById(R.id.tvCountryName);
        tvCases = findViewById(R.id.tvCases);
        tvTodayCases = findViewById(R.id.tvTodayCases);
        tvTotalDeaths = findViewById(R.id.tvTotalDeaths);
        tvTodayDeaths = findViewById(R.id.tvTodayDeaths);
        tvRecovered = findViewById(R.id.tvRecovered);
        tvActive = findViewById(R.id.tvActive);
        tvCritical = findViewById(R.id.tvCritical);

        tvCountryName.setText(AffectedCountries.countryModelsList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getCases());
        tvTodayCases.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayCases());
        tvTotalDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getDeaths());
        tvTodayDeaths.setText(AffectedCountries.countryModelsList.get(positionCountry).getTodayDeaths());
        tvRecovered.setText(AffectedCountries.countryModelsList.get(positionCountry).getRecovered());
        tvActive.setText(AffectedCountries.countryModelsList.get(positionCountry).getActive());
        tvCritical.setText(AffectedCountries.countryModelsList.get(positionCountry).getCritical());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
