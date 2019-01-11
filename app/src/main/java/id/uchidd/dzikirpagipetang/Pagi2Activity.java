package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pagi2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi2);
    }

    public void goToPagi1(View view) {

        startActivity(new Intent(Pagi2Activity.this, Pagi1Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi2Activity.this, MainActivity.class));
        finish();

    }

    public void goToPagi3(View view) {

        startActivity(new Intent(Pagi2Activity.this, Pagi3Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi1Activity.class));
        finish();

    }
}
