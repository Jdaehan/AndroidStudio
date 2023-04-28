package kr.co.company.myuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity4 extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        imageView = (ImageView) findViewById(R.id.imageView);

    }
    public void tc(View view){
        boolean on = ((ToggleButton)view).isChecked();
        if (on) {
            imageView.setImageResource(R.drawable.pic3);
        }
        else{
            imageView.setImageResource(0);
        }
    }

}