package com.stardust.autojs.runtime.api.ui.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.nickandjerry.dynamiclayoutinflator.lib.DynamicLayoutInflator;
import com.stardust.autojs.runtime.api.ui.JsViewHelper;

/**
 * Created by Stardust on 2017/5/14.
 */

public class JsLinearLayout extends LinearLayout {


    public JsLinearLayout(Context context) {
        super(context);
    }

    public JsLinearLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public JsLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public JsLinearLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public View id(String id) {
        return JsViewHelper.findViewByStringId(this, id);
    }

}
