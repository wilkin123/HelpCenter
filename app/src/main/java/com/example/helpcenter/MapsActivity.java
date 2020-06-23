package com.example.helpcenter;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.fragment.app.FragmentActivity;

        import android.os.Bundle;
        import android.widget.Toast;

        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.BitmapDescriptorFactory;
        import com.google.android.gms.maps.model.LatLng;
        import com.google.android.gms.maps.model.Marker;
        import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final LatLng Key = new LatLng(40.821640, -73.945170);

    private static final LatLng Super = new LatLng(40.822710, -73.942730);

    private static final LatLng Pioneer = new LatLng(40.8231237, -73.9375922);

    private static final LatLng FineFare = new LatLng(40.821250,-73.938740);

    private  static final LatLng Key2 = new LatLng(40.819920, -73.943420);

    private static final LatLng FineFare2 = new LatLng(40.813100,-73.939200);

    private static final LatLng Church = new LatLng(40.81594335, -73.9417977922599);

    private static final LatLng Hosp = new LatLng(40.81470595,-73.939280346021);

    private static final LatLng Ryan = new LatLng(40.8119441111111,-73.9499976666667);

    private static final LatLng Church2 = new LatLng(40.82661715	,-73.9384599511008);

    private  static final LatLng Phys = new LatLng(40.8094195, -73.9488561);

    private static final LatLng CityMD = new LatLng(40.8268934,-73.9497877);

    private static final LatLng CityMD2 = new LatLng(40.8156548,-73.9582503);

    private static final LatLng CityMD3 = new LatLng(40.817955,	-73.9603735);

    private static final LatLng family = new LatLng(40.8018113,-73.9437044);
    
    private static final LatLng boriken = new LatLng(40.8024	,-73.9367685);

    private static final LatLng UnitarianChurch = new LatLng(40.775450, -73.958360);

    private static final LatLng CommunityKitchen = new LatLng(40.803950, -73.954990);

    private static final LatLng XavierMission = new LatLng(40.737810, -73.995510);

    private static final LatLng SaintLuke = new LatLng(40.75986705, -73.98869052);

    private static final LatLng CommonPantry= new LatLng(40.79575935, -73.94923617);

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
                .position(Key)
                .title("Key Food Supermarket")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(Super)
                .title("Super FoodTown")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(Pioneer)
                .title("Pioneer Market")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(FineFare)
                .title("FineFare Supermarket")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(Key2)
                .title("Key Food Supermarket")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(FineFare2)
                .title("FineFare Supermarket")
                .snippet("Grocery Store, Reverse Vending Machine")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        mMap.addMarker(new MarkerOptions()
                .position(Church)
                .title("Mother AME Zion Church")
                .snippet("Episcopal Church, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(Hosp)
                .title("NYC Health")
                .snippet("Hospital, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(Ryan)
                .title("Ryan Health")
                .snippet("Health Clinic, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(Church2)
                .title("St Matthews Baptist Church")
                .snippet("Baptist Church, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(Phys)
                .title("AdvantageCare Physicians")
                .snippet("Internist, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(CityMD)
                .title("CityMD Urgent Care")
                .snippet("Urgent Care, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(CityMD2)
                .title("CityMD Urgent Care")
                .snippet("Urgent Care, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(CityMD3)
                .title("CityMD Urgent Care")
                .snippet("Urgent Care, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(family)
                .title("Family Health Center")
                .snippet("Health Clinic, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(boriken)
                .title("Boriken Neighborhood Health Center")
                .snippet("Health Clinic, COVID-19 Testing Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
        mMap.addMarker(new MarkerOptions()
                .position(UnitarianChurch)
                .title("Unitatian Church")
                .snippet("Soup Kitchen, Donation Center")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions()
                .position(CommunityKitchen)
                .title("Food Bank For New York City")
                .snippet("Food Pantry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions()
                .position(XavierMission)
                .title("Xavier Mission")
                .snippet("Church, Soup Kitchen, Clothing Bank")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions()
                .position(SaintLuke)
                .title("St Luke's Lutheran Church")
                .snippet("Lutheran Church, Soup Kitchen, Clothing Bank, Food Pantry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        mMap.addMarker(new MarkerOptions()
                .position(CommonPantry)
                .title("New York Common Pantry")
                .snippet("Food Pantry")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
    }

    }

    