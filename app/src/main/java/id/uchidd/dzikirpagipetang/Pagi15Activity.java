package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi15);
    }

    public void goToPagi14(View view) {

        startActivity(new Intent(Pagi15Activity.this, Pagi14Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi15Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi16(View view) {

        startActivity(new Intent(Pagi15Activity.this, Pagi16Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi14Activity.class));
        finish();

    }
}
