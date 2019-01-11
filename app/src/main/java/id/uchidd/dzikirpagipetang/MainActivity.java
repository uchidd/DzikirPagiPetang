package id.uchidd.dzikirpagipetang;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToPagi(View view) {

        startActivity(new Intent(MainActivity.this, Pagi1Activity.class));
        finish();

    }

    public void goToPetang(View view) {

        startActivity(new Intent(MainActivity.this, Petang1Activity.class));
        finish();

    }

    public void goToAboutDeveloper(View view) {

        startActivity(new Intent(MainActivity.this, AboutDeveloperActivity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }


}
