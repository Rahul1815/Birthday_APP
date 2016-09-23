package app.com.example.android.test;

        import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button wish;
    private EditText message;
    private EditText name;
    String text,text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wish=(Button) findViewById(R.id.wish);
        message=(EditText) findViewById(R.id.message);
        name=(EditText) findViewById(R.id.name);

        wish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text = message.getText().toString();
                text2=name.getText().toString();
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent = intent.putExtra("message-tag",text);
                intent = intent.putExtra("name-tag",text2);
                startActivity(intent);



            }
        });
    }
}
