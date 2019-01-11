package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi9Activity extends AppCompatActivity {

    private CardView cvHitungPagi9;
    private TextView tvHitungPagi9;
    private int angkaHitungPagi9 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi9);

        cvHitungPagi9 = (CardView)findViewById(R.id.cvHitungPagi9);
        tvHitungPagi9 = (TextView)findViewById(R.id.tvHitungPagi9);


        cvHitungPagi9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi9++;
                tvHitungPagi9.setText(angkaHitungPagi9 + "x");
                if (angkaHitungPagi9 == 4){
                    tvHitungPagi9.setText("Selesai");
                    cvHitungPagi9.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi8(View view) {

        startActivity(new Intent(Pagi9Activity.this, Pagi8Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi9Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi10(View view) {

        startActivity(new Intent(Pagi9Activity.this, Pagi10Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi8Activity.class));
        finish();

    }
}
