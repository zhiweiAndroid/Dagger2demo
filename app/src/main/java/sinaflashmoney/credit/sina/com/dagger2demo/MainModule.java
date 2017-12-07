package sinaflashmoney.credit.sina.com.dagger2demo;

import dagger.Module;

/**
 * Created by Administrator on 2017/12/6 0006.
 */
@Module
public class MainModule {

    /**
     * @Provides 注解表示这个方法是用来创建某个实例对象的，这里我们创建返回Gson对象
     * 方法名随便，一般用provideXXX结构
     * @return 返回注入对象
     */
//    @Provides
//    public Gson provideGson(){
//        return new Gson();
//    }

}
