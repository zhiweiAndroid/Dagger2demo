package sinaflashmoney.credit.sina.com.dagger2demo;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/12/6 0006.
 */

public class Poetry {
    private String message;

    public Poetry(String message) {
        this.message = message;
    }

    @Inject
    public Poetry() {
        message = "今天天气不错";
    }

    public String getMessage(){
        return message;
    }

}
