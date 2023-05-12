package my.pg20230513;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }
    //시작 버튼 클릭 이벤트 처리
    public void start(View view){
        Intent intent = new Intent(QuizActivity.this,QuizStratActivity.class);
        startActivity(intent);
    }
}