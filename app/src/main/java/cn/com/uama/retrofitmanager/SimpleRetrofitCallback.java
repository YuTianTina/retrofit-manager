package cn.com.uama.retrofitmanager;

import retrofit2.Call;

/**
 * Created by liwei on 2017/4/18 10:51
 * Email: liwei@uama.com.cn
 * Description: AdvancedRetrofitCallback 的简单实现，需要哪那个回调复写哪个
 */

public class SimpleRetrofitCallback<T> implements AdvancedRetrofitCallback<T> {

    @Override
    public void onSuccess(Call<T> call, T resp) {
        // do nothing
    }

    @Override
    public boolean onError(Call<T> call, String errorCode, String msg) {
        // do nothing
        return false;
    }

    @Override
    public void onEnd(Call<T> call) {
        // do nothing
        // 该回调方法主要用在进行接口访问前显示进度对话框的情况下，在最后取消显示对话框
    }
}
