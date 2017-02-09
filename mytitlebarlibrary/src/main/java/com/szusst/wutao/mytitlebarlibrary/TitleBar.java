package com.szusst.wutao.mytitlebarlibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TitleBar  extends LinearLayout {
    private ImageView iv_left;
    private ImageView iv_right;
    private TextView tv_title;

    public TitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.inflate(context, R.layout.common_titlebar, this);
        this.iv_left = (ImageView) this.findViewById(R.id.iv_titleBar_left);
        this.iv_right = (ImageView) this.findViewById(R.id.iv_titleBar_right);
        this.tv_title = (TextView) this.findViewById(R.id.tv_titleBar_title);
    }
    public void initActionBar(String title, int leftId, int rightId, View.OnClickListener listener) {
        this.tv_title.setText(title);
        if (leftId == -1) {
            this.iv_left.setVisibility(View.INVISIBLE);
        } else {
            this.iv_left.setImageResource(leftId);
            iv_left.setOnClickListener(listener);
        }
        if (rightId == -1) {
            this.iv_right.setVisibility(View.INVISIBLE);

        } else {
            this.iv_right.setImageResource(rightId);
            iv_right.setOnClickListener(listener);
        }
    }
    public void setTitle(String title) {
        this.tv_title.setText(title);
    }

    public void setVisible(int visible){
        if(visible==View.VISIBLE){
            iv_right.setVisibility(View.VISIBLE);
        }else if(visible==View.INVISIBLE){
            iv_right.setVisibility(View.INVISIBLE);
        }else if(visible==View.GONE){
            iv_right.setVisibility(View.GONE);
        }
    }
}
