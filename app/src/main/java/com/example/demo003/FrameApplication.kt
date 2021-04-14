package com.example.demo003

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import com.averysk.libraryrefresh.header.WaterDropHeader
import com.averysk.libraryrefresh.layout.SmartRefreshLayout
import com.averysk.libraryrefresh.layout.footer.ClassicsFooter
import com.averysk.libraryrefresh.listener.DefaultRefreshFooterCreator
import com.averysk.libraryrefresh.listener.DefaultRefreshHeaderCreator

class FrameApplication : Application() {

    companion object {
        /**
         * 方法说明：获取单列 方法名称：getInstance
         *
         * @return 返回值：GaudetenetApplication
         */
        @SuppressLint("StaticFieldLeak")
        var singleInstance: FrameApplication? = null
            private set

        /**
         * 获得程序上下
         */
        @SuppressLint("StaticFieldLeak")
        var appContext: Context? = null
            private set

        /**
         * 方法说明：获取Application 方法名称：getInstance
         *
         * @return 返回值：Application
         */
        val instance: Application?
            get() = singleInstance

        init {
            //设置全局默认配置（优先级最低，会被其他设置覆盖）
            SmartRefreshLayout.setDefaultRefreshInitializer { context, layout ->
                //全局设置（优先级最低）
                layout.setEnableAutoLoadMore(true)
                layout.setEnableLoadMore(false)
                layout.setEnableOverScrollDrag(true)
                layout.setEnableOverScrollBounce(true)
                layout.setEnableLoadMoreWhenContentNotFull(true)
                layout.setEnableScrollContentWhenRefreshed(true)
                layout.setEnablePureScrollMode(false)
                layout.setDisableContentWhenRefresh(false)
                layout.setDisableContentWhenLoading(false)
                layout.setPrimaryColorsId(R.color.purple_500, R.color.white)
                layout.setHeaderMaxDragRate(2.5f)
                layout.setFooterMaxDragRate(4.0f)
                layout.setFooterHeight(45.0f)
            }
            //设置全局默认配置_仿IOS效果头部
            SmartRefreshLayout.setDefaultRefreshHeaderCreator(DefaultRefreshHeaderCreator { context, layout -> //全局设置主题颜色（优先级第二低，可以覆盖 DefaultRefreshInitializer 的配置，与下面的ClassicsHeader绑定）
                layout.setEnableHeaderTranslationContent(true)
                WaterDropHeader(context)
            })
            //设置全局默认配置_仿经典底部
            SmartRefreshLayout.setDefaultRefreshFooterCreator(DefaultRefreshFooterCreator { context, layout ->
                ClassicsFooter(context)
            })

        }
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
        singleInstance = this
    }

}