package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi8);
    }

    public void goToPagi7(View view) {

        startActivity(new Intent(Pagi8Activity.this, Pagi7Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi8Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi9(View view) {

        startActivity(new Intent(Pagi8Activity.this, Pagi9Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi7Activity.class));
        finish();

    }
}
