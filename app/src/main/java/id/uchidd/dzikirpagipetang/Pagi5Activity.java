package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi5Activity extends AppCompatActivity {

    private CardView cvHitungPagi5;
    private TextView tvHitungPagi5;
    private int angkaHitungPagi5 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi5);

        cvHitungPagi5 = (CardView)findViewById(R.id.cvHitungPagi5);
        tvHitungPagi5 = (TextView)findViewById(R.id.tvHitungPagi5);


        cvHitungPagi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi5++;
                tvHitungPagi5.setText(angkaHitungPagi5 + "x");
                if (angkaHitungPagi5 == 4){
                    tvHitungPagi5.setText("Selesai");
                    cvHitungPagi5.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi4(View view) {

        startActivity(new Intent(Pagi5Activity.this, Pagi4Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi5Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi6(View view) {

        startActivity(new Intent(Pagi5Activity.this, Pagi6Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi4Activity.class));
        finish();

    }
}
