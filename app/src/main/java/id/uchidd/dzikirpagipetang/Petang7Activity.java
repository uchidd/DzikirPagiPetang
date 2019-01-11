package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang7);
    }

    public void goToPetang6(View view) {

        startActivity(new Intent(Petang7Activity.this, Petang6Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang7Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang8(View view) {

        startActivity(new Intent(Petang7Activity.this, Petang8Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang6Activity.class));
        finish();

    }
}
