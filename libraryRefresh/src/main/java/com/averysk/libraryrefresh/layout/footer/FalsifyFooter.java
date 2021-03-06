package com.averysk.libraryrefresh.layout.footer;

import android.content.Context;
import android.util.AttributeSet;

import com.averysk.libraryrefresh.layout.api.RefreshFooter;

/**
 * 虚假的 Footer
 * 用于 正真的 Footer 在 RefreshLayout 外部时，
 * Created by scwang on 2017/6/14.
 */
@SuppressWarnings("unused")
public class FalsifyFooter extends com.averysk.libraryrefresh.footer.FalsifyFooter implements RefreshFooter {

    //<editor-fold desc="FalsifyHeader">
    public FalsifyFooter(Context context) {
        this(context, null);
    }

    public FalsifyFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //</editor-fold>

}
