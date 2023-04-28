package kr.co.company.myuiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2, editText3;

    String s1, s2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.edit1); // 첫번째 수 입력 받은 위젯 참조
        editText2 = findViewById(R.id.edit2); // 첫번째 수 입력 받은 위젯 참조
        editText3 = findViewById(R.id.edit3); // 첫번째 수 입력 받은 위젯 참조

    }

    public void cal(View view){
        s1 = editText1.getText().toString(); //10
        s2 = editText2.getText().toString(); //20

        switch(view.getId()){
            case R.id.button1: // +버튼
                int result = Integer.parseInt(s1) + Integer.parseInt(s2);
                editText3.setText(result+""); // 또 다른 방법은 String.valueOf(result)
                break;
            case R.id.button2: // -버튼
                int result2 = Integer.parseInt(s1) - Integer.parseInt(s2);
                editText3.setText(result2+""); // 또 다른 방법은 String.valueOf(result)
                break;
            case R.id.button3: // *버튼
                int result3 = Integer.parseInt(s1) * Integer.parseInt(s2);
                editText3.setText(result3+""); // 또 다른 방법은 String.valueOf(result)
                break;
            case R.id.button4: // /버튼
                int result4 = Integer.parseInt(s1) / Integer.parseInt(s2);
                editText3.setText(result4+""); // 또 다른 방법은 String.valueOf(result)
                break;
        }
    }
}