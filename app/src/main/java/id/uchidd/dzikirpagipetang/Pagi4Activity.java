package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi4Activity extends AppCompatActivity {

    private CardView cvHitungPagi4;
    private TextView tvHitungPagi4;
    private int angkaHitungPagi4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi4);

        cvHitungPagi4 = (CardView)findViewById(R.id.cvHitungPagi4);
        tvHitungPagi4 = (TextView)findViewById(R.id.tvHitungPagi4);

        cvHitungPagi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi4++;
                tvHitungPagi4.setText(angkaHitungPagi4 + "x");
                if (angkaHitungPagi4 == 4){
                    tvHitungPagi4.setText("Selesai");
                    cvHitungPagi4.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToPagi3(View view) {

        startActivity(new Intent(Pagi4Activity.this, Pagi3Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi4Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi5(View view) {

        startActivity(new Intent(Pagi4Activity.this, Pagi5Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi3Activity.class));
        finish();

    }
}
