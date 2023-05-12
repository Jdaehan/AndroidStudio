package kr.co.company.hello;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2, textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_test3);

        //Button button = findViewById(R. id. button6);
        //Button.setOnclickListener(new MyListener();
        textView1 = findViewById(R.id.textView5);
        textView2 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.textView7);

    }

    //클릭 이벤트 처리 메소드
    // 1. public 2. void 반환 3. View를 메소드 인수로 가진다.

    public void plus(View view){
        Toast.makeText(getApplicationContext(), "첫번째 버튼이 클릭되었습니다.",Toast.LENGTH_LONG).show();
    }
    public void onClick(View view){
        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);

        switch (view.getId()){
            case R.id.button7:
                textView1.setVisibility(View.VISIBLE);
                break;
            case R.id.button8:
                textView2.setVisibility(View.VISIBLE);
                break;
            case R.id.button9:
                textView3.setVisibility(View.VISIBLE);
                break;
        }
    }
}

//2. 리스너 객체 이용
class MyListener implements View.OnClickListener{
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "두번째 버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
    }
}
