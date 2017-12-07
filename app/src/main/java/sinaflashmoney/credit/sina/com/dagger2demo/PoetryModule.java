package sinaflashmoney.credit.sina.com.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/12/6 0006.
 */

@Module
public class PoetryModule {

    @PoetryScope
    @Provides
    public Poetry providePoetry(String message){
        return new Poetry(message);
    }
    @Provides
    public String provideMessage(){
        return "蓝蓝的天空白云朵朵";
    }







}
