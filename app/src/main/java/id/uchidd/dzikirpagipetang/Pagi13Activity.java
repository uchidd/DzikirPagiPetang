package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi13Activity extends AppCompatActivity {

    private CardView cvHitungPagi13;
    private TextView tvHitungPagi13;
    private int angkaHitungPagi13 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi13);

        cvHitungPagi13 = (CardView)findViewById(R.id.cvHitungPagi13);
        tvHitungPagi13 = (TextView)findViewById(R.id.tvHitungPagi13);


        cvHitungPagi13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi13++;
                tvHitungPagi13.setText(angkaHitungPagi13 + "x");
                if (angkaHitungPagi13 == 4){
                    tvHitungPagi13.setText("Selesai");
                    cvHitungPagi13.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi12(View view) {

        startActivity(new Intent(Pagi13Activity.this, Pagi12Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi13Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi14(View view) {

        startActivity(new Intent(Pagi13Activity.this, Pagi14Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi12Activity.class));
        finish();

    }
}
