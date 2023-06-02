package my.day13_20191450;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import kotlin.Suppress;

public class MainActivity3 extends AppCompatActivity {
        DBHelper helper;
        SQLiteDatabase db;
        EditText edit_name, edit_tel;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        helper = new DBHelper(getApplicationContext(), null, null , 1);
            db = helper.getWritableDatabase();
            Cursor cursor = db.rawQuery("SELECT * FROM contact", null);
            startManagingCursor(cursor);
            String[] from = { "name", "tel" };
            int[] to = { android.R.id.text1, android.R.id.text2 };
            SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, android.R.layout.simple_list_item_2,
                    cursor, from, to);
            @SuppressLint({"MissingInflatedId","LocalSuppress"})
            ListView list = (ListView) findViewById(R.id.list);
            list.setAdapter(adapter);

        }
}