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

public class AActivity extends AppCompatActivity{

    @Inject
    Gson mGson;

    @PoetryQualifier("A")
    @Inject
    Poetry mPoetryA;

    @PoetryQualifier("B")
    @Inject
    Poetry mPoetryB;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aactivity_activity);
        TextView tv = (TextView) findViewById(R.id.tv);

        MainApplication.getInstance().getaComponent().inject(this);
        String text = mPoetryA.getMessage()+",mPoetryA:>>>>>>>"+mPoetryA+(mGson == null ? "Gson没被注入" : "Gson已经被注入")+mPoetryB.getMessage()+",mPoetryB:>>>>>>>"+mPoetryB;
        tv.setText(text);

    }
}
