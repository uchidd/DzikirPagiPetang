package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi14);
    }

    public void goToPagi13(View view) {

        startActivity(new Intent(Pagi14Activity.this, Pagi13Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi14Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi15(View view) {

        startActivity(new Intent(Pagi14Activity.this, Pagi15Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi13Activity.class));
        finish();

    }
}
