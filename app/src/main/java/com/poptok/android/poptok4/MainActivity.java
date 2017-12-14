package com.poptok.android.poptok4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import net.daum.mf.map.api.MapPOIItem;
import net.daum.mf.map.api.MapView;

/**
 * Created by BIT on 2017-12-05.
 */

public class MainActivity extends AppCompatActivity {

    private static String API_KEY="00d81ece29fd249d4c498ddb0d01d02c";

    @Override
    protected void onCreate(Bundle saveInstanceState)
    {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_drawmap);

        //아래처럼 써주면 splashActivity를 시작하겠다는 뜻
//        Intent intent = new Intent(this, SplashActivity.class);
//
//        startActivity(intent);

//        setTheme(R.style.AppTheme);

        MapPOIItem clsMarker = null;
        MapView mapView = new MapView(this);
        mapView.setDaumMapApiKey("00d81ece29fd249d4c498ddb0d01d02c");
//
//        RelativeLayout container = (RelativeLayout) findViewById(R.id.map_view);
//        container.addView(mapView);

        mapView.selectPOIItem(clsMarker, true);

        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.map_view);
        viewGroup.addView(mapView);

        //mapView.setMapViewEventListener((MapView.MapViewEventListener) this);


    }

}
