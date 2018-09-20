package com.shijc.customviewpractice;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shijiacheng
 * @version V1.0
 * @Package com.shijc.customviewpractice
 * @Description:
 * @date 2018/9/18 16:05
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecVH> {
    List<ChapterModel> products = new ArrayList<>();

    //构造方法传入数据
    public RecyclerAdapter(List<ChapterModel> products) {
        this.products = products;
    }

    //创造ViewHolder
    @Override
    public RecVH onCreateViewHolder(ViewGroup parent, int viewType) {
        //把item的Layout转化成View传给ViewHolder
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.app_item_recycler, parent, false);
        return new RecVH(view);
    }

    //    将数据放入相应的位置
    @Override
    public void onBindViewHolder(RecVH holder, final int position) {
        holder.tvTitle.setText(products.get(position).getChapterName());
        holder.ivPic.setImageResource(products.get(position).getResId());

        holder.rootView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener!=null){
                    listener.onItemClickListener(products.get(position),position);
                }
            }
        });
        holder.ivOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener!=null){
                    listener.onItemWebOpenClickListener(products.get(position),position,v);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    //ViewHolder绑定控件
    public class RecVH extends RecyclerView.ViewHolder {
        ImageView ivPic,ivOpenWeb;
        TextView tvTitle;
        View rootView;

        public RecVH(View itemView) {
            super(itemView);
            ivPic = (ImageView) itemView.findViewById(R.id.ivPic);
            ivOpenWeb = (ImageView) itemView.findViewById(R.id.iv_open_web);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            rootView = itemView.findViewById(R.id.rootView);
        }
    }

    public interface Listener{
        void onItemClickListener(ChapterModel model,int position);
        void onItemWebOpenClickListener(ChapterModel model,int position,View view);
    }

    private Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;
    }
}
