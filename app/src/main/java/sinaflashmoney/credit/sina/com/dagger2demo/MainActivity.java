package sinaflashmoney.credit.sina.com.dagger2demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.google.gson.Gson;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Poetry mPoetry;
    private TextView tv;

    @Inject
    Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OtherActivity.class));
            }
        });
        findViewById(R.id.btn_a).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AActivity.class));
            }
        });
        MainComponent.getInstance().inject(this);
        initview();
    }
    private void initview() {
        tv = (TextView) findViewById(R.id.tv_message);
        String message = gson.toJson(mPoetry);
        tv.setText(message+"mPoetry"+mPoetry);

    }
}
