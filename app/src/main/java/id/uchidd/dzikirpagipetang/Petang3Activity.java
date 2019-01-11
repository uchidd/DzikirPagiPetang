package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang3Activity extends AppCompatActivity {

    private CardView cvHitungPetang3;
    private TextView tvHitungPetang3;
    private int angkaHitungPetang3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang3);

        cvHitungPetang3 = (CardView)findViewById(R.id.cvHitungPetang3);
        tvHitungPetang3 = (TextView)findViewById(R.id.tvHitungPetang3);


        cvHitungPetang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang3++;
                tvHitungPetang3.setText(angkaHitungPetang3 + "x");
                if (angkaHitungPetang3 == 4){
                    tvHitungPetang3.setText("Selesai");
                    cvHitungPetang3.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang2(View view) {

        startActivity(new Intent(Petang3Activity.this, Petang2Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang3Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang4(View view) {

        startActivity(new Intent(Petang3Activity.this, Petang4Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang2Activity.class));
        finish();

    }

}
