package my.day13_20191450;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DataActivity extends AppCompatActivity {
    DBHelper dbHelper;
    SQLiteDatabase db;
    EditText edit_name, edit_tel;
    TextView edit_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        ////////////////////////////////////////////////////////////////////////
        dbHelper = new DBHelper(this, "test.db",null,1);
        ////////////////////////////////////////////////////////////////////////
        edit_name = (EditText) findViewById(R.id.name);
        edit_tel = (EditText) findViewById(R.id.tel);
        edit_result = (TextView) findViewById(R.id.textView);



    }


    public void insert(View target) {
        db=dbHelper.getWritableDatabase();
        String name = edit_name.getText().toString();
        String tel = edit_tel.getText().toString();
        String sql = "INSERT INTO contact VALUES (null, '"+name+"','"+tel+"')"; // 값은 작은 따옴표, 앞뒤로 문자열 큰 따옴표로 묶어준다.
        db.execSQL(sql);
        Toast.makeText(this,"추가 성공",Toast.LENGTH_LONG).show();

    }

    public void search(View target) {
        db=dbHelper.getReadableDatabase();
        String ser_name = edit_name.getText().toString();
        String sql = "SELECT * FROM contact WHERE name = '"+ser_name+"'";

        Cursor cursor = db.rawQuery(sql,null);

        while(cursor.moveToNext()){
            String tel = cursor.getString(2);
            edit_tel.setText(tel);
        }

    }
    public void select_all(View target) {
        db=dbHelper.getReadableDatabase();
        // 모든 레코드를 조회하기
        String sql = "SELECT *FROM contact";
        Cursor cursor = db.rawQuery(sql, null);
        String s = "ID\t NAME\t TEL \r\n";
        while(cursor.moveToNext()){
            s += cursor.getInt(0)+"\t";
            s += cursor.getString(1)+"\t";
            s += cursor.getString(2)+"\r\n";

        }
        edit_result.setText(s);


    }

}
