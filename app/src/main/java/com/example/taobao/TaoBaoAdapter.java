package com.example.taobao;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TaoBaoAdapter extends RecyclerView.Adapter<TaoBaoAdapter.ViewHolder01> {
    private List<TaoBao> taoBaoList;

    public TaoBaoAdapter(List<TaoBao> myList){
        taoBaoList=myList;
    }
    /*onCreateViewHolder方法用于引入子项布局创建ViewHolderR实例，并将加载出的布局传入构造函数中，最后返回该实例*/
    @NonNull
    @Override
    public ViewHolder01 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//      纵向滚动布局
        final View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.taobao_item,parent,false);

        final  ViewHolder01 holder01=new ViewHolder01(view);
        holder01.taobaoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder01.getAdapterPosition();
               TaoBao fruit = taoBaoList.get(position);
                Toast.makeText(view.getContext(), "You Click view " + fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        holder01.taobaoImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int position=holder01.getAdapterPosition();
                TaoBao taobao=taoBaoList.get(position);
                Toast.makeText(view.getContext(),"You Click v " + taobao.getName(), Toast.LENGTH_SHORT).show();
            }
        });
        return holder01;
    }

    //onBindViewHolder方法用于对RecyclerView子项的数据进行赋值，即将Fruit实例取出的图片和文本信息设置ViewHolder中对应的变量
    @Override
    public void onBindViewHolder(@NonNull ViewHolder01 holder, int position) {
        TaoBao taobao=taoBaoList.get(position);
        holder.taobaoImage.setImageResource(taobao.getImageId());
        holder.taobaoName.setText(taobao.getName());
    }
    //getItemCount方法用于告诉RecyclerView一共有多少个子项
    @Override
    public int getItemCount() {
        return taoBaoList.size();
    }

    static class ViewHolder01 extends RecyclerView.ViewHolder{
        View taobaoView;
        ImageView taobaoImage;
        TextView taobaoName;


        public ViewHolder01(@NonNull View itemView) {
            super(itemView);
            taobaoView=itemView;
            taobaoImage=itemView.findViewById(R.id.taobao_image);
           taobaoName=itemView.findViewById(R.id.taobao_name);
        }
    }
}

