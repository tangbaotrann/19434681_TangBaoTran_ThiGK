package com.example.tangbaotran_19434681_thigk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import adapter.GiayAdapter;
import model.Giay;

public class MainActivity2 extends AppCompatActivity {

    private GiayAdapter giayAdapter;
    private List<Giay> listGiay;
    private GridView gridView;
    private int[] imgs = new int[] {R.drawable.lst_img_1, R.drawable.lst_img_2, R.drawable.lst_img_3, R.drawable.lst_img_4,
                                    R.drawable.lst_img_5, R.drawable.lst_img_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        gridView = findViewById(R.id.idGridview);
        listGiay = new ArrayList<>();
        listGiay.add(new Giay(imgs[0], "Nike SOS", "$700"));
        listGiay.add(new Giay(imgs[1], "Nylon", "$300"));
        listGiay.add(new Giay(imgs[2], "Addidas", "$350"));
        listGiay.add(new Giay(imgs[3], "Red One", "$950"));
        listGiay.add(new Giay(imgs[4], "Nike SOS", "$700"));
        listGiay.add(new Giay(imgs[1], "Nylon", "$300"));

        giayAdapter = new GiayAdapter(this, R.layout.item_custom_grid_view, listGiay);
        gridView.setAdapter(giayAdapter);
    }
}