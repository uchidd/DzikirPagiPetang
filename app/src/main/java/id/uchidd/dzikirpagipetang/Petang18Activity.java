package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Petang18Activity extends AppCompatActivity {

    private CardView cvHitungPetang18;
    private TextView tvHitungPetang18;
    private int angkaHitungPetang18 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petang18);

        cvHitungPetang18 = (CardView)findViewById(R.id.cvHitungPetang18);
        tvHitungPetang18 = (TextView)findViewById(R.id.tvHitungPetang18);


        cvHitungPetang18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPetang18++;
                tvHitungPetang18.setText(angkaHitungPetang18 + "x");
                if (angkaHitungPetang18 == 101){
                    tvHitungPetang18.setText("Selesai");
                    cvHitungPetang18.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPetang17(View view) {

        startActivity(new Intent(Petang18Activity.this, Petang17Activity.class));
        finish();

    }

    public void goToBeranda(View view) {

        startActivity(new Intent(Petang18Activity.this, MainActivity.class));
        finish();

    }

    public void goToPetang19(View view) {

        startActivity(new Intent(Petang18Activity.this, Petang19Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Petang17Activity.class));
        finish();

    }
}
