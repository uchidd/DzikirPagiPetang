package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang1);
    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang1Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang2(View view) {

        startActivity(new Intent(Petang1Activity.this, Petang2Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, MainActivity.class));
        finish();

    }

}
