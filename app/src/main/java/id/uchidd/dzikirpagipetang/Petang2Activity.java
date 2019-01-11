package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang2);
    }

    public void goToPetang1(View view) {

        startActivity(new Intent(Petang2Activity.this, Petang1Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang2Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang3(View view) {

        startActivity(new Intent(Petang2Activity.this, Petang3Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang1Activity.class));
        finish();

    }


}
