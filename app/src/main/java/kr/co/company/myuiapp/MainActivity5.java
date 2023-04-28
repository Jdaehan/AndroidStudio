package kr.co.company.myuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {
    private RatingBar ratingBar;
    private TextView TextView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ratingBar = findViewById(R.id.ratingBar);
        button = findViewById(R.id.button);
        TextView = findViewById(R.id.textView5);
        // 이벤트 처리
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                float rating = ratingBar.getRating();
                TextView.setText("SCORE: "+String.valueOf(rating));
            }
        });
    }
}