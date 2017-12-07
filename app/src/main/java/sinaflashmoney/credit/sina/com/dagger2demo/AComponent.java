package sinaflashmoney.credit.sina.com.dagger2demo;

import dagger.Subcomponent;

/**
 * Created by Administrator on 2017/12/7 0007.
 */
@AScope
@Subcomponent(modules = AModule.class)
public interface AComponent {

    void inject(AActivity activity);
}
