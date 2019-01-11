package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi7);
    }

    public void goToPagi6(View view) {

        startActivity(new Intent(Pagi7Activity.this, Pagi6Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi7Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi8(View view) {

        startActivity(new Intent(Pagi7Activity.this, Pagi8Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi6Activity.class));
        finish();

    }
}
