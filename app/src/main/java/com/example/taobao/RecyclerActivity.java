package com.example.taobao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {
    private List<TaoBao> taobaolist=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_taobao);

        initTaobao();
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        TaoBaoAdapter adapter=new TaoBaoAdapter(taobaolist);
        recyclerView.setAdapter(adapter);


    }

    private void initTaobao() {
        TaoBao shoes1=new TaoBao("shoes1",R.drawable.shoes1);
        taobaolist.add(shoes1);
        TaoBao shoes2=new TaoBao("shoes2",R.drawable.shoes2);
        taobaolist.add(shoes2);
        TaoBao shoes3=new TaoBao("shoes3",R.drawable.shoes3);
        taobaolist.add(shoes3);
        TaoBao shoes4=new TaoBao("shoes4",R.drawable.shoes4);
        taobaolist.add(shoes4);
        TaoBao hat=new TaoBao("hat",R.drawable.hat);
        taobaolist.add(hat);
        TaoBao hat1=new TaoBao("hat1",R.drawable.hat1);
        taobaolist.add(hat1);
        TaoBao coat=new TaoBao("coat",R.drawable.coat);
        taobaolist.add(coat);
        TaoBao scarf=new TaoBao("scarf",R.drawable.scarf);
        taobaolist.add(scarf);
        TaoBao socks=new TaoBao("socks",R.drawable.socks);
        taobaolist.add(socks);
        TaoBao xiangzi=new TaoBao("xiangzi",R.drawable.xiangzi);
        taobaolist.add(xiangzi);
        TaoBao yusan=new TaoBao("yusan",R.drawable.yusan);
        taobaolist.add(yusan);
        TaoBao bag=new TaoBao("bag",R.drawable.bag);
        taobaolist.add(bag);


    }
}