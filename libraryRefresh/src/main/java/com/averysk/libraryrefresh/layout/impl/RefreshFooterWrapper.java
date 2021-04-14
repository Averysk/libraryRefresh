package com.averysk.libraryrefresh.layout.impl;

import android.annotation.SuppressLint;
import android.view.View;

import com.averysk.libraryrefresh.layout.api.RefreshFooter;
import com.averysk.libraryrefresh.layout.internal.InternalAbstract;

/**
 * 刷新底部包装
 * Created by scwang on 2017/5/26.
 */
@SuppressLint("ViewConstructor")
public class RefreshFooterWrapper extends InternalAbstract implements RefreshFooter {

    public RefreshFooterWrapper(View wrapper) {
        super(wrapper);
    }

}
