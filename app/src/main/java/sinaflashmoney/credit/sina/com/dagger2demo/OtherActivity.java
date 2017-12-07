package sinaflashmoney.credit.sina.com.dagger2demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/12/7 0007.
 */

public class OtherActivity extends AppCompatActivity{
    @Inject
    Poetry mPoetry;
    private TextView tv;

    @Inject
    Gson gson;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        MainComponent.getInstance().inject(this);
       initview();
    }

    private void initview() {
        tv = (TextView) findViewById(R.id.tv_message);
        String message = gson.toJson(mPoetry);
        tv.setText(message+"mPoetry"+mPoetry);

    }
}
