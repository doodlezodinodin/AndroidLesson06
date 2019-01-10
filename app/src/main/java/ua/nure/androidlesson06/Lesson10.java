package ua.nure.androidlesson06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.Toast;

public class Lesson10 extends AppCompatActivity {

    private ListView listView;
    private SeekBar seekBar;

    private String[] names = new String[]{"Red", "Grey", "One", "Black", "Street"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson10);
        actionListener();
    }

    public void actionListener() {
        listView = findViewById(R.id.listView);
        seekBar = findViewById(R.id.seekBar);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.names, names);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String val = (String) listView.getItemAtPosition(position);

                        Toast.makeText(
                                Lesson10.this,
                                "Position:" + position + " Value: " + val + "; Bar: " + seekBar.getProgress(),
                                Toast.LENGTH_SHORT
                        ).show();
                    }
                }
        );
    }
}
