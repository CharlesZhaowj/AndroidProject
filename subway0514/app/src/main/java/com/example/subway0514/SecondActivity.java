package com.example.subway0514;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    private Food[] food = {new Food("私藏！最难忘的体育西14家美食",R.drawable.pisa),   //http://mp.weixin.qq.com/s/Oh5bSPPyMCW_sqRF63aCog
            new Food("文艺吃货表示有64G内存，都吃不完体育西横路这些美食",R.drawable.cake),  //http://mp.weixin.qq.com/s/9Fu2KwLvXx_bKb_0ad28fQ
            new Food("食过翻寻味!原来这14家美食才是正佳广场的精华",R.drawable.crab),    //http://mp.weixin.qq.com/s/VFWnJdICvIMXW6tKZGW2zQ
            new Food("最好吃！！珠江新城的12间店，几乎包含了所有菜式！",R.drawable.sushi), //http://mp.weixin.qq.com/s/cf904KXuiI7_vk4Y-rXC1g
            new Food(" 疯掉！能在花城汇立足的10家人气超高的食肆，低至10元！",R.drawable.fenmiji) //http://mp.weixin.qq.com/s/4IGOUblmSKYq_DgKMiR_bA
    };

    private List<Food> foodList = new ArrayList<>();

    private FoodAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initFood();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new FoodAdapter(foodList);
        recyclerView.setAdapter(adapter);
    }

    private void initFood(){
        foodList.clear();
        for(int i =0;i<5;i++){
            /*Random random = new Random();
            int index = random.nextInt(food.length);*/
            foodList.add(food[i]);
        }
    }
}
