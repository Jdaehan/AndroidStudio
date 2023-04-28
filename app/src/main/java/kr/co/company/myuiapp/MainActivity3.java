package kr.co.company.myuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        // 뷰 바인딩...
        layout = (LinearLayout) findViewById(R.id.layout);
    }
    public void cc(View view){
        boolean checked = ((RadioButton) view). isChecked();

        switch (view.getId()) {
            case R.id.radioButton:
                if (checked)
                    layout.setBackgroundColor(Color.RED);
                break;
            case R.id.radioButton2:
                if (checked)
                    layout.setBackgroundColor(Color.BLUE);
                break;
            case R.id.radioButton3:
                if (checked)
                    layout.setBackgroundColor(Color.GREEN);
                break;

        }
    }
}