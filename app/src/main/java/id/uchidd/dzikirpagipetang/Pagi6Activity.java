package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi6);
    }

    public void goToPagi5(View view) {

        startActivity(new Intent(Pagi6Activity.this, Pagi5Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi6Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi7(View view) {

        startActivity(new Intent(Pagi6Activity.this, Pagi7Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi5Activity.class));
        finish();

    }
}
