package com.poptok.android.poptok4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.ViewGroup;

import net.daum.mf.map.api.MapPoint;
import net.daum.mf.map.api.MapView;

/**
 * Created by BIT on 2017-12-15.
 */

public class DrawMapActivity extends AppCompatActivity{

    private MapPoint.GeoCoordinate mapPointGeo;
    private MapPoint mapPoint = null;


    public void onMapViewInitialized(MapView mapView) {

        mapView.setDaumMapApiKey("f1ce1afe4bd1995ca9fe8c5957fcd78b");
        mapView.setCurrentLocationTrackingMode(MapView.CurrentLocationTrackingMode.TrackingModeOnWithoutHeading);

        mapView.setMapCenterPointAndZoomLevel(MapPoint.mapPointWithGeoCoord(33.41, 126.52), 1, false);
        Log.i("DrawMapActivity : ", "onMapViewInitialized");
    }

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        MapView mapView = new MapView(this);

        MapView.CurrentLocationEventListener mCurrentLocationEventListener = null;
        onMapViewInitialized(mapView);
        setContentView(R.layout.activity_drawmap);

        ViewGroup mapViewContainer = (ViewGroup) findViewById(R.id.map_view);
        mapViewContainer.addView(mapView);
    }




}
