package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang8);
    }

    public void goToPetang7(View view) {

        startActivity(new Intent(Petang8Activity.this, Petang7Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang8Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang9(View view) {

        startActivity(new Intent(Petang8Activity.this, Petang9Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang7Activity.class));
        finish();

    }
}
