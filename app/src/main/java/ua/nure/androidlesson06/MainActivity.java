package ua.nure.androidlesson06;

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
        image = findViewById(R.id.iv_res);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        if (e.equals(String.valueOf(email.getText())) && p.equals(String.valueOf(pass.getText()))) {
                            image.setImageResource(R.drawable.galka);
                        } else {
                            image.setImageResource(R.drawable.krestik);
                        }
                    }
                }
        );
    }
}
