package com.example.helpcenter;

        import androidx.fragment.app.FragmentActivity;

        import android.os.Bundle;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final LatLng Klein = new LatLng(40.821640, -73.945170);

    private static final LatLng Key = new LatLng(40.821640, -73.945170);

    private static final LatLng Super = new LatLng(40.823879, -73.944382);

    private static final LatLng Pioneer = new LatLng(40.822790, -73.935540);



    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        addMarkers();


        // Add a marker in Sydney and move the camera
        LatLng currentLocation = new LatLng(40.821640, -73.945170);
        mMap.addMarker(new MarkerOptions().position(currentLocation).title("Klein"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, 12f));
    }

    private void addMarkers() {
        mMap.addMarker(new MarkerOptions()
                .position(Klein)
                .title("Klein"));

        mMap.addMarker(new MarkerOptions()
                .position(Key)
                .title("KeyFoods")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        mMap.addMarker(new MarkerOptions()
                .position(Super)
                .title("Super FoodTown")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));

        mMap.addMarker(new MarkerOptions()
                .position(Pioneer)
                .title("Pioneer")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));
    }


    }