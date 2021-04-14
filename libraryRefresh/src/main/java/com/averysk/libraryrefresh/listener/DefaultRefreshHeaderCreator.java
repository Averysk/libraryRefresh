package com.averysk.libraryrefresh.listener;

import android.content.Context;

import androidx.annotation.NonNull;

import com.averysk.libraryrefresh.api.RefreshHeader;
import com.averysk.libraryrefresh.api.RefreshLayout;

/**
 * 默认Header创建器
 * Created by scwang on 2018/1/26.
 */
public interface DefaultRefreshHeaderCreator {
    @NonNull
    RefreshHeader createRefreshHeader(@NonNull Context context, @NonNull RefreshLayout layout);
}
