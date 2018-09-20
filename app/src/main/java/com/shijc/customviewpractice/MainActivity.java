package com.shijc.customviewpractice;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


import com.alibaba.android.arouter.launcher.ARouter;
import com.shijc.customviewpractice.webview.WebViewActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Resources res;
    private RecyclerView recyclerView;
    private List<ChapterModel> products=new ArrayList<>();
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        context = this;
        res = getResources();

        initVar();
        initView();


    }

    private void initView() {
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        //设置并列2行的layoutManager
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

//        设置线性布局的layoutManager
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(linearLayoutManager);

        //设置adapter
        RecyclerAdapter adapter=new RecyclerAdapter(products);

        adapter.setListener(new RecyclerAdapter.Listener() {
            @Override
            public void onItemClickListener(ChapterModel model, int position) {
                switch (model.getChapterId()){
                    case 1:
                        ARouter.getInstance().build("/customview1/activity").navigation();
                        break;
                    case 2:
                        ARouter.getInstance().build("/customview2/activity").navigation();
                        break;
                    case 3:
                        ARouter.getInstance().build("/customview3/activity").navigation();
                        break;
                    case 4:
                        ARouter.getInstance().build("/customview4/activity").navigation();
                        break;
                    case 5:
                        ARouter.getInstance().build("/customview5/activity").navigation();
                        break;
                    case 6:
                        ARouter.getInstance().build("/customview6/activity").navigation();
                        break;
                    case 7:
                        ARouter.getInstance().build("/customview7/activity").navigation();
                        break;

                    default:
                        break;
                }
            }

            @Override
            public void onItemWebOpenClickListener(final ChapterModel model, int position, View view) {
                // View当前PopupMenu显示的相对View的位置
                PopupMenu popupMenu = new PopupMenu(context, view);

                // menu布局
                popupMenu.getMenuInflater().inflate(R.menu.app_menu_charpter, popupMenu.getMenu());

                // menu的item点击事件
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        ARouter.getInstance()
                                .build("/app/WebViewActivity")
                                .withString("URL", model.getArticleUrl())
                                .navigation();

                        return false;
                    }
                });

                // PopupMenu关闭事件
                popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
                    @Override
                    public void onDismiss(PopupMenu menu) {
                    }
                });

                popupMenu.show();

            }
        });

        recyclerView.setAdapter(adapter);
    }

    private void initVar() {
        products.add(new ChapterModel(1,R.drawable.icon_custom_view_1,res.getString(R.string.title_chapter_1),res.getString(R.string.url_chapter_1)));
        products.add(new ChapterModel(2,R.drawable.icon_custom_view_2,res.getString(R.string.title_chapter_2),res.getString(R.string.url_chapter_2)));
        products.add(new ChapterModel(3,R.drawable.icon_custom_view_3,res.getString(R.string.title_chapter_3),res.getString(R.string.url_chapter_3)));
        products.add(new ChapterModel(4,R.drawable.icon_custom_view_4,res.getString(R.string.title_chapter_4),res.getString(R.string.url_chapter_4)));
        products.add(new ChapterModel(5,R.drawable.icon_custom_view_5,res.getString(R.string.title_chapter_5),res.getString(R.string.url_chapter_5)));
        products.add(new ChapterModel(6,R.drawable.icon_custom_view_6,res.getString(R.string.title_chapter_6),res.getString(R.string.url_chapter_6)));
        products.add(new ChapterModel(7,R.drawable.icon_custom_view_7,res.getString(R.string.title_chapter_7),res.getString(R.string.url_chapter_7)));

    }

}
