package com.android.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    int[] images;
    String[] names;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        images=new int[]{R.drawable.android_pie, R.drawable.audi ,R.drawable.hyundai,R.drawable.kia,R.drawable.suzuki};
        names=new String[]{"android_pie","audi","hyundai","kia", "suzuki"};

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(MainActivity.this);

        CarAdapter adapter=new CarAdapter(MainActivity.this,getList(images,names));

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private List<CarName> getList(int[] images,String[] names){
        List<CarName> list=new ArrayList<>();
        for (int i=0;i<images.length;i++){
            CarName name=new CarName();
            name.setImage(images[i]);
            name.setName(names[i]);
            list.add(name);
        }
        return list;
    }
}
