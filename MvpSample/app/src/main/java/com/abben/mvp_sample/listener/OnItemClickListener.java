package com.abben.mvp_sample.listener;

import android.view.View;

/**
 * Created by Shaolin on 2017/9/5.
 */

public interface OnItemClickListener<T> {

    void onItemClick(T t, View view);

}