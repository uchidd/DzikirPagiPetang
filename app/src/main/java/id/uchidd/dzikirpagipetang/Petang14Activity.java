package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Petang14Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang14);
    }

    public void goToPetang13(View view) {

        startActivity(new Intent(Petang14Activity.this, Petang13Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang14Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang15(View view) {

        startActivity(new Intent(Petang14Activity.this, Petang15Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang13Activity.class));
        finish();

    }
}
