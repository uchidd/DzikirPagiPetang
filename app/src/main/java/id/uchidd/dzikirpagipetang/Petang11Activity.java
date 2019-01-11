package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang11);
    }

    public void goToPetang10(View view) {

        startActivity(new Intent(Petang11Activity.this, Petang10Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang11Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang12(View view) {

        startActivity(new Intent(Petang11Activity.this, Petang12Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang10Activity.class));
        finish();

    }
}
