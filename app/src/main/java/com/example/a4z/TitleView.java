package com.example.a4z;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
/**
 *  自定义组合view的操作
 *  1.绘制布局，将组合view在布局当中显示出来。
 *  2.创建一个类，继承布局最外层的容器类控件。
 *  3.让自定义的类表示布局。
 */
public class TitleView extends RelativeLayout{
    private  RelativeLayout layout;
    private  ImageButton backBtn,addBtn;
    private  TextView titleTv;
    public TitleView(final Context context, AttributeSet attrs) {
        super(context, attrs);
//        将xml文件转化为当前的view对象
        LayoutInflater.from(context).inflate(R.layout.title,this);
        titleTv =   findViewById(R.id.title_tv);
        backBtn =   findViewById(R.id.title_btn_back);
        addBtn  =   findViewById(R.id.title_btn_add);
        layout  =   findViewById(R.id.title_layout);
//        设置按钮的点击事件
        backBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"点击了返回按钮",Toast.LENGTH_SHORT).show();
            }
        });

        addBtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"点击了添加按钮",Toast.LENGTH_SHORT).show();
            }
        });
    }
//    设置背景颜色的方法
    public void setBackgroundColor(int color){
        layout.setBackgroundColor(color);
    }
//    设置文字内容的方法
    public void setTextContent(String text){
        titleTv.setText(text);
    }
//    设置文字颜色的改变
    public void setTextColor(int color){
        titleTv.setTextColor(color);
    }
//   设置返回的按钮是否出现
    public void setBackVisiable(boolean b){
        if (b) {
            backBtn.setVisibility(VISIBLE);
        }else{
            backBtn.setVisibility(INVISIBLE);
        }
    }
//    设置添加的按钮是否出现
    public void setAddVisiable(boolean b){
        if (b) {
            addBtn.setVisibility(VISIBLE);
        }else{
            addBtn.setVisibility(INVISIBLE);
        }
    }
}