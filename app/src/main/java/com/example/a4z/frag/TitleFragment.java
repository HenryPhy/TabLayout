package com.example.a4z.frag;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.a4z.R;
import com.example.a4z.TitleView;
/**
 * 组合view
 */
public class TitleFragment extends Fragment {

    private TitleView titleView1,titleView2,titleView3,titleView4,titleView5,titleView6;
    public TitleFragment() {}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title, container, false);

        titleView1 = view. findViewById(R.id.title_view1);
        titleView2 = view. findViewById(R.id.title_view2);
        titleView3 = view. findViewById(R.id.title_view3);
        titleView4 = view. findViewById(R.id.title_view4);
        titleView5 = view. findViewById(R.id.title_view5);
        titleView6 = view. findViewById(R.id.title_view6);

        titleView1.setBackgroundColor(Color.GREEN);
        titleView1.setTextContent("标题1");

        titleView2.setBackgroundColor(Color.GREEN);
        titleView2.setTextContent("标题2");
        titleView2.setAddVisiable(false);

        titleView3.setBackgroundColor(Color.RED);
        titleView3.setTextContent("标题3");
        titleView3.setAddVisiable(false);
        titleView3.setBackVisiable(false);

        titleView4.setBackgroundColor(Color.RED);
        titleView4.setTextContent("标题4");

        titleView5.setTextContent("标题5");
        titleView5.setBackVisiable(false);

        titleView6.setTextContent("标题6");
        titleView6.setBackVisiable(false);
        titleView6.setTextColor(Color.BLACK);
        return view;
    }
}