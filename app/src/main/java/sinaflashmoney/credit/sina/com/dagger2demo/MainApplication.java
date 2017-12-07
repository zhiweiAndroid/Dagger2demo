package sinaflashmoney.credit.sina.com.dagger2demo;

import android.app.Application;

/**
 * Created by Administrator on 2017/12/7 0007.
 */

public class MainApplication extends Application {
    private ApplicationComponent mApplicationComponent;
    private static MainApplication sApplication;
    private AComponent aComponent;

    public static MainApplication getInstance() {
        return sApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;

        mApplicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

    public AComponent getaComponent(){
        if (aComponent==null){
            aComponent=mApplicationComponent.plus(new AModule());
        }
        return aComponent;
    }
}
