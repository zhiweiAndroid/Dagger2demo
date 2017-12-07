package sinaflashmoney.credit.sina.com.dagger2demo;

import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2017/12/7 0007.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Gson getGson();

    AComponent plus(AModule module);

}
