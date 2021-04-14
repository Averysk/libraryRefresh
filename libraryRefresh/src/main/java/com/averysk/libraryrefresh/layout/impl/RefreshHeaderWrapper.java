package com.averysk.libraryrefresh.layout.impl;

import android.annotation.SuppressLint;
import android.view.View;

import com.averysk.libraryrefresh.layout.api.RefreshHeader;
import com.averysk.libraryrefresh.layout.internal.InternalAbstract;

/**
 * 刷新头部包装
 * Created by scwang on 2017/5/26.
 */
@SuppressLint("ViewConstructor")
public class RefreshHeaderWrapper extends InternalAbstract implements RefreshHeader {

    public RefreshHeaderWrapper(View wrapper) {
        super(wrapper);
    }

}
