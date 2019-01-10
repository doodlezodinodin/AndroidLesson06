package ua.nure.androidlesson06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText pass;

    private Button btn;
    private Button btn_lesson10;

    private ImageView image;

    private final String e = "s@gmail.com";
    private final String p = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login() {
        email = findViewById(R.id.et_email);
        pass = findViewById(R.id.et_pass);

        btn = findViewById(R.id.btn_enter);
        btn_lesson10 = findViewById(R.id.btn_Lesson10);

        image = findViewById(R.id.iv_res);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (e.equals(String.valueOf(email.getText())) && p.equals(String.valueOf(pass.getText()))) {
                            image.setImageResource(R.drawable.galka);
                        } else {
                            image.setImageResource(R.drawable.krestik);
                        }
                    }
                }
        );

        btn_lesson10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".Lesson10");
                        startActivity(intent);

                    }
                }
        );
    }
}
