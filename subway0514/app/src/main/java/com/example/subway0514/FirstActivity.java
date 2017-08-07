package com.example.subway0514;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity  {

    private String[] data = {"Line1","Line2","Line3","Line3（北延段）","Line4","Line5","Line6","Line7",
            "Line8","APM"};
    private String[] data1 = {"广州东站","体育中心","体育西路","杨箕","东山口","烈士陵园","农讲所"
    ,"公园前","西门口","陈家祠","长寿路","黄沙","芳村","花地湾","坑口","西朗"};
    private String[] data2 ={"嘉禾望岗","黄边","江夏","萧岗","白云文化广场","白云公园","飞翔公园"
            ,"三元里","广州火车站","越秀公园","纪念堂","公园前","海珠广场","市二宫",
            "江南西","东晓南","南洲","洛溪","南浦","会江","石壁","广州南站"};
    private String[] data3 ={"天河客运站","五山","华师","岗顶","石牌桥","体育西路","珠江新城","广州塔"
            ,"客村","大塘","沥滘","夏滘","大石","汉溪长隆","市桥","番禺广场"};
    private String[] data4 ={"黄村","车陂","车陂南","万胜围","官洲","大学城北","大学城南","新造"
            ,"石碁","海傍","低涌","东涌","黄阁汽车城","黄阁","蕉门","金洲"};
    private String[] data5 ={"文冲","大沙东","大沙地","鱼珠","三溪","东圃","车陂南","科韵路","员村"
            ,"潭村","猎德","珠江新城","五羊邨","杨箕","动物园","区庄","淘金","小北","广州火车站"
            ,"西村","西场","中山八","坦尾","滘口"};
    private String[] data6 ={"浔峰岗","横沙","沙贝","河沙","坦尾","如意坊","黄沙","文化公园","一德路"
            ,"海珠广场","北京路","团一大广场","东湖","东山口","区庄","黄花岗","沙河顶","天平架"
            ,"燕塘","天河客运站","长湴","龙洞","高塘石","黄陂","金峰","暹岗","苏元","萝岗","香雪"};
    private String[] data7 ={"大学城南","板桥","员岗","南村万博","汉溪长隆","钟村","谢村","石壁","广州南站"};
    private String[] data8 ={"万胜围","琶洲","新港东","磨碟沙","赤岗","客村","鹭江","中大","晓港","昌岗"
            ,"宝岗大道","沙园","凤凰新村"};
    private String[] data9 ={"体育西路","林和西","广州东站","燕塘","梅花园","京溪南方医院","同和","永泰"
            ,"白云大道北","嘉禾望岗","龙归","人和","机场南"};
    private String[] dataAPM ={"林和西","体育中心南","天河南","黄埔大道","妇儿中心","花城大道","大剧院"
            ,"海心沙","广州塔"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null){
            actionbar.hide();
        }
        ArrayAdapter adapter= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data);
        ArrayAdapter adapter1= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data1);
        ArrayAdapter adapter2= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data2);
        ArrayAdapter adapter3= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data3);
        ArrayAdapter adapter4= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data9);
        ArrayAdapter adapter5= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data4);
        ArrayAdapter adapter6= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data5);
        ArrayAdapter adapter7= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data6);
        ArrayAdapter adapter8= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data7);
        ArrayAdapter adapter9= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,data8);
        ArrayAdapter adapterAPM= new ArrayAdapter(FirstActivity.this, android.R.layout.simple_list_item_1,dataAPM);
        final ListView yuer = (ListView) findViewById(R.id.list_view);
        final ListView listView01 = (ListView) findViewById(R.id.list01);
        final ListView listView02 = (ListView) findViewById(R.id.list02);
        final ListView listView03 = (ListView) findViewById(R.id.list03);
        final ListView listView04 = (ListView) findViewById(R.id.list04);
        final ListView listView05 = (ListView) findViewById(R.id.list05);
        final ListView listView06 = (ListView) findViewById(R.id.list06);
        final ListView listView07 = (ListView) findViewById(R.id.list07);
        final ListView listView08 = (ListView) findViewById(R.id.list08);
        final ListView listView09 = (ListView) findViewById(R.id.list09);
        final ListView listViewAPM = (ListView) findViewById(R.id.listAPM);
        final ImageView imageView1 = (ImageView) findViewById(R.id.image_view);
        //listView01.setVisibility(View.INVISIBLE);
        //listView02.setVisibility(View.INVISIBLE);
        yuer.setAdapter(adapter);
        listView01.setAdapter(adapter1);
        listView02.setAdapter(adapter2);
        listView03.setAdapter(adapter3);
        listView04.setAdapter(adapter4);
        listView05.setAdapter(adapter5);
        listView06.setAdapter(adapter6);
        listView07.setAdapter(adapter7);
        listView08.setAdapter(adapter8);
        listView09.setAdapter(adapter9);
        listViewAPM.setAdapter(adapterAPM);
        yuer.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> parent,View view,
                                    int position,long id) {
                switch (position) {
                    case 0:



                        imageView1.setImageResource(R.drawable.main);
                        listView01.setVisibility(View.VISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);

                        break;
                    case 1:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.VISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 2:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.VISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 3:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.VISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 4:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.VISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 5:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.VISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 6:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.VISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 7:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.VISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 8:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.VISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 9:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 10:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                    case 11:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.VISIBLE);
                        break;
                    default:
                        listView01.setVisibility(View.INVISIBLE);
                        listView02.setVisibility(View.INVISIBLE);
                        listView03.setVisibility(View.INVISIBLE);
                        listView04.setVisibility(View.INVISIBLE);
                        listView05.setVisibility(View.INVISIBLE);
                        listView06.setVisibility(View.INVISIBLE);
                        listView07.setVisibility(View.INVISIBLE);
                        listView08.setVisibility(View.INVISIBLE);
                        listView09.setVisibility(View.INVISIBLE);
                        listViewAPM.setVisibility(View.INVISIBLE);
                        break;
                }
            }
            }

        );
        //这个下面↓↓↓是每个站点的点♂击♂事♂5件
        listView03.setOnItemClickListener(new AdapterView.OnItemClickListener(){

                                              public void onItemClick(AdapterView<?> parent,View view,
                                                                      int position,long id) {
                                                  switch (position) {
                                                      case 0:
                                                          imageView1.setImageResource(R.drawable.keyun);
                                                          break;
                                                      case 1:
                                                          Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                                                          startActivity(intent);
                                                          break;
                                                      case 2:
                                                          imageView1.setImageResource(R.drawable.huashi);
                                                          break;
                                                      case 3:
                                                          imageView1.setImageResource(R.drawable.gangding);
                                                          break;
                                                      case 4:
                                                          imageView1.setImageResource(R.drawable.taigu);
                                                          break;
                                                      case 5:
                                                          imageView1.setImageResource(R.drawable.tiyuxi);
                                                          break;
                                                      default:break;

                                                  }
                                              }
                                          }

        );
    }
}
