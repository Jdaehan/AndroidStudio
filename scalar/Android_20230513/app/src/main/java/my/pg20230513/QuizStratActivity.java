package my.pg20230513;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.Toast;

public class QuizStratActivity extends AppCompatActivity {
    Fragment fragment;

    Button next;

    int prob_count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_start);
        next = findViewById(R.id.next);

        fragment = new Fragment01();

        transaction(fragment);

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                prob_count++;
                if( prob_count == 2) {
                    fragment = new Fragment02();
                    transaction(fragment);
                    Toast.makeText(getApplicationContext(), "정답은 ④ 자바 언어", Toast.LENGTH_SHORT).show();
                }else if( prob_count == 3) {
                    fragment = new Fragment03();
                    Toast.makeText(getApplicationContext(), "정답은 ① LinearLayout", Toast.LENGTH_SHORT).show();
                    transaction(fragment);
                }else if( prob_count == 4) {
                    fragment = new Fragment04();
                    Toast.makeText(getApplicationContext(), "정답은 ④ Android, Inc", Toast.LENGTH_SHORT).show();
                    transaction(fragment);
                }else if( prob_count == 5) {
                    fragment = new Fragment05();
                    Toast.makeText(getApplicationContext(), "정답은 ② layout", Toast.LENGTH_SHORT).show();
                    transaction(fragment);
                    next.setText("문제완료");
                }else if( prob_count == 6) {
                    fragment = new Fragment06();
                    Toast.makeText(getApplicationContext(), "정답은 ⑨ 프래그먼트. 초기화면으로 되돌아갑니다", Toast.LENGTH_SHORT).show();
                    transaction(fragment);
                        Intent intent = new Intent(QuizStratActivity.this,QuizActivity.class);
                        startActivity(intent);

                }


                }


        });

    }

    public void transaction(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.replace(R.id.framelayoutid, fragment, "Quiz");
        ft.commit();
    }
}