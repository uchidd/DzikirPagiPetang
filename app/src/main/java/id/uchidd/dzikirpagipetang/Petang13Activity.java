package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang13Activity extends AppCompatActivity {

    private CardView cvHitungPetang13;
    private TextView tvHitungPetang13;
    private int angkaHitungPetang13 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang13);

        cvHitungPetang13 = (CardView)findViewById(R.id.cvHitungPetang13);
        tvHitungPetang13 = (TextView)findViewById(R.id.tvHitungPetang13);


        cvHitungPetang13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang13++;
                tvHitungPetang13.setText(angkaHitungPetang13 + "x");
                if (angkaHitungPetang13 == 4){
                    tvHitungPetang13.setText("Selesai");
                    cvHitungPetang13.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang12(View view) {

        startActivity(new Intent(Petang13Activity.this, Petang12Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang13Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang14(View view) {

        startActivity(new Intent(Petang13Activity.this, Petang14Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang12Activity.class));
        finish();

    }
}
