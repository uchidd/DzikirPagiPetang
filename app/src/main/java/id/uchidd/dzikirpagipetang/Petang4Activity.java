package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang4Activity extends AppCompatActivity {

    private CardView cvHitungPetang4;
    private TextView tvHitungPetang4;
    private int angkaHitungPetang4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang4);


        cvHitungPetang4 = (CardView)findViewById(R.id.cvHitungPetang4);
        tvHitungPetang4 = (TextView)findViewById(R.id.tvHitungPetang4);


        cvHitungPetang4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang4++;
                tvHitungPetang4.setText(angkaHitungPetang4  + "x");
                if (angkaHitungPetang4 == 4){
                    tvHitungPetang4.setText("Selesai");
                    cvHitungPetang4.setVisibility(View.GONE);
                }

            }
        });}


    public void goToPetang3(View view) {

        startActivity(new Intent(Petang4Activity.this, Petang3Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang4Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang5(View view) {

        startActivity(new Intent(Petang4Activity.this, Petang5Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang3Activity.class));
        finish();

    }
}
