package kr.co.company.myuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView4, imageView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()){
            case R.id.checkBox:
                if (checked)imageView4.setImageResource(R.drawable.meat);
                else imageView4.setImageResource(0);
                break;
            case R.id.checkBox2:
                if (checked)imageView5.setImageResource(R.drawable.cheese);
                else imageView5.setImageResource(0);
                break;
        }
    }
}