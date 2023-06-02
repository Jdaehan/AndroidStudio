package my.day13_20191450;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    DBHelper2 helper;
    SQLiteDatabase db;
    EditText edit_id, edit_pass;
    TextView edit_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        helper = new DBHelper2(this,"test2.db",null,1);
        try {
            db = helper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = helper.getReadableDatabase();
        }
        edit_id = (EditText) findViewById(R.id.id);
        edit_pass = (EditText) findViewById(R.id.pass);
        edit_result = (TextView) findViewById(R.id.textView);
    }

    public void enroll(View target) { //회원 등록
            String id = edit_id.getText().toString();
            String pass = edit_pass.getText().toString();

            db.execSQL("INSERT INTO member VALUES (null, '" + id + "','" + pass + "');");
            Toast.makeText(getApplicationContext(), "성공적으로 추가되었음",
                    Toast.LENGTH_SHORT).show();
            edit_id.setText("");
            edit_pass.setText("");
        }


    public void login(View target) { //로그인 시 호출
        String id = edit_id.getText().toString();
        String pass = edit_pass.getText().toString();
        Cursor cursor;
    cursor = db.rawQuery("SELECT email, passwd FROM member WHERE email='"
            + id + "';",null);
    while (cursor.moveToNext()){
        String pass2 = cursor.getString(1);
        if(pass.equals(pass2))
            Toast.makeText(getApplicationContext(),"로그인 성공입니다.",
                    Toast.LENGTH_SHORT).show();
    }


    }
}
