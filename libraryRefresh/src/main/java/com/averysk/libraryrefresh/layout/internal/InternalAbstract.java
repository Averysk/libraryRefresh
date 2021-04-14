package com.averysk.libraryrefresh.layout.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.averysk.libraryrefresh.layout.api.RefreshInternal;
import com.averysk.libraryrefresh.simple.SimpleComponent;

/**
 * Internal 初步实现
 * 实现 Header 和 Footer 时，继承 InternalAbstract 的话可以少写很多接口方法
 * Created by scwang on 2018/2/6.
 */
public abstract class InternalAbstract extends SimpleComponent {


    protected InternalAbstract(@NonNull View wrapped) {
        super(wrapped);
    }

    protected InternalAbstract(@NonNull View wrappedView, @Nullable RefreshInternal wrappedInternal) {
        super(wrappedView, wrappedInternal);
    }

    protected InternalAbstract(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


}
