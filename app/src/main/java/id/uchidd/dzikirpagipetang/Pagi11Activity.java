package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi11Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi11);
    }

    public void goToPagi10(View view) {

        startActivity(new Intent(Pagi11Activity.this, Pagi10Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi11Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi12(View view) {

        startActivity(new Intent(Pagi11Activity.this, Pagi12Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi10Activity.class));
        finish();

    }
}
