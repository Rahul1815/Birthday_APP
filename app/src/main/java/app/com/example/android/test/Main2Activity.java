package app.com.example.android.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import app.com.example.android.test.R;

public class Main2Activity extends AppCompatActivity {
    private TextView Text;
    private TextView text2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Text= (TextView)findViewById(R.id.Text);
        text2= (TextView)findViewById(R.id.text2);

        Bundle bundle = getIntent().getExtras();
        String data=bundle.getString("message-tag");
        if(data!=null)
            Text.setText(data);
        Bundle bundle2=getIntent().getExtras();
        String data2=bundle2.getString("name-tag");
        if(data2!=null)
            text2.setText(data2);


    }
}