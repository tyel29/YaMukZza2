package com.example.yamukzza;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, LoadingActivity.class);
        startActivity(intent);


//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // 버튼의 id를 가져온다.
//                switch (v.getId()){
//                    case R.id.btn_mypage:
//                        // btn_mypage을 눌렀을 때의 처리
//                        break;
//                    case R.id.btn_search:
//                        // btn_search을 눌렀을 때의 처리
//                        break;
//                    case R.id.btn_main:
//                        // btn_main을 눌렀을 때의 처리
//                        break;
//                    case R.id.btn_recipe:
//                        // btn_recipe을 눌렀을 때의 처리
//                        break;
//                    case R.id.btn_basket:
//                        // btn_basket을 눌렀을 때의 처리
//                        break;
//                }
//            }
//        };
//
//        Button btn_mypage = (Button) findViewById(R.id.btn_mypage);
//        Button btn_search = (Button) findViewById(R.id.btn_search);
//        Button btn_main = (Button) findViewById(R.id.btn_main);
//        Button btn_recipe = (Button) findViewById(R.id.btn_recipe);
//        Button btn_basket = (Button) findViewById(R.id.btn_basket);
//
//        btn_mypage.setOnClickListener(listener);
//        btn_search.setOnClickListener(listener);
//        btn_main.setOnClickListener(listener);
//        btn_recipe.setOnClickListener(listener);
//        btn_basket.setOnClickListener(listener);




    }

}
