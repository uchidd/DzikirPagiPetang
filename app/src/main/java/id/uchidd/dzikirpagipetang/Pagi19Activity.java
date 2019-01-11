package id.uchidd.dzikirpagipetang;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Pagi19Activity extends AppCompatActivity {

    private CardView cvHitungPagi19;
    private TextView tvHitungPagi19;
    private int angkaHitungPagi19 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagi19);

        cvHitungPagi19 = (CardView)findViewById(R.id.cvHitungPagi19);
        tvHitungPagi19 = (TextView)findViewById(R.id.tvHitungPagi19);


        cvHitungPagi19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                angkaHitungPagi19++;
                tvHitungPagi19.setText(angkaHitungPagi19 + "x");
                if (angkaHitungPagi19 == 101){
                    tvHitungPagi19.setText("Selesai");
                    cvHitungPagi19.setVisibility(View.GONE);
                }

            }
        });

    }
    public void goToPagi18(View view) {

        startActivity(new Intent(Pagi19Activity.this, Pagi18Activity.class));
        finish();

    }
    public void goToBeranda(View view) {

        startActivity(new Intent(Pagi19Activity.this, MainActivity.class));
        finish();

    }
    public void goToPagi20(View view) {

        startActivity(new Intent(Pagi19Activity.this, Pagi20Activity.class));
        finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        startActivity(new Intent(this, Pagi18Activity.class));
        finish();

    }
}
