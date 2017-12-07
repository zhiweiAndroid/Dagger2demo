package sinaflashmoney.credit.sina.com.dagger2demo;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/12/7 0007.
 */
@Module
public class AModule {

    @PoetryQualifier("A")
    @AScope
    @Provides
    public Poetry getPoetry(){
        return new Poetry("万物生长");
    }

    @PoetryQualifier("B")
    @AScope
    @Provides
    public Poetry getOtherPoetry(){
        return new Poetry("我在你心中");
    }




}
