package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang15Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang15);
    }

    public void goToPetang14(View view) {

        startActivity(new Intent(Petang15Activity.this, Petang14Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang15Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang16(View view) {

        startActivity(new Intent(Petang15Activity.this, Petang16Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang14Activity.class));
        finish();

    }
}
