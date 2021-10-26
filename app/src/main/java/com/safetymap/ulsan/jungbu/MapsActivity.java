
package com.safetymap.ulsan.jungbu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;


public class MapsActivity extends FragmentActivity implements
        GoogleMap.OnMyLocationButtonClickListener,
        GoogleMap.OnMyLocationClickListener,
        OnMapReadyCallback{

    private GoogleMap mMap;
    private int MY_LOCATION_REQUEST_CODE = 1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //화면캡쳐
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
               .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    //침입절도
    public void onClick3(View v){

        Toast.makeText(this, "침입절도 눌렀어요", Toast.LENGTH_LONG).show();

        BitmapDrawable bitmapdraw3=(BitmapDrawable)getResources().getDrawable(R.drawable.jd);
        Bitmap b3=bitmapdraw3.getBitmap();
        Bitmap smallMarker3 = Bitmap.createScaledBitmap(b3, 15, 15, false);

        LatLng map = new LatLng(35.5522976674435,129.334944127208);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5744797067111,129.34577719678);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5744797067111,129.34577719678);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5544481674559,129.33695729726);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5595809899715,129.310852226716);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5549769332326,129.320253862018);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538027003521,129.318623663009);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538027003521,129.318623663009);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5620744996295,129.315332947489);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5614338938455,129.320904039001);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5546284981664,129.320885498927);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5596496540711,129.343661470689);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5546284981664,129.320885498927);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5724723846932,129.340651835741);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5532829611084,129.283053520817);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5636959254357,129.339831097752);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548815092272,129.310238861848);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531970590348,129.321361023789);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559004228592,129.307747769776);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559004228592,129.307747769776);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559004228592,129.307747769776);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5617525232811,129.312512623699);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5562139634193,129.307926875416);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5549769332326,129.320253862018);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5609023982178,129.344972226322);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5772183931218,129.347161692959);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.55750498028,129.282590005752);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5673674049046,129.339097704746);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5555494330414,129.326940876444);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5875778170754,129.343861571598);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5534812757935,129.309751572318);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5635786038279,129.266322777862);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559744660186,129.328697675884);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5658370111895,129.328047082556);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5573953176884,129.340563904652);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5550156900098,129.320668343771);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548902625184,129.317764470196);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5552089423777,129.331416385145);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5736203641321,129.345184292471);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5745700370575,129.346177765123);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5697878563319,129.33710913681);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5697878563319,129.33710913681);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5752100932707,129.340464668773);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5581472901009,129.315343166526);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5649990627341,129.268178671647);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548902625184,129.317764470196);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.567515505253,129.332749563924);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5587303957113,129.345330570077);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5513160924925,129.294423064715);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5519313718567,129.292639670889);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5539761981836,129.28099020626);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545993174151,129.345165764447);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531371634669,129.320159148221);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531371634669,129.320159148221);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5572499100094,129.324471373568);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.560854055273,129.313027813438);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5534356698327,129.333645831836);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5845019716771,129.32541972627);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566596643698,129.336168963412);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.556543844075,129.329237724655);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5589848589599,129.341531325165);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5592139904429,129.348905093532);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5532829611084,129.283053520817);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548054929989,129.31490387051);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5711254291087,129.348671577571);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.553900804179,129.303076621553);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559963845834,129.278323959905);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559963845834,129.278323959905);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.557402325068,129.281396028325);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5622157844551,129.343355791388);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5680684926126,129.345870238064);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5728998935814,129.346519599191);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5755374533255,129.346499609759);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.553887866793,129.312785717603);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542024563013,129.315126693132);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542024563013,129.315126693132);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542143520873,129.345693959906);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542993079356,129.30690983769);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5650351652591,129.332090717553);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5612325711727,129.326705045526);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5740537475457,129.348314589692);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5614334052789,129.339205942049);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5579256212802,129.268218792025);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5579139073982,129.342842053075);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5578061393471,129.34389683559);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5547225534315,129.33182339043);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5547309579275,129.331504262108);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5577603747927,129.344138644308);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5577603747927,129.344138644308);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545331971625,129.314073495565);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5698312868569,129.30436979158);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5533013743439,129.312074720463);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5550943811485,129.31073848291);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5720891352815,129.344005746944);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5646166162061,129.326582701509);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5592073996686,129.268683702242);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5498679655925,129.292764049663);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5561750041537,129.277794964596);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5621082589922,129.32309317762);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5621082589922,129.32309317762);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548483075455,129.319757003955);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553143259956,129.3213553648);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566220982212,129.283894218001);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.551285187028,129.30035388252);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603449165872,129.304798065604);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603449165872,129.304798065604);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5512746028122,129.299398073771);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.573942106876,129.340687719348);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5541622308764,129.31683583307);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5550848751545,129.345524413094);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5515843541096,129.338799916341);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553859774602,129.282625837678);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5604328335239,129.345059923055);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5578112480089,129.332416225903);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5563760253622,129.309890178627);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5765123842058,129.346315541706);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5524153676412,129.29621800394);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5561858474469,129.331346752961);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538910705245,129.33208396748);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5634810676743,129.326586889608);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.556543844075,129.329237724655);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.556543844075,129.329237724655);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5537210254748,129.31984525528);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603793415369,129.317744283743);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5544425384855,129.314375175803);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5688061942357,129.333406794703);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5539482225604,129.313119112065);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5705425862368,129.346707487173);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554834710442,129.328398977087);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554834710442,129.328398977087);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.556992271079,129.315992693065);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5556263634835,129.319822672436);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5547225534315,129.33182339043);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5744345172688,129.341504662109);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5558692223006,129.31315239872);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5555670983285,129.318625860683);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566905262058,129.321729809255);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.555309408069,129.307446919886);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.569782830999,129.341351983634);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5577485548625,129.327492241812);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5592734801383,129.293474353548);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5633627201092,129.329201465151);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5586269516264,129.270865994995);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5586269516264,129.270865994995);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5592181085203,129.341385434259);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5577392753221,129.271356374471);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5600088425308,129.302563318026);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5586031882871,129.333383613408);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.561049129097,129.316119686017);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5640019863006,129.341373600414);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5626347346261,129.343598064012);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559865343012,129.32380881724);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5657351663072,129.32365046536);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5636669878908,129.333933032073);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5630508070594,129.337619313088);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5586291679201,129.327021234162);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5561998009772,129.342212067485);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603449165872,129.304798065604);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.557910507024,129.347395961491);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.557910507024,129.347395961491);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5656082729135,129.343644493772);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553106711176,129.318784959145);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5551454090787,129.321625658422);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5588040791202,129.318019366944);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5588040791202,129.318019366944);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5745979421964,129.307115096033);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5571177563409,129.341064395071);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5571177563409,129.341064395071);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548637362215,129.315397842365);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5516263941174,129.287847340388);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5513740329314,129.29031700255);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5633300143977,129.310642917636);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5547298240202,129.321643729326);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5556939148053,129.319055209493);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5764862939825,129.316941460104);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.555144609366,129.318187013297);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531385767059,129.322652552456);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5632650850445,129.267110742187);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5584045402829,129.274113950099);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5584045402829,129.274113950099);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5504096018532,129.292270456467);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5556574411549,129.324250924283);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.554097233208,129.325337372184);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5949042777656,129.34305352178);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5570443103957,129.325664646589);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5543170645017,129.311628387071);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5571195523049,129.324246690653);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5612294890978,129.338214901289);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5731710480943,129.347717287791);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5617290974541,129.337939939091);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5525800050505,129.329756295322);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5690145659965,129.342348292335);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5513831220502,129.29969064015);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5502749187556,129.296724062239);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610090142039,129.308909949057);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5736092543702,129.347971530887);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5626595229499,129.304422360664);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5738385878665,129.346418947187);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5651000179104,129.325785352787);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5809630681951,129.335833728288);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.575594407294,129.344083704498);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603932948002,129.32350289622);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5601678842444,129.323599452669);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566368354251,129.27612292593);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5584703897927,129.324059054207);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5595916061929,129.323543199369);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5644515070799,129.334684041662);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5591007024197,129.319159351572);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5560406448534,129.345231480558);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5519997204057,129.288173342309);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531078371376,129.344220590103);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.558351629323,129.328759481994);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5598329407747,129.3301570048);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5621539137769,129.339262930157);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5557288365657,129.333731347546);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559677599058,129.326955604273);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5738791121578,129.310489942236);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5575021553463,129.333759429814);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5575021553463,129.333759429814);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5674401813808,129.340668215981);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5556220481021,129.347284805529);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5611770313245,129.294272551271);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5598590242272,129.323593654927);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5647489383235,129.335984484876);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5598590242272,129.323593654927);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5580174320721,129.325257275343);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5544322816528,129.32146685117);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5570998562167,129.271639355714);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5641128797146,129.265556226338);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5537484003136,129.325014583157);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5537484003136,129.325014583157);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603233895647,129.338702256745);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5539373254487,129.338032976993);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5540669610485,129.318452125087);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610090142039,129.308909949057);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5565460632773,129.322926862716);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566740664992,129.323172231438);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5541371106188,129.308094601278);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5549706969284,129.316365847533);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5572343370814,129.342789112521);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5585553415777,129.268594186748);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5756072127251,129.310757728565);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.56036933891,129.343754215324);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5698746858421,129.345189937645);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5537565871856,129.283195599675);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803904592827,129.319604634583);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5555405967231,129.320139281184);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.551925567212,129.335369600703);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5583266394524,129.274334701688);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5559331746456,129.281413953398);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5526649778174,129.348926971802);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5646715856473,129.35152719279);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5622157265974,129.324617854402);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538554417583,129.320723983555);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5781162692262,129.324576662096);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5759918737577,129.307008160339);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553070789249,129.28201449388);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5745979421964,129.307115096033);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5527442605659,129.337203681628);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5743309075866,129.310965199982);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5645439185743,129.34769050732);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.570936569475,129.349353584771);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610480878851,129.342658232285);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5895479804189,129.343945255017);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5805268384639,129.340014852816);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610480878851,129.342658232285);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5606004152952,129.3366869675);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5603449165872,129.304798065604);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.584530771655,129.276643798778);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5533013743439,129.312074720463);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531384847861,129.333712335408);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531384847861,129.333712335408);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5598329407747,129.3301570048);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5795620565819,129.267365594503);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.554868913535,129.277546897909);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.556298158793,129.279534538636);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5588067280207,129.268937968652);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5522179983293,129.296712746487);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5649990627341,129.268178671647);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553800675905,129.278111302091);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5569177100593,129.28123042732);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542944372332,129.339281879141);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5597949667963,129.32052082066);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545418072295,129.317587646005);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5689957382963,129.34657691841);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5526560391407,129.296855374134);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.578568634469,129.34498473255);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5709059107411,129.340512104483);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554607174471,129.306858846606);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5549506157915,129.322030810206);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5546682474232,129.332345342892);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5575001929809,129.272344340534);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.553527618859,129.315757386445);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5557519102902,129.33223214224);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5519186005881,129.294315673754);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554069457881,129.323716277991);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5595433015588,129.330999174721);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5550569604314,129.320937839878);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.554912851309,129.309814962967);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5670416061212,129.343579409824);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.551201465743,129.344960103459);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.550728177293,129.297740447042);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5543610285168,129.32895978774);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5737697423765,129.346663760628);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5550156900098,129.320668343771);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5737031009426,129.339492183979);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5566892270209,129.324606636769);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5628553677495,129.333126772771);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5532010038699,129.335537722265);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5578632758367,129.348491128441);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554170935054,129.307104916498);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5595549740192,129.348635807487);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5544762219447,129.309625262496);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542913984487,129.336864363195);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5690145659965,129.342348292335);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5572615474971,129.281238429722);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5682501821946,129.34501156053);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5568968726214,129.280839709304);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545751854498,129.317229970148);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5518532298991,129.296341980839);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5539917575834,129.314057094299);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5803461904805,129.339169498654);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5561726938945,129.330120044097);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5678231274011,129.34471695491);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5590510974506,129.311268507303);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5582251530473,129.311518407089);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5551548108473,129.323391107358);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5533894232503,129.318172593113);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5554069457881,129.323716277991);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5597949667963,129.32052082066);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5549253219314,129.321041897779);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5528840955189,129.301361115117);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5578112480089,129.332416225903);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5649990627341,129.268178671647);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542913984487,129.336864363195);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5567930691575,129.284594740816);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545466579901,129.309773505266);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5542913984487,129.336864363195);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5578112480089,129.332416225903);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5785412024384,129.318084677252);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5785412024384,129.318084677252);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5782925193946,129.317970326995);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5783416011072,129.317867266333);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5769537440559,129.318257276273);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5765645675779,129.317623813047);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5562940461166,129.296895122662);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5746653113204,129.304572383906);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5680684926126,129.345870238064);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.57680292937,129.317701819589);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5677993824542,129.347006129308);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5531385767059,129.322652552456);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610090142039,129.308909949057);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5677993824542,129.347006129308);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5809000681937,129.321810986669);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5701986192281,129.341592341856);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5742465134025,129.347908560173);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.564037481296,129.330402468806);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5564533344204,129.345074261922);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5581447150301,129.270501256904);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5633419252308,129.337446795535);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5556951210741,129.313980663461);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5890916504358,129.342495581316);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5519897368883,129.300253113774);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5564346941501,129.336965414856);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5787268945138,129.311760888523);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5608241842405,129.342766286374);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5543377733981,129.320740568252);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5644515070799,129.334684041662);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5565895849449,129.330988736844);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5552562375523,129.320658044998);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5689659700239,129.343672327493);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5553106711176,129.318784959145);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5581183894788,129.328603324131);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5605781918542,129.338905161615);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5564472142417,129.314886869925);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5573635948497,129.32732535695);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5598319594579,129.330548111133);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5517319976654,129.287572995308);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5680684926126,129.345870238064);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5522976674435,129.334944127208);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5548577914551,129.311384522421);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5573361854997,129.27069621267);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5703626456611,129.336383621246);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5557586559336,129.28725797674);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5798006183202,129.264911710709);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5602741837629,129.320865375814);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.558009864325,129.333770480203);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5520564458152,129.293183737568);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5646048495608,129.350691671468);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5536505867562,129.347962293058);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5565686442965,129.331285434515);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5513585137252,129.347610725463);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5656045938161,129.351272482428);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5530148494755,129.345269372623);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5525859956341,129.337708441723);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5659387864432,129.32660969092);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538929248244,129.321634347443);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.554052537031,129.321628375998);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5545214964625,129.318500257885);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5575807116414,129.339121664932);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5538038153539,129.325795010306);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.572952733645,129.346944256039);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5570534478498,129.27238785356);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5624374008108,129.335067433385);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5614980171375,129.31126652201);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5822001559674,129.342054003433);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5701424985103,129.338745087532);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.562563256673,129.266226244766);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.553970169518,129.32695266272);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5569362121516,129.27393453746);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5678766430691,129.348492837632);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5561513479137,129.340959330929);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5596203711594,129.349354441458);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5588657866746,129.34708227457);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5505830696321,129.290040987766);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5735591764057,129.310288143716);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5610217522723,129.328383271754);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5539435582441,129.321627302067);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5768187734587,129.349255739323);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5614539255148,129.316700225577);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5546528036086,129.315666849852);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5513016946455,129.291005594513);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5649990627341,129.268178671647);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.573307178118,129.343997049456);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
        map = new LatLng(35.5663764398404,129.344014845118);mMap.addMarker(new MarkerOptions().position(map).icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));
    }


    //원래대로
    public void onClick4(View v){
        mMap.clear();
    }


    //공폐가 현황
    public void onClick5(View v) {

        Polygon polygon1 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56122, 129.33127),
                        new LatLng(35.56005, 129.32941),
                        new LatLng(35.55987, 129.32959),
                        new LatLng(35.55978, 129.32932),
                        new LatLng(35.55949, 129.3294),
                        new LatLng(35.5597, 129.33009),
                        new LatLng(35.5597, 129.33009),
                        new LatLng(35.55879, 129.33133),
                        new LatLng(35.55902, 129.33142),
                        new LatLng(35.55832, 129.33322),
                        new LatLng(35.55858, 129.33359))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));


        Polygon polygon2 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55404, 129.32414),
                        new LatLng(35.55367, 129.32401),
                        new LatLng(35.55318, 129.32387),
                        new LatLng(35.55276, 129.3238),
                        new LatLng(35.55246, 129.32713),
                        new LatLng(35.55377, 129.32732))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));

        Polygon polygon3 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55809, 129.31214),
                        new LatLng(35.55771, 129.31138),
                        new LatLng(35.55678, 129.3117),
                        new LatLng(35.5564, 129.31106),
                        new LatLng(35.55589, 129.31077),
                        new LatLng(35.55579, 129.31218),
                        new LatLng(35.55634, 129.31376))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));


        Polygon polygon4 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55573, 129.31232),
                        new LatLng(35.55505, 129.31337),
                        new LatLng(35.55585, 129.31553),
                        new LatLng(35.55601, 129.31651),
                        new LatLng(35.55673, 129.31609),
                        new LatLng(35.55713, 129.31601))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));

        Polygon polygon5 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55462, 129.31532),
                        new LatLng(35.5542, 129.31394),
                        new LatLng(35.55325, 129.31437),
                        new LatLng(35.55402, 129.31574))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));

        Polygon polygon6 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55462, 129.31532),
                        new LatLng(35.55546, 129.31467),
                        new LatLng(35.55581, 129.31578),
                        new LatLng(35.55508, 129.31638))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 107, 153, 0)));

        Polygon polygon7 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56225, 129.32212),
                        new LatLng(35.55792, 129.32356),
                        new LatLng(35.5589, 129.32603),
                        new LatLng(35.5588, 129.32755),
                        new LatLng(35.55942, 129.32816),
                        new LatLng(35.56144, 129.32799),
                        new LatLng(35.56311, 129.3265))
                .strokeColor(Color.BLUE)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 61, 183, 204)));

        Polygon polygon8 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56224, 129.32201),
                        new LatLng(35.56149, 129.31912),
                        new LatLng(35.55984, 129.31561),
                        new LatLng(35.5576, 129.31708),
                        new LatLng(35.55593, 129.31722),
                        new LatLng(35.55589, 129.31783),
                        new LatLng(35.55735, 129.32028),
                        new LatLng(35.55726, 129.32147),
                        new LatLng(35.55733, 129.32198),
                        new LatLng(35.55787, 129.32348))
                .strokeColor(Color.BLUE)
                .strokeWidth(2)
                .fillColor(Color.argb(70, 61, 183, 204)));

        BitmapDrawable bitmapdraw3 = (BitmapDrawable) getResources().getDrawable(R.drawable.gpg);
        Bitmap b3 = bitmapdraw3.getBitmap();
        Bitmap smallMarker3 = Bitmap.createScaledBitmap(b3, 110, 80, false);

        LatLng map = new LatLng(35.56009, 129.33136);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성동지역주택조합")
                .snippet("220가구 중 76가구 공폐가" +
                        " / 부분철거 진행에 따른 가림막 설치/잠금장치 보완")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));


        map = new LatLng(35.5533, 129.32507);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("옥교동지역주택조합")
                .snippet("200가구 중 14가구 공폐가" +
                        " / 11월 공가 다수발생 예정")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55607, 129.31434);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("우정동지역주택조합")
                .snippet("200가구 중 철거 150가구 40가구 공폐가" +
                        " / 부분철거 진행에 따른 가림막 설치/잠금장치 보완")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.554, 129.31476);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("동원개발")
                .snippet("170가구 중 철거 146가구 40가구 공폐가" +
                        " / 토지 매입중 및 10월 착공 예정")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55668, 129.31224);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("우정뉴시티지역주택조합")
                .snippet("철거완료")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55945, 129.31938);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("B-04 재개발지역")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.5607, 129.32518);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("B-05 재개발지역")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3))
                .snippet("번영로 센트리지 착공)" +
                        " 2,625세대 / `23년 9월 완공 예정"));
    }

    //CPTED 사업지 현황
    public void onClick20(View v) {
//태화강먹거리단지
        Polygon polygon20 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55585, 129.27693),
                        new LatLng(35.55564, 129.2762),
                        new LatLng(35.5551, 129.27584),
                        new LatLng(35.55432, 129.27938),
                        new LatLng(35.55184, 129.28674),
                        new LatLng(35.55127, 129.28833),
                        new LatLng(35.55025, 129.29026),
                        new LatLng(35.55025, 129.29026),
                        new LatLng(35.55047, 129.29082),
                        new LatLng(35.55166, 129.28855),
                        new LatLng(35.55354, 129.28844),
                        new LatLng(35.55349, 129.28683),
                        new LatLng(35.55396, 129.28672),
                        new LatLng(35.5541, 129.2856),
                        new LatLng(35.55349, 129.28539),
                        new LatLng(35.55392, 129.28358),
                        new LatLng(35.55419, 129.28353),
                        new LatLng(35.55474, 129.28133),
                        new LatLng(35.55501, 129.28138),
                        new LatLng(35.55524, 129.28047),
                        new LatLng(35.55496, 129.28037))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //학성6성프로젝트
        Polygon polygon21 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55862, 129.33364),
                        new LatLng(35.55816, 129.33296),
                        new LatLng(35.55746, 129.33262),
                        new LatLng(35.5567, 129.33533))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //군계일학
        Polygon polygon22 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55612, 129.33721),
                        new LatLng(35.55578, 129.33581),
                        new LatLng(35.55561, 129.33405),
                        new LatLng(35.55182, 129.33361),
                        new LatLng(35.5515, 129.3375),
                        new LatLng(35.55219, 129.33758),
                        new LatLng(35.55201, 129.33934),
                        new LatLng(35.5528, 129.33944),
                        new LatLng(35.55291, 129.33764),
                        new LatLng(35.55408, 129.3378),
                        new LatLng(35.55415, 129.33702))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //깨어나라 성곽도시
        Polygon polygon23 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57894, 129.34649),
                        new LatLng(35.5789, 129.34686),
                        new LatLng(35.57864, 129.34709),
                        new LatLng(35.57831, 129.34706),
                        new LatLng(35.57796, 129.34857),
                        new LatLng(35.57814, 129.34974),
                        new LatLng(35.57746, 129.35012),
                        new LatLng(35.5761, 129.35102),
                        new LatLng(35.57584, 129.35126),
                        new LatLng(35.57507, 129.35153),
                        new LatLng(35.57362, 129.35064),
                        new LatLng(35.5737, 129.3497),
                        new LatLng(35.57402, 129.34957),
                        new LatLng(35.5746, 129.34894),
                        new LatLng(35.57537, 129.34886),
                        new LatLng(35.57673, 129.3477),
                        new LatLng(35.57745, 129.34678),
                        new LatLng(35.57755, 129.3466),
                        new LatLng(35.57816, 129.34669),
                        new LatLng(35.57868, 129.34646))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        BitmapDrawable bitmapdraw20 = (BitmapDrawable) getResources().getDrawable(R.drawable.cpted);
        Bitmap b20 = bitmapdraw20.getBitmap();
        Bitmap smallMarker20 = Bitmap.createScaledBitmap(b20, 120, 120, false);

        LatLng map = new LatLng(35.55364, 129.28313);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("태화동 도시재생활성화 뉴딜사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(22년~24년)" +
                        " 태화강 먹거리단지 일원 / 사업비(200억)"));

        map = new LatLng(35.55765, 129.33379);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성6성 프로젝트 재생사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(18년~22년)" +
                        " 학성동 153-1번지 일원 / 사업비(60억)"));

        map = new LatLng(35.55372, 129.33541);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("군계일학 도시재생사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(18년~22년)" +
                        " 옥성초~가구거리 일원 / 사업비(200억)"));

        map = new LatLng(35.57653, 129.34928);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("깨어나라 성곽도시 프로젝트")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(19년~21년, 진행)" +
                        " 병영2동 108번지 일원 / 사업비(100억)"));
    }

    //여성안심 현황
    public void onClick6(View v) {

        Polygon polygon9 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57549, 129.34612),
                        new LatLng(35.57364, 129.34596),
                        new LatLng(35.57205, 129.34609),
                        new LatLng(35.57188, 129.34877),
                        new LatLng(35.57293, 129.34922),
                        new LatLng(35.57297, 129.34784),
                        new LatLng(35.57337, 129.34787),
                        new LatLng(35.57407, 129.34886),
                        new LatLng(35.57466, 129.34889),
                        new LatLng(35.5754, 129.34808))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        Polygon polygon10 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57747, 129.34648),
                        new LatLng(35.57431, 129.34593),
                        new LatLng(35.57429, 129.34352),
                        new LatLng(35.57507, 129.34296),
                        new LatLng(35.57485, 129.3406),
                        new LatLng(35.57615, 129.34168),
                        new LatLng(35.5779, 129.34565))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        Polygon polygon11 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55658, 129.28636),
                        new LatLng(35.55353, 129.28537),
                        new LatLng(35.55574, 129.27614),
                        new LatLng(35.55726, 129.27897),
                        new LatLng(35.55789, 129.28146),
                        new LatLng(35.55785, 129.28268))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        BitmapDrawable bitmapdraw4 = (BitmapDrawable) getResources().getDrawable(R.drawable.female);
        Bitmap b4 = bitmapdraw4.getBitmap();
        Bitmap smallMarker4 = Bitmap.createScaledBitmap(b4, 120, 120, false);

        LatLng map = new LatLng(35.57391, 129.34712);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("여성대상범죄 우려지역" +
                        " / CCTV 14대, 큐브형 LED 안내판 2대"));


        map = new LatLng(35.57614, 129.34394);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("성범죄 우려지역" +
                        " / CCTV 13대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55582, 129.28203);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(태화)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("다세대 밀집지역" +
                        " / CCTV 14대, 큐브형 LED 안내판 2대"));

        Polygon polygon12 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57423, 129.34589),
                        new LatLng(35.57424, 129.34351),
                        new LatLng(35.57504, 129.34289),
                        new LatLng(35.5748, 129.34052),
                        new LatLng(35.57398, 129.33932),
                        new LatLng(35.57158, 129.33985),
                        new LatLng(35.57168, 129.34113),
                        new LatLng(35.57039, 129.34135),
                        new LatLng(35.5709, 129.34607))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polygon polygon13 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56019, 129.27027),
                        new LatLng(35.55777, 129.27301),
                        new LatLng(35.5568, 129.27183),
                        new LatLng(35.55901, 129.26893))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polygon polygon14 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56399, 129.33936),
                        new LatLng(35.5621, 129.33616),
                        new LatLng(35.56054, 129.33752),
                        new LatLng(35.5624, 129.3408))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polyline polyline1 = mMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55983, 129.31555),
                        new LatLng(35.55824, 129.31645),
                        new LatLng(35.55758, 129.31699),
                        new LatLng(35.5559, 129.31718),
                        new LatLng(35.55581, 129.31785),
                        new LatLng(35.55729, 129.3202)));
        polyline1.setColor(Color.BLUE);
        polyline1.setWidth(5);

        Polyline polyline2 = mMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57675, 129.31298),
                        new LatLng(35.5776, 129.31099),
                        new LatLng(35.575, 129.30938),
                        new LatLng(35.57446, 129.31114),
                        new LatLng(35.57382, 129.31379),
                        new LatLng(35.57364, 129.31457),
                        new LatLng(35.57357, 129.31523)));
        polyline2.setColor(Color.BLUE);
        polyline2.setWidth(5);

        map = new LatLng(35.57287, 129.33955);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("선우시장 인근으로 심야시간 여성귀가 인구 多" +
                        " / CCTV 8대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55824, 129.31645);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(학성)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("유흥가 밀집지역 인근" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55923, 129.27135);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(태화)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("통학로 & 다세대주택 밀집지역" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.57639, 129.31025);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(성안)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("통학로 & 원룸밀집지역(여성1인가구)" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.56306, 129.33778);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(반구)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("여성거주인구 多" +
                        " / CCTV 7대, 큐브형 LED 안내판 2대"));
//큐브형
        BitmapDrawable bitmapdraw30 = (BitmapDrawable) getResources().getDrawable(R.drawable.bell);
        Bitmap b30 = bitmapdraw30.getBitmap();
        Bitmap smallMarker30 = Bitmap.createScaledBitmap(b30, 70, 70, false);

        map = new LatLng(35.57781, 129.34557);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57551, 129.34381);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57422, 129.34726);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57187, 129.34887);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55418, 129.28224);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55642, 129.28416);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57359, 129.33938);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55904, 129.31598);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55759, 129.31699);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55761, 129.27283);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55997, 129.27);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.56401, 129.33937);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.56311, 129.33787);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.5771, 129.31209);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57503, 129.30935);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));
    }

    //탄력순찰
    public void onClick7(View v) {

        BitmapDrawable bitmapdraw = (BitmapDrawable) getResources().getDrawable(R.drawable.ts);
        Bitmap b = bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 60, 60, false);

        LatLng map = new LatLng(35.5815738251039,129.337051152836);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.560180022713,129.311213719623);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));


        map = new LatLng(35.5602118274961,129.312347997483);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));


        map = new LatLng(35.5599844015702,129.31078299627);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55934,129.29954);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5630242095723,129.330261944155);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5783046219181,129.346567730165);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5608720493881,129.328078005575);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5565723461665,129.34016856192);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5561390342994,129.345634396725);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.556790046075,129.344116727048);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5514618523675,129.34559196086);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5758801545826,129.318913310363);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5541231236588,129.32011929235);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5544723334121,129.348416778077);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5768420302677,129.321964560791);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5668970230712,129.351540167261);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5647057698346,129.344152505496);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5606679617317,129.337328616247);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55451,129.28465);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5524175633282,129.301625472319);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.56121,129.29971);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.556295632415,129.30645220179);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55871,129.30544);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));
    }

    //기타요소
    public void onClick8(View v){
        Polygon polygon15 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.5980272560593,129.331981197784),
                        new LatLng(35.5976455915817,129.331767389612),
                        new LatLng(35.5971140752712,129.331453388384),
                        new LatLng(35.5969176337586,129.33121392452),
                        new LatLng(35.5963826537568,129.330999119178),
                        new LatLng(35.5960443101526,129.331107573923),
                        new LatLng(35.5958501467377,129.331303649406),
                        new LatLng(35.5957175568352,129.331483224095),
                        new LatLng(35.595501540767,129.331775552242),
                        new LatLng(35.5952658908604,129.332107637851),
                        new LatLng(35.595120531954,129.332292013169),
                        new LatLng(35.5949484490841,129.332547680094),
                        new LatLng(35.5948573433022,129.332686390226),
                        new LatLng(35.5946350241673,129.333063684252),
                        new LatLng(35.5945171875438,129.333259547958),
                        new LatLng(35.5944201224916,129.333480150932),
                        new LatLng(35.5942156259083,129.334064822035),
                        new LatLng(35.5941502876522,129.334181177996),
                        new LatLng(35.5941354976331,129.33426867478),
                        new LatLng(35.5941245000626,129.334327648673),
                        new LatLng(35.594101085835,129.334453503196),
                        new LatLng(35.5941046730543,129.334645993287),
                        new LatLng(35.5941397998141,129.334991448932),
                        new LatLng(35.5941456636437,129.33504506309),
                        new LatLng(35.5941950569478,129.335322664013),
                        new LatLng(35.5943325967454,129.335752804627),
                        new LatLng(35.5945230356377,129.336141385262),
                        new LatLng(35.5949083711573,129.336688714917),
                        new LatLng(35.5949827533586,129.336795687198),
                        new LatLng(35.5950958602136,129.336989640909),
                        new LatLng(35.5952025698429,129.337237534197),
                        new LatLng(35.5952237530733,129.337292283714),
                        new LatLng(35.5957469413939,129.338397695892),
                        new LatLng(35.5959222583008,129.338839982705),
                        new LatLng(35.5960800600878,129.339291755058),
                        new LatLng(35.5961087490825,129.339424297373),
                        new LatLng(35.5962184743179,129.340060172024),
                        new LatLng(35.5963519176758,129.3408091471),
                        new LatLng(35.5964310388009,129.341273803309),
                        new LatLng(35.5965218768596,129.341910518998),
                        new LatLng(35.5965351365015,129.342315335966),
                        new LatLng(35.5965284486484,129.342499941907),
                        new LatLng(35.5965175218128,129.342815793423),
                        new LatLng(35.5964901084412,129.343566629468),
                        new LatLng(35.5964699116151,129.344047706966),
                        new LatLng(35.5964472666418,129.344517340358),
                        new LatLng(35.5964418351706,129.344629929624),
                        new LatLng(35.5963859087825,129.345434410178),
                        new LatLng(35.5963503791864,129.345827805288),
                        new LatLng(35.5963175945112,129.345913393182),
                        new LatLng(35.5961631280647,129.346318483368),
                        new LatLng(35.5960378727875,129.346576178562),
                        new LatLng(35.595943265051,129.346770635701),
                        new LatLng(35.595893758911,129.346868831324),
                        new LatLng(35.5958720830487,129.346911988378),
                        new LatLng(35.5958646127518,129.346926943199),
                        new LatLng(35.5955202347852,129.34747474595),
                        new LatLng(35.5954392680768,129.347626848301),
                        new LatLng(35.5953725964082,129.347760394269),
                        new LatLng(35.5953145450672,129.347892818392),
                        new LatLng(35.5952990756263,129.347927879151),
                        new LatLng(35.5952164078915,129.348116480177),
                        new LatLng(35.5951655902053,129.348231531329),
                        new LatLng(35.5951385297383,129.348225565549),
                        new LatLng(35.5949138692539,129.348150048906),
                        new LatLng(35.5948001949442,129.348109498388),
                        new LatLng(35.5946685778296,129.348186678461),
                        new LatLng(35.594481587065,129.348295678494),
                        new LatLng(35.5944151162379,129.348324769071),
                        new LatLng(35.5941879827229,129.348463292505),
                        new LatLng(35.593828316351,129.348596210532),
                        new LatLng(35.5934391793485,129.34865862545),
                        new LatLng(35.5933935468718,129.348406638099),
                        new LatLng(35.5934810285454,129.348274388613),
                        new LatLng(35.593751770476,129.348145423251),
                        new LatLng(35.59339743466,129.348148861185),
                        new LatLng(35.5932630210424,129.348139077756),
                        new LatLng(35.5932190015866,129.348193988993),
                        new LatLng(35.5930134306621,129.348454150302),
                        new LatLng(35.5927433021602,129.348457641348),
                        new LatLng(35.5922210110412,129.348792676812),
                        new LatLng(35.5916980142689,129.348809464434),
                        new LatLng(35.5912068159079,129.348661343995),
                        new LatLng(35.5909346844534,129.348796819498),
                        new LatLng(35.5908749044924,129.34879369204),
                        new LatLng(35.5908069222835,129.3487779268),
                        new LatLng(35.5902789655829,129.348767325427),
                        new LatLng(35.5900699656301,129.348762604389),
                        new LatLng(35.5899229134253,129.348743827271),
                        new LatLng(35.5895790723652,129.348693103151),
                        new LatLng(35.5890706051283,129.348694460494),
                        new LatLng(35.589069104101,129.348301737056),
                        new LatLng(35.5876023220942,129.348295453895),
                        new LatLng(35.5862878913113,129.348289486249),
                        new LatLng(35.5858669209532,129.348287891193),
                        new LatLng(35.5856456997198,129.348382783781),
                        new LatLng(35.5853801143978,129.348420534887),
                        new LatLng(35.585188516605,129.348454577407),
                        new LatLng(35.5851088472184,129.348475011681),
                        new LatLng(35.5847829962619,129.348556165692),
                        new LatLng(35.5839959946194,129.348565590742),
                        new LatLng(35.5830137303352,129.34863895502),
                        new LatLng(35.5822867098504,129.348778708875),
                        new LatLng(35.5819976405274,129.348836117876),
                        new LatLng(35.5817011588609,129.348913289599),
                        new LatLng(35.5813428625845,129.34901142313),
                        new LatLng(35.5803881710677,129.349353431109),
                        new LatLng(35.5798667761131,129.349757717346),
                        new LatLng(35.5794963270199,129.35004645604),
                        new LatLng(35.5787159347419,129.350453515486),
                        new LatLng(35.5785389041334,129.350571061181),
                        new LatLng(35.5784083037172,129.350654460259),
                        new LatLng(35.5781137673457,129.350840609173),
                        new LatLng(35.5776875834343,129.351113570176),
                        new LatLng(35.5774080540863,129.35128121166),
                        new LatLng(35.577359570656,129.351327010446),
                        new LatLng(35.5773103631273,129.35137383214),
                        new LatLng(35.5772565538897,129.35142534505),
                        new LatLng(35.5771484786716,129.351508707053),
                        new LatLng(35.5770799249104,129.351565650252),
                        new LatLng(35.5769503693204,129.351645972442),
                        new LatLng(35.5769356118394,129.351658982809),
                        new LatLng(35.5767244544027,129.351735882074),
                        new LatLng(35.5766204719688,129.351775590798),
                        new LatLng(35.5764916864103,129.351823532616),
                        new LatLng(35.5764830848973,129.35182431162),
                        new LatLng(35.5763384292055,129.351877303619),
                        new LatLng(35.5762317798627,129.351916581088),
                        new LatLng(35.5761565933309,129.351945061523),
                        new LatLng(35.5760874776236,129.351965800907),
                        new LatLng(35.5756573068426,129.352117983842),
                        new LatLng(35.5753627305476,129.352205550208),
                        new LatLng(35.5751501567671,129.352261036016),
                        new LatLng(35.5750419291361,129.352272689503),
                        new LatLng(35.5748539412939,129.352295458552),
                        new LatLng(35.5741673210102,129.352377760582),
                        new LatLng(35.5739331047925,129.352402280333),
                        new LatLng(35.5738477764709,129.352409443637),
                        new LatLng(35.5734959030952,129.352402601747),
                        new LatLng(35.5734128741887,129.352400176384),
                        new LatLng(35.5731757438671,129.352400818954),
                        new LatLng(35.5731456479938,129.352406490977),
                        new LatLng(35.5731312359781,129.352409175301),
                        new LatLng(35.572996244432,129.352399715974),
                        new LatLng(35.5728099171486,129.352387715848),
                        new LatLng(35.5727637509225,129.352386709069),
                        new LatLng(35.5724523434541,129.352369684108),
                        new LatLng(35.5719882264952,129.352363698992),
                        new LatLng(35.571951858633,129.352344023442),
                        new LatLng(35.571864134085,129.352301131719),
                        new LatLng(35.5717970183805,129.352291240568),
                        new LatLng(35.5715818611373,129.352255659672),
                        new LatLng(35.5715477184248,129.352251903112),
                        new LatLng(35.5714065369423,129.352213655097),
                        new LatLng(35.5713880680757,129.35220725286),
                        new LatLng(35.5711247665805,129.352199893606),
                        new LatLng(35.5709785335494,129.352197005457),
                        new LatLng(35.5707753936245,129.352194862177),
                        new LatLng(35.5704319313485,129.352175172264),
                        new LatLng(35.5700603520826,129.352153285869),
                        new LatLng(35.5699998259139,129.352152547657),
                        new LatLng(35.5699418654688,129.352149823752),
                        new LatLng(35.5695634472569,129.352117735931),
                        new LatLng(35.5693493143367,129.352101820718),
                        new LatLng(35.5691500950696,129.352093593947),
                        new LatLng(35.5690955356032,129.352089925124),
                        new LatLng(35.5689954738249,129.352080111589),
                        new LatLng(35.5688575679134,129.352068500391),
                        new LatLng(35.5688066777918,129.352064593846),
                        new LatLng(35.5686226024973,129.352080935935),
                        new LatLng(35.5684916927173,129.352093648341),
                        new LatLng(35.5683806528779,129.352105222717),
                        new LatLng(35.5682362713494,129.352144430932),
                        new LatLng(35.5680675122469,129.35219120014),
                        new LatLng(35.5680361244667,129.352197870198),
                        new LatLng(35.5680053976387,129.352206628219),
                        new LatLng(35.5679953790534,129.35220805183),
                        new LatLng(35.5679168565519,129.352227468203),
                        new LatLng(35.5677333148658,129.352274150543),
                        new LatLng(35.5676689149398,129.352291223356),
                        new LatLng(35.5673905026892,129.35238718039),
                        new LatLng(35.5672150055941,129.352447874825),
                        new LatLng(35.5672024842937,129.352454406368),
                        new LatLng(35.5670300883613,129.352558282541),
                        new LatLng(35.5668908748643,129.352642787398),
                        new LatLng(35.5667587928436,129.352708204582),
                        new LatLng(35.5666583710527,129.35276006904),
                        new LatLng(35.5666251615397,129.352773228667),
                        new LatLng(35.5664984722479,129.352843975363),
                        new LatLng(35.5664493994905,129.352869079496),
                        new LatLng(35.5662709604926,129.352964840992),
                        new LatLng(35.5659549319351,129.353141372358),
                        new LatLng(35.5656625780129,129.353208304817),
                        new LatLng(35.5652413589831,129.353291463854),
                        new LatLng(35.5638977723012,129.353582009979),
                        new LatLng(35.5636608240844,129.353631266329),
                        new LatLng(35.5633204376551,129.353706435118),
                        new LatLng(35.5629505460427,129.353785577839),
                        new LatLng(35.5622259167648,129.35370890328),
                        new LatLng(35.5617916008873,129.353619005296),
                        new LatLng(35.5615227478864,129.353549456817),
                        new LatLng(35.5609335486474,129.353409198448),
                        new LatLng(35.560826464827,129.353384009223),
                        new LatLng(35.5607654200455,129.353366368145),
                        new LatLng(35.560707961428,129.35335228379),
                        new LatLng(35.5605660207949,129.353324008033),
                        new LatLng(35.5605601153516,129.35330902393),
                        new LatLng(35.5605215964545,129.353204853591),
                        new LatLng(35.5605062266201,129.353155807997),
                        new LatLng(35.5603896034532,129.352976979686),
                        new LatLng(35.5602558181475,129.352776290471),
                        new LatLng(35.5600790170506,129.352535735342),
                        new LatLng(35.5599909614574,129.352386696068),
                        new LatLng(35.5599571223538,129.352331260648),
                        new LatLng(35.5597384186209,129.351770017057),
                        new LatLng(35.559728781552,129.351751817971),
                        new LatLng(35.5596759914849,129.351635508345),
                        new LatLng(35.5596190601175,129.35146463229),
                        new LatLng(35.5595795469897,129.351317361412),
                        new LatLng(35.5595445824473,129.351189856012),
                        new LatLng(35.559542614486,129.351175330606),
                        new LatLng(35.5594447169086,129.350888495539),
                        new LatLng(35.5593737448355,129.35070067108),
                        new LatLng(35.5593399998521,129.350618696572),
                        new LatLng(35.5592839614419,129.350459573843),
                        new LatLng(35.5592091714415,129.350295064155),
                        new LatLng(35.5591465498625,129.350199154064),
                        new LatLng(35.5590448244113,129.350050754819),
                        new LatLng(35.5589621169739,129.349930820953),
                        new LatLng(35.5589184424905,129.349881643378),
                        new LatLng(35.5587538211942,129.349694541027),
                        new LatLng(35.5582484136331,129.349415810602),
                        new LatLng(35.5581311104459,129.349517493342),
                        new LatLng(35.5580608008664,129.349570920556),
                        new LatLng(35.5579191942447,129.349626410918),
                        new LatLng(35.5577672329358,129.349649889026),
                        new LatLng(35.5575106465433,129.349651713315),
                        new LatLng(35.5573075239851,129.349699546433),
                        new LatLng(35.5571253531321,129.349755566512),
                        new LatLng(35.5569331294312,129.349865405687),
                        new LatLng(35.55674595389,129.349968846352),
                        new LatLng(35.5565601238766,129.350046469645),
                        new LatLng(35.5564484026235,129.350100410939),
                        new LatLng(35.5561842263723,129.350195751323),
                        new LatLng(35.5559968073704,129.350311576536),
                        new LatLng(35.5558984473133,129.350352128765),
                        new LatLng(35.5556421701346,129.35042460259),
                        new LatLng(35.5553679219945,129.350524110946),
                        new LatLng(35.5552950308843,129.350550587878),
                        new LatLng(35.5551457052135,129.35057586188),
                        new LatLng(35.5549795057263,129.350585487655),
                        new LatLng(35.5547812987555,129.350619682661),
                        new LatLng(35.5547047241186,129.350632609061),
                        new LatLng(35.5545650755011,129.350652994139),
                        new LatLng(35.5544759815746,129.350665557319),
                        new LatLng(35.5542698279327,129.350695382534),
                        new LatLng(35.554182455436,129.35069868763),
                        new LatLng(35.5540097859964,129.35065781039),
                        new LatLng(35.553719844291,129.350514604499),
                        new LatLng(35.5534943244838,129.350374657004),
                        new LatLng(35.5533250799359,129.350259110219),
                        new LatLng(35.5532498794017,129.35020212236),
                        new LatLng(35.5529432455876,129.349983312795),
                        new LatLng(35.5528351926258,129.349906417283),
                        new LatLng(35.5527794205297,129.349863776121),
                        new LatLng(35.5527632678029,129.34985434165),
                        new LatLng(35.5526314843002,129.34978881512),
                        new LatLng(35.5524260550807,129.349658422261),
                        new LatLng(35.5523421893353,129.349699058282),
                        new LatLng(35.5521905433174,129.349778712068),
                        new LatLng(35.5520835030452,129.349837954495),
                        new LatLng(35.552159938704,129.349904288964),
                        new LatLng(35.5522438926424,129.349989087312),
                        new LatLng(35.5522349376122,129.349993659105),
                        new LatLng(35.5521400039017,129.350052567645),
                        new LatLng(35.5520327154143,129.350132136917),
                        new LatLng(35.5519720577303,129.350195495316),
                        new LatLng(35.5517569356807,129.350352898871),
                        new LatLng(35.5515402501371,129.350511640465),
                        new LatLng(35.5514867063642,129.350549362364),
                        new LatLng(35.551457286639,129.350570555676),
                        new LatLng(35.5510849155549,129.350849486237),
                        new LatLng(35.5507850643706,129.351077473484),
                        new LatLng(35.5507426996787,129.351105183991),
                        new LatLng(35.5506896173168,129.351126715336),
                        new LatLng(35.5506372859204,129.351131738265),
                        new LatLng(35.5505847862031,129.351123315109),
                        new LatLng(35.5505346559164,129.351109100573),
                        new LatLng(35.5504987783539,129.351078756191),
                        new LatLng(35.5504689505342,129.351041709923),
                        new LatLng(35.5498857430681,129.35148194396),
                        new LatLng(35.5496477028634,129.351659005574),
                        new LatLng(35.5496294191755,129.351672602865),
                        new LatLng(35.5493976648676,129.351845367086),
                        new LatLng(35.5492266571315,129.351899638741),
                        new LatLng(35.548849697492,129.352016477899),
                        new LatLng(35.5488645752713,129.351990027555),
                        new LatLng(35.5489177960233,129.351917849984),
                        new LatLng(35.5489351133306,129.351845990356),
                        new LatLng(35.5489663319081,129.351782805291),
                        new LatLng(35.5489883269585,129.351723495563),
                        new LatLng(35.5490148926778,129.351660863712),
                        new LatLng(35.5490509421133,129.351566816617),
                        new LatLng(35.5490867931397,129.351454150588),
                        new LatLng(35.5491242917296,129.351401139793),
                        new LatLng(35.5492251278592,129.351169084415),
                        new LatLng(35.5492600492901,129.351075340786),
                        new LatLng(35.5492789355793,129.351031094669),
                        new LatLng(35.5493057634107,129.350983640289),
                        new LatLng(35.5493590635774,129.350893185872),
                        new LatLng(35.5494039004434,129.350817992749),
                        new LatLng(35.549428873174,129.350735676451),
                        new LatLng(35.5494700156014,129.350669346034),
                        new LatLng(35.5495081635727,129.350597410522),
                        new LatLng(35.5495433881585,129.350517112803),
                        new LatLng(35.5495372848793,129.350483159064),
                        new LatLng(35.5496207142004,129.350356723428),
                        new LatLng(35.5497803294694,129.350142909294),
                        new LatLng(35.5498226024463,129.350090734303),
                        new LatLng(35.5498912316178,129.349661313419),
                        new LatLng(35.5499332874819,129.349425128185),
                        new LatLng(35.5498013439607,129.349483644144),
                        new LatLng(35.5496904671946,129.349544853993),
                        new LatLng(35.5497099343105,129.349427229202),
                        new LatLng(35.5497416278099,129.349339591789),
                        new LatLng(35.5497681268239,129.349259035),
                        new LatLng(35.5498027416334,129.349180454436),
                        new LatLng(35.5498585224831,129.349063879568),
                        new LatLng(35.5499192530231,129.348931266616),
                        new LatLng(35.5499871879353,129.348797824223),
                        new LatLng(35.5500348079602,129.348738568299),
                        new LatLng(35.5500538353458,129.348723274899),
                        new LatLng(35.5501244351884,129.348315268845),
                        new LatLng(35.5496947129345,129.348227970617),
                        new LatLng(35.5495547535265,129.348228018606),
                        new LatLng(35.5495564207575,129.348221871226),
                        new LatLng(35.5495615557207,129.348204102467),
                        new LatLng(35.5495680475386,129.348181541639),
                        new LatLng(35.5495795290703,129.348141564364),
                        new LatLng(35.5495825421403,129.348131319733),
                        new LatLng(35.5495829165529,129.348126501374),
                        new LatLng(35.5495836763576,129.348116180863),
                        new LatLng(35.5495861509234,129.348083179676),
                        new LatLng(35.5495883333132,129.348057743592),
                        new LatLng(35.5495944483132,129.347996930179),
                        new LatLng(35.5496191121345,129.347808130874),
                        new LatLng(35.5496226795208,129.347783770609),
                        new LatLng(35.5496236337188,129.347777940008),
                        new LatLng(35.5496582396164,129.34764248981),
                        new LatLng(35.5496606528549,129.347633941144),
                        new LatLng(35.5496640994953,129.347623367456),
                        new LatLng(35.5496660241375,129.347618599873),
                        new LatLng(35.5496728947404,129.347605349658),
                        new LatLng(35.5497979294483,129.347359516506),
                        new LatLng(35.5498040749935,129.347347630817),
                        new LatLng(35.5498214306401,129.347302307065),
                        new LatLng(35.5498218852544,129.347300941333),
                        new LatLng(35.5498223408496,129.347299233684),
                        new LatLng(35.5498247540322,129.34729069602),
                        new LatLng(35.549826430261,129.347284537608),
                        new LatLng(35.5498541925998,129.347174734661),
                        new LatLng(35.5498653351313,129.347130266548),
                        new LatLng(35.5498772856292,129.347080651011),
                        new LatLng(35.5498782497873,129.347074478504),
                        new LatLng(35.5498910156567,129.347004549697),
                        new LatLng(35.5498955753179,129.34697987371),
                        new LatLng(35.5499235537482,129.346822864248),
                        new LatLng(35.549930622189,129.346778279307),
                        new LatLng(35.5499378451021,129.346739551809),
                        new LatLng(35.5499412834176,129.34672241532),
                        new LatLng(35.5499866178142,129.346519750774),
                        new LatLng(35.5499873938067,129.346516323851),
                        new LatLng(35.5499880055931,129.346513580068),
                        new LatLng(35.5499984968169,129.346466682455),
                        new LatLng(35.549999418986,129.346462572314),
                        new LatLng(35.5500006825255,129.346455717229),
                        new LatLng(35.5500021242078,129.346446458425),
                        new LatLng(35.5500031193202,129.346438907316),
                        new LatLng(35.5500035036575,129.346433747044),
                        new LatLng(35.5500032288938,129.346425815484),
                        new LatLng(35.5499969167057,129.346316395483),
                        new LatLng(35.5499903086472,129.346200080645),
                        new LatLng(35.5499901141661,129.346195590709),
                        new LatLng(35.5499896192956,129.346192125252),
                        new LatLng(35.5499727187617,129.346068961035),
                        new LatLng(35.5499600929799,129.345979698504),
                        new LatLng(35.5499562690447,129.345952019569),
                        new LatLng(35.5499547853575,129.345941292319),
                        new LatLng(35.5499545279278,129.345939901471),
                        new LatLng(35.5499534249003,129.345931602393),
                        new LatLng(35.549952940013,129.34592779506),
                        new LatLng(35.5499519512019,129.345920533265),
                        new LatLng(35.5499512088528,129.345915346114),
                        new LatLng(35.5499507149511,129.345911538743),
                        new LatLng(35.5499504675119,129.345909806017),
                        new LatLng(35.549950240054,129.345907389532),
                        new LatLng(35.5499450666075,129.345869336882),
                        new LatLng(35.5499353497991,129.345796686598),
                        new LatLng(35.549922931977,129.345703972733),
                        new LatLng(35.5499077921075,129.345592232012),
                        new LatLng(35.549899887594,129.345535141452),
                        new LatLng(35.5498960325491,129.345508852171),
                        new LatLng(35.5498884977015,129.345454873589),
                        new LatLng(35.5498778720887,129.345378414268),
                        new LatLng(35.549864029537,129.345279451627),
                        new LatLng(35.5498498187861,129.345170494521),
                        new LatLng(35.5498431723407,129.345121019919),
                        new LatLng(35.549838524519,129.345085054229),
                        new LatLng(35.5498374324269,129.345076060348),
                        new LatLng(35.5498332595189,129.345044243864),
                        new LatLng(35.5498192850461,129.344937703356),
                        new LatLng(35.5498065981265,129.344844293735),
                        new LatLng(35.5497913535958,129.344737372872),
                        new LatLng(35.5497781790234,129.344647391476),
                        new LatLng(35.5497493104677,129.344459443561),
                        new LatLng(35.5497279486156,129.344319606218),
                        new LatLng(35.5497106993548,129.344207459974),
                        new LatLng(35.549706967297,129.344182197103),
                        new LatLng(35.5497040908881,129.344163511577),
                        new LatLng(35.5497030710414,129.344157617376),
                        new LatLng(35.5497027103162,129.344154505466),
                        new LatLng(35.5497019469475,129.34415034402),
                        new LatLng(35.5496997196703,129.344134782664),
                        new LatLng(35.5496829761584,129.344025407104),
                        new LatLng(35.5496720457675,129.343957550029),
                        new LatLng(35.5496458714187,129.343804478917),
                        new LatLng(35.5496300785975,129.343718909611),
                        new LatLng(35.5495925930945,129.343517612931),
                        new LatLng(35.5495783144066,129.343447932911),
                        new LatLng(35.5495696065994,129.343403567633),
                        new LatLng(35.5495387158856,129.343254160786),
                        new LatLng(35.5495347556016,129.343233022142),
                        new LatLng(35.5495245590511,129.34311281054),
                        new LatLng(35.549518672604,129.343046133235),
                        new LatLng(35.5495179610787,129.34303956756),
                        new LatLng(35.549516342893,129.343028497931),
                        new LatLng(35.5495144133928,129.343019136582),
                        new LatLng(35.5495133605738,129.343015315848),
                        new LatLng(35.5495071459798,129.342994454433),
                        new LatLng(35.5495015805491,129.342976717171),
                        new LatLng(35.5494772839733,129.342908130899),
                        new LatLng(35.5493709518943,129.342619717748),
                        new LatLng(35.5493692179447,129.342614504404),
                        new LatLng(35.549360648801,129.34242541983),
                        new LatLng(35.5493443979346,129.342109307372),
                        new LatLng(35.5493438534686,129.3421010218),
                        new LatLng(35.5493462925954,129.3419970225),
                        new LatLng(35.5493588789343,129.341472251709),
                        new LatLng(35.549360060427,129.341411284769),
                        new LatLng(35.5493607034768,129.34137823161),
                        new LatLng(35.5493611471443,129.341355148417),
                        new LatLng(35.5493616097677,129.341331734413),
                        new LatLng(35.5493624541853,129.341287994368),
                        new LatLng(35.5493644361079,129.341186055632),
                        new LatLng(35.5493661162061,129.341092034911),
                        new LatLng(35.5493673998008,129.341033152995),
                        new LatLng(35.5493674777014,129.340963887088),
                        new LatLng(35.5493677445578,129.340913934904),
                        new LatLng(35.5493687749071,129.340868133088),
                        new LatLng(35.5493660700988,129.340695419344),
                        new LatLng(35.5493630989038,129.340514774167),
                        new LatLng(35.5493630912494,129.340507880601),
                        new LatLng(35.549366501043,129.340484545178),
                        new LatLng(35.5494236430803,129.340217426737),
                        new LatLng(35.549485791875,129.339910136838),
                        new LatLng(35.5494957072845,129.339849096185),
                        new LatLng(35.5495121502314,129.339777891525),
                        new LatLng(35.5495365720204,129.339709345418),
                        new LatLng(35.549560276496,129.339677988344),
                        new LatLng(35.549593991765,129.339638301767),
                        new LatLng(35.5496053207576,129.339613135481),
                        new LatLng(35.549615523155,129.339558989462),
                        new LatLng(35.5496172968532,129.339540433942),
                        new LatLng(35.5496185223713,129.339527710825),
                        new LatLng(35.5496199339172,129.339512936966),
                        new LatLng(35.5496202860611,129.339509508211),
                        new LatLng(35.5496204631073,129.339507446402),
                        new LatLng(35.5496211883604,129.339499541159),
                        new LatLng(35.5496231291227,129.339479265705),
                        new LatLng(35.5496386322171,129.339318793605),
                        new LatLng(35.5496695981663,129.33899267612),
                        new LatLng(35.5497404790192,129.338256288073),
                        new LatLng(35.5497961614771,129.337657629511),
                        new LatLng(35.5498329362234,129.33726381248),
                        new LatLng(35.5498476696929,129.33710675553),
                        new LatLng(35.549853797976,129.337052139826),
                        new LatLng(35.5498597162109,129.337008211042),
                        new LatLng(35.5498708695769,129.336919633676),
                        new LatLng(35.5498815850922,129.336845856356),
                        new LatLng(35.5499434413237,129.336400722249),
                        new LatLng(35.550078737408,129.335514922956),
                        new LatLng(35.5500959962246,129.335408590494),
                        new LatLng(35.5501007335716,129.33536772283),
                        new LatLng(35.5501729959132,129.334544187085),
                        new LatLng(35.5501868805303,129.334379878891),
                        new LatLng(35.5501945309191,129.334312209789),
                        new LatLng(35.5502135583322,129.334165625548),
                        new LatLng(35.5502832733669,129.333655245682),
                        new LatLng(35.5503381360188,129.333257792921),
                        new LatLng(35.5503392465183,129.333244043348),
                        new LatLng(35.5503434286099,129.33322452682),
                        new LatLng(35.5503857111211,129.333054831131),
                        new LatLng(35.5504837530908,129.332652437234),
                        new LatLng(35.550552448333,129.332376687513),
                        new LatLng(35.5505552114945,129.332365051379),
                        new LatLng(35.5506149718045,129.332063542913),
                        new LatLng(35.5506883973245,129.33169592205),
                        new LatLng(35.550706805696,129.331603071133),
                        new LatLng(35.5507239975202,129.33152982625),
                        new LatLng(35.5502341858074,129.328823713777),
                        new LatLng(35.5502210303764,129.328738907485),
                        new LatLng(35.5502005174324,129.328598404052),
                        new LatLng(35.5501683789832,129.328373839719),
                        new LatLng(35.5501507646115,129.328257900495),
                        new LatLng(35.5501463995417,129.328228830373),
                        new LatLng(35.550144510567,129.328217395868),
                        new LatLng(35.5501389796809,129.328182784077),
                        new LatLng(35.5501152228887,129.328034955036),
                        new LatLng(35.5501033961775,129.327961901079),
                        new LatLng(35.5500874202615,129.327863230252),
                        new LatLng(35.5500674312108,129.327738601213),
                        new LatLng(35.5500485652729,129.327621929237),
                        new LatLng(35.5500297091605,129.327504915433),
                        new LatLng(35.5500289560797,129.327500070323),
                        new LatLng(35.550028368022,129.327494200115),
                        new LatLng(35.5500209568296,129.327418175128),
                        new LatLng(35.5500160283445,129.327367374211),
                        new LatLng(35.550013204306,129.327338354541),
                        new LatLng(35.5500121525494,129.327327287446),
                        new LatLng(35.55001181219,129.327323149913),
                        new LatLng(35.5500115862376,129.327320038609),
                        new LatLng(35.5500073091632,129.327271666884),
                        new LatLng(35.5500020327626,129.327209492907),
                        new LatLng(35.5499957862917,129.327139362567),
                        new LatLng(35.5499855930076,129.32702535098),
                        new LatLng(35.5499786359035,129.326947960223),
                        new LatLng(35.5499742234721,129.32689958799),
                        new LatLng(35.5499699154362,129.326852605932),
                        new LatLng(35.5499670393693,129.326819438902),
                        new LatLng(35.5499648123046,129.326796289503),
                        new LatLng(35.5499629473321,129.326775910034),
                        new LatLng(35.5499615560678,129.326760363506),
                        new LatLng(35.5499607410843,129.326751723926),
                        new LatLng(35.5499600404826,129.326744121603),
                        new LatLng(35.5499594623542,129.326737898494),
                        new LatLng(35.5499591229267,129.326733408017),
                        new LatLng(35.5499586492141,129.326728575077),
                        new LatLng(35.5499584014989,129.326726842407),
                        new LatLng(35.5499577207683,129.326718556321),
                        new LatLng(35.5499552776518,129.326691953746),
                        new LatLng(35.5499471559712,129.326601774875),
                        new LatLng(35.5499438978322,129.32656653273),
                        new LatLng(35.5499397121426,129.326520929918),
                        new LatLng(35.5499337733939,129.326463562333),
                        new LatLng(35.5499298755538,129.326424854279),
                        new LatLng(35.5499172855598,129.326303531519),
                        new LatLng(35.54989561925,129.326098224892),
                        new LatLng(35.5498932251644,129.326076795498),
                        new LatLng(35.5498915505055,129.325958891935),
                        new LatLng(35.5498867002864,129.325560412289),
                        new LatLng(35.5498870364676,129.325535949697),
                        new LatLng(35.5498875271852,129.325517708495),
                        new LatLng(35.5499029006859,129.325385137814),
                        new LatLng(35.5499497468979,129.324985387879),
                        new LatLng(35.5499726400407,129.324791356372),
                        new LatLng(35.5499768036577,129.324758052233),
                        new LatLng(35.5499914670259,129.32461098532),
                        new LatLng(35.5500358900061,129.324132262771),
                        new LatLng(35.5500495995628,129.323991026553),
                        new LatLng(35.5500597568307,129.323880361577),
                        new LatLng(35.5500671810442,129.323787200886),
                        new LatLng(35.5500687371453,129.323764838767),
                        new LatLng(35.550088825846,129.323445640708),
                        new LatLng(35.5501172663619,129.322985747086),
                        new LatLng(35.5501190319468,129.322952378068),
                        new LatLng(35.55014811648,129.32270682816),
                        new LatLng(35.5502087766969,129.322203759392),
                        new LatLng(35.5502265263429,129.322064369565),
                        new LatLng(35.5502859119719,129.321700810536),
                        new LatLng(35.5502923605703,129.321665507771),
                        new LatLng(35.5502933857443,129.321656235796),
                        new LatLng(35.5503022733775,129.321574816139),
                        new LatLng(35.5503101968951,129.321506815888),
                        new LatLng(35.550313811636,129.321472803348),
                        new LatLng(35.5503538076512,129.321040814849),
                        new LatLng(35.5503572277478,129.321001970445),
                        new LatLng(35.5503825317355,129.32061675578),
                        new LatLng(35.5503862726107,129.320575861072),
                        new LatLng(35.5503973549235,129.320226756557),
                        new LatLng(35.5503978841404,129.320220923886),
                        new LatLng(35.5503987008959,129.320215434277),
                        new LatLng(35.5504003775532,129.320208591407),
                        new LatLng(35.5504026635616,129.320199699405),
                        new LatLng(35.5504774577836,129.31998613842),
                        new LatLng(35.5504818233031,129.319971441917),
                        new LatLng(35.5504831178298,129.319962523917),
                        new LatLng(35.5505036476074,129.319810459813),
                        new LatLng(35.5505489198745,129.319484398661),
                        new LatLng(35.5505513420964,129.319468271594),
                        new LatLng(35.5505555872659,129.319430831073),
                        new LatLng(35.5505577960988,129.31940333141),
                        new LatLng(35.5505731670557,129.319197365947),
                        new LatLng(35.5505818437661,129.319075630871),
                        new LatLng(35.5505910742779,129.318924966705),
                        new LatLng(35.5505988512614,129.318799069779),
                        new LatLng(35.5506068048039,129.318671110944),
                        new LatLng(35.5506117219742,129.318583718884),
                        new LatLng(35.5506163082303,129.318498741045),
                        new LatLng(35.5506184972242,129.318458137813),
                        new LatLng(35.5506195763681,129.318438531015),
                        new LatLng(35.5506204364457,129.318423390437),
                        new LatLng(35.5506208312958,129.318417204254),
                        new LatLng(35.5506210485899,129.318413410847),
                        new LatLng(35.5506212775656,129.31840860274),
                        new LatLng(35.5506213289855,129.318406187408),
                        new LatLng(35.5506219618528,129.318395182124),
                        new LatLng(35.5506222116102,129.318389326265),
                        new LatLng(35.5506226362257,129.318382103394),
                        new LatLng(35.5506228543886,129.318377979094),
                        new LatLng(35.5506229067067,129.318375221841),
                        new LatLng(35.5506231447238,129.31837040274),
                        new LatLng(35.5506233628862,129.31836627844),
                        new LatLng(35.5506240065903,129.318354578319),
                        new LatLng(35.5506240697194,129.318351137258),
                        new LatLng(35.550624276171,129.318348038687),
                        new LatLng(35.5506244943327,129.318343914387),
                        new LatLng(35.5506247125232,129.318339779058),
                        new LatLng(35.5506253968028,129.318326358441),
                        new LatLng(35.5506261442086,129.318309496763),
                        new LatLng(35.5506281474416,129.318270955369),
                        new LatLng(35.550629536707,129.318243088439),
                        new LatLng(35.5506312081754,129.318207303196),
                        new LatLng(35.5506328273487,129.318174264175),
                        new LatLng(35.5506351316685,129.318127462611),
                        new LatLng(35.5506394679386,129.318041446931),
                        new LatLng(35.550643047806,129.317972281861),
                        new LatLng(35.5506507068866,129.317815368386),
                        new LatLng(35.5506576311578,129.31766016162),
                        new LatLng(35.55066058887,129.317594424355),
                        new LatLng(35.5506615858913,129.317571706797),
                        new LatLng(35.550662810953,129.317544523048),
                        new LatLng(35.5506638277854,129.317521121717),
                        new LatLng(35.5506645859143,129.317503565186),
                        new LatLng(35.5506648139574,129.317499098995),
                        new LatLng(35.5506650528358,129.317493937967),
                        new LatLng(35.5506652917429,129.317488765909),
                        new LatLng(35.5506655621729,129.317481884349),
                        new LatLng(35.5506658524229,129.317474319017),
                        new LatLng(35.5506662562671,129.317468121831),
                        new LatLng(35.5506664960405,129.317462618881),
                        new LatLng(35.5506665483377,129.317459861626),
                        new LatLng(35.5506667971245,129.317454358712),
                        new LatLng(35.5506675543475,129.317437144101),
                        new LatLng(35.5506690074474,129.317405483127),
                        new LatLng(35.5506708463583,129.317360742273),
                        new LatLng(35.5506725473231,129.317323920302),
                        new LatLng(35.5506727654498,129.317319795997),
                        new LatLng(35.5506736983913,129.317307755069),
                        new LatLng(35.5506738741624,129.317306035103),
                        new LatLng(35.5506742058563,129.317303289973),
                        new LatLng(35.5506771983496,129.317279256654),
                        new LatLng(35.5506815672139,129.317242511322),
                        new LatLng(35.5506874160684,129.317194786064),
                        new LatLng(35.5506999844715,129.317090382707),
                        new LatLng(35.5507095404739,129.317010718489),
                        new LatLng(35.5507281241615,129.316856880792),
                        new LatLng(35.550737649391,129.316778584099),
                        new LatLng(35.5507536748723,129.31664809751),
                        new LatLng(35.550764751146,129.316562604342),
                        new LatLng(35.5507707232161,129.316515916274),
                        new LatLng(35.5507765411393,129.316469569521),
                        new LatLng(35.5508011376372,129.316273852643),
                        new LatLng(35.5508317894678,129.316026980733),
                        new LatLng(35.550865215831,129.315759846566),
                        new LatLng(35.5508989606507,129.315491345712),
                        new LatLng(35.5509026044019,129.315462847698),
                        new LatLng(35.5509247410418,129.315314615266),
                        new LatLng(35.5509513801013,129.315136884332),
                        new LatLng(35.550962463591,129.315065531081),
                        new LatLng(35.5510033185799,129.314866490427),
                        new LatLng(35.5510205011463,129.314792899701),
                        new LatLng(35.5510617860202,129.314615578303),
                        new LatLng(35.5510627386168,129.314609747193),
                        new LatLng(35.5510641040164,129.314604623602),
                        new LatLng(35.5510654370166,129.314601562475),
                        new LatLng(35.5510678984664,129.314597843943),
                        new LatLng(35.551072531175,129.314591078574),
                        new LatLng(35.551077317978,129.314583982906),
                        new LatLng(35.5510838027273,129.314568665536),
                        new LatLng(35.5510895951465,129.314545734839),
                        new LatLng(35.5511096816295,129.31447498994),
                        new LatLng(35.5511629174848,129.314291118732),
                        new LatLng(35.5512299205529,129.314057346234),
                        new LatLng(35.551264734373,129.313945318099),
                        new LatLng(35.5513354766473,129.313722335765),
                        new LatLng(35.5513427687617,129.313701517469),
                        new LatLng(35.5514194202827,129.313500760886),
                        new LatLng(35.5514414579951,129.313445564194),
                        new LatLng(35.5514986465224,129.313297653482),
                        new LatLng(35.5515873169363,129.313050021158),
                        new LatLng(35.5517489832492,129.312637706019),
                        new LatLng(35.5517738018522,129.312577081823),
                        new LatLng(35.5517971100099,129.312521922633),
                        new LatLng(35.5518902555055,129.312268559175),
                        new LatLng(35.5518913009134,129.312265143907),
                        new LatLng(35.5519116975911,129.312185442557),
                        new LatLng(35.5519366758447,129.312087261506),
                        new LatLng(35.5519563172375,129.312010281567),
                        new LatLng(35.5519657706388,129.311972650509),
                        new LatLng(35.551981286335,129.311912100371),
                        new LatLng(35.5519825065467,129.311907307016),
                        new LatLng(35.5519851135927,129.311896022324),
                        new LatLng(35.5519865202725,129.311888825142),
                        new LatLng(35.5519869861706,129.311886422393),
                        new LatLng(35.5519996072355,129.31181580168),
                        new LatLng(35.5520443095078,129.311562768582),
                        new LatLng(35.5520704107476,129.31141326874),
                        new LatLng(35.5520930371603,129.311282969758),
                        new LatLng(35.5521182479886,129.311143095537),
                        new LatLng(35.5521468828591,129.3109860937),
                        new LatLng(35.5521635691478,129.310894222395),
                        new LatLng(35.5521664039542,129.31087844929),
                        new LatLng(35.5521695271734,129.310862688322),
                        new LatLng(35.552174968951,129.310835619432),
                        new LatLng(35.552189222762,129.310767795263),
                        new LatLng(35.5521985428865,129.310722232828),
                        new LatLng(35.5522047380164,129.310693126251),
                        new LatLng(35.5522081415178,129.310677024414),
                        new LatLng(35.5522118748058,129.310658861221),
                        new LatLng(35.55221465744,129.310645845412),
                        new LatLng(35.5522169750765,129.310634890437),
                        new LatLng(35.5522185168889,129.310627693731),
                        new LatLng(35.5522191476419,129.310624265805),
                        new LatLng(35.5522196126095,129.310622216),
                        new LatLng(35.5522206885485,129.310617422057),
                        new LatLng(35.552221940163,129.3106109081),
                        new LatLng(35.5522259636096,129.310592073181),
                        new LatLng(35.5522286011381,129.310579398742),
                        new LatLng(35.5522295526633,129.310573909427),
                        new LatLng(35.5522329983695,129.310555403188),
                        new LatLng(35.5522781240283,129.310280332203),
                        new LatLng(35.5523204551265,129.310040325822),
                        new LatLng(35.5523620615647,129.309808566909),
                        new LatLng(35.5523687434881,129.309768784952),
                        new LatLng(35.5524124670547,129.309544324745),
                        new LatLng(35.5524135842775,129.309537468308),
                        new LatLng(35.5524769134305,129.309348026152),
                        new LatLng(35.5525315457516,129.309179022324),
                        new LatLng(35.5526316810745,129.308854171136),
                        new LatLng(35.5526761684754,129.308714854105),
                        new LatLng(35.5526849888687,129.308688227965),
                        new LatLng(35.5527351442705,129.308531835671),
                        new LatLng(35.5527726401967,129.308412301745),
                        new LatLng(35.5528053074563,129.30831640895),
                        new LatLng(35.5529080290337,129.308040561362),
                        new LatLng(35.5531689076874,129.307321272554),
                        new LatLng(35.5531855150992,129.307270056296),
                        new LatLng(35.5531887416492,129.30725601609),
                        new LatLng(35.553191059305,129.307237825078),
                        new LatLng(35.5531932223411,129.307213070515),
                        new LatLng(35.5531972685528,129.306847214419),
                        new LatLng(35.5531971563365,129.306831021672),
                        new LatLng(35.5531971476243,129.306823785833),
                        new LatLng(35.5531823383969,129.30656008606),
                        new LatLng(35.5531819770146,129.306549727342),
                        new LatLng(35.5531719930557,129.306423669602),
                        new LatLng(35.5531694318013,129.306395676312),
                        new LatLng(35.553167924219,129.306378750293),
                        new LatLng(35.5531675732626,129.306374954579),
                        new LatLng(35.5531631729632,129.306332780537),
                        new LatLng(35.5531546621694,129.306255007553),
                        new LatLng(35.5531319795815,129.306042425197),
                        new LatLng(35.5531281691049,129.306005790574),
                        new LatLng(35.5531260410032,129.305984703845),
                        new LatLng(35.5531225597192,129.305960479427),
                        new LatLng(35.5530630466848,129.305611767012),
                        new LatLng(35.5530620133233,129.305606909832),
                        new LatLng(35.5529579093017,129.305300330329),
                        new LatLng(35.5529492388209,129.305274928241),
                        new LatLng(35.5528945827698,129.305165843357),
                        new LatLng(35.5527414676379,129.3048740703),
                        new LatLng(35.5526233050313,129.304669435495),
                        new LatLng(35.5526001835288,129.304626728065),
                        new LatLng(35.5525926589639,129.304615151204),
                        new LatLng(35.552420941818,129.304375559827),
                        new LatLng(35.5523242229434,129.304242537222),
                        new LatLng(35.5523020834537,129.304214327278),
                        new LatLng(35.5522544523256,129.30415748672),
                        new LatLng(35.5522467414001,129.304148313806),
                        new LatLng(35.5521765463675,129.304056357059),
                        new LatLng(35.5521445959131,129.304011686604),
                        new LatLng(35.5520252930437,129.303837007867),
                        new LatLng(35.5517894368392,129.303490827874),
                        new LatLng(35.5517384784147,129.303416316607),
                        new LatLng(35.5516745161632,129.303322476262),
                        new LatLng(35.5516686348746,129.303313354474),
                        new LatLng(35.5516668266528,129.303311924827),
                        new LatLng(35.5516088963006,129.303293033881),
                        new LatLng(35.5514758455891,129.303248216699),
                        new LatLng(35.5514203028745,129.303229742902),
                        new LatLng(35.5513497831202,129.303206017895),
                        new LatLng(35.5512822081025,129.303183417988),
                        new LatLng(35.5512494697948,129.303172485969),
                        new LatLng(35.5512328171457,129.303166842421),
                        new LatLng(35.5512158941082,129.303161186833),
                        new LatLng(35.5511851108108,129.303150659235),
                        new LatLng(35.5511831467842,129.303150254798),
                        new LatLng(35.5511813170821,129.303150203822),
                        new LatLng(35.5511167484232,129.303147325721),
                        new LatLng(35.5510088249704,129.303143546167),
                        new LatLng(35.5508838762474,129.303138941767),
                        new LatLng(35.5508330682919,129.303137493983),
                        new LatLng(35.550807297569,129.303137441539),
                        new LatLng(35.550794343748,129.303137756986),
                        new LatLng(35.5506038652201,129.303143341301),
                        new LatLng(35.550512430422,129.303145899535),
                        new LatLng(35.5504501571025,129.303147905245),
                        new LatLng(35.5504436756709,129.303148068465),
                        new LatLng(35.5504391780328,129.303147941314),
                        new LatLng(35.5504247992489,129.303148560254),
                        new LatLng(35.5504063464504,129.30314906466),
                        new LatLng(35.550379871817,129.30314934047),
                        new LatLng(35.5503711370593,129.303149440098),
                        new LatLng(35.5503642320315,129.303149579671),
                        new LatLng(35.5503580390156,129.303149755002),
                        new LatLng(35.5503541002089,129.303149640974),
                        new LatLng(35.5503433915547,129.303149678056),
                        new LatLng(35.5503249486256,129.303149840575),
                        new LatLng(35.5500787722339,129.303152105735),
                        new LatLng(35.5498864228431,129.303152465902),
                        new LatLng(35.5498682593421,129.303152629466),
                        new LatLng(35.5498230327374,129.3031540924),
                        new LatLng(35.5498083745224,129.303154710287),
                        new LatLng(35.5497662493464,129.303155920126),
                        new LatLng(35.5494236952432,129.303176442224),
                        new LatLng(35.549212633204,129.30319108179),
                        new LatLng(35.5491531307556,129.303195248604),
                        new LatLng(35.549127049248,129.303196915606),
                        new LatLng(35.5491057538226,129.303198710838),
                        new LatLng(35.5490523190797,129.303202348899),
                        new LatLng(35.5489928157736,129.303206857612),
                        new LatLng(35.5489216115126,129.303211708504),
                        new LatLng(35.5488382487014,129.303219657255),
                        new LatLng(35.548692530914,129.303233416502),
                        new LatLng(35.5486774284768,129.303235047424),
                        new LatLng(35.5485091524298,129.303258152334),
                        new LatLng(35.5484943285379,129.303260137238),
                        new LatLng(35.5482418009878,129.30330770955),
                        new LatLng(35.5480687082768,129.303339288839),
                        new LatLng(35.5480632191955,129.303339124877),
                        new LatLng(35.5479045690298,129.303351820587),
                        new LatLng(35.5477897707799,129.303361283597),
                        new LatLng(35.547772848506,129.303362521624),
                        new LatLng(35.5477650944598,129.303363341819),
                        new LatLng(35.5476978693514,129.303366586098),
                        new LatLng(35.5476110342631,129.303371686995),
                        new LatLng(35.5475088271997,129.303378064804),
                        new LatLng(35.5473900086117,129.303383972223),
                        new LatLng(35.5473048582636,129.303382219124),
                        new LatLng(35.5472714991814,129.303381608749),
                        new LatLng(35.5472670122677,129.303380797809),
                        new LatLng(35.547258898182,129.303377811512),
                        new LatLng(35.5472528717487,129.303376255832),
                        new LatLng(35.5472506291757,129.303375497425),
                        new LatLng(35.5470802878277,129.303219013946),
                        new LatLng(35.5468736633176,129.303030829296),
                        new LatLng(35.5467712464757,129.302937281123),
                        new LatLng(35.5467676587983,129.302933727282),
                        new LatLng(35.5467628521859,129.30292738949),
                        new LatLng(35.5466518811477,129.302736420871),
                        new LatLng(35.5465914854444,129.302632707088),
                        new LatLng(35.5465520840211,129.302564729628),
                        new LatLng(35.5465140555658,129.302499205868),
                        new LatLng(35.5464859716713,129.302450847802),
                        new LatLng(35.5464582907654,129.302403539056),
                        new LatLng(35.5464449357326,129.302380415914),
                        new LatLng(35.5464330700318,129.30236008875),
                        new LatLng(35.5464251628426,129.30234642703),
                        new LatLng(35.5464224339693,129.302341872776),
                        new LatLng(35.5464194364141,129.302336622674),
                        new LatLng(35.5464183410994,129.302334864928),
                        new LatLng(35.5464176685555,129.302333461699),
                        new LatLng(35.5464164388861,129.302331361544),
                        new LatLng(35.5464154778985,129.302329957237),
                        new LatLng(35.5464142572429,129.302327857116),
                        new LatLng(35.5464123460156,129.302324353698),
                        new LatLng(35.5464111253599,129.302322253577),
                        new LatLng(35.5463810567475,129.302274527917),
                        new LatLng(35.546375185238,129.302265064937),
                        new LatLng(35.5463576647672,129.302238716769),
                        new LatLng(35.5462699073288,129.302107681395),
                        new LatLng(35.5460827940301,129.30182633328),
                        new LatLng(35.5460781629084,129.301818275705),
                        new LatLng(35.5460649940559,129.301792738065),
                        new LatLng(35.5460590104931,129.301781201247),
                        new LatLng(35.5460497795703,129.301763365667),
                        new LatLng(35.54604420806,129.301752867136),
                        new LatLng(35.5460230602378,129.301695403287),
                        new LatLng(35.5460101930348,129.30166093315),
                        new LatLng(35.545911745,129.301337664365),
                        new LatLng(35.5459036728283,129.301310557631),
                        new LatLng(35.5458976883286,129.301284881441),
                        new LatLng(35.5458567320442,129.301076972123),
                        new LatLng(35.5457599854614,129.300568718628),
                        new LatLng(35.5457382299399,129.30045439765),
                        new LatLng(35.5457250323858,129.300385791322),
                        new LatLng(35.545711472934,129.300314073448),
                        new LatLng(35.5456983264244,129.30025029813),
                        new LatLng(35.5456660385562,129.300090189292),
                        new LatLng(35.5456142776756,129.299836481165),
                        new LatLng(35.5455869093546,129.299706136501),
                        new LatLng(35.5455622901611,129.299564850157),
                        new LatLng(35.5455546936659,129.299520187075),
                        new LatLng(35.5455474283261,129.299465532819),
                        new LatLng(35.5455208372809,129.29927215971),
                        new LatLng(35.5455108129156,129.299199517796),
                        new LatLng(35.5455041467289,129.299150391414),
                        new LatLng(35.5454995783871,129.29911683491),
                        new LatLng(35.5454905666606,129.299035605077),
                        new LatLng(35.5454834558239,129.298973043587),
                        new LatLng(35.5454680164288,129.29882994968),
                        new LatLng(35.5454628798103,129.298781898827),
                        new LatLng(35.5454557176557,129.29871450643),
                        new LatLng(35.5454533204056,129.298692384167),
                        new LatLng(35.5454507995132,129.29866922471),
                        new LatLng(35.5454479462846,129.298641928103),
                        new LatLng(35.5454444641566,129.298610129292),
                        new LatLng(35.5454428104065,129.298593546403),
                        new LatLng(35.5454420767439,129.298587665168),
                        new LatLng(35.5454417247244,129.298584200722),
                        new LatLng(35.5454414873028,129.298581784466),
                        new LatLng(35.5454408781213,129.298576598526),
                        new LatLng(35.545440650556,129.298573840403),
                        new LatLng(35.5454404024351,129.298572107914),
                        new LatLng(35.545439223524,129.298560357538),
                        new LatLng(35.5454368163892,129.298538577151),
                        new LatLng(35.5454334981684,129.298506095146),
                        new LatLng(35.5454310909966,129.298484325791),
                        new LatLng(35.5454287342019,129.298467718256),
                        new LatLng(35.5454283722956,129.298464606707),
                        new LatLng(35.5454027293529,129.298280899218),
                        new LatLng(35.5453604978931,129.297991979093),
                        new LatLng(35.545303969602,129.297611343708),
                        new LatLng(35.5452508736218,129.297249404766),
                        new LatLng(35.5452146645803,129.297006830047),
                        new LatLng(35.545213911109,129.297001643603),
                        new LatLng(35.5452139223931,129.296846243599),
                        new LatLng(35.5452110957037,129.29644714519),
                        new LatLng(35.5452083267504,129.296171407513),
                        new LatLng(35.5452072738965,129.296071105014),
                        new LatLng(35.545207200833,129.296060428576),
                        new LatLng(35.5452071503759,129.296055255743),
                        new LatLng(35.5452069942853,129.296049045788),
                        new LatLng(35.5452067574626,129.296024229444),
                        new LatLng(35.5452064988871,129.295993556568),
                        new LatLng(35.5452061478868,129.295960126079),
                        new LatLng(35.5452061996916,129.295957368993),
                        new LatLng(35.545206385007,129.295955307229),
                        new LatLng(35.545206602402,129.29595118314),
                        new LatLng(35.5452080702636,129.295933310334),
                        new LatLng(35.5452084434259,129.29592815008),
                        new LatLng(35.545211151777,129.295911682505),
                        new LatLng(35.5452378540621,129.295759115265),
                        new LatLng(35.5452538364015,129.295666540199),
                        new LatLng(35.5452551077659,129.295658989905),
                        new LatLng(35.5452563684205,129.295652134405),
                        new LatLng(35.5452576397841,129.295644584111),
                        new LatLng(35.5452592110808,129.295636020234),
                        new LatLng(35.5452620644213,129.295619222295),
                        new LatLng(35.5452677407172,129.295586993914),
                        new LatLng(35.5452748629616,129.295545848258),
                        new LatLng(35.5452897278824,129.295460471037),
                        new LatLng(35.5452939770489,129.295436818074),
                        new LatLng(35.545296200068,129.295423436845),
                        new LatLng(35.5453034052007,129.295392636772),
                        new LatLng(35.5453150032522,129.295345761246),
                        new LatLng(35.5453173088184,129.295335490523),
                        new LatLng(35.545371839437,129.295155793485),
                        new LatLng(35.5454265045566,129.294968872612),
                        new LatLng(35.545433285531,129.294945636888),
                        new LatLng(35.5454392089882,129.294930294893),
                        new LatLng(35.5454526994217,129.294902087413),
                        new LatLng(35.5454676674307,129.294870466275),
                        new LatLng(35.5455203369119,129.294773756121),
                        new LatLng(35.5455893490697,129.294647205311),
                        new LatLng(35.5457057478379,129.294420351002),
                        new LatLng(35.5457285210064,129.294377927419),
                        new LatLng(35.5457327281324,129.294371490656),
                        new LatLng(35.5457361705632,129.294368150309),
                        new LatLng(35.5457514080617,129.294351695058),
                        new LatLng(35.5458106831678,129.294285162032),
                        new LatLng(35.5458374461266,129.294255248933),
                        new LatLng(35.5458482283077,129.294243497934),
                        new LatLng(35.5458581533665,129.294232074691),
                        new LatLng(35.5458623284345,129.294227700253),
                        new LatLng(35.5458686553118,129.294220653543),
                        new LatLng(35.5458909522534,129.294196139501),
                        new LatLng(35.5459353929393,129.29414708876),
                        new LatLng(35.5459369851373,129.294144723269),
                        new LatLng(35.5459701582023,129.294080885476),
                        new LatLng(35.5461376425698,129.293751764262),
                        new LatLng(35.5461416112883,129.293743264103),
                        new LatLng(35.5461435346359,129.293738153521),
                        new LatLng(35.546179238284,129.293645439013),
                        new LatLng(35.5462287856765,129.29351246276),
                        new LatLng(35.5462295593366,129.293509377379),
                        new LatLng(35.5462296217292,129.293505947511),
                        new LatLng(35.5462294877035,129.293498016999),
                        new LatLng(35.5462235630929,129.29343204065),
                        new LatLng(35.5462212470012,129.293405782659),
                        new LatLng(35.5461799420934,129.293015925904),
                        new LatLng(35.5461757647624,129.292976525381),
                        new LatLng(35.546175763403,129.292969632104),
                        new LatLng(35.546241225928,129.292643800523),
                        new LatLng(35.5462582302224,129.292571234426),
                        new LatLng(35.5463119699347,129.292396339305),
                        new LatLng(35.5463340809058,129.292336673709),
                        new LatLng(35.5463842048501,129.292218190926),
                        new LatLng(35.5464535661595,129.292057866191),
                        new LatLng(35.5464582788411,129.292047317154),
                        new LatLng(35.5464609346863,129.292041194462),
                        new LatLng(35.5464702590879,129.292024584934),
                        new LatLng(35.5466775145444,129.291640068195),
                        new LatLng(35.5466827663493,129.291630215893),
                        new LatLng(35.5466863841092,129.29162515545),
                        new LatLng(35.5466885449282,129.291622461056),
                        new LatLng(35.546710345516,129.29160171628),
                        new LatLng(35.5467685552319,129.291546514738),
                        new LatLng(35.5468473134615,129.291470188762),
                        new LatLng(35.5468625505389,129.291453743764),
                        new LatLng(35.5468999808383,129.291410698721),
                        new LatLng(35.547001449506,129.291295057413),
                        new LatLng(35.5470799080202,129.291204601284),
                        new LatLng(35.5471121702103,129.291166566807),
                        new LatLng(35.5471203979852,129.291156129542),
                        new LatLng(35.5471990328138,129.291056023075),
                        new LatLng(35.5472576229418,129.290981189871),
                        new LatLng(35.5472951359354,129.290933666764),
                        new LatLng(35.5473640636961,129.290848105843),
                        new LatLng(35.5476447027871,129.290506683536),
                        new LatLng(35.5477046576323,129.29043396104),
                        new LatLng(35.5477225306901,129.290412065554),
                        new LatLng(35.5477421294113,129.290388499775),
                        new LatLng(35.5477780196756,129.290344731329),
                        new LatLng(35.5478028183783,129.2903140812),
                        new LatLng(35.54781160412,129.290303987674),
                        new LatLng(35.5478595167043,129.290249872517),
                        new LatLng(35.5479062189282,129.290200550776),
                        new LatLng(35.5479500384703,129.290154240719),
                        new LatLng(35.5479783515038,129.290124033215),
                        new LatLng(35.5480077166876,129.29009109415),
                        new LatLng(35.5480370547944,129.290058165992),
                        new LatLng(35.5480880154753,129.289999660691),
                        new LatLng(35.5480946190806,129.28999364019),
                        new LatLng(35.5481583908689,129.289941699145),
                        new LatLng(35.5482486752874,129.289866051286),
                        new LatLng(35.5483452756529,129.289784028748),
                        new LatLng(35.5483521299739,129.289778703968),
                        new LatLng(35.5483589621255,129.289775110745),
                        new LatLng(35.5485032295274,129.289718913367),
                        new LatLng(35.5485165644222,129.289713777216),
                        new LatLng(35.5485809651385,129.289681492615),
                        new LatLng(35.5486818881107,129.289631294293),
                        new LatLng(35.5488484826165,129.289548848671),
                        new LatLng(35.5488851384133,129.289531630255),
                        new LatLng(35.5490592060581,129.289418725051),
                        new LatLng(35.5491799233746,129.289334625574),
                        new LatLng(35.5492990902984,129.289250498244),
                        new LatLng(35.5493132520076,129.289238835359),
                        new LatLng(35.5494329024728,129.289137139194),
                        new LatLng(35.5494353418236,129.289134798587),
                        new LatLng(35.54949688801,129.289052119334),
                        new LatLng(35.5495763872211,129.28894411369),
                        new LatLng(35.5495956865652,129.288921229786),
                        new LatLng(35.5497160490238,129.288781648244),
                        new LatLng(35.5498103618517,129.288671985276),
                        new LatLng(35.549830414997,129.288646710476),
                        new LatLng(35.5498976670961,129.288560069054),
                        new LatLng(35.5499688031444,129.288462488785),
                        new LatLng(35.5499735687358,129.288456086455),
                        new LatLng(35.5499856212647,129.288436783222),
                        new LatLng(35.5500517122111,129.288322871736),
                        new LatLng(35.550153246772,129.288136576518),
                        new LatLng(35.5502324435706,129.287984801801),
                        new LatLng(35.5503299551627,129.287780468728),
                        new LatLng(35.550420148464,129.287590745721),
                        new LatLng(35.5504412837082,129.28754620521),
                        new LatLng(35.5504530066515,129.287521385647),
                        new LatLng(35.5504760256523,129.28747310165),
                        new LatLng(35.5504769040276,129.287471406178),
                        new LatLng(35.5505215813562,129.287313816239),
                        new LatLng(35.5505284960677,129.287290578873),
                        new LatLng(35.5505297463975,129.28728407571),
                        new LatLng(35.5505794235876,129.287047706129),
                        new LatLng(35.5505876703935,129.287006252151),
                        new LatLng(35.5506396939725,129.286787527269),
                        new LatLng(35.5506707278367,129.286658499741),
                        new LatLng(35.5506818382717,129.286614364534),
                        new LatLng(35.550697381489,129.28655966738),
                        new LatLng(35.5506997895717,129.286551469694),
                        new LatLng(35.5507037167422,129.286537453623),
                        new LatLng(35.5507184962922,129.286485489141),
                        new LatLng(35.5507426483795,129.286400027033),
                        new LatLng(35.5507870668727,129.286233125852),
                        new LatLng(35.5509294748626,129.285673068599),
                        new LatLng(35.5509595882725,129.28554779812),
                        new LatLng(35.5510002931716,129.285391813549),
                        new LatLng(35.5510040358777,129.285379517382),
                        new LatLng(35.5510579220255,129.285218395041),
                        new LatLng(35.5512949155091,129.284578655641),
                        new LatLng(35.5513806152345,129.284365714989),
                        new LatLng(35.5514158702634,129.284280566292),
                        new LatLng(35.551474015081,129.284147826407),
                        new LatLng(35.5514801748777,129.284134898859),
                        new LatLng(35.5515699061293,129.283947571963),
                        new LatLng(35.5516055037653,129.283873807025),
                        new LatLng(35.5516211825596,129.283841511084),
                        new LatLng(35.551635828158,129.283811605013),
                        new LatLng(35.5516403754674,129.283802080024),
                        new LatLng(35.5516793503225,129.283721863223),
                        new LatLng(35.5517190690641,129.283639597373),
                        new LatLng(35.5517725151726,129.283538418965),
                        new LatLng(35.5518176097711,129.283454583438),
                        new LatLng(35.5518433032864,129.283406725965),
                        new LatLng(35.5518647706428,129.283365979055),
                        new LatLng(35.5519293258393,129.28324374976),
                        new LatLng(35.5519540171848,129.283196550448),
                        new LatLng(35.5519567881635,129.283191111311),
                        new LatLng(35.5519779146912,129.283153462532),
                        new LatLng(35.5520169412513,129.283085654054),
                        new LatLng(35.5520341194311,129.283055811708),
                        new LatLng(35.5520580038546,129.283014444348),
                        new LatLng(35.5520652811469,129.283001564647),
                        new LatLng(35.5520703766155,129.282992736371),
                        new LatLng(35.5520807116955,129.282975113408),
                        new LatLng(35.5520856629145,129.282966295654),
                        new LatLng(35.5520936628823,129.282952745638),
                        new LatLng(35.5521006509773,129.282940184786),
                        new LatLng(35.5521109950635,129.282922561842),
                        new LatLng(35.5521219102141,129.282903573163),
                        new LatLng(35.5521454856935,129.282863241459),
                        new LatLng(35.5521710972094,129.282819519588),
                        new LatLng(35.5522906803963,129.282616818683),
                        new LatLng(35.552452743686,129.282341599144),
                        new LatLng(35.5526002849623,129.282097322511),
                        new LatLng(35.5526268786613,129.282053625633),
                        new LatLng(35.5526562220331,129.282005868193),
                        new LatLng(35.5528517609106,129.281680586556),
                        new LatLng(35.5529262068448,129.281556568848),
                        new LatLng(35.5529286975251,129.281551470548),
                        new LatLng(35.5529307433478,129.281547738441),
                        new LatLng(35.5531731110973,129.281054241369),
                        new LatLng(35.5532636153608,129.280869678365),
                        new LatLng(35.5533904982638,129.280623427737),
                        new LatLng(35.5534674012609,129.280473297137),
                        new LatLng(35.5534681557437,129.280470564253),
                        new LatLng(35.5535466310024,129.280244649973),
                        new LatLng(35.5535477057357,129.280239855537),
                        new LatLng(35.5535854298745,129.280091364541),
                        new LatLng(35.5536456052077,129.279858040118),
                        new LatLng(35.5536636656433,129.279789295787),
                        new LatLng(35.5536765301295,129.279741755698),
                        new LatLng(35.5536847145437,129.279710623485),
                        new LatLng(35.5536929169521,129.279679502359),
                        new LatLng(35.5536932273952,129.27967778271),
                        new LatLng(35.5537021614781,129.279622551936),
                        new LatLng(35.5537207736778,129.279502121555),
                        new LatLng(35.5537677496771,129.279199160715),
                        new LatLng(35.5537719118524,129.279172757556),
                        new LatLng(35.5537915700144,129.279063724853),
                        new LatLng(35.5538090484976,129.278965659716),
                        new LatLng(35.5538363796687,129.278808605417),
                        new LatLng(35.5538564069447,129.278687870669),
                        new LatLng(35.553893475979,129.278454917139),
                        new LatLng(35.5539284361793,129.278221581112),
                        new LatLng(35.5539298930378,129.27821128382),
                        new LatLng(35.5539305531031,129.278206465847),
                        new LatLng(35.5539339418177,129.278183137378),
                        new LatLng(35.553939620277,129.278144010354),
                        new LatLng(35.5539402811243,129.278138850444),
                        new LatLng(35.553953962937,129.278025527997),
                        new LatLng(35.5539764098154,129.277835938974),
                        new LatLng(35.5539775456426,129.277828045173),
                        new LatLng(35.5539780712684,129.277822884793),
                        new LatLng(35.5539842101209,129.277736218671),
                        new LatLng(35.5540078168308,129.277425697129),
                        new LatLng(35.5540408819771,129.277054463836),
                        new LatLng(35.5540627702654,129.276804900572),
                        new LatLng(35.5540930817678,129.276482168725),
                        new LatLng(35.5540953125488,129.276460512789),
                        new LatLng(35.5540965525018,129.276454351073),
                        new LatLng(35.5541587900041,129.276290002143),
                        new LatLng(35.5542185698812,129.276092509426),
                        new LatLng(35.5542297708732,129.276058364607),
                        new LatLng(35.5542411756739,129.27601388504),
                        new LatLng(35.5543221029255,129.275657439352),
                        new LatLng(35.5543898520703,129.275328182086),
                        new LatLng(35.554391430967,129.275319605833),
                        new LatLng(35.5544088518468,129.275201904893),
                        new LatLng(35.5544100690059,129.275189874901),
                        new LatLng(35.5544296951984,129.274970216654),
                        new LatLng(35.554429683799,129.274963322634),
                        new LatLng(35.5544258182815,129.274728186127),
                        new LatLng(35.5544254769178,129.274723695608),
                        new LatLng(35.5543766246795,129.274431809745),
                        new LatLng(35.5543753415939,129.274425220267),
                        new LatLng(35.5543748234851,129.274423144802),
                        new LatLng(35.5542928333323,129.274215782947),
                        new LatLng(35.5542800708021,129.274183376655),
                        new LatLng(35.5542607298827,129.274134237112),
                        new LatLng(35.5541283057017,129.273831381028),
                        new LatLng(35.5540327073116,129.273614333904),
                        new LatLng(35.5539714068275,129.273445120272),
                        new LatLng(35.5539065490754,129.273262371737),
                        new LatLng(35.5538612232297,129.273128079299),
                        new LatLng(35.5538075431957,129.272964936694),
                        new LatLng(35.5537662121737,129.272841776576),
                        new LatLng(35.5537635326696,129.272834818467),
                        new LatLng(35.5537586386311,129.272810557414),
                        new LatLng(35.5537353277342,129.272694782269),
                        new LatLng(35.5537336705868,129.272686139979),
                        new LatLng(35.5537329149909,129.272621334562),
                        new LatLng(35.5537302064419,129.27245893772),
                        new LatLng(35.5537227482817,129.272264018689),
                        new LatLng(35.5537221913854,129.272166829065),
                        new LatLng(35.5537214285577,129.272012766655),
                        new LatLng(35.5537210617417,129.271935222592),
                        new LatLng(35.553721005875,129.271915930454),
                        new LatLng(35.5537209631641,129.271902826344),
                        new LatLng(35.5537208349404,129.271887659286),
                        new LatLng(35.5537207177928,129.271863535682),
                        new LatLng(35.5537206068746,129.27182457638),
                        new LatLng(35.5537204824865,129.271771520341),
                        new LatLng(35.5537205659504,129.271722237355),
                        new LatLng(35.5537216503764,129.271664718113),
                        new LatLng(35.5537226127159,129.271613397474),
                        new LatLng(35.5537230520502,129.271590312583),
                        new LatLng(35.5537231959919,129.271582393328),
                        new LatLng(35.5537233489471,129.271574474104),
                        new LatLng(35.5537251713218,129.271485267353),
                        new LatLng(35.5537278100779,129.271345434369),
                        new LatLng(35.5537303033791,129.271198023089),
                        new LatLng(35.5537322839156,129.271070221913),
                        new LatLng(35.5537307215938,129.270950593335),
                        new LatLng(35.5537318535655,129.270936158493),
                        new LatLng(35.5537332179021,129.270930681013),
                        new LatLng(35.5537851892625,129.270750531909),
                        new LatLng(35.5538427413709,129.270565724384),
                        new LatLng(35.5538634328574,129.270499104394),
                        new LatLng(35.5538728857477,129.270468019523),
                        new LatLng(35.5538971473841,129.270413213831),
                        new LatLng(35.5539801071141,129.270225335969),
                        new LatLng(35.5540693713474,129.270023503335),
                        new LatLng(35.554071147209,129.270019405979),
                        new LatLng(35.5540944054544,129.269957691686),
                        new LatLng(35.5541452277293,129.269823368347),
                        new LatLng(35.5541478930832,129.269816516365),
                        new LatLng(35.5541495246667,129.269812440581),
                        new LatLng(35.5542230948361,129.269651168511),
                        new LatLng(35.5543217814674,129.269435467748),
                        new LatLng(35.5543586377152,129.269355157038),
                        new LatLng(35.5543918257914,129.269282709732),
                        new LatLng(35.5544094538643,129.269243577479),
                        new LatLng(35.5544371035536,129.269180939725),
                        new LatLng(35.554447559314,129.269156773856),
                        new LatLng(35.554449770066,129.269151663114),
                        new LatLng(35.5544524157618,129.269145527993),
                        new LatLng(35.5544606600052,129.269126814799),
                        new LatLng(35.5545152463751,129.26900187866),
                        new LatLng(35.554565729655,129.268885797155),
                        new LatLng(35.5545677766285,129.268881369738),
                        new LatLng(35.5546119396078,129.268794376313),
                        new LatLng(35.5546343109855,129.268750218704),
                        new LatLng(35.5546391357068,129.268741068461),
                        new LatLng(35.5546404577984,129.268738337311),
                        new LatLng(35.5546414808911,129.268736300084),
                        new LatLng(35.5546433731069,129.26873255603),
                        new LatLng(35.5546520010679,129.268715564765),
                        new LatLng(35.5546578586752,129.26870402435),
                        new LatLng(35.5546708787559,129.268677848302),
                        new LatLng(35.5546822867814,129.26865508632),
                        new LatLng(35.554689002975,129.268642522918),
                        new LatLng(35.5547061474933,129.268614055182),
                        new LatLng(35.5547241791047,129.268583902725),
                        new LatLng(35.5547394509664,129.268558484176),
                        new LatLng(35.5548009372183,129.268455796406),
                        new LatLng(35.5548051632634,129.268448331796),
                        new LatLng(35.5548153723017,129.268429680116),
                        new LatLng(35.5548556520322,129.268353957432),
                        new LatLng(35.554939091952,129.268200182928),
                        new LatLng(35.5550370096434,129.268061997965),
                        new LatLng(35.5551402994139,129.267915689963),
                        new LatLng(35.5551433370492,129.267911640805),
                        new LatLng(35.5552014912532,129.267844006893),
                        new LatLng(35.555375020773,129.26763902775),
                        new LatLng(35.5555000504453,129.267489183463),
                        new LatLng(35.5555992819649,129.267372058308),
                        new LatLng(35.5556368599122,129.267327641128),
                        new LatLng(35.5557067195682,129.267245164825),
                        new LatLng(35.5557775548787,129.267161687818),
                        new LatLng(35.5558224796265,129.267108856313),
                        new LatLng(35.5558633647459,129.267060732504),
                        new LatLng(35.5558694196708,129.267053659827),
                        new LatLng(35.5558707214118,129.267051965414),
                        new LatLng(35.5558725924853,129.267049611046),
                        new LatLng(35.5558764781006,129.26704524473),
                        new LatLng(35.5558803644934,129.267040525438),
                        new LatLng(35.5558829581592,129.267037500588),
                        new LatLng(35.5558845302677,129.267035829128),
                        new LatLng(35.5558869970343,129.267033123746),
                        new LatLng(35.5558884159068,129.26703145178),
                        new LatLng(35.555892870149,129.267026745391),
                        new LatLng(35.5559500720284,129.266965637175),
                        new LatLng(35.5560355833804,129.266873273284),
                        new LatLng(35.5561314091691,129.266771556151),
                        new LatLng(35.5561605831692,129.266740667328),
                        new LatLng(35.5561872896495,129.266712825831),
                        new LatLng(35.5561972106241,129.266702070583),
                        new LatLng(35.5562128679812,129.266685620375),
                        new LatLng(35.5562295280848,129.266668169677),
                        new LatLng(35.5562796721346,129.266615134183),
                        new LatLng(35.5563323910592,129.266559404597),
                        new LatLng(35.5563555198765,129.266535246463),
                        new LatLng(35.5563575261479,129.266532892514),
                        new LatLng(35.5563586821557,129.266531881502),
                        new LatLng(35.5563614019786,129.266528868064),
                        new LatLng(35.5563994676478,129.266496166226),
                        new LatLng(35.5564591725546,129.266444430513),
                        new LatLng(35.556498809573,129.266410388028),
                        new LatLng(35.5565331638884,129.266380685233),
                        new LatLng(35.5565793852629,129.266340630579),
                        new LatLng(35.5566244769085,129.266301928934),
                        new LatLng(35.556645229813,129.266284237829),
                        new LatLng(35.5566596792282,129.266271897917),
                        new LatLng(35.5566778497254,129.266256216916),
                        new LatLng(35.5566890114721,129.266246877555),
                        new LatLng(35.5566923081517,129.266243877024),
                        new LatLng(35.5566951707113,129.266241536905),
                        new LatLng(35.5566983134279,129.266238866787),
                        new LatLng(35.5567006073622,129.266236866749),
                        new LatLng(35.556707027979,129.266231537987),
                        new LatLng(35.5567106319053,129.266228185483),
                        new LatLng(35.5567139188436,129.266225515839),
                        new LatLng(35.5567160685556,129.266223515325),
                        new LatLng(35.5567190662745,129.266221197711),
                        new LatLng(35.5567213609838,129.266218844692),
                        new LatLng(35.5567247921197,129.266216186552),
                        new LatLng(35.5567267968827,129.266214516481),
                        new LatLng(35.5567343832684,129.266207834776),
                        new LatLng(35.556748543505,129.266195824807),
                        new LatLng(35.5567697395271,129.266177473263),
                        new LatLng(35.5567977805869,129.266153441349),
                        new LatLng(35.5568116704017,129.266141430471),
                        new LatLng(35.5568165384479,129.266137089353),
                        new LatLng(35.5568304500914,129.266123346721),
                        new LatLng(35.5568627455826,129.266091166036),
                        new LatLng(35.5569870240433,129.265966475198),
                        new LatLng(35.5570406935383,129.265912843662),
                        new LatLng(35.5570926376571,129.265860894091),
                        new LatLng(35.5571336776694,129.265820005568),
                        new LatLng(35.5571678343639,129.265785812125),
                        new LatLng(35.5572037066114,129.265750289566),
                        new LatLng(35.5572100213377,129.265743912463),
                        new LatLng(35.5572150343412,129.265739229822),
                        new LatLng(35.5575316243244,129.265548951165),
                        new LatLng(35.5577178038366,129.265435282708),
                        new LatLng(35.5581851432399,129.264902545436),
                        new LatLng(35.5584266417062,129.264631567097),
                        new LatLng(35.5589708931715,129.264007933381),
                        new LatLng(35.5594632943807,129.263715396375),
                        new LatLng(35.5596213835442,129.263627122316),
                        new LatLng(35.5597293710653,129.263560548401),
                        new LatLng(35.5599346711944,129.263432605077),
                        new LatLng(35.5600806859403,129.263342271961),
                        new LatLng(35.5602171620254,129.263236188078),
                        new LatLng(35.5603141695019,129.263161701182),
                        new LatLng(35.5605128011676,129.262991164815),
                        new LatLng(35.5607359250187,129.262761701058),
                        new LatLng(35.5611055362167,129.262327165238),
                        new LatLng(35.5612141494385,129.262166857401),
                        new LatLng(35.5614138604396,129.261871610977),
                        new LatLng(35.5614956567068,129.261707078435),
                        new LatLng(35.5616394322561,129.261271021346),
                        new LatLng(35.5616916154818,129.261010904651),
                        new LatLng(35.5617301295141,129.260676987802),
                        new LatLng(35.5617418175825,129.260376442498),
                        new LatLng(35.5617596974222,129.259933049609),
                        new LatLng(35.5617817899476,129.259445301805),
                        new LatLng(35.5618336060912,129.258979755741),
                        new LatLng(35.5618472823515,129.258978762555),
                        new LatLng(35.5625874201968,129.258930595786),
                        new LatLng(35.5628905833088,129.258885343637),
                        new LatLng(35.562894821077,129.258884772522),
                        new LatLng(35.5629219346464,129.258880711399),
                        new LatLng(35.563427363974,129.258568159083),
                        new LatLng(35.5634331422886,129.258567978977),
                        new LatLng(35.5640457668563,129.258554492037),
                        new LatLng(35.5640524636425,129.258550530992),
                        new LatLng(35.5646744310497,129.258188182645),
                        new LatLng(35.5648203586849,129.258103008377),
                        new LatLng(35.5650184618966,129.258156118627),
                        new LatLng(35.5650506956605,129.25816460565),
                        new LatLng(35.5655175428806,129.258288339469),
                        new LatLng(35.5658658354169,129.258269847424),
                        new LatLng(35.5659787201757,129.258264051886),
                        new LatLng(35.5660395455281,129.258234735508),
                        new LatLng(35.5661465340135,129.258182939796),
                        new LatLng(35.5661770773694,129.258168287485),
                        new LatLng(35.5666043626137,129.257961762905),
                        new LatLng(35.5668492808829,129.257605347094),
                        new LatLng(35.5668980750775,129.257472985038),
                        new LatLng(35.5670357339966,129.257100129785),
                        new LatLng(35.5672805347847,129.256968091699),
                        new LatLng(35.5673208258612,129.256951638341),
                        new LatLng(35.5673442367916,129.256942302262),
                        new LatLng(35.5673941809552,129.256921985179),
                        new LatLng(35.568150075884,129.257183080652),
                        new LatLng(35.568740479299,129.257348533708),
                        new LatLng(35.5687607935207,129.257354268942),
                        new LatLng(35.568779981056,129.25735997853),
                        new LatLng(35.569041375888,129.25743211222),
                        new LatLng(35.5691451732271,129.257460872943),
                        new LatLng(35.5694393717333,129.257442921572),
                        new LatLng(35.5695109872511,129.257438725432),
                        new LatLng(35.5698202881225,129.257749689293),
                        new LatLng(35.5699703731386,129.257900728018),
                        new LatLng(35.5702705426526,129.258376194657),
                        new LatLng(35.5703408296658,129.258487770707),
                        new LatLng(35.5705955031811,129.258520082421),
                        new LatLng(35.5706287912717,129.258524458403),
                        new LatLng(35.5706556272506,129.258527964261),
                        new LatLng(35.5706589974927,129.258528416334),
                        new LatLng(35.570818104649,129.258370871426),
                        new LatLng(35.5709043239671,129.258285743157),
                        new LatLng(35.5712739427957,129.257924543635),
                        new LatLng(35.5712812590475,129.257917506041),
                        new LatLng(35.5713930436034,129.257903420601),
                        new LatLng(35.5713985432546,129.257902875465),
                        new LatLng(35.5714090162777,129.257907652913),
                        new LatLng(35.5715234437937,129.257947746508),
                        new LatLng(35.5719140037379,129.258085202362),
                        new LatLng(35.5723733170763,129.258017425567),
                        new LatLng(35.5723808820096,129.258012131867),
                        new LatLng(35.5729106391576,129.257626456009),
                        new LatLng(35.5734065194993,129.257801341163),
                        new LatLng(35.573992487373,129.257873279468),
                        new LatLng(35.5742558956063,129.257905486227),
                        new LatLng(35.5742672087627,129.257917868328),
                        new LatLng(35.5745547544467,129.258420583068),
                        new LatLng(35.5746874222943,129.258652493445),
                        new LatLng(35.5745811531184,129.259830106518),
                        new LatLng(35.574580432344,129.259838356989),
                        new LatLng(35.5750368298822,129.259836016596),
                        new LatLng(35.5754606355563,129.259596974327),
                        new LatLng(35.5759342478652,129.259397588546),
                        new LatLng(35.576753112244,129.258965563477),
                        new LatLng(35.5771296688643,129.259188817994),
                        new LatLng(35.5772350976329,129.259251064808),
                        new LatLng(35.577261411998,129.259266629158),
                        new LatLng(35.5772772924109,129.259276036475),
                        new LatLng(35.5779659123868,129.259355004673),
                        new LatLng(35.5782100999705,129.259000603958),
                        new LatLng(35.578672585747,129.258890865282),
                        new LatLng(35.579028030862,129.258054221669),
                        new LatLng(35.5788919381663,129.256960058081),
                        new LatLng(35.5797430546756,129.256361704386),
                        new LatLng(35.5802481966689,129.256147316622),
                        new LatLng(35.5804743231387,129.255530738657),
                        new LatLng(35.5808945932703,129.255412557161),
                        new LatLng(35.5812245444961,129.255319776617),
                        new LatLng(35.5812726319979,129.255316298217),
                        new LatLng(35.5813699254143,129.255309013913),
                        new LatLng(35.5817292932803,129.255269796572),
                        new LatLng(35.581781351726,129.255264024523),
                        new LatLng(35.5821124414459,129.255058531906),
                        new LatLng(35.5821174233349,129.255055579425),
                        new LatLng(35.5822930719616,129.25494672931),
                        new LatLng(35.5823575314555,129.254963362438),
                        new LatLng(35.5823978917736,129.254973806661),
                        new LatLng(35.5826875595672,129.255039501974),
                        new LatLng(35.5830179150119,129.255114263888),
                        new LatLng(35.5834014267741,129.255252564416),
                        new LatLng(35.5835753350586,129.255379467904),
                        new LatLng(35.5839006699364,129.255616466257),
                        new LatLng(35.5839148358916,129.255626861318),
                        new LatLng(35.5845536978168,129.255279693832),
                        new LatLng(35.5846429846974,129.255226347928),
                        new LatLng(35.584681721622,129.255202955616),
                        new LatLng(35.5849023054343,129.255183624018),
                        new LatLng(35.5849996189741,129.255175313101),
                        new LatLng(35.5852472514192,129.255109864828),
                        new LatLng(35.5856563502425,129.255001371615),
                        new LatLng(35.5857169210402,129.254985474077),
                        new LatLng(35.5857347513376,129.254980807461),
                        new LatLng(35.5857942686559,129.254900088883),
                        new LatLng(35.5858170941171,129.254869009933),
                        new LatLng(35.5858512008853,129.254822727618),
                        new LatLng(35.5858751739144,129.254790306008),
                        new LatLng(35.5858913549448,129.25476835382),
                        new LatLng(35.5859092716154,129.254744034633),
                        new LatLng(35.5859458191918,129.254694372248),
                        new LatLng(35.5859910449118,129.254632896909),
                        new LatLng(35.586029328037,129.254580889494),
                        new LatLng(35.5860669059744,129.254529872934),
                        new LatLng(35.5861202036983,129.254457597751),
                        new LatLng(35.5861703470481,129.254389362293),
                        new LatLng(35.5861742523995,129.254383956527),
                        new LatLng(35.5862267529215,129.254309239966),
                        new LatLng(35.5862713060646,129.254246018593),
                        new LatLng(35.5863057338408,129.25419698911),
                        new LatLng(35.5863488404298,129.254135804495),
                        new LatLng(35.5863928151848,129.254073254233),
                        new LatLng(35.58642087795,129.25403336346),
                        new LatLng(35.5864477833921,129.253995157344),
                        new LatLng(35.5864729531934,129.253959318228),
                        new LatLng(35.586521264419,129.253973782055),
                        new LatLng(35.586871335674,129.254077704027),
                        new LatLng(35.5871209328195,129.254321542064),
                        new LatLng(35.587211373045,129.254409917881),
                        new LatLng(35.5874861359744,129.254392111284),
                        new LatLng(35.5875218091019,129.254389663413),
                        new LatLng(35.587549730005,129.25438734564),
                        new LatLng(35.5876386390316,129.254376391788),
                        new LatLng(35.587725004857,129.254366047868),
                        new LatLng(35.5878285919721,129.254353440758),
                        new LatLng(35.5878403129706,129.254352043083),
                        new LatLng(35.5879519421847,129.254338622576),
                        new LatLng(35.5880249007689,129.254329979935),
                        new LatLng(35.5881221828679,129.254315123834),
                        new LatLng(35.5882525389913,129.254294997664),
                        new LatLng(35.5883907847157,129.254273704456),
                        new LatLng(35.5884598261151,129.254263217577),
                        new LatLng(35.5884988053831,129.254257403293),
                        new LatLng(35.5885015303242,129.254247502389),
                        new LatLng(35.5887545137421,129.253330973522),
                        new LatLng(35.5887549680094,129.253329264508),
                        new LatLng(35.589404493571,129.25287064726),
                        new LatLng(35.5894408728135,129.252845126314),
                        new LatLng(35.5896007825977,129.252726865545),
                        new LatLng(35.5896092475784,129.252726417489),
                        new LatLng(35.5900294166825,129.252711299267),
                        new LatLng(35.5903851466156,129.25273884064),
                        new LatLng(35.5904772332677,129.252798995092),
                        new LatLng(35.5905599939668,129.252853172473),
                        new LatLng(35.5905641707214,129.252855900226),
                        new LatLng(35.5904967067011,129.253263598881),
                        new LatLng(35.5904659691554,129.253462005891),
                        new LatLng(35.590460302973,129.253516326028),
                        new LatLng(35.5904456504651,129.253561767652),
                        new LatLng(35.5903240348113,129.253815915407),
                        new LatLng(35.5902800799698,129.253907756582),
                        new LatLng(35.5902086213195,129.254069519083),
                        new LatLng(35.5902077336374,129.254071579891),
                        new LatLng(35.5901128984643,129.254286458593),
                        new LatLng(35.5899863265242,129.254496315167),
                        new LatLng(35.5899470159801,129.254655529349),
                        new LatLng(35.5899055138309,129.254819514726),
                        new LatLng(35.5898562620561,129.254990858066),
                        new LatLng(35.5898098918176,129.255159186636),
                        new LatLng(35.5897908301926,129.255222082435),
                        new LatLng(35.589970118857,129.255588775868),
                        new LatLng(35.5901798588341,129.256013546685),
                        new LatLng(35.5899444150497,129.25624000582),
                        new LatLng(35.5898278263686,129.25635222876),
                        new LatLng(35.5898950869918,129.256693364672),
                        new LatLng(35.5899271218265,129.256855265107),
                        new LatLng(35.5898378824375,129.257026182162),
                        new LatLng(35.5897559653505,129.257182820488),
                        new LatLng(35.5895843473383,129.257353827724),
                        new LatLng(35.5893833261096,129.257554358966),
                        new LatLng(35.5892101445823,129.257727048013),
                        new LatLng(35.5891004917465,129.257942545595),
                        new LatLng(35.5889616185299,129.258215839473),
                        new LatLng(35.5888782873883,129.258379676282),
                        new LatLng(35.5887074199934,129.258510701429),
                        new LatLng(35.5883929867121,129.258752179859),
                        new LatLng(35.588228993027,129.258990287095),
                        new LatLng(35.58800666935,129.259312932906),
                        new LatLng(35.5878241388297,129.259577760181),
                        new LatLng(35.5878043471684,129.259769914442),
                        new LatLng(35.5877718038867,129.260086523867),
                        new LatLng(35.5875331728099,129.260865163175),
                        new LatLng(35.5875285252989,129.260880210835),
                        new LatLng(35.5874506625283,129.261240359482),
                        new LatLng(35.587448194656,129.261252004363),
                        new LatLng(35.5873061980424,129.261907878219),
                        new LatLng(35.5872052462301,129.262035357029),
                        new LatLng(35.5870337564359,129.262252209728),
                        new LatLng(35.5869524087114,129.262355066374),
                        new LatLng(35.5868944351058,129.262428248803),
                        new LatLng(35.5868915516391,129.262431958179),
                        new LatLng(35.5868792374726,129.262457474858),
                        new LatLng(35.5868339729013,129.262551686636),
                        new LatLng(35.5866927921065,129.263156552997),
                        new LatLng(35.5866883426643,129.263175728026),
                        new LatLng(35.5867684425294,129.264024002666),
                        new LatLng(35.5867705471071,129.26404682952),
                        new LatLng(35.5867711374949,129.264053044045),
                        new LatLng(35.5865088041066,129.26474378052),
                        new LatLng(35.5864720087211,129.264843072238),
                        new LatLng(35.5862533218442,129.264934120726),
                        new LatLng(35.5859887236859,129.26504734142),
                        new LatLng(35.5857694080015,129.26535143312),
                        new LatLng(35.5857679613176,129.265353469785),
                        new LatLng(35.5858727633022,129.265650823307),
                        new LatLng(35.5859298146096,129.265604521611),
                        new LatLng(35.5859333997287,129.265601509883),
                        new LatLng(35.5859612421146,129.265528187519),
                        new LatLng(35.5859816678679,129.265528067013),
                        new LatLng(35.5859844800383,129.265528142458),
                        new LatLng(35.5859865891539,129.265528204558),
                        new LatLng(35.5860143247134,129.26552829565),
                        new LatLng(35.585939474578,129.265667528339),
                        new LatLng(35.5856121938479,129.266277143417),
                        new LatLng(35.5856029886574,129.266294459564),
                        new LatLng(35.5855404120278,129.266410249565),
                        new LatLng(35.5855382126893,129.266414325134),
                        new LatLng(35.585782786419,129.266504644326),
                        new LatLng(35.5858099133592,129.266515062203),
                        new LatLng(35.5859880125673,129.266583512719),
                        new LatLng(35.5860124625375,129.266593855614),
                        new LatLng(35.5860181904535,129.266596092478),
                        new LatLng(35.586076582129,129.266620826228),
                        new LatLng(35.5861056529123,129.266632674072),
                        new LatLng(35.5861721813238,129.266658681637),
                        new LatLng(35.5861934774627,129.266664456834),
                        new LatLng(35.5861974050154,129.266665595331),
                        new LatLng(35.5862257007226,129.266673291594),
                        new LatLng(35.5863087694971,129.266658403865),
                        new LatLng(35.5863380224324,129.266653016083),
                        new LatLng(35.5863399865731,129.266653419813),
                        new LatLng(35.5863490945039,129.266655745081),
                        new LatLng(35.5864037526312,129.26666900155),
                        new LatLng(35.5864814264568,129.266709457416),
                        new LatLng(35.5865273657316,129.266752468032),
                        new LatLng(35.5865323402241,129.266757096981),
                        new LatLng(35.5865367340897,129.26676342337),
                        new LatLng(35.5865397534796,129.266767637583),
                        new LatLng(35.5866322940654,129.266900912138),
                        new LatLng(35.5868780715771,129.267189158589),
                        new LatLng(35.586891791846,129.267200911883),
                        new LatLng(35.5869839586668,129.267278670026),
                        new LatLng(35.5870424583883,129.267327902283),
                        new LatLng(35.5870739420391,129.26735326516),
                        new LatLng(35.5872230658798,129.267472614902),
                        new LatLng(35.5874243298011,129.267582062818),
                        new LatLng(35.5874938355758,129.267749504808),
                        new LatLng(35.5875013402024,129.267767604841),
                        new LatLng(35.587503805835,129.267773571858),
                        new LatLng(35.5874995949373,129.267802756272),
                        new LatLng(35.5874586297595,129.268086714083),
                        new LatLng(35.5874551145456,129.268131426876),
                        new LatLng(35.5874476624196,129.268228089944),
                        new LatLng(35.5874311777163,129.268617887117),
                        new LatLng(35.5874312754401,129.268634792903),
                        new LatLng(35.5874333365166,129.268936846953),
                        new LatLng(35.5874584603736,129.269240257878),
                        new LatLng(35.587478694808,129.269354591692),
                        new LatLng(35.5875254139743,129.269617918918),
                        new LatLng(35.5876095141047,129.269937472787),
                        new LatLng(35.5876313697136,129.270048060532),
                        new LatLng(35.5876753291234,129.27027098055),
                        new LatLng(35.5876829961181,129.270349453507),
                        new LatLng(35.5877060539095,129.270583515362),
                        new LatLng(35.5876981427687,129.270727395439),
                        new LatLng(35.5876389547085,129.271051160526),
                        new LatLng(35.5875654341017,129.271245945077),
                        new LatLng(35.5875127262286,129.27142062735),
                        new LatLng(35.5873532747186,129.271909124961),
                        new LatLng(35.5872258785995,129.272191332491),
                        new LatLng(35.5871149667204,129.27240607243),
                        new LatLng(35.5871116291802,129.272411148249),
                        new LatLng(35.5870872710256,129.272448386019),
                        new LatLng(35.5869883704045,129.272600730654),
                        new LatLng(35.5869094776825,129.272722266987),
                        new LatLng(35.5867554557496,129.273035080567),
                        new LatLng(35.5865992137987,129.27342058258),
                        new LatLng(35.5865431015442,129.273588606868),
                        new LatLng(35.5864604881641,129.273832427229),
                        new LatLng(35.586329999102,129.274308288879),
                        new LatLng(35.5862793145009,129.274546798242),
                        new LatLng(35.5862646867439,129.274673250761),
                        new LatLng(35.5862289516382,129.274976992692),
                        new LatLng(35.5862078047261,129.275247028802),
                        new LatLng(35.5862011235647,129.275541258055),
                        new LatLng(35.5861743829755,129.275884214347),
                        new LatLng(35.5861017712968,129.276194847465),
                        new LatLng(35.5860694036407,129.276320786332),
                        new LatLng(35.5860690850357,129.276322153547),
                        new LatLng(35.5860355708513,129.276456706494),
                        new LatLng(35.5860344864708,129.276461844957),
                        new LatLng(35.5860119270799,129.276575314858),
                        new LatLng(35.5860116166797,129.27657703521),
                        new LatLng(35.585966483135,129.277050809824),
                        new LatLng(35.5859564517975,129.277156708484),
                        new LatLng(35.5858856467564,129.27740912682),
                        new LatLng(35.5858649007266,129.277486110785),
                        new LatLng(35.5858408265616,129.27757575109),
                        new LatLng(35.5857945080392,129.277739225144),
                        new LatLng(35.5857927748057,129.277756069129),
                        new LatLng(35.5857788911315,129.277894616842),
                        new LatLng(35.5857501587555,129.278230611836),
                        new LatLng(35.5857239575811,129.278559100707),
                        new LatLng(35.5856891412153,129.278702221574),
                        new LatLng(35.5856436004284,129.278899165439),
                        new LatLng(35.585583072595,129.27919634014),
                        new LatLng(35.5855048689205,129.279504741696),
                        new LatLng(35.585311284194,129.280106694001),
                        new LatLng(35.5853000778882,129.28017772903),
                        new LatLng(35.5852767422944,129.280317390287),
                        new LatLng(35.5852424982755,129.280527745353),
                        new LatLng(35.5852270074439,129.280631063636),
                        new LatLng(35.5852050561803,129.280772141868),
                        new LatLng(35.5851629934821,129.281038116767),
                        new LatLng(35.5850429205759,129.281266732711),
                        new LatLng(35.5849421635689,129.281464507465),
                        new LatLng(35.5848961407794,129.281649716524),
                        new LatLng(35.5848347008773,129.281882728397),
                        new LatLng(35.5848149045548,129.281968706653),
                        new LatLng(35.5848087864733,129.282076095454),
                        new LatLng(35.584793566299,129.282143915737),
                        new LatLng(35.5845476071699,129.282618202611),
                        new LatLng(35.584531707488,129.282706687803),
                        new LatLng(35.5845054451284,129.282859357441),
                        new LatLng(35.5844738037889,129.282983947445),
                        new LatLng(35.5844669621811,129.28301098005),
                        new LatLng(35.5844585125873,129.283070371164),
                        new LatLng(35.5844448669542,129.283166179926),
                        new LatLng(35.5842884116858,129.283182073153),
                        new LatLng(35.5841545239393,129.283195507468),
                        new LatLng(35.5841336426668,129.283197685332),
                        new LatLng(35.5841647150938,129.283081347711),
                        new LatLng(35.5841891991812,129.2830379136),
                        new LatLng(35.5842116776323,129.282980988341),
                        new LatLng(35.5842140756614,129.282973129173),
                        new LatLng(35.584243464936,129.282878810231),
                        new LatLng(35.5842836407721,129.282712407722),
                        new LatLng(35.5843180460971,129.282635463356),
                        new LatLng(35.5843636060807,129.282475424208),
                        new LatLng(35.5844169291963,129.282306628547),
                        new LatLng(35.5844883362464,129.282074921958),
                        new LatLng(35.5844925861718,129.281902677372),
                        new LatLng(35.5844618299246,129.281779072143),
                        new LatLng(35.5843617185923,129.281846232039),
                        new LatLng(35.584271827456,129.281879187488),
                        new LatLng(35.5841696594378,129.281830776182),
                        new LatLng(35.584089900409,129.281789913433),
                        new LatLng(35.584038605148,129.281777078118),
                        new LatLng(35.5823975904757,129.281318922268),
                        new LatLng(35.5813986857534,129.280881067951),
                        new LatLng(35.5813173360086,129.281199349478),
                        new LatLng(35.5807566552059,129.282306909708),
                        new LatLng(35.5807528519377,129.282314388496),
                        new LatLng(35.5806811855925,129.282456090196),
                        new LatLng(35.5806772271332,129.282456672199),
                        new LatLng(35.5802242281802,129.282532415002),
                        new LatLng(35.5799544723009,129.282924984052),
                        new LatLng(35.5799200499999,129.283032256161),
                        new LatLng(35.5798521325723,129.283243360789),
                        new LatLng(35.5798356276637,129.283266683689),
                        new LatLng(35.5796868802792,129.283478596804),
                        new LatLng(35.5791786484942,129.283659975055),
                        new LatLng(35.579175238244,129.283661254038),
                        new LatLng(35.5789647321196,129.283736284036),
                        new LatLng(35.5789132742086,129.283754474582),
                        new LatLng(35.5788898371349,129.284047161059),
                        new LatLng(35.5788728308359,129.284261089236),
                        new LatLng(35.5785790866281,129.284656077121),
                        new LatLng(35.5785535003106,129.284654309909),
                        new LatLng(35.5785570050632,129.284662685775),
                        new LatLng(35.5785690203168,129.284681981849),
                        new LatLng(35.5785796892243,129.284698834744),
                        new LatLng(35.5785099962852,129.284966078526),
                        new LatLng(35.5782482642469,129.285737013665),
                        new LatLng(35.5782468699206,129.285751098685),
                        new LatLng(35.5782393812016,129.28582672982),
                        new LatLng(35.5781753945326,129.286839743146),
                        new LatLng(35.5784737071088,129.287377004534),
                        new LatLng(35.5783440155694,129.287570492893),
                        new LatLng(35.5783193268216,129.287699410399),
                        new LatLng(35.5783187402147,129.287745242057),
                        new LatLng(35.5783185149241,129.287771777161),
                        new LatLng(35.5783184125176,129.287776940541),
                        new LatLng(35.5783465660027,129.287851517867),
                        new LatLng(35.5782712918406,129.288078608901),
                        new LatLng(35.5782434421167,129.288232594306),
                        new LatLng(35.5782666892876,129.288588302243),
                        new LatLng(35.5782110483428,129.288871116113),
                        new LatLng(35.5782047479061,129.288988138293),
                        new LatLng(35.5782643189429,129.289106002887),
                        new LatLng(35.5783248501796,129.289225614406),
                        new LatLng(35.578335195082,129.289362755465),
                        new LatLng(35.5783936810366,129.289530919055),
                        new LatLng(35.5783944774644,129.28953334931),
                        new LatLng(35.5784027288972,129.289580812535),
                        new LatLng(35.5784043732667,129.289590517006),
                        new LatLng(35.5784281238175,129.289726658097),
                        new LatLng(35.5784523485387,129.289815256932),
                        new LatLng(35.5785666038568,129.289945356376),
                        new LatLng(35.5785699116731,129.289949241061),
                        new LatLng(35.5785770139525,129.289960818795),
                        new LatLng(35.5785783790086,129.289962931123),
                        new LatLng(35.5786315379523,129.290047860498),
                        new LatLng(35.5786465919381,129.290130336143),
                        new LatLng(35.5786824094435,129.290327504338),
                        new LatLng(35.578685086925,129.290342398403),
                        new LatLng(35.5787060539024,129.290402287365),
                        new LatLng(35.5787323555931,129.290477830275),
                        new LatLng(35.5787825476191,129.290578196672),
                        new LatLng(35.5788292048761,129.290671566145),
                        new LatLng(35.5788547614889,129.290749511928),
                        new LatLng(35.5788632800837,129.290775604203),
                        new LatLng(35.5788647799641,129.290792888396),
                        new LatLng(35.5788705599974,129.290859574901),
                        new LatLng(35.5788574755343,129.29091056978),
                        new LatLng(35.5788518617311,129.290917302209),
                        new LatLng(35.5787214206305,129.291075265582),
                        new LatLng(35.5786948434243,129.291118278512),
                        new LatLng(35.5785250082156,129.291393696135),
                        new LatLng(35.5784053474062,129.291517834702),
                        new LatLng(35.5783840934065,129.29153997982),
                        new LatLng(35.5783553771465,129.291591557842),
                        new LatLng(35.5782805905466,129.291725589464),
                        new LatLng(35.5782728681628,129.291739508107),
                        new LatLng(35.5782716906251,129.291741887122),
                        new LatLng(35.5781771186893,129.291931875747),
                        new LatLng(35.5781494468245,129.291987627976),
                        new LatLng(35.5780964889888,129.292055403714),
                        new LatLng(35.5779837735929,129.292199724118),
                        new LatLng(35.5779686921477,129.292215160764),
                        new LatLng(35.57791713095,129.292268156248),
                        new LatLng(35.5777845559876,129.292405706817),
                        new LatLng(35.5776174032602,129.292547103871),
                        new LatLng(35.5775403071964,129.292580752967),
                        new LatLng(35.577452771886,129.292682021759),
                        new LatLng(35.5773974883857,129.292745937336),
                        new LatLng(35.5773203211904,129.292835084411),
                        new LatLng(35.5772726367146,129.292936110893),
                        new LatLng(35.5772023965124,129.293083020991),
                        new LatLng(35.577224218499,129.293083298714),
                        new LatLng(35.5772227401679,129.293087044741),
                        new LatLng(35.5769880492,129.293677046459),
                        new LatLng(35.5768305001556,129.294076204395),
                        new LatLng(35.5767124883793,129.294106624509),
                        new LatLng(35.5765551745767,129.294278625512),
                        new LatLng(35.5765324327072,129.294319344212),
                        new LatLng(35.5765268922767,129.294329187893),
                        new LatLng(35.5765126056909,129.294354965043),
                        new LatLng(35.5765070652574,129.294364808719),
                        new LatLng(35.5764770355404,129.294514929954),
                        new LatLng(35.5764740783304,129.294530023885),
                        new LatLng(35.5764267437642,129.294649662885),
                        new LatLng(35.5765013800007,129.29456768102),
                        new LatLng(35.576545841221,129.294517585922),
                        new LatLng(35.5766212321668,129.294432870277),
                        new LatLng(35.5767757751561,129.29427354779),
                        new LatLng(35.5768796453484,129.294238927848),
                        new LatLng(35.5769680401835,129.294225943263),
                        new LatLng(35.5771067584415,129.294202317976),
                        new LatLng(35.5772042298589,129.2941857915),
                        new LatLng(35.5772968955115,129.294169821238),
                        new LatLng(35.5773603968549,129.294133365921),
                        new LatLng(35.5773626715537,129.294132050177),
                        new LatLng(35.5775456221589,129.2940262754),
                        new LatLng(35.5777348483265,129.293938253894),
                        new LatLng(35.5778097429304,129.293924182601),
                        new LatLng(35.5778387086349,129.293918804241),
                        new LatLng(35.5779968085055,129.293898150486),
                        new LatLng(35.5781620931778,129.293869766139),
                        new LatLng(35.5782266501659,129.293858856881),
                        new LatLng(35.5786084107458,129.293753229126),
                        new LatLng(35.5787267123508,129.293759352448),
                        new LatLng(35.5788206797416,129.293764107439),
                        new LatLng(35.5788771025933,129.293854998611),
                        new LatLng(35.5788959377618,129.293841738355),
                        new LatLng(35.5789634405869,129.293794373218),
                        new LatLng(35.5789767135196,129.293785097961),
                        new LatLng(35.5789797109524,129.29378311175),
                        new LatLng(35.5789841259638,129.293780137656),
                        new LatLng(35.5789874019418,129.293778516571),
                        new LatLng(35.5790993659654,129.293725509149),
                        new LatLng(35.5791366320462,129.293720712485),
                        new LatLng(35.579138886197,129.293720433799),
                        new LatLng(35.5791438271352,129.293719889033),
                        new LatLng(35.5791480560351,129.293719319611),
                        new LatLng(35.5791785506492,129.293715358968),
                        new LatLng(35.5792387257148,129.293734655014),
                        new LatLng(35.579258542671,129.293751421122),
                        new LatLng(35.5792846031187,129.293773197194),
                        new LatLng(35.5793218904061,129.29380424936),
                        new LatLng(35.5794864134031,129.294015427454),
                        new LatLng(35.5797235218357,129.293934628575),
                        new LatLng(35.5799041664667,129.293727771773),
                        new LatLng(35.5799613113839,129.293662184509),
                        new LatLng(35.5801788293019,129.293604958598),
                        new LatLng(35.5801841848745,129.293604415324),
                        new LatLng(35.5801940577612,129.293603314697),
                        new LatLng(35.580225813365,129.293599744729),
                        new LatLng(35.5802698303833,129.293595137974),
                        new LatLng(35.5802734996227,129.293594897523),
                        new LatLng(35.5802683700622,129.293610039477),
                        new LatLng(35.5802678253811,129.293611626381),
                        new LatLng(35.5802663363346,129.293616067636),
                        new LatLng(35.5803579989023,129.293601096577),
                        new LatLng(35.5803842761097,129.293596679157),
                        new LatLng(35.580395854186,129.293594933719),
                        new LatLng(35.5805363285493,129.293545857451),
                        new LatLng(35.5806155133143,129.293498467326),
                        new LatLng(35.5806167948542,129.293497820977),
                        new LatLng(35.5806634359614,129.293466742168),
                        new LatLng(35.5807609692198,129.29340230481),
                        new LatLng(35.5808288332566,129.293335983144),
                        new LatLng(35.5808727356178,129.293293109921),
                        new LatLng(35.5809433281072,129.293209287013),
                        new LatLng(35.5809921918691,129.293127602989),
                        new LatLng(35.580992916286,129.2931262374),
                        new LatLng(35.5810075534627,129.293097017261),
                        new LatLng(35.5810126800103,129.29308681836),
                        new LatLng(35.5811160521135,129.292982204486),
                        new LatLng(35.5811532451756,129.29289950686),
                        new LatLng(35.5812557273025,129.292752816536),
                        new LatLng(35.58126874158,129.292734911285),
                        new LatLng(35.5812898510366,129.292705526837),
                        new LatLng(35.5812976651888,129.292694708667),
                        new LatLng(35.58130778517,129.292680875515),
                        new LatLng(35.5813926028804,129.292633647927),
                        new LatLng(35.5814435355337,129.292628204963),
                        new LatLng(35.5814678076093,129.292625446053),
                        new LatLng(35.5814953252722,129.292622445108),
                        new LatLng(35.5815365202553,129.292618103386),
                        new LatLng(35.5816118076616,129.292590603157),
                        new LatLng(35.5816305277001,129.292583895993),
                        new LatLng(35.5816959006887,129.292529911069),
                        new LatLng(35.5819348681944,129.292402956573),
                        new LatLng(35.5819902349363,129.292386616703),
                        new LatLng(35.58199603463,129.292385059802),
                        new LatLng(35.5819977398131,129.292384414956),
                        new LatLng(35.5820119022944,129.292379997362),
                        new LatLng(35.5821734860994,129.292331159871),
                        new LatLng(35.5821747668071,129.292330855547),
                        new LatLng(35.5823850697826,129.292237571756),
                        new LatLng(35.5824825001299,129.292260334536),
                        new LatLng(35.5825354181695,129.292276326897),
                        new LatLng(35.5825432637445,129.292278617285),
                        new LatLng(35.5826000905246,129.292310910326),
                        new LatLng(35.5826222438839,129.292323271549),
                        new LatLng(35.5829831258538,129.292479376769),
                        new LatLng(35.5833275739299,129.292677067442),
                        new LatLng(35.5836743432435,129.292686256984),
                        new LatLng(35.5839741509229,129.292795811087),
                        new LatLng(35.5840136919425,129.292841758226),
                        new LatLng(35.5841431917893,129.292991964812),
                        new LatLng(35.5842811684531,129.293170329463),
                        new LatLng(35.5845102390718,129.293378531619),
                        new LatLng(35.584736259653,129.293584241115),
                        new LatLng(35.5849555586438,129.29368460256),
                        new LatLng(35.5850986396506,129.293750049954),
                        new LatLng(35.5852740980586,129.293830545108),
                        new LatLng(35.5853401228917,129.293861053093),
                        new LatLng(35.5857037323775,129.293962084474),
                        new LatLng(35.5857458885088,129.293973978704),
                        new LatLng(35.5859095899279,129.293814196196),
                        new LatLng(35.5860055711563,129.293720750285),
                        new LatLng(35.5863957459898,129.293587081135),
                        new LatLng(35.5864444668603,129.293586750549),
                        new LatLng(35.5866416324102,129.293584785443),
                        new LatLng(35.5868917221034,129.293428845212),
                        new LatLng(35.587224933371,129.293054991321),
                        new LatLng(35.587317472002,129.292994535812),
                        new LatLng(35.5875377078149,129.292845679013),
                        new LatLng(35.5876255749447,129.292786133036),
                        new LatLng(35.5876748946786,129.292769251751),
                        new LatLng(35.5878662278603,129.292704033241),
                        new LatLng(35.5882552001525,129.292085948263),
                        new LatLng(35.5883440570828,129.29194471229),
                        new LatLng(35.5885873009744,129.291741001349),
                        new LatLng(35.5888142644686,129.291578876829),
                        new LatLng(35.588986836357,129.291537257191),
                        new LatLng(35.5891408735381,129.291500271475),
                        new LatLng(35.5892265994662,129.291449973607),
                        new LatLng(35.5893568493968,129.291397827806),
                        new LatLng(35.5895518005977,129.291319607263),
                        new LatLng(35.5895961885626,129.291318112023),
                        new LatLng(35.5896225384937,129.291317136612),
                        new LatLng(35.5896751870678,129.291302782041),
                        new LatLng(35.5899410440744,129.291279672678),
                        new LatLng(35.5901054498034,129.291267806555),
                        new LatLng(35.5902869336515,129.291298487783),
                        new LatLng(35.5903696030101,129.29131221578),
                        new LatLng(35.5907147792667,129.291316539164),
                        new LatLng(35.590736033603,129.291309211082),
                        new LatLng(35.5907673558392,129.291298387983),
                        new LatLng(35.5909071252262,129.291249618986),
                        new LatLng(35.5909130798045,129.291247367165),
                        new LatLng(35.5909901858116,129.291220608434),
                        new LatLng(35.5910653894852,129.291212757451),
                        new LatLng(35.5910782285393,129.291211391197),
                        new LatLng(35.5910962263466,129.291212603747),
                        new LatLng(35.5911022734416,129.2912131111),
                        new LatLng(35.5911061764969,129.291081870189),
                        new LatLng(35.5911880466222,129.291105604343),
                        new LatLng(35.591309225895,129.291140747353),
                        new LatLng(35.5912850687881,129.29119694094),
                        new LatLng(35.5913799970106,129.291180685785),
                        new LatLng(35.591394686255,129.291178344036),
                        new LatLng(35.5915372285562,129.291153443099),
                        new LatLng(35.5916459277837,129.291183089837),
                        new LatLng(35.5921458720817,129.291082526022),
                        new LatLng(35.5923166684497,129.291119459403),
                        new LatLng(35.5925297084842,129.291030717388),
                        new LatLng(35.5925336680165,129.29102220114),
                        new LatLng(35.592585795488,129.290909571999),
                        new LatLng(35.5925984862424,129.290530677292),
                        new LatLng(35.5926029748764,129.29033911542),
                        new LatLng(35.5930408533636,129.290496049035),
                        new LatLng(35.593041752797,129.290508136317),
                        new LatLng(35.5930427357219,129.29052299385),
                        new LatLng(35.5931469478298,129.29052940511),
                        new LatLng(35.5933729233813,129.290537920662),
                        new LatLng(35.5933815130309,129.290538161231),
                        new LatLng(35.593544546638,129.290575904837),
                        new LatLng(35.593553240322,129.290577867359),
                        new LatLng(35.5930418809212,129.291493852955),
                        new LatLng(35.59300083289,129.291571991781),
                        new LatLng(35.5929636593449,129.292786264556),
                        new LatLng(35.5928704839702,129.293139762468),
                        new LatLng(35.5927402770426,129.293278096014),
                        new LatLng(35.5927131630032,129.293378686527),
                        new LatLng(35.5927071157257,129.293400581294),
                        new LatLng(35.59270545128,129.293406733121),
                        new LatLng(35.592685296611,129.293585094705),
                        new LatLng(35.5926378805488,129.293798196469),
                        new LatLng(35.5926380067306,129.293961623181),
                        new LatLng(35.592573122072,129.294241106302),
                        new LatLng(35.592606626117,129.294300677102),
                        new LatLng(35.5926905664139,129.29433650652),
                        new LatLng(35.5927244204471,129.294392988749),
                        new LatLng(35.5927315847665,129.2944307677),
                        new LatLng(35.5927067248348,129.294775186856),
                        new LatLng(35.5927311745688,129.294888269741),
                        new LatLng(35.5928502303003,129.295224728291),
                        new LatLng(35.5929016683247,129.295289287152),
                        new LatLng(35.5929768738757,129.29534728953),
                        new LatLng(35.593084351918,129.295507567172),
                        new LatLng(35.5931648792745,129.295552964545),
                        new LatLng(35.5932736288066,129.295572619692),
                        new LatLng(35.593353537123,129.295598349353),
                        new LatLng(35.5934166370379,129.295641520192),
                        new LatLng(35.5934630090246,129.295698700409),
                        new LatLng(35.5935268941878,129.295811542792),
                        new LatLng(35.5936131181577,129.295986046598),
                        new LatLng(35.5936873495584,129.296073666519),
                        new LatLng(35.5938273382985,129.296138694682),
                        new LatLng(35.5939217917172,129.296184144171),
                        new LatLng(35.593982027014,129.296259651165),
                        new LatLng(35.5940294953575,129.296347537742),
                        new LatLng(35.5940506542378,129.296441927282),
                        new LatLng(35.5940706133526,129.29667281427),
                        new LatLng(35.5941093776914,129.29677390114),
                        new LatLng(35.5942138351544,129.296944799341),
                        new LatLng(35.5942915796029,129.297135960838),
                        new LatLng(35.5944009754161,129.297446624969),
                        new LatLng(35.5944832689676,129.297568962489),
                        new LatLng(35.5945432328975,129.297695830958),
                        new LatLng(35.59459591891,129.297871793444),
                        new LatLng(35.5946048170601,129.298032376126),
                        new LatLng(35.5945933367915,129.298250634324),
                        new LatLng(35.5945651015168,129.298372917832),
                        new LatLng(35.5945547303682,129.298495708702),
                        new LatLng(35.5945740463325,129.298664165351),
                        new LatLng(35.5945007044986,129.298943763524),
                        new LatLng(35.5945448188048,129.299118790046),
                        new LatLng(35.5946130912262,129.299289690568),
                        new LatLng(35.5946141970074,129.299607958206),
                        new LatLng(35.5945618861884,129.300231544411),
                        new LatLng(35.5945864594594,129.300663226508),
                        new LatLng(35.5945748881102,129.300974240388),
                        new LatLng(35.5945568947702,129.301112662406),
                        new LatLng(35.5945107157021,129.301355797822),
                        new LatLng(35.5944692093448,129.301575609577),
                        new LatLng(35.5944633451236,129.301816445143),
                        new LatLng(35.5943398653413,129.302354223466),
                        new LatLng(35.5943352489134,129.302455802071),
                        new LatLng(35.5943741161093,129.302647231809),
                        new LatLng(35.5944491520574,129.302854523426),
                        new LatLng(35.5944726225463,129.302959661709),
                        new LatLng(35.5944694538695,129.303206433545),
                        new LatLng(35.5944266118014,129.303702378138),
                        new LatLng(35.5943946824289,129.303803865074),
                        new LatLng(35.5943307710109,129.303884097974),
                        new LatLng(35.5939247339414,129.303947968362),
                        new LatLng(35.593593324704,129.303989495755),
                        new LatLng(35.5935157597768,129.304032783898),
                        new LatLng(35.5934575564608,129.304079731455),
                        new LatLng(35.5933876789896,129.30417737715),
                        new LatLng(35.5932803862102,129.30433185899),
                        new LatLng(35.5931973658456,129.30446911694),
                        new LatLng(35.5931377907944,129.30460980683),
                        new LatLng(35.5930304672532,129.305126996332),
                        new LatLng(35.5930183998428,129.305169051759),
                        new LatLng(35.5930064794476,129.305202842027),
                        new LatLng(35.5929727424321,129.305273585468),
                        new LatLng(35.5927316129946,129.305616278982),
                        new LatLng(35.5925794985679,129.305611222988),
                        new LatLng(35.5923968541686,129.305413260155),
                        new LatLng(35.5921410917998,129.305092538576),
                        new LatLng(35.5920763405623,129.305069307014),
                        new LatLng(35.5920298526207,129.305063492292),
                        new LatLng(35.5919854028847,129.305060830395),
                        new LatLng(35.5918941537316,129.305075803053),
                        new LatLng(35.5918171452606,129.305127036898),
                        new LatLng(35.5917130764724,129.305275059862),
                        new LatLng(35.591638847723,129.305357059744),
                        new LatLng(35.5913231638176,129.305592796838),
                        new LatLng(35.5911064632416,129.305695522092),
                        new LatLng(35.5910156571245,129.305717061599),
                        new LatLng(35.5908416001611,129.305784468915),
                        new LatLng(35.5906789842414,129.305879441376),
                        new LatLng(35.5905538287196,129.306003423728),
                        new LatLng(35.5904593882599,129.306200321973),
                        new LatLng(35.5903780895135,129.306482771024),
                        new LatLng(35.5903176358456,129.306609977083),
                        new LatLng(35.5902276067925,129.30672323242),
                        new LatLng(35.5901362051069,129.306805429079),
                        new LatLng(35.5897896216281,129.307036470093),
                        new LatLng(35.589757883906,129.307054182351),
                        new LatLng(35.5895372135887,129.307239540052),
                        new LatLng(35.5893882333998,129.307416606287),
                        new LatLng(35.5893784451118,129.307501484531),
                        new LatLng(35.5893787745448,129.307616637595),
                        new LatLng(35.589392149726,129.30773424602),
                        new LatLng(35.5895300709955,129.308502874612),
                        new LatLng(35.5896034957408,129.30880078493),
                        new LatLng(35.5895884726266,129.308916199626),
                        new LatLng(35.5893972672558,129.309400948975),
                        new LatLng(35.5893356024112,129.309679813679),
                        new LatLng(35.5893633189913,129.309842302153),
                        new LatLng(35.5894348855514,129.31009017252),
                        new LatLng(35.5895393740432,129.310354159775),
                        new LatLng(35.5896414178987,129.310569462105),
                        new LatLng(35.5899593812918,129.311089528049),
                        new LatLng(35.5904101875233,129.311533095289),
                        new LatLng(35.5907053761833,129.311735341707),
                        new LatLng(35.5910306325974,129.311962921576),
                        new LatLng(35.5913158646025,129.312243837254),
                        new LatLng(35.5915250846719,129.312516702893),
                        new LatLng(35.5917526559982,129.312852499093),
                        new LatLng(35.5921260454526,129.31346279752),
                        new LatLng(35.5921479564436,129.313494797312),
                        new LatLng(35.5923588213546,129.313813572314),
                        new LatLng(35.5925936379491,129.314131316519),
                        new LatLng(35.5927800037127,129.31436939543),
                        new LatLng(35.5928910974341,129.314516016874),
                        new LatLng(35.5929632776724,129.314621180705),
                        new LatLng(35.5931204479002,129.314869124266),
                        new LatLng(35.5932883020225,129.315212867129),
                        new LatLng(35.5935667425853,129.315692882253),
                        new LatLng(35.5935943738256,129.315757118879),
                        new LatLng(35.5936033981668,129.315815301418),
                        new LatLng(35.5938155253055,129.316273066521),
                        new LatLng(35.5941278265468,129.316866801733),
                        new LatLng(35.5944657226572,129.317285801256),
                        new LatLng(35.5945883845894,129.317460682948),
                        new LatLng(35.5945971246919,129.317657806814),
                        new LatLng(35.5945374531514,129.317956389969),
                        new LatLng(35.5943812239375,129.318282534873),
                        new LatLng(35.5943128508325,129.318557763731),
                        new LatLng(35.5942931766128,129.318621671819),
                        new LatLng(35.5942550375315,129.31880364543),
                        new LatLng(35.5942121378351,129.319006523961),
                        new LatLng(35.594182306963,129.319510411428),
                        new LatLng(35.5941912038739,129.319684437182),
                        new LatLng(35.594587746174,129.320735738262),
                        new LatLng(35.5946823389419,129.321000500441),
                        new LatLng(35.5947874998788,129.32119903477),
                        new LatLng(35.5948879970299,129.32131053296),
                        new LatLng(35.5951772635452,129.321615062066),
                        new LatLng(35.5954558050552,129.32184755187),
                        new LatLng(35.5956220247695,129.322018886205),
                        new LatLng(35.5957479114261,129.322164920257),
                        new LatLng(35.5958698170202,129.322269112293),
                        new LatLng(35.5959568160868,129.322320931659),
                        new LatLng(35.5960563862826,129.322363795901),
                        new LatLng(35.596547996379,129.322484540502),
                        new LatLng(35.5966831757681,129.322491889711),
                        new LatLng(35.5968596663601,129.322495607507),
                        new LatLng(35.5972948458659,129.322468872219),
                        new LatLng(35.5973842235692,129.322463523445),
                        new LatLng(35.5974232687868,129.322461207265),
                        new LatLng(35.597644595404,129.322447600569),
                        new LatLng(35.5978905464897,129.322478502274),
                        new LatLng(35.5979359028326,129.322492567123),
                        new LatLng(35.5981492689824,129.322621474146),
                        new LatLng(35.5985154887597,129.32295099455),
                        new LatLng(35.5985510303425,129.323035465893),
                        new LatLng(35.5987657808634,129.323516454202),
                        new LatLng(35.5988334872737,129.323663565399),
                        new LatLng(35.5989499000317,129.324081728994),
                        new LatLng(35.5989596561549,129.324692647314),
                        new LatLng(35.5989597379727,129.324695748888),
                        new LatLng(35.598844262027,129.325017901827),
                        new LatLng(35.5987793811498,129.325198770618),
                        new LatLng(35.5984874381157,129.325632009276),
                        new LatLng(35.5984835593929,129.325636386117),
                        new LatLng(35.5983738872669,129.325773887476),
                        new LatLng(35.5982789377987,129.325936986047),
                        new LatLng(35.5981724295294,129.326268352955),
                        new LatLng(35.5981169724601,129.326376737506),
                        new LatLng(35.5980568800498,129.326536024819),
                        new LatLng(35.5980469305254,129.326598836505),
                        new LatLng(35.5980305848815,129.326686972752),
                        new LatLng(35.5980220216968,129.32673706512),
                        new LatLng(35.5980360483759,129.326900216822),
                        new LatLng(35.5980959009693,129.327140201621),
                        new LatLng(35.5981706462495,129.327352689396),
                        new LatLng(35.5982610115991,129.327675273492),
                        new LatLng(35.5983506103504,129.327927840425),
                        new LatLng(35.5984750716346,129.32823452864),
                        new LatLng(35.5988904205101,129.329190605426),
                        new LatLng(35.599039084516,129.329512472252),
                        new LatLng(35.5991212489701,129.329756217226),
                        new LatLng(35.5991914568721,129.32998478279),
                        new LatLng(35.5991943380426,129.329995897278),
                        new LatLng(35.599260322929,129.330239168675),
                        new LatLng(35.5992826374079,129.330359469554),
                        new LatLng(35.5993262401816,129.33060932694),
                        new LatLng(35.5994211746653,129.33114652114),
                        new LatLng(35.5994191228632,129.331333007867),
                        new LatLng(35.599369760709,129.331547763462),
                        new LatLng(35.5991665117009,129.331769777441),
                        new LatLng(35.5990624016902,129.331845368788),
                        new LatLng(35.5981948179625,129.332039154491),
                        new LatLng(35.5980272560593,129.331981197784)
                )
                .strokeColor(Color.argb(105,165,102,255))
                .strokeWidth(20));

        LatLng map = new LatLng(35.56242, 129.3504);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("백신접종시설")
                .snippet("관내 백신접종시설(B급)"));
        BitmapDrawable bitmapdraw2=(BitmapDrawable)getResources().getDrawable(R.drawable.police_logo);
        Bitmap b2=bitmapdraw2.getBitmap();
        Bitmap smallMarker2 = Bitmap.createScaledBitmap(b2, 120, 120, false);

        map = new LatLng(35.579119772412184, 129.34599071614767);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("병영지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.55593342111656, 129.3296384983032);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.5600786920339, 129.29724881297633);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("태화지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.556183949387965, 129.34140096879955);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("반구파출소")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.5809751544276, 129.32281866880004);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("성안파출소")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));
    }




    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == MY_LOCATION_REQUEST_CODE) {
            if (permissions.length == 1 &&
                    permissions[0] == Manifest.permission.ACCESS_FINE_LOCATION &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED &&
                        checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) !=
                                PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.ACCESS_FINE_LOCATION,
                            Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
                }
                mMap.setMyLocationEnabled(true);
            }
        }
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
        if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) !=
                PackageManager.PERMISSION_GRANTED &&
                checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) !=
                        PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION
            }, 1);
        }

        mMap.setMyLocationEnabled(true);
        mMap.setOnMyLocationButtonClickListener(this);
        mMap.setOnMyLocationClickListener(this);



        Polygon polygon1 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56122, 129.33127),
                        new LatLng(35.56005, 129.32941),
                        new LatLng(35.55987, 129.32959),
                        new LatLng(35.55978, 129.32932),
                        new LatLng(35.55949, 129.3294),
                        new LatLng(35.5597, 129.33009),
                        new LatLng(35.5597, 129.33009),
                        new LatLng(35.55879, 129.33133),
                        new LatLng(35.55902, 129.33142),
                        new LatLng(35.55832, 129.33322),
                        new LatLng(35.55858, 129.33359))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70,107,153,0)));


    Polygon polygon2 = mMap.addPolygon(new PolygonOptions()
            .clickable(true)
            .add(
                    new LatLng(35.55404, 129.32414),
                    new LatLng(35.55367, 129.32401),
                    new LatLng(35.55318, 129.32387),
                    new LatLng(35.55276, 129.3238),
                    new LatLng(35.55246, 129.32713),
                    new LatLng(35.55377, 129.32732))
            .strokeColor(Color.BLACK)
            .strokeWidth(2)
            .fillColor(Color.argb(70,107,153,0)));

        Polygon polygon3 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55809, 129.31214),
                        new LatLng(35.55771, 129.31138),
                        new LatLng(35.55678, 129.3117),
                        new LatLng(35.5564, 129.31106),
                        new LatLng(35.55589, 129.31077),
                        new LatLng(35.55579, 129.31218),
                        new LatLng(35.55634, 129.31376))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70,107,153,0)));


        Polygon polygon4 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55573, 129.31232),
                        new LatLng(35.55505, 129.31337),
                        new LatLng(35.55585, 129.31553),
                        new LatLng(35.55601, 129.31651),
                        new LatLng(35.55673, 129.31609),
                        new LatLng(35.55713, 129.31601))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70,107,153,0)));

        Polygon polygon5 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55462, 129.31532),
                        new LatLng(35.5542, 129.31394),
                        new LatLng(35.55325, 129.31437),
                        new LatLng(35.55402, 129.31574))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70,107,153,0)));

        Polygon polygon6 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55462, 129.31532),
                        new LatLng(35.55546, 129.31467),
                        new LatLng(35.55581, 129.31578),
                        new LatLng(35.55508, 129.31638))
                .strokeColor(Color.BLACK)
                .strokeWidth(2)
                .fillColor(Color.argb(70,107,153,0)));

        Polygon polygon7 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56225, 129.32212),
                        new LatLng(35.55792, 129.32356),
                        new LatLng(35.5589, 129.32603),
                        new LatLng(35.5588, 129.32755),
                        new LatLng(35.55942, 129.32816),
                        new LatLng(35.56144, 129.32799),
                        new LatLng(35.56311, 129.3265))
                .strokeColor(Color.BLUE)
                .strokeWidth(2)
                .fillColor(Color.argb(70,61,183,204)));

        Polygon polygon8 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56224, 129.32201),
                        new LatLng(35.56149, 129.31912),
                        new LatLng(35.55984, 129.31561),
                        new LatLng(35.5576, 129.31708),
                        new LatLng(35.55593, 129.31722),
                        new LatLng(35.55589, 129.31783),
                        new LatLng(35.55735, 129.32028),
                        new LatLng(35.55726, 129.32147),
                        new LatLng(35.55733, 129.32198),
                        new LatLng(35.55787, 129.32348))
                .strokeColor(Color.BLUE)
                .strokeWidth(2)
                .fillColor(Color.argb(70,61,183,204)));

        BitmapDrawable bitmapdraw3=(BitmapDrawable)getResources().getDrawable(R.drawable.gpg);
        Bitmap b3=bitmapdraw3.getBitmap();
        Bitmap smallMarker3 = Bitmap.createScaledBitmap(b3, 110, 80, false);

        LatLng map = new LatLng(35.56009, 129.33136);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성동지역주택조합")
                .snippet("220가구 중 76가구 공폐가" +
                        " / 부분철거 진행에 따른 가림막 설치/잠금장치 보완")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));


        map = new LatLng(35.5533, 129.32507);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("옥교동지역주택조합")
                .snippet("200가구 중 14가구 공폐가" +
                        " / 11월 공가 다수발생 예정")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55607, 129.31434);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("우정동지역주택조합")
                .snippet("200가구 중 철거 150가구 40가구 공폐가" +
                        " / 부분철거 진행에 따른 가림막 설치/잠금장치 보완")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.554, 129.31476);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("동원개발")
                .snippet("170가구 중 철거 146가구 40가구 공폐가" +
                        " / 토지 매입중 및 10월 착공 예정")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55668, 129.31224);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("우정뉴시티지역주택조합")
                .snippet("철거완료")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.55945, 129.31938);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("B-04 재개발지역")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3)));

        map = new LatLng(35.5607, 129.32518);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("B-05 재개발지역")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker3))
                .snippet("번영로 센트리지 착공)" +
                        " 2,625세대 / `23년 9월 완공 예정"));

        Polygon polygon9 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57549, 129.34612),
                        new LatLng(35.57364, 129.34596),
                        new LatLng(35.57205, 129.34609),
                        new LatLng(35.57188, 129.34877),
                        new LatLng(35.57293, 129.34922),
                        new LatLng(35.57297, 129.34784),
                        new LatLng(35.57337, 129.34787),
                        new LatLng(35.57407, 129.34886),
                        new LatLng(35.57466, 129.34889),
                        new LatLng(35.5754, 129.34808))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        Polygon polygon10 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57747, 129.34648),
                        new LatLng(35.57431, 129.34593),
                        new LatLng(35.57429, 129.34352),
                        new LatLng(35.57507, 129.34296),
                        new LatLng(35.57485, 129.3406),
                        new LatLng(35.57615, 129.34168),
                        new LatLng(35.5779, 129.34565))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        Polygon polygon11 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55658, 129.28636),
                        new LatLng(35.55353, 129.28537),
                        new LatLng(35.55574, 129.27614),
                        new LatLng(35.55726, 129.27897),
                        new LatLng(35.55789, 129.28146),
                        new LatLng(35.55785, 129.28268))
                .strokeColor(Color.RED)
                .strokeWidth(2)
                .fillColor(Color.argb(70,204,61,61)));

        Polygon polygon15 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.5980272560593,129.331981197784),
                        new LatLng(35.5976455915817,129.331767389612),
                        new LatLng(35.5971140752712,129.331453388384),
                        new LatLng(35.5969176337586,129.33121392452),
                        new LatLng(35.5963826537568,129.330999119178),
                        new LatLng(35.5960443101526,129.331107573923),
                        new LatLng(35.5958501467377,129.331303649406),
                        new LatLng(35.5957175568352,129.331483224095),
                        new LatLng(35.595501540767,129.331775552242),
                        new LatLng(35.5952658908604,129.332107637851),
                        new LatLng(35.595120531954,129.332292013169),
                        new LatLng(35.5949484490841,129.332547680094),
                        new LatLng(35.5948573433022,129.332686390226),
                        new LatLng(35.5946350241673,129.333063684252),
                        new LatLng(35.5945171875438,129.333259547958),
                        new LatLng(35.5944201224916,129.333480150932),
                        new LatLng(35.5942156259083,129.334064822035),
                        new LatLng(35.5941502876522,129.334181177996),
                        new LatLng(35.5941354976331,129.33426867478),
                        new LatLng(35.5941245000626,129.334327648673),
                        new LatLng(35.594101085835,129.334453503196),
                        new LatLng(35.5941046730543,129.334645993287),
                        new LatLng(35.5941397998141,129.334991448932),
                        new LatLng(35.5941456636437,129.33504506309),
                        new LatLng(35.5941950569478,129.335322664013),
                        new LatLng(35.5943325967454,129.335752804627),
                        new LatLng(35.5945230356377,129.336141385262),
                        new LatLng(35.5949083711573,129.336688714917),
                        new LatLng(35.5949827533586,129.336795687198),
                        new LatLng(35.5950958602136,129.336989640909),
                        new LatLng(35.5952025698429,129.337237534197),
                        new LatLng(35.5952237530733,129.337292283714),
                        new LatLng(35.5957469413939,129.338397695892),
                        new LatLng(35.5959222583008,129.338839982705),
                        new LatLng(35.5960800600878,129.339291755058),
                        new LatLng(35.5961087490825,129.339424297373),
                        new LatLng(35.5962184743179,129.340060172024),
                        new LatLng(35.5963519176758,129.3408091471),
                        new LatLng(35.5964310388009,129.341273803309),
                        new LatLng(35.5965218768596,129.341910518998),
                        new LatLng(35.5965351365015,129.342315335966),
                        new LatLng(35.5965284486484,129.342499941907),
                        new LatLng(35.5965175218128,129.342815793423),
                        new LatLng(35.5964901084412,129.343566629468),
                        new LatLng(35.5964699116151,129.344047706966),
                        new LatLng(35.5964472666418,129.344517340358),
                        new LatLng(35.5964418351706,129.344629929624),
                        new LatLng(35.5963859087825,129.345434410178),
                        new LatLng(35.5963503791864,129.345827805288),
                        new LatLng(35.5963175945112,129.345913393182),
                        new LatLng(35.5961631280647,129.346318483368),
                        new LatLng(35.5960378727875,129.346576178562),
                        new LatLng(35.595943265051,129.346770635701),
                        new LatLng(35.595893758911,129.346868831324),
                        new LatLng(35.5958720830487,129.346911988378),
                        new LatLng(35.5958646127518,129.346926943199),
                        new LatLng(35.5955202347852,129.34747474595),
                        new LatLng(35.5954392680768,129.347626848301),
                        new LatLng(35.5953725964082,129.347760394269),
                        new LatLng(35.5953145450672,129.347892818392),
                        new LatLng(35.5952990756263,129.347927879151),
                        new LatLng(35.5952164078915,129.348116480177),
                        new LatLng(35.5951655902053,129.348231531329),
                        new LatLng(35.5951385297383,129.348225565549),
                        new LatLng(35.5949138692539,129.348150048906),
                        new LatLng(35.5948001949442,129.348109498388),
                        new LatLng(35.5946685778296,129.348186678461),
                        new LatLng(35.594481587065,129.348295678494),
                        new LatLng(35.5944151162379,129.348324769071),
                        new LatLng(35.5941879827229,129.348463292505),
                        new LatLng(35.593828316351,129.348596210532),
                        new LatLng(35.5934391793485,129.34865862545),
                        new LatLng(35.5933935468718,129.348406638099),
                        new LatLng(35.5934810285454,129.348274388613),
                        new LatLng(35.593751770476,129.348145423251),
                        new LatLng(35.59339743466,129.348148861185),
                        new LatLng(35.5932630210424,129.348139077756),
                        new LatLng(35.5932190015866,129.348193988993),
                        new LatLng(35.5930134306621,129.348454150302),
                        new LatLng(35.5927433021602,129.348457641348),
                        new LatLng(35.5922210110412,129.348792676812),
                        new LatLng(35.5916980142689,129.348809464434),
                        new LatLng(35.5912068159079,129.348661343995),
                        new LatLng(35.5909346844534,129.348796819498),
                        new LatLng(35.5908749044924,129.34879369204),
                        new LatLng(35.5908069222835,129.3487779268),
                        new LatLng(35.5902789655829,129.348767325427),
                        new LatLng(35.5900699656301,129.348762604389),
                        new LatLng(35.5899229134253,129.348743827271),
                        new LatLng(35.5895790723652,129.348693103151),
                        new LatLng(35.5890706051283,129.348694460494),
                        new LatLng(35.589069104101,129.348301737056),
                        new LatLng(35.5876023220942,129.348295453895),
                        new LatLng(35.5862878913113,129.348289486249),
                        new LatLng(35.5858669209532,129.348287891193),
                        new LatLng(35.5856456997198,129.348382783781),
                        new LatLng(35.5853801143978,129.348420534887),
                        new LatLng(35.585188516605,129.348454577407),
                        new LatLng(35.5851088472184,129.348475011681),
                        new LatLng(35.5847829962619,129.348556165692),
                        new LatLng(35.5839959946194,129.348565590742),
                        new LatLng(35.5830137303352,129.34863895502),
                        new LatLng(35.5822867098504,129.348778708875),
                        new LatLng(35.5819976405274,129.348836117876),
                        new LatLng(35.5817011588609,129.348913289599),
                        new LatLng(35.5813428625845,129.34901142313),
                        new LatLng(35.5803881710677,129.349353431109),
                        new LatLng(35.5798667761131,129.349757717346),
                        new LatLng(35.5794963270199,129.35004645604),
                        new LatLng(35.5787159347419,129.350453515486),
                        new LatLng(35.5785389041334,129.350571061181),
                        new LatLng(35.5784083037172,129.350654460259),
                        new LatLng(35.5781137673457,129.350840609173),
                        new LatLng(35.5776875834343,129.351113570176),
                        new LatLng(35.5774080540863,129.35128121166),
                        new LatLng(35.577359570656,129.351327010446),
                        new LatLng(35.5773103631273,129.35137383214),
                        new LatLng(35.5772565538897,129.35142534505),
                        new LatLng(35.5771484786716,129.351508707053),
                        new LatLng(35.5770799249104,129.351565650252),
                        new LatLng(35.5769503693204,129.351645972442),
                        new LatLng(35.5769356118394,129.351658982809),
                        new LatLng(35.5767244544027,129.351735882074),
                        new LatLng(35.5766204719688,129.351775590798),
                        new LatLng(35.5764916864103,129.351823532616),
                        new LatLng(35.5764830848973,129.35182431162),
                        new LatLng(35.5763384292055,129.351877303619),
                        new LatLng(35.5762317798627,129.351916581088),
                        new LatLng(35.5761565933309,129.351945061523),
                        new LatLng(35.5760874776236,129.351965800907),
                        new LatLng(35.5756573068426,129.352117983842),
                        new LatLng(35.5753627305476,129.352205550208),
                        new LatLng(35.5751501567671,129.352261036016),
                        new LatLng(35.5750419291361,129.352272689503),
                        new LatLng(35.5748539412939,129.352295458552),
                        new LatLng(35.5741673210102,129.352377760582),
                        new LatLng(35.5739331047925,129.352402280333),
                        new LatLng(35.5738477764709,129.352409443637),
                        new LatLng(35.5734959030952,129.352402601747),
                        new LatLng(35.5734128741887,129.352400176384),
                        new LatLng(35.5731757438671,129.352400818954),
                        new LatLng(35.5731456479938,129.352406490977),
                        new LatLng(35.5731312359781,129.352409175301),
                        new LatLng(35.572996244432,129.352399715974),
                        new LatLng(35.5728099171486,129.352387715848),
                        new LatLng(35.5727637509225,129.352386709069),
                        new LatLng(35.5724523434541,129.352369684108),
                        new LatLng(35.5719882264952,129.352363698992),
                        new LatLng(35.571951858633,129.352344023442),
                        new LatLng(35.571864134085,129.352301131719),
                        new LatLng(35.5717970183805,129.352291240568),
                        new LatLng(35.5715818611373,129.352255659672),
                        new LatLng(35.5715477184248,129.352251903112),
                        new LatLng(35.5714065369423,129.352213655097),
                        new LatLng(35.5713880680757,129.35220725286),
                        new LatLng(35.5711247665805,129.352199893606),
                        new LatLng(35.5709785335494,129.352197005457),
                        new LatLng(35.5707753936245,129.352194862177),
                        new LatLng(35.5704319313485,129.352175172264),
                        new LatLng(35.5700603520826,129.352153285869),
                        new LatLng(35.5699998259139,129.352152547657),
                        new LatLng(35.5699418654688,129.352149823752),
                        new LatLng(35.5695634472569,129.352117735931),
                        new LatLng(35.5693493143367,129.352101820718),
                        new LatLng(35.5691500950696,129.352093593947),
                        new LatLng(35.5690955356032,129.352089925124),
                        new LatLng(35.5689954738249,129.352080111589),
                        new LatLng(35.5688575679134,129.352068500391),
                        new LatLng(35.5688066777918,129.352064593846),
                        new LatLng(35.5686226024973,129.352080935935),
                        new LatLng(35.5684916927173,129.352093648341),
                        new LatLng(35.5683806528779,129.352105222717),
                        new LatLng(35.5682362713494,129.352144430932),
                        new LatLng(35.5680675122469,129.35219120014),
                        new LatLng(35.5680361244667,129.352197870198),
                        new LatLng(35.5680053976387,129.352206628219),
                        new LatLng(35.5679953790534,129.35220805183),
                        new LatLng(35.5679168565519,129.352227468203),
                        new LatLng(35.5677333148658,129.352274150543),
                        new LatLng(35.5676689149398,129.352291223356),
                        new LatLng(35.5673905026892,129.35238718039),
                        new LatLng(35.5672150055941,129.352447874825),
                        new LatLng(35.5672024842937,129.352454406368),
                        new LatLng(35.5670300883613,129.352558282541),
                        new LatLng(35.5668908748643,129.352642787398),
                        new LatLng(35.5667587928436,129.352708204582),
                        new LatLng(35.5666583710527,129.35276006904),
                        new LatLng(35.5666251615397,129.352773228667),
                        new LatLng(35.5664984722479,129.352843975363),
                        new LatLng(35.5664493994905,129.352869079496),
                        new LatLng(35.5662709604926,129.352964840992),
                        new LatLng(35.5659549319351,129.353141372358),
                        new LatLng(35.5656625780129,129.353208304817),
                        new LatLng(35.5652413589831,129.353291463854),
                        new LatLng(35.5638977723012,129.353582009979),
                        new LatLng(35.5636608240844,129.353631266329),
                        new LatLng(35.5633204376551,129.353706435118),
                        new LatLng(35.5629505460427,129.353785577839),
                        new LatLng(35.5622259167648,129.35370890328),
                        new LatLng(35.5617916008873,129.353619005296),
                        new LatLng(35.5615227478864,129.353549456817),
                        new LatLng(35.5609335486474,129.353409198448),
                        new LatLng(35.560826464827,129.353384009223),
                        new LatLng(35.5607654200455,129.353366368145),
                        new LatLng(35.560707961428,129.35335228379),
                        new LatLng(35.5605660207949,129.353324008033),
                        new LatLng(35.5605601153516,129.35330902393),
                        new LatLng(35.5605215964545,129.353204853591),
                        new LatLng(35.5605062266201,129.353155807997),
                        new LatLng(35.5603896034532,129.352976979686),
                        new LatLng(35.5602558181475,129.352776290471),
                        new LatLng(35.5600790170506,129.352535735342),
                        new LatLng(35.5599909614574,129.352386696068),
                        new LatLng(35.5599571223538,129.352331260648),
                        new LatLng(35.5597384186209,129.351770017057),
                        new LatLng(35.559728781552,129.351751817971),
                        new LatLng(35.5596759914849,129.351635508345),
                        new LatLng(35.5596190601175,129.35146463229),
                        new LatLng(35.5595795469897,129.351317361412),
                        new LatLng(35.5595445824473,129.351189856012),
                        new LatLng(35.559542614486,129.351175330606),
                        new LatLng(35.5594447169086,129.350888495539),
                        new LatLng(35.5593737448355,129.35070067108),
                        new LatLng(35.5593399998521,129.350618696572),
                        new LatLng(35.5592839614419,129.350459573843),
                        new LatLng(35.5592091714415,129.350295064155),
                        new LatLng(35.5591465498625,129.350199154064),
                        new LatLng(35.5590448244113,129.350050754819),
                        new LatLng(35.5589621169739,129.349930820953),
                        new LatLng(35.5589184424905,129.349881643378),
                        new LatLng(35.5587538211942,129.349694541027),
                        new LatLng(35.5582484136331,129.349415810602),
                        new LatLng(35.5581311104459,129.349517493342),
                        new LatLng(35.5580608008664,129.349570920556),
                        new LatLng(35.5579191942447,129.349626410918),
                        new LatLng(35.5577672329358,129.349649889026),
                        new LatLng(35.5575106465433,129.349651713315),
                        new LatLng(35.5573075239851,129.349699546433),
                        new LatLng(35.5571253531321,129.349755566512),
                        new LatLng(35.5569331294312,129.349865405687),
                        new LatLng(35.55674595389,129.349968846352),
                        new LatLng(35.5565601238766,129.350046469645),
                        new LatLng(35.5564484026235,129.350100410939),
                        new LatLng(35.5561842263723,129.350195751323),
                        new LatLng(35.5559968073704,129.350311576536),
                        new LatLng(35.5558984473133,129.350352128765),
                        new LatLng(35.5556421701346,129.35042460259),
                        new LatLng(35.5553679219945,129.350524110946),
                        new LatLng(35.5552950308843,129.350550587878),
                        new LatLng(35.5551457052135,129.35057586188),
                        new LatLng(35.5549795057263,129.350585487655),
                        new LatLng(35.5547812987555,129.350619682661),
                        new LatLng(35.5547047241186,129.350632609061),
                        new LatLng(35.5545650755011,129.350652994139),
                        new LatLng(35.5544759815746,129.350665557319),
                        new LatLng(35.5542698279327,129.350695382534),
                        new LatLng(35.554182455436,129.35069868763),
                        new LatLng(35.5540097859964,129.35065781039),
                        new LatLng(35.553719844291,129.350514604499),
                        new LatLng(35.5534943244838,129.350374657004),
                        new LatLng(35.5533250799359,129.350259110219),
                        new LatLng(35.5532498794017,129.35020212236),
                        new LatLng(35.5529432455876,129.349983312795),
                        new LatLng(35.5528351926258,129.349906417283),
                        new LatLng(35.5527794205297,129.349863776121),
                        new LatLng(35.5527632678029,129.34985434165),
                        new LatLng(35.5526314843002,129.34978881512),
                        new LatLng(35.5524260550807,129.349658422261),
                        new LatLng(35.5523421893353,129.349699058282),
                        new LatLng(35.5521905433174,129.349778712068),
                        new LatLng(35.5520835030452,129.349837954495),
                        new LatLng(35.552159938704,129.349904288964),
                        new LatLng(35.5522438926424,129.349989087312),
                        new LatLng(35.5522349376122,129.349993659105),
                        new LatLng(35.5521400039017,129.350052567645),
                        new LatLng(35.5520327154143,129.350132136917),
                        new LatLng(35.5519720577303,129.350195495316),
                        new LatLng(35.5517569356807,129.350352898871),
                        new LatLng(35.5515402501371,129.350511640465),
                        new LatLng(35.5514867063642,129.350549362364),
                        new LatLng(35.551457286639,129.350570555676),
                        new LatLng(35.5510849155549,129.350849486237),
                        new LatLng(35.5507850643706,129.351077473484),
                        new LatLng(35.5507426996787,129.351105183991),
                        new LatLng(35.5506896173168,129.351126715336),
                        new LatLng(35.5506372859204,129.351131738265),
                        new LatLng(35.5505847862031,129.351123315109),
                        new LatLng(35.5505346559164,129.351109100573),
                        new LatLng(35.5504987783539,129.351078756191),
                        new LatLng(35.5504689505342,129.351041709923),
                        new LatLng(35.5498857430681,129.35148194396),
                        new LatLng(35.5496477028634,129.351659005574),
                        new LatLng(35.5496294191755,129.351672602865),
                        new LatLng(35.5493976648676,129.351845367086),
                        new LatLng(35.5492266571315,129.351899638741),
                        new LatLng(35.548849697492,129.352016477899),
                        new LatLng(35.5488645752713,129.351990027555),
                        new LatLng(35.5489177960233,129.351917849984),
                        new LatLng(35.5489351133306,129.351845990356),
                        new LatLng(35.5489663319081,129.351782805291),
                        new LatLng(35.5489883269585,129.351723495563),
                        new LatLng(35.5490148926778,129.351660863712),
                        new LatLng(35.5490509421133,129.351566816617),
                        new LatLng(35.5490867931397,129.351454150588),
                        new LatLng(35.5491242917296,129.351401139793),
                        new LatLng(35.5492251278592,129.351169084415),
                        new LatLng(35.5492600492901,129.351075340786),
                        new LatLng(35.5492789355793,129.351031094669),
                        new LatLng(35.5493057634107,129.350983640289),
                        new LatLng(35.5493590635774,129.350893185872),
                        new LatLng(35.5494039004434,129.350817992749),
                        new LatLng(35.549428873174,129.350735676451),
                        new LatLng(35.5494700156014,129.350669346034),
                        new LatLng(35.5495081635727,129.350597410522),
                        new LatLng(35.5495433881585,129.350517112803),
                        new LatLng(35.5495372848793,129.350483159064),
                        new LatLng(35.5496207142004,129.350356723428),
                        new LatLng(35.5497803294694,129.350142909294),
                        new LatLng(35.5498226024463,129.350090734303),
                        new LatLng(35.5498912316178,129.349661313419),
                        new LatLng(35.5499332874819,129.349425128185),
                        new LatLng(35.5498013439607,129.349483644144),
                        new LatLng(35.5496904671946,129.349544853993),
                        new LatLng(35.5497099343105,129.349427229202),
                        new LatLng(35.5497416278099,129.349339591789),
                        new LatLng(35.5497681268239,129.349259035),
                        new LatLng(35.5498027416334,129.349180454436),
                        new LatLng(35.5498585224831,129.349063879568),
                        new LatLng(35.5499192530231,129.348931266616),
                        new LatLng(35.5499871879353,129.348797824223),
                        new LatLng(35.5500348079602,129.348738568299),
                        new LatLng(35.5500538353458,129.348723274899),
                        new LatLng(35.5501244351884,129.348315268845),
                        new LatLng(35.5496947129345,129.348227970617),
                        new LatLng(35.5495547535265,129.348228018606),
                        new LatLng(35.5495564207575,129.348221871226),
                        new LatLng(35.5495615557207,129.348204102467),
                        new LatLng(35.5495680475386,129.348181541639),
                        new LatLng(35.5495795290703,129.348141564364),
                        new LatLng(35.5495825421403,129.348131319733),
                        new LatLng(35.5495829165529,129.348126501374),
                        new LatLng(35.5495836763576,129.348116180863),
                        new LatLng(35.5495861509234,129.348083179676),
                        new LatLng(35.5495883333132,129.348057743592),
                        new LatLng(35.5495944483132,129.347996930179),
                        new LatLng(35.5496191121345,129.347808130874),
                        new LatLng(35.5496226795208,129.347783770609),
                        new LatLng(35.5496236337188,129.347777940008),
                        new LatLng(35.5496582396164,129.34764248981),
                        new LatLng(35.5496606528549,129.347633941144),
                        new LatLng(35.5496640994953,129.347623367456),
                        new LatLng(35.5496660241375,129.347618599873),
                        new LatLng(35.5496728947404,129.347605349658),
                        new LatLng(35.5497979294483,129.347359516506),
                        new LatLng(35.5498040749935,129.347347630817),
                        new LatLng(35.5498214306401,129.347302307065),
                        new LatLng(35.5498218852544,129.347300941333),
                        new LatLng(35.5498223408496,129.347299233684),
                        new LatLng(35.5498247540322,129.34729069602),
                        new LatLng(35.549826430261,129.347284537608),
                        new LatLng(35.5498541925998,129.347174734661),
                        new LatLng(35.5498653351313,129.347130266548),
                        new LatLng(35.5498772856292,129.347080651011),
                        new LatLng(35.5498782497873,129.347074478504),
                        new LatLng(35.5498910156567,129.347004549697),
                        new LatLng(35.5498955753179,129.34697987371),
                        new LatLng(35.5499235537482,129.346822864248),
                        new LatLng(35.549930622189,129.346778279307),
                        new LatLng(35.5499378451021,129.346739551809),
                        new LatLng(35.5499412834176,129.34672241532),
                        new LatLng(35.5499866178142,129.346519750774),
                        new LatLng(35.5499873938067,129.346516323851),
                        new LatLng(35.5499880055931,129.346513580068),
                        new LatLng(35.5499984968169,129.346466682455),
                        new LatLng(35.549999418986,129.346462572314),
                        new LatLng(35.5500006825255,129.346455717229),
                        new LatLng(35.5500021242078,129.346446458425),
                        new LatLng(35.5500031193202,129.346438907316),
                        new LatLng(35.5500035036575,129.346433747044),
                        new LatLng(35.5500032288938,129.346425815484),
                        new LatLng(35.5499969167057,129.346316395483),
                        new LatLng(35.5499903086472,129.346200080645),
                        new LatLng(35.5499901141661,129.346195590709),
                        new LatLng(35.5499896192956,129.346192125252),
                        new LatLng(35.5499727187617,129.346068961035),
                        new LatLng(35.5499600929799,129.345979698504),
                        new LatLng(35.5499562690447,129.345952019569),
                        new LatLng(35.5499547853575,129.345941292319),
                        new LatLng(35.5499545279278,129.345939901471),
                        new LatLng(35.5499534249003,129.345931602393),
                        new LatLng(35.549952940013,129.34592779506),
                        new LatLng(35.5499519512019,129.345920533265),
                        new LatLng(35.5499512088528,129.345915346114),
                        new LatLng(35.5499507149511,129.345911538743),
                        new LatLng(35.5499504675119,129.345909806017),
                        new LatLng(35.549950240054,129.345907389532),
                        new LatLng(35.5499450666075,129.345869336882),
                        new LatLng(35.5499353497991,129.345796686598),
                        new LatLng(35.549922931977,129.345703972733),
                        new LatLng(35.5499077921075,129.345592232012),
                        new LatLng(35.549899887594,129.345535141452),
                        new LatLng(35.5498960325491,129.345508852171),
                        new LatLng(35.5498884977015,129.345454873589),
                        new LatLng(35.5498778720887,129.345378414268),
                        new LatLng(35.549864029537,129.345279451627),
                        new LatLng(35.5498498187861,129.345170494521),
                        new LatLng(35.5498431723407,129.345121019919),
                        new LatLng(35.549838524519,129.345085054229),
                        new LatLng(35.5498374324269,129.345076060348),
                        new LatLng(35.5498332595189,129.345044243864),
                        new LatLng(35.5498192850461,129.344937703356),
                        new LatLng(35.5498065981265,129.344844293735),
                        new LatLng(35.5497913535958,129.344737372872),
                        new LatLng(35.5497781790234,129.344647391476),
                        new LatLng(35.5497493104677,129.344459443561),
                        new LatLng(35.5497279486156,129.344319606218),
                        new LatLng(35.5497106993548,129.344207459974),
                        new LatLng(35.549706967297,129.344182197103),
                        new LatLng(35.5497040908881,129.344163511577),
                        new LatLng(35.5497030710414,129.344157617376),
                        new LatLng(35.5497027103162,129.344154505466),
                        new LatLng(35.5497019469475,129.34415034402),
                        new LatLng(35.5496997196703,129.344134782664),
                        new LatLng(35.5496829761584,129.344025407104),
                        new LatLng(35.5496720457675,129.343957550029),
                        new LatLng(35.5496458714187,129.343804478917),
                        new LatLng(35.5496300785975,129.343718909611),
                        new LatLng(35.5495925930945,129.343517612931),
                        new LatLng(35.5495783144066,129.343447932911),
                        new LatLng(35.5495696065994,129.343403567633),
                        new LatLng(35.5495387158856,129.343254160786),
                        new LatLng(35.5495347556016,129.343233022142),
                        new LatLng(35.5495245590511,129.34311281054),
                        new LatLng(35.549518672604,129.343046133235),
                        new LatLng(35.5495179610787,129.34303956756),
                        new LatLng(35.549516342893,129.343028497931),
                        new LatLng(35.5495144133928,129.343019136582),
                        new LatLng(35.5495133605738,129.343015315848),
                        new LatLng(35.5495071459798,129.342994454433),
                        new LatLng(35.5495015805491,129.342976717171),
                        new LatLng(35.5494772839733,129.342908130899),
                        new LatLng(35.5493709518943,129.342619717748),
                        new LatLng(35.5493692179447,129.342614504404),
                        new LatLng(35.549360648801,129.34242541983),
                        new LatLng(35.5493443979346,129.342109307372),
                        new LatLng(35.5493438534686,129.3421010218),
                        new LatLng(35.5493462925954,129.3419970225),
                        new LatLng(35.5493588789343,129.341472251709),
                        new LatLng(35.549360060427,129.341411284769),
                        new LatLng(35.5493607034768,129.34137823161),
                        new LatLng(35.5493611471443,129.341355148417),
                        new LatLng(35.5493616097677,129.341331734413),
                        new LatLng(35.5493624541853,129.341287994368),
                        new LatLng(35.5493644361079,129.341186055632),
                        new LatLng(35.5493661162061,129.341092034911),
                        new LatLng(35.5493673998008,129.341033152995),
                        new LatLng(35.5493674777014,129.340963887088),
                        new LatLng(35.5493677445578,129.340913934904),
                        new LatLng(35.5493687749071,129.340868133088),
                        new LatLng(35.5493660700988,129.340695419344),
                        new LatLng(35.5493630989038,129.340514774167),
                        new LatLng(35.5493630912494,129.340507880601),
                        new LatLng(35.549366501043,129.340484545178),
                        new LatLng(35.5494236430803,129.340217426737),
                        new LatLng(35.549485791875,129.339910136838),
                        new LatLng(35.5494957072845,129.339849096185),
                        new LatLng(35.5495121502314,129.339777891525),
                        new LatLng(35.5495365720204,129.339709345418),
                        new LatLng(35.549560276496,129.339677988344),
                        new LatLng(35.549593991765,129.339638301767),
                        new LatLng(35.5496053207576,129.339613135481),
                        new LatLng(35.549615523155,129.339558989462),
                        new LatLng(35.5496172968532,129.339540433942),
                        new LatLng(35.5496185223713,129.339527710825),
                        new LatLng(35.5496199339172,129.339512936966),
                        new LatLng(35.5496202860611,129.339509508211),
                        new LatLng(35.5496204631073,129.339507446402),
                        new LatLng(35.5496211883604,129.339499541159),
                        new LatLng(35.5496231291227,129.339479265705),
                        new LatLng(35.5496386322171,129.339318793605),
                        new LatLng(35.5496695981663,129.33899267612),
                        new LatLng(35.5497404790192,129.338256288073),
                        new LatLng(35.5497961614771,129.337657629511),
                        new LatLng(35.5498329362234,129.33726381248),
                        new LatLng(35.5498476696929,129.33710675553),
                        new LatLng(35.549853797976,129.337052139826),
                        new LatLng(35.5498597162109,129.337008211042),
                        new LatLng(35.5498708695769,129.336919633676),
                        new LatLng(35.5498815850922,129.336845856356),
                        new LatLng(35.5499434413237,129.336400722249),
                        new LatLng(35.550078737408,129.335514922956),
                        new LatLng(35.5500959962246,129.335408590494),
                        new LatLng(35.5501007335716,129.33536772283),
                        new LatLng(35.5501729959132,129.334544187085),
                        new LatLng(35.5501868805303,129.334379878891),
                        new LatLng(35.5501945309191,129.334312209789),
                        new LatLng(35.5502135583322,129.334165625548),
                        new LatLng(35.5502832733669,129.333655245682),
                        new LatLng(35.5503381360188,129.333257792921),
                        new LatLng(35.5503392465183,129.333244043348),
                        new LatLng(35.5503434286099,129.33322452682),
                        new LatLng(35.5503857111211,129.333054831131),
                        new LatLng(35.5504837530908,129.332652437234),
                        new LatLng(35.550552448333,129.332376687513),
                        new LatLng(35.5505552114945,129.332365051379),
                        new LatLng(35.5506149718045,129.332063542913),
                        new LatLng(35.5506883973245,129.33169592205),
                        new LatLng(35.550706805696,129.331603071133),
                        new LatLng(35.5507239975202,129.33152982625),
                        new LatLng(35.5502341858074,129.328823713777),
                        new LatLng(35.5502210303764,129.328738907485),
                        new LatLng(35.5502005174324,129.328598404052),
                        new LatLng(35.5501683789832,129.328373839719),
                        new LatLng(35.5501507646115,129.328257900495),
                        new LatLng(35.5501463995417,129.328228830373),
                        new LatLng(35.550144510567,129.328217395868),
                        new LatLng(35.5501389796809,129.328182784077),
                        new LatLng(35.5501152228887,129.328034955036),
                        new LatLng(35.5501033961775,129.327961901079),
                        new LatLng(35.5500874202615,129.327863230252),
                        new LatLng(35.5500674312108,129.327738601213),
                        new LatLng(35.5500485652729,129.327621929237),
                        new LatLng(35.5500297091605,129.327504915433),
                        new LatLng(35.5500289560797,129.327500070323),
                        new LatLng(35.550028368022,129.327494200115),
                        new LatLng(35.5500209568296,129.327418175128),
                        new LatLng(35.5500160283445,129.327367374211),
                        new LatLng(35.550013204306,129.327338354541),
                        new LatLng(35.5500121525494,129.327327287446),
                        new LatLng(35.55001181219,129.327323149913),
                        new LatLng(35.5500115862376,129.327320038609),
                        new LatLng(35.5500073091632,129.327271666884),
                        new LatLng(35.5500020327626,129.327209492907),
                        new LatLng(35.5499957862917,129.327139362567),
                        new LatLng(35.5499855930076,129.32702535098),
                        new LatLng(35.5499786359035,129.326947960223),
                        new LatLng(35.5499742234721,129.32689958799),
                        new LatLng(35.5499699154362,129.326852605932),
                        new LatLng(35.5499670393693,129.326819438902),
                        new LatLng(35.5499648123046,129.326796289503),
                        new LatLng(35.5499629473321,129.326775910034),
                        new LatLng(35.5499615560678,129.326760363506),
                        new LatLng(35.5499607410843,129.326751723926),
                        new LatLng(35.5499600404826,129.326744121603),
                        new LatLng(35.5499594623542,129.326737898494),
                        new LatLng(35.5499591229267,129.326733408017),
                        new LatLng(35.5499586492141,129.326728575077),
                        new LatLng(35.5499584014989,129.326726842407),
                        new LatLng(35.5499577207683,129.326718556321),
                        new LatLng(35.5499552776518,129.326691953746),
                        new LatLng(35.5499471559712,129.326601774875),
                        new LatLng(35.5499438978322,129.32656653273),
                        new LatLng(35.5499397121426,129.326520929918),
                        new LatLng(35.5499337733939,129.326463562333),
                        new LatLng(35.5499298755538,129.326424854279),
                        new LatLng(35.5499172855598,129.326303531519),
                        new LatLng(35.54989561925,129.326098224892),
                        new LatLng(35.5498932251644,129.326076795498),
                        new LatLng(35.5498915505055,129.325958891935),
                        new LatLng(35.5498867002864,129.325560412289),
                        new LatLng(35.5498870364676,129.325535949697),
                        new LatLng(35.5498875271852,129.325517708495),
                        new LatLng(35.5499029006859,129.325385137814),
                        new LatLng(35.5499497468979,129.324985387879),
                        new LatLng(35.5499726400407,129.324791356372),
                        new LatLng(35.5499768036577,129.324758052233),
                        new LatLng(35.5499914670259,129.32461098532),
                        new LatLng(35.5500358900061,129.324132262771),
                        new LatLng(35.5500495995628,129.323991026553),
                        new LatLng(35.5500597568307,129.323880361577),
                        new LatLng(35.5500671810442,129.323787200886),
                        new LatLng(35.5500687371453,129.323764838767),
                        new LatLng(35.550088825846,129.323445640708),
                        new LatLng(35.5501172663619,129.322985747086),
                        new LatLng(35.5501190319468,129.322952378068),
                        new LatLng(35.55014811648,129.32270682816),
                        new LatLng(35.5502087766969,129.322203759392),
                        new LatLng(35.5502265263429,129.322064369565),
                        new LatLng(35.5502859119719,129.321700810536),
                        new LatLng(35.5502923605703,129.321665507771),
                        new LatLng(35.5502933857443,129.321656235796),
                        new LatLng(35.5503022733775,129.321574816139),
                        new LatLng(35.5503101968951,129.321506815888),
                        new LatLng(35.550313811636,129.321472803348),
                        new LatLng(35.5503538076512,129.321040814849),
                        new LatLng(35.5503572277478,129.321001970445),
                        new LatLng(35.5503825317355,129.32061675578),
                        new LatLng(35.5503862726107,129.320575861072),
                        new LatLng(35.5503973549235,129.320226756557),
                        new LatLng(35.5503978841404,129.320220923886),
                        new LatLng(35.5503987008959,129.320215434277),
                        new LatLng(35.5504003775532,129.320208591407),
                        new LatLng(35.5504026635616,129.320199699405),
                        new LatLng(35.5504774577836,129.31998613842),
                        new LatLng(35.5504818233031,129.319971441917),
                        new LatLng(35.5504831178298,129.319962523917),
                        new LatLng(35.5505036476074,129.319810459813),
                        new LatLng(35.5505489198745,129.319484398661),
                        new LatLng(35.5505513420964,129.319468271594),
                        new LatLng(35.5505555872659,129.319430831073),
                        new LatLng(35.5505577960988,129.31940333141),
                        new LatLng(35.5505731670557,129.319197365947),
                        new LatLng(35.5505818437661,129.319075630871),
                        new LatLng(35.5505910742779,129.318924966705),
                        new LatLng(35.5505988512614,129.318799069779),
                        new LatLng(35.5506068048039,129.318671110944),
                        new LatLng(35.5506117219742,129.318583718884),
                        new LatLng(35.5506163082303,129.318498741045),
                        new LatLng(35.5506184972242,129.318458137813),
                        new LatLng(35.5506195763681,129.318438531015),
                        new LatLng(35.5506204364457,129.318423390437),
                        new LatLng(35.5506208312958,129.318417204254),
                        new LatLng(35.5506210485899,129.318413410847),
                        new LatLng(35.5506212775656,129.31840860274),
                        new LatLng(35.5506213289855,129.318406187408),
                        new LatLng(35.5506219618528,129.318395182124),
                        new LatLng(35.5506222116102,129.318389326265),
                        new LatLng(35.5506226362257,129.318382103394),
                        new LatLng(35.5506228543886,129.318377979094),
                        new LatLng(35.5506229067067,129.318375221841),
                        new LatLng(35.5506231447238,129.31837040274),
                        new LatLng(35.5506233628862,129.31836627844),
                        new LatLng(35.5506240065903,129.318354578319),
                        new LatLng(35.5506240697194,129.318351137258),
                        new LatLng(35.550624276171,129.318348038687),
                        new LatLng(35.5506244943327,129.318343914387),
                        new LatLng(35.5506247125232,129.318339779058),
                        new LatLng(35.5506253968028,129.318326358441),
                        new LatLng(35.5506261442086,129.318309496763),
                        new LatLng(35.5506281474416,129.318270955369),
                        new LatLng(35.550629536707,129.318243088439),
                        new LatLng(35.5506312081754,129.318207303196),
                        new LatLng(35.5506328273487,129.318174264175),
                        new LatLng(35.5506351316685,129.318127462611),
                        new LatLng(35.5506394679386,129.318041446931),
                        new LatLng(35.550643047806,129.317972281861),
                        new LatLng(35.5506507068866,129.317815368386),
                        new LatLng(35.5506576311578,129.31766016162),
                        new LatLng(35.55066058887,129.317594424355),
                        new LatLng(35.5506615858913,129.317571706797),
                        new LatLng(35.550662810953,129.317544523048),
                        new LatLng(35.5506638277854,129.317521121717),
                        new LatLng(35.5506645859143,129.317503565186),
                        new LatLng(35.5506648139574,129.317499098995),
                        new LatLng(35.5506650528358,129.317493937967),
                        new LatLng(35.5506652917429,129.317488765909),
                        new LatLng(35.5506655621729,129.317481884349),
                        new LatLng(35.5506658524229,129.317474319017),
                        new LatLng(35.5506662562671,129.317468121831),
                        new LatLng(35.5506664960405,129.317462618881),
                        new LatLng(35.5506665483377,129.317459861626),
                        new LatLng(35.5506667971245,129.317454358712),
                        new LatLng(35.5506675543475,129.317437144101),
                        new LatLng(35.5506690074474,129.317405483127),
                        new LatLng(35.5506708463583,129.317360742273),
                        new LatLng(35.5506725473231,129.317323920302),
                        new LatLng(35.5506727654498,129.317319795997),
                        new LatLng(35.5506736983913,129.317307755069),
                        new LatLng(35.5506738741624,129.317306035103),
                        new LatLng(35.5506742058563,129.317303289973),
                        new LatLng(35.5506771983496,129.317279256654),
                        new LatLng(35.5506815672139,129.317242511322),
                        new LatLng(35.5506874160684,129.317194786064),
                        new LatLng(35.5506999844715,129.317090382707),
                        new LatLng(35.5507095404739,129.317010718489),
                        new LatLng(35.5507281241615,129.316856880792),
                        new LatLng(35.550737649391,129.316778584099),
                        new LatLng(35.5507536748723,129.31664809751),
                        new LatLng(35.550764751146,129.316562604342),
                        new LatLng(35.5507707232161,129.316515916274),
                        new LatLng(35.5507765411393,129.316469569521),
                        new LatLng(35.5508011376372,129.316273852643),
                        new LatLng(35.5508317894678,129.316026980733),
                        new LatLng(35.550865215831,129.315759846566),
                        new LatLng(35.5508989606507,129.315491345712),
                        new LatLng(35.5509026044019,129.315462847698),
                        new LatLng(35.5509247410418,129.315314615266),
                        new LatLng(35.5509513801013,129.315136884332),
                        new LatLng(35.550962463591,129.315065531081),
                        new LatLng(35.5510033185799,129.314866490427),
                        new LatLng(35.5510205011463,129.314792899701),
                        new LatLng(35.5510617860202,129.314615578303),
                        new LatLng(35.5510627386168,129.314609747193),
                        new LatLng(35.5510641040164,129.314604623602),
                        new LatLng(35.5510654370166,129.314601562475),
                        new LatLng(35.5510678984664,129.314597843943),
                        new LatLng(35.551072531175,129.314591078574),
                        new LatLng(35.551077317978,129.314583982906),
                        new LatLng(35.5510838027273,129.314568665536),
                        new LatLng(35.5510895951465,129.314545734839),
                        new LatLng(35.5511096816295,129.31447498994),
                        new LatLng(35.5511629174848,129.314291118732),
                        new LatLng(35.5512299205529,129.314057346234),
                        new LatLng(35.551264734373,129.313945318099),
                        new LatLng(35.5513354766473,129.313722335765),
                        new LatLng(35.5513427687617,129.313701517469),
                        new LatLng(35.5514194202827,129.313500760886),
                        new LatLng(35.5514414579951,129.313445564194),
                        new LatLng(35.5514986465224,129.313297653482),
                        new LatLng(35.5515873169363,129.313050021158),
                        new LatLng(35.5517489832492,129.312637706019),
                        new LatLng(35.5517738018522,129.312577081823),
                        new LatLng(35.5517971100099,129.312521922633),
                        new LatLng(35.5518902555055,129.312268559175),
                        new LatLng(35.5518913009134,129.312265143907),
                        new LatLng(35.5519116975911,129.312185442557),
                        new LatLng(35.5519366758447,129.312087261506),
                        new LatLng(35.5519563172375,129.312010281567),
                        new LatLng(35.5519657706388,129.311972650509),
                        new LatLng(35.551981286335,129.311912100371),
                        new LatLng(35.5519825065467,129.311907307016),
                        new LatLng(35.5519851135927,129.311896022324),
                        new LatLng(35.5519865202725,129.311888825142),
                        new LatLng(35.5519869861706,129.311886422393),
                        new LatLng(35.5519996072355,129.31181580168),
                        new LatLng(35.5520443095078,129.311562768582),
                        new LatLng(35.5520704107476,129.31141326874),
                        new LatLng(35.5520930371603,129.311282969758),
                        new LatLng(35.5521182479886,129.311143095537),
                        new LatLng(35.5521468828591,129.3109860937),
                        new LatLng(35.5521635691478,129.310894222395),
                        new LatLng(35.5521664039542,129.31087844929),
                        new LatLng(35.5521695271734,129.310862688322),
                        new LatLng(35.552174968951,129.310835619432),
                        new LatLng(35.552189222762,129.310767795263),
                        new LatLng(35.5521985428865,129.310722232828),
                        new LatLng(35.5522047380164,129.310693126251),
                        new LatLng(35.5522081415178,129.310677024414),
                        new LatLng(35.5522118748058,129.310658861221),
                        new LatLng(35.55221465744,129.310645845412),
                        new LatLng(35.5522169750765,129.310634890437),
                        new LatLng(35.5522185168889,129.310627693731),
                        new LatLng(35.5522191476419,129.310624265805),
                        new LatLng(35.5522196126095,129.310622216),
                        new LatLng(35.5522206885485,129.310617422057),
                        new LatLng(35.552221940163,129.3106109081),
                        new LatLng(35.5522259636096,129.310592073181),
                        new LatLng(35.5522286011381,129.310579398742),
                        new LatLng(35.5522295526633,129.310573909427),
                        new LatLng(35.5522329983695,129.310555403188),
                        new LatLng(35.5522781240283,129.310280332203),
                        new LatLng(35.5523204551265,129.310040325822),
                        new LatLng(35.5523620615647,129.309808566909),
                        new LatLng(35.5523687434881,129.309768784952),
                        new LatLng(35.5524124670547,129.309544324745),
                        new LatLng(35.5524135842775,129.309537468308),
                        new LatLng(35.5524769134305,129.309348026152),
                        new LatLng(35.5525315457516,129.309179022324),
                        new LatLng(35.5526316810745,129.308854171136),
                        new LatLng(35.5526761684754,129.308714854105),
                        new LatLng(35.5526849888687,129.308688227965),
                        new LatLng(35.5527351442705,129.308531835671),
                        new LatLng(35.5527726401967,129.308412301745),
                        new LatLng(35.5528053074563,129.30831640895),
                        new LatLng(35.5529080290337,129.308040561362),
                        new LatLng(35.5531689076874,129.307321272554),
                        new LatLng(35.5531855150992,129.307270056296),
                        new LatLng(35.5531887416492,129.30725601609),
                        new LatLng(35.553191059305,129.307237825078),
                        new LatLng(35.5531932223411,129.307213070515),
                        new LatLng(35.5531972685528,129.306847214419),
                        new LatLng(35.5531971563365,129.306831021672),
                        new LatLng(35.5531971476243,129.306823785833),
                        new LatLng(35.5531823383969,129.30656008606),
                        new LatLng(35.5531819770146,129.306549727342),
                        new LatLng(35.5531719930557,129.306423669602),
                        new LatLng(35.5531694318013,129.306395676312),
                        new LatLng(35.553167924219,129.306378750293),
                        new LatLng(35.5531675732626,129.306374954579),
                        new LatLng(35.5531631729632,129.306332780537),
                        new LatLng(35.5531546621694,129.306255007553),
                        new LatLng(35.5531319795815,129.306042425197),
                        new LatLng(35.5531281691049,129.306005790574),
                        new LatLng(35.5531260410032,129.305984703845),
                        new LatLng(35.5531225597192,129.305960479427),
                        new LatLng(35.5530630466848,129.305611767012),
                        new LatLng(35.5530620133233,129.305606909832),
                        new LatLng(35.5529579093017,129.305300330329),
                        new LatLng(35.5529492388209,129.305274928241),
                        new LatLng(35.5528945827698,129.305165843357),
                        new LatLng(35.5527414676379,129.3048740703),
                        new LatLng(35.5526233050313,129.304669435495),
                        new LatLng(35.5526001835288,129.304626728065),
                        new LatLng(35.5525926589639,129.304615151204),
                        new LatLng(35.552420941818,129.304375559827),
                        new LatLng(35.5523242229434,129.304242537222),
                        new LatLng(35.5523020834537,129.304214327278),
                        new LatLng(35.5522544523256,129.30415748672),
                        new LatLng(35.5522467414001,129.304148313806),
                        new LatLng(35.5521765463675,129.304056357059),
                        new LatLng(35.5521445959131,129.304011686604),
                        new LatLng(35.5520252930437,129.303837007867),
                        new LatLng(35.5517894368392,129.303490827874),
                        new LatLng(35.5517384784147,129.303416316607),
                        new LatLng(35.5516745161632,129.303322476262),
                        new LatLng(35.5516686348746,129.303313354474),
                        new LatLng(35.5516668266528,129.303311924827),
                        new LatLng(35.5516088963006,129.303293033881),
                        new LatLng(35.5514758455891,129.303248216699),
                        new LatLng(35.5514203028745,129.303229742902),
                        new LatLng(35.5513497831202,129.303206017895),
                        new LatLng(35.5512822081025,129.303183417988),
                        new LatLng(35.5512494697948,129.303172485969),
                        new LatLng(35.5512328171457,129.303166842421),
                        new LatLng(35.5512158941082,129.303161186833),
                        new LatLng(35.5511851108108,129.303150659235),
                        new LatLng(35.5511831467842,129.303150254798),
                        new LatLng(35.5511813170821,129.303150203822),
                        new LatLng(35.5511167484232,129.303147325721),
                        new LatLng(35.5510088249704,129.303143546167),
                        new LatLng(35.5508838762474,129.303138941767),
                        new LatLng(35.5508330682919,129.303137493983),
                        new LatLng(35.550807297569,129.303137441539),
                        new LatLng(35.550794343748,129.303137756986),
                        new LatLng(35.5506038652201,129.303143341301),
                        new LatLng(35.550512430422,129.303145899535),
                        new LatLng(35.5504501571025,129.303147905245),
                        new LatLng(35.5504436756709,129.303148068465),
                        new LatLng(35.5504391780328,129.303147941314),
                        new LatLng(35.5504247992489,129.303148560254),
                        new LatLng(35.5504063464504,129.30314906466),
                        new LatLng(35.550379871817,129.30314934047),
                        new LatLng(35.5503711370593,129.303149440098),
                        new LatLng(35.5503642320315,129.303149579671),
                        new LatLng(35.5503580390156,129.303149755002),
                        new LatLng(35.5503541002089,129.303149640974),
                        new LatLng(35.5503433915547,129.303149678056),
                        new LatLng(35.5503249486256,129.303149840575),
                        new LatLng(35.5500787722339,129.303152105735),
                        new LatLng(35.5498864228431,129.303152465902),
                        new LatLng(35.5498682593421,129.303152629466),
                        new LatLng(35.5498230327374,129.3031540924),
                        new LatLng(35.5498083745224,129.303154710287),
                        new LatLng(35.5497662493464,129.303155920126),
                        new LatLng(35.5494236952432,129.303176442224),
                        new LatLng(35.549212633204,129.30319108179),
                        new LatLng(35.5491531307556,129.303195248604),
                        new LatLng(35.549127049248,129.303196915606),
                        new LatLng(35.5491057538226,129.303198710838),
                        new LatLng(35.5490523190797,129.303202348899),
                        new LatLng(35.5489928157736,129.303206857612),
                        new LatLng(35.5489216115126,129.303211708504),
                        new LatLng(35.5488382487014,129.303219657255),
                        new LatLng(35.548692530914,129.303233416502),
                        new LatLng(35.5486774284768,129.303235047424),
                        new LatLng(35.5485091524298,129.303258152334),
                        new LatLng(35.5484943285379,129.303260137238),
                        new LatLng(35.5482418009878,129.30330770955),
                        new LatLng(35.5480687082768,129.303339288839),
                        new LatLng(35.5480632191955,129.303339124877),
                        new LatLng(35.5479045690298,129.303351820587),
                        new LatLng(35.5477897707799,129.303361283597),
                        new LatLng(35.547772848506,129.303362521624),
                        new LatLng(35.5477650944598,129.303363341819),
                        new LatLng(35.5476978693514,129.303366586098),
                        new LatLng(35.5476110342631,129.303371686995),
                        new LatLng(35.5475088271997,129.303378064804),
                        new LatLng(35.5473900086117,129.303383972223),
                        new LatLng(35.5473048582636,129.303382219124),
                        new LatLng(35.5472714991814,129.303381608749),
                        new LatLng(35.5472670122677,129.303380797809),
                        new LatLng(35.547258898182,129.303377811512),
                        new LatLng(35.5472528717487,129.303376255832),
                        new LatLng(35.5472506291757,129.303375497425),
                        new LatLng(35.5470802878277,129.303219013946),
                        new LatLng(35.5468736633176,129.303030829296),
                        new LatLng(35.5467712464757,129.302937281123),
                        new LatLng(35.5467676587983,129.302933727282),
                        new LatLng(35.5467628521859,129.30292738949),
                        new LatLng(35.5466518811477,129.302736420871),
                        new LatLng(35.5465914854444,129.302632707088),
                        new LatLng(35.5465520840211,129.302564729628),
                        new LatLng(35.5465140555658,129.302499205868),
                        new LatLng(35.5464859716713,129.302450847802),
                        new LatLng(35.5464582907654,129.302403539056),
                        new LatLng(35.5464449357326,129.302380415914),
                        new LatLng(35.5464330700318,129.30236008875),
                        new LatLng(35.5464251628426,129.30234642703),
                        new LatLng(35.5464224339693,129.302341872776),
                        new LatLng(35.5464194364141,129.302336622674),
                        new LatLng(35.5464183410994,129.302334864928),
                        new LatLng(35.5464176685555,129.302333461699),
                        new LatLng(35.5464164388861,129.302331361544),
                        new LatLng(35.5464154778985,129.302329957237),
                        new LatLng(35.5464142572429,129.302327857116),
                        new LatLng(35.5464123460156,129.302324353698),
                        new LatLng(35.5464111253599,129.302322253577),
                        new LatLng(35.5463810567475,129.302274527917),
                        new LatLng(35.546375185238,129.302265064937),
                        new LatLng(35.5463576647672,129.302238716769),
                        new LatLng(35.5462699073288,129.302107681395),
                        new LatLng(35.5460827940301,129.30182633328),
                        new LatLng(35.5460781629084,129.301818275705),
                        new LatLng(35.5460649940559,129.301792738065),
                        new LatLng(35.5460590104931,129.301781201247),
                        new LatLng(35.5460497795703,129.301763365667),
                        new LatLng(35.54604420806,129.301752867136),
                        new LatLng(35.5460230602378,129.301695403287),
                        new LatLng(35.5460101930348,129.30166093315),
                        new LatLng(35.545911745,129.301337664365),
                        new LatLng(35.5459036728283,129.301310557631),
                        new LatLng(35.5458976883286,129.301284881441),
                        new LatLng(35.5458567320442,129.301076972123),
                        new LatLng(35.5457599854614,129.300568718628),
                        new LatLng(35.5457382299399,129.30045439765),
                        new LatLng(35.5457250323858,129.300385791322),
                        new LatLng(35.545711472934,129.300314073448),
                        new LatLng(35.5456983264244,129.30025029813),
                        new LatLng(35.5456660385562,129.300090189292),
                        new LatLng(35.5456142776756,129.299836481165),
                        new LatLng(35.5455869093546,129.299706136501),
                        new LatLng(35.5455622901611,129.299564850157),
                        new LatLng(35.5455546936659,129.299520187075),
                        new LatLng(35.5455474283261,129.299465532819),
                        new LatLng(35.5455208372809,129.29927215971),
                        new LatLng(35.5455108129156,129.299199517796),
                        new LatLng(35.5455041467289,129.299150391414),
                        new LatLng(35.5454995783871,129.29911683491),
                        new LatLng(35.5454905666606,129.299035605077),
                        new LatLng(35.5454834558239,129.298973043587),
                        new LatLng(35.5454680164288,129.29882994968),
                        new LatLng(35.5454628798103,129.298781898827),
                        new LatLng(35.5454557176557,129.29871450643),
                        new LatLng(35.5454533204056,129.298692384167),
                        new LatLng(35.5454507995132,129.29866922471),
                        new LatLng(35.5454479462846,129.298641928103),
                        new LatLng(35.5454444641566,129.298610129292),
                        new LatLng(35.5454428104065,129.298593546403),
                        new LatLng(35.5454420767439,129.298587665168),
                        new LatLng(35.5454417247244,129.298584200722),
                        new LatLng(35.5454414873028,129.298581784466),
                        new LatLng(35.5454408781213,129.298576598526),
                        new LatLng(35.545440650556,129.298573840403),
                        new LatLng(35.5454404024351,129.298572107914),
                        new LatLng(35.545439223524,129.298560357538),
                        new LatLng(35.5454368163892,129.298538577151),
                        new LatLng(35.5454334981684,129.298506095146),
                        new LatLng(35.5454310909966,129.298484325791),
                        new LatLng(35.5454287342019,129.298467718256),
                        new LatLng(35.5454283722956,129.298464606707),
                        new LatLng(35.5454027293529,129.298280899218),
                        new LatLng(35.5453604978931,129.297991979093),
                        new LatLng(35.545303969602,129.297611343708),
                        new LatLng(35.5452508736218,129.297249404766),
                        new LatLng(35.5452146645803,129.297006830047),
                        new LatLng(35.545213911109,129.297001643603),
                        new LatLng(35.5452139223931,129.296846243599),
                        new LatLng(35.5452110957037,129.29644714519),
                        new LatLng(35.5452083267504,129.296171407513),
                        new LatLng(35.5452072738965,129.296071105014),
                        new LatLng(35.545207200833,129.296060428576),
                        new LatLng(35.5452071503759,129.296055255743),
                        new LatLng(35.5452069942853,129.296049045788),
                        new LatLng(35.5452067574626,129.296024229444),
                        new LatLng(35.5452064988871,129.295993556568),
                        new LatLng(35.5452061478868,129.295960126079),
                        new LatLng(35.5452061996916,129.295957368993),
                        new LatLng(35.545206385007,129.295955307229),
                        new LatLng(35.545206602402,129.29595118314),
                        new LatLng(35.5452080702636,129.295933310334),
                        new LatLng(35.5452084434259,129.29592815008),
                        new LatLng(35.545211151777,129.295911682505),
                        new LatLng(35.5452378540621,129.295759115265),
                        new LatLng(35.5452538364015,129.295666540199),
                        new LatLng(35.5452551077659,129.295658989905),
                        new LatLng(35.5452563684205,129.295652134405),
                        new LatLng(35.5452576397841,129.295644584111),
                        new LatLng(35.5452592110808,129.295636020234),
                        new LatLng(35.5452620644213,129.295619222295),
                        new LatLng(35.5452677407172,129.295586993914),
                        new LatLng(35.5452748629616,129.295545848258),
                        new LatLng(35.5452897278824,129.295460471037),
                        new LatLng(35.5452939770489,129.295436818074),
                        new LatLng(35.545296200068,129.295423436845),
                        new LatLng(35.5453034052007,129.295392636772),
                        new LatLng(35.5453150032522,129.295345761246),
                        new LatLng(35.5453173088184,129.295335490523),
                        new LatLng(35.545371839437,129.295155793485),
                        new LatLng(35.5454265045566,129.294968872612),
                        new LatLng(35.545433285531,129.294945636888),
                        new LatLng(35.5454392089882,129.294930294893),
                        new LatLng(35.5454526994217,129.294902087413),
                        new LatLng(35.5454676674307,129.294870466275),
                        new LatLng(35.5455203369119,129.294773756121),
                        new LatLng(35.5455893490697,129.294647205311),
                        new LatLng(35.5457057478379,129.294420351002),
                        new LatLng(35.5457285210064,129.294377927419),
                        new LatLng(35.5457327281324,129.294371490656),
                        new LatLng(35.5457361705632,129.294368150309),
                        new LatLng(35.5457514080617,129.294351695058),
                        new LatLng(35.5458106831678,129.294285162032),
                        new LatLng(35.5458374461266,129.294255248933),
                        new LatLng(35.5458482283077,129.294243497934),
                        new LatLng(35.5458581533665,129.294232074691),
                        new LatLng(35.5458623284345,129.294227700253),
                        new LatLng(35.5458686553118,129.294220653543),
                        new LatLng(35.5458909522534,129.294196139501),
                        new LatLng(35.5459353929393,129.29414708876),
                        new LatLng(35.5459369851373,129.294144723269),
                        new LatLng(35.5459701582023,129.294080885476),
                        new LatLng(35.5461376425698,129.293751764262),
                        new LatLng(35.5461416112883,129.293743264103),
                        new LatLng(35.5461435346359,129.293738153521),
                        new LatLng(35.546179238284,129.293645439013),
                        new LatLng(35.5462287856765,129.29351246276),
                        new LatLng(35.5462295593366,129.293509377379),
                        new LatLng(35.5462296217292,129.293505947511),
                        new LatLng(35.5462294877035,129.293498016999),
                        new LatLng(35.5462235630929,129.29343204065),
                        new LatLng(35.5462212470012,129.293405782659),
                        new LatLng(35.5461799420934,129.293015925904),
                        new LatLng(35.5461757647624,129.292976525381),
                        new LatLng(35.546175763403,129.292969632104),
                        new LatLng(35.546241225928,129.292643800523),
                        new LatLng(35.5462582302224,129.292571234426),
                        new LatLng(35.5463119699347,129.292396339305),
                        new LatLng(35.5463340809058,129.292336673709),
                        new LatLng(35.5463842048501,129.292218190926),
                        new LatLng(35.5464535661595,129.292057866191),
                        new LatLng(35.5464582788411,129.292047317154),
                        new LatLng(35.5464609346863,129.292041194462),
                        new LatLng(35.5464702590879,129.292024584934),
                        new LatLng(35.5466775145444,129.291640068195),
                        new LatLng(35.5466827663493,129.291630215893),
                        new LatLng(35.5466863841092,129.29162515545),
                        new LatLng(35.5466885449282,129.291622461056),
                        new LatLng(35.546710345516,129.29160171628),
                        new LatLng(35.5467685552319,129.291546514738),
                        new LatLng(35.5468473134615,129.291470188762),
                        new LatLng(35.5468625505389,129.291453743764),
                        new LatLng(35.5468999808383,129.291410698721),
                        new LatLng(35.547001449506,129.291295057413),
                        new LatLng(35.5470799080202,129.291204601284),
                        new LatLng(35.5471121702103,129.291166566807),
                        new LatLng(35.5471203979852,129.291156129542),
                        new LatLng(35.5471990328138,129.291056023075),
                        new LatLng(35.5472576229418,129.290981189871),
                        new LatLng(35.5472951359354,129.290933666764),
                        new LatLng(35.5473640636961,129.290848105843),
                        new LatLng(35.5476447027871,129.290506683536),
                        new LatLng(35.5477046576323,129.29043396104),
                        new LatLng(35.5477225306901,129.290412065554),
                        new LatLng(35.5477421294113,129.290388499775),
                        new LatLng(35.5477780196756,129.290344731329),
                        new LatLng(35.5478028183783,129.2903140812),
                        new LatLng(35.54781160412,129.290303987674),
                        new LatLng(35.5478595167043,129.290249872517),
                        new LatLng(35.5479062189282,129.290200550776),
                        new LatLng(35.5479500384703,129.290154240719),
                        new LatLng(35.5479783515038,129.290124033215),
                        new LatLng(35.5480077166876,129.29009109415),
                        new LatLng(35.5480370547944,129.290058165992),
                        new LatLng(35.5480880154753,129.289999660691),
                        new LatLng(35.5480946190806,129.28999364019),
                        new LatLng(35.5481583908689,129.289941699145),
                        new LatLng(35.5482486752874,129.289866051286),
                        new LatLng(35.5483452756529,129.289784028748),
                        new LatLng(35.5483521299739,129.289778703968),
                        new LatLng(35.5483589621255,129.289775110745),
                        new LatLng(35.5485032295274,129.289718913367),
                        new LatLng(35.5485165644222,129.289713777216),
                        new LatLng(35.5485809651385,129.289681492615),
                        new LatLng(35.5486818881107,129.289631294293),
                        new LatLng(35.5488484826165,129.289548848671),
                        new LatLng(35.5488851384133,129.289531630255),
                        new LatLng(35.5490592060581,129.289418725051),
                        new LatLng(35.5491799233746,129.289334625574),
                        new LatLng(35.5492990902984,129.289250498244),
                        new LatLng(35.5493132520076,129.289238835359),
                        new LatLng(35.5494329024728,129.289137139194),
                        new LatLng(35.5494353418236,129.289134798587),
                        new LatLng(35.54949688801,129.289052119334),
                        new LatLng(35.5495763872211,129.28894411369),
                        new LatLng(35.5495956865652,129.288921229786),
                        new LatLng(35.5497160490238,129.288781648244),
                        new LatLng(35.5498103618517,129.288671985276),
                        new LatLng(35.549830414997,129.288646710476),
                        new LatLng(35.5498976670961,129.288560069054),
                        new LatLng(35.5499688031444,129.288462488785),
                        new LatLng(35.5499735687358,129.288456086455),
                        new LatLng(35.5499856212647,129.288436783222),
                        new LatLng(35.5500517122111,129.288322871736),
                        new LatLng(35.550153246772,129.288136576518),
                        new LatLng(35.5502324435706,129.287984801801),
                        new LatLng(35.5503299551627,129.287780468728),
                        new LatLng(35.550420148464,129.287590745721),
                        new LatLng(35.5504412837082,129.28754620521),
                        new LatLng(35.5504530066515,129.287521385647),
                        new LatLng(35.5504760256523,129.28747310165),
                        new LatLng(35.5504769040276,129.287471406178),
                        new LatLng(35.5505215813562,129.287313816239),
                        new LatLng(35.5505284960677,129.287290578873),
                        new LatLng(35.5505297463975,129.28728407571),
                        new LatLng(35.5505794235876,129.287047706129),
                        new LatLng(35.5505876703935,129.287006252151),
                        new LatLng(35.5506396939725,129.286787527269),
                        new LatLng(35.5506707278367,129.286658499741),
                        new LatLng(35.5506818382717,129.286614364534),
                        new LatLng(35.550697381489,129.28655966738),
                        new LatLng(35.5506997895717,129.286551469694),
                        new LatLng(35.5507037167422,129.286537453623),
                        new LatLng(35.5507184962922,129.286485489141),
                        new LatLng(35.5507426483795,129.286400027033),
                        new LatLng(35.5507870668727,129.286233125852),
                        new LatLng(35.5509294748626,129.285673068599),
                        new LatLng(35.5509595882725,129.28554779812),
                        new LatLng(35.5510002931716,129.285391813549),
                        new LatLng(35.5510040358777,129.285379517382),
                        new LatLng(35.5510579220255,129.285218395041),
                        new LatLng(35.5512949155091,129.284578655641),
                        new LatLng(35.5513806152345,129.284365714989),
                        new LatLng(35.5514158702634,129.284280566292),
                        new LatLng(35.551474015081,129.284147826407),
                        new LatLng(35.5514801748777,129.284134898859),
                        new LatLng(35.5515699061293,129.283947571963),
                        new LatLng(35.5516055037653,129.283873807025),
                        new LatLng(35.5516211825596,129.283841511084),
                        new LatLng(35.551635828158,129.283811605013),
                        new LatLng(35.5516403754674,129.283802080024),
                        new LatLng(35.5516793503225,129.283721863223),
                        new LatLng(35.5517190690641,129.283639597373),
                        new LatLng(35.5517725151726,129.283538418965),
                        new LatLng(35.5518176097711,129.283454583438),
                        new LatLng(35.5518433032864,129.283406725965),
                        new LatLng(35.5518647706428,129.283365979055),
                        new LatLng(35.5519293258393,129.28324374976),
                        new LatLng(35.5519540171848,129.283196550448),
                        new LatLng(35.5519567881635,129.283191111311),
                        new LatLng(35.5519779146912,129.283153462532),
                        new LatLng(35.5520169412513,129.283085654054),
                        new LatLng(35.5520341194311,129.283055811708),
                        new LatLng(35.5520580038546,129.283014444348),
                        new LatLng(35.5520652811469,129.283001564647),
                        new LatLng(35.5520703766155,129.282992736371),
                        new LatLng(35.5520807116955,129.282975113408),
                        new LatLng(35.5520856629145,129.282966295654),
                        new LatLng(35.5520936628823,129.282952745638),
                        new LatLng(35.5521006509773,129.282940184786),
                        new LatLng(35.5521109950635,129.282922561842),
                        new LatLng(35.5521219102141,129.282903573163),
                        new LatLng(35.5521454856935,129.282863241459),
                        new LatLng(35.5521710972094,129.282819519588),
                        new LatLng(35.5522906803963,129.282616818683),
                        new LatLng(35.552452743686,129.282341599144),
                        new LatLng(35.5526002849623,129.282097322511),
                        new LatLng(35.5526268786613,129.282053625633),
                        new LatLng(35.5526562220331,129.282005868193),
                        new LatLng(35.5528517609106,129.281680586556),
                        new LatLng(35.5529262068448,129.281556568848),
                        new LatLng(35.5529286975251,129.281551470548),
                        new LatLng(35.5529307433478,129.281547738441),
                        new LatLng(35.5531731110973,129.281054241369),
                        new LatLng(35.5532636153608,129.280869678365),
                        new LatLng(35.5533904982638,129.280623427737),
                        new LatLng(35.5534674012609,129.280473297137),
                        new LatLng(35.5534681557437,129.280470564253),
                        new LatLng(35.5535466310024,129.280244649973),
                        new LatLng(35.5535477057357,129.280239855537),
                        new LatLng(35.5535854298745,129.280091364541),
                        new LatLng(35.5536456052077,129.279858040118),
                        new LatLng(35.5536636656433,129.279789295787),
                        new LatLng(35.5536765301295,129.279741755698),
                        new LatLng(35.5536847145437,129.279710623485),
                        new LatLng(35.5536929169521,129.279679502359),
                        new LatLng(35.5536932273952,129.27967778271),
                        new LatLng(35.5537021614781,129.279622551936),
                        new LatLng(35.5537207736778,129.279502121555),
                        new LatLng(35.5537677496771,129.279199160715),
                        new LatLng(35.5537719118524,129.279172757556),
                        new LatLng(35.5537915700144,129.279063724853),
                        new LatLng(35.5538090484976,129.278965659716),
                        new LatLng(35.5538363796687,129.278808605417),
                        new LatLng(35.5538564069447,129.278687870669),
                        new LatLng(35.553893475979,129.278454917139),
                        new LatLng(35.5539284361793,129.278221581112),
                        new LatLng(35.5539298930378,129.27821128382),
                        new LatLng(35.5539305531031,129.278206465847),
                        new LatLng(35.5539339418177,129.278183137378),
                        new LatLng(35.553939620277,129.278144010354),
                        new LatLng(35.5539402811243,129.278138850444),
                        new LatLng(35.553953962937,129.278025527997),
                        new LatLng(35.5539764098154,129.277835938974),
                        new LatLng(35.5539775456426,129.277828045173),
                        new LatLng(35.5539780712684,129.277822884793),
                        new LatLng(35.5539842101209,129.277736218671),
                        new LatLng(35.5540078168308,129.277425697129),
                        new LatLng(35.5540408819771,129.277054463836),
                        new LatLng(35.5540627702654,129.276804900572),
                        new LatLng(35.5540930817678,129.276482168725),
                        new LatLng(35.5540953125488,129.276460512789),
                        new LatLng(35.5540965525018,129.276454351073),
                        new LatLng(35.5541587900041,129.276290002143),
                        new LatLng(35.5542185698812,129.276092509426),
                        new LatLng(35.5542297708732,129.276058364607),
                        new LatLng(35.5542411756739,129.27601388504),
                        new LatLng(35.5543221029255,129.275657439352),
                        new LatLng(35.5543898520703,129.275328182086),
                        new LatLng(35.554391430967,129.275319605833),
                        new LatLng(35.5544088518468,129.275201904893),
                        new LatLng(35.5544100690059,129.275189874901),
                        new LatLng(35.5544296951984,129.274970216654),
                        new LatLng(35.554429683799,129.274963322634),
                        new LatLng(35.5544258182815,129.274728186127),
                        new LatLng(35.5544254769178,129.274723695608),
                        new LatLng(35.5543766246795,129.274431809745),
                        new LatLng(35.5543753415939,129.274425220267),
                        new LatLng(35.5543748234851,129.274423144802),
                        new LatLng(35.5542928333323,129.274215782947),
                        new LatLng(35.5542800708021,129.274183376655),
                        new LatLng(35.5542607298827,129.274134237112),
                        new LatLng(35.5541283057017,129.273831381028),
                        new LatLng(35.5540327073116,129.273614333904),
                        new LatLng(35.5539714068275,129.273445120272),
                        new LatLng(35.5539065490754,129.273262371737),
                        new LatLng(35.5538612232297,129.273128079299),
                        new LatLng(35.5538075431957,129.272964936694),
                        new LatLng(35.5537662121737,129.272841776576),
                        new LatLng(35.5537635326696,129.272834818467),
                        new LatLng(35.5537586386311,129.272810557414),
                        new LatLng(35.5537353277342,129.272694782269),
                        new LatLng(35.5537336705868,129.272686139979),
                        new LatLng(35.5537329149909,129.272621334562),
                        new LatLng(35.5537302064419,129.27245893772),
                        new LatLng(35.5537227482817,129.272264018689),
                        new LatLng(35.5537221913854,129.272166829065),
                        new LatLng(35.5537214285577,129.272012766655),
                        new LatLng(35.5537210617417,129.271935222592),
                        new LatLng(35.553721005875,129.271915930454),
                        new LatLng(35.5537209631641,129.271902826344),
                        new LatLng(35.5537208349404,129.271887659286),
                        new LatLng(35.5537207177928,129.271863535682),
                        new LatLng(35.5537206068746,129.27182457638),
                        new LatLng(35.5537204824865,129.271771520341),
                        new LatLng(35.5537205659504,129.271722237355),
                        new LatLng(35.5537216503764,129.271664718113),
                        new LatLng(35.5537226127159,129.271613397474),
                        new LatLng(35.5537230520502,129.271590312583),
                        new LatLng(35.5537231959919,129.271582393328),
                        new LatLng(35.5537233489471,129.271574474104),
                        new LatLng(35.5537251713218,129.271485267353),
                        new LatLng(35.5537278100779,129.271345434369),
                        new LatLng(35.5537303033791,129.271198023089),
                        new LatLng(35.5537322839156,129.271070221913),
                        new LatLng(35.5537307215938,129.270950593335),
                        new LatLng(35.5537318535655,129.270936158493),
                        new LatLng(35.5537332179021,129.270930681013),
                        new LatLng(35.5537851892625,129.270750531909),
                        new LatLng(35.5538427413709,129.270565724384),
                        new LatLng(35.5538634328574,129.270499104394),
                        new LatLng(35.5538728857477,129.270468019523),
                        new LatLng(35.5538971473841,129.270413213831),
                        new LatLng(35.5539801071141,129.270225335969),
                        new LatLng(35.5540693713474,129.270023503335),
                        new LatLng(35.554071147209,129.270019405979),
                        new LatLng(35.5540944054544,129.269957691686),
                        new LatLng(35.5541452277293,129.269823368347),
                        new LatLng(35.5541478930832,129.269816516365),
                        new LatLng(35.5541495246667,129.269812440581),
                        new LatLng(35.5542230948361,129.269651168511),
                        new LatLng(35.5543217814674,129.269435467748),
                        new LatLng(35.5543586377152,129.269355157038),
                        new LatLng(35.5543918257914,129.269282709732),
                        new LatLng(35.5544094538643,129.269243577479),
                        new LatLng(35.5544371035536,129.269180939725),
                        new LatLng(35.554447559314,129.269156773856),
                        new LatLng(35.554449770066,129.269151663114),
                        new LatLng(35.5544524157618,129.269145527993),
                        new LatLng(35.5544606600052,129.269126814799),
                        new LatLng(35.5545152463751,129.26900187866),
                        new LatLng(35.554565729655,129.268885797155),
                        new LatLng(35.5545677766285,129.268881369738),
                        new LatLng(35.5546119396078,129.268794376313),
                        new LatLng(35.5546343109855,129.268750218704),
                        new LatLng(35.5546391357068,129.268741068461),
                        new LatLng(35.5546404577984,129.268738337311),
                        new LatLng(35.5546414808911,129.268736300084),
                        new LatLng(35.5546433731069,129.26873255603),
                        new LatLng(35.5546520010679,129.268715564765),
                        new LatLng(35.5546578586752,129.26870402435),
                        new LatLng(35.5546708787559,129.268677848302),
                        new LatLng(35.5546822867814,129.26865508632),
                        new LatLng(35.554689002975,129.268642522918),
                        new LatLng(35.5547061474933,129.268614055182),
                        new LatLng(35.5547241791047,129.268583902725),
                        new LatLng(35.5547394509664,129.268558484176),
                        new LatLng(35.5548009372183,129.268455796406),
                        new LatLng(35.5548051632634,129.268448331796),
                        new LatLng(35.5548153723017,129.268429680116),
                        new LatLng(35.5548556520322,129.268353957432),
                        new LatLng(35.554939091952,129.268200182928),
                        new LatLng(35.5550370096434,129.268061997965),
                        new LatLng(35.5551402994139,129.267915689963),
                        new LatLng(35.5551433370492,129.267911640805),
                        new LatLng(35.5552014912532,129.267844006893),
                        new LatLng(35.555375020773,129.26763902775),
                        new LatLng(35.5555000504453,129.267489183463),
                        new LatLng(35.5555992819649,129.267372058308),
                        new LatLng(35.5556368599122,129.267327641128),
                        new LatLng(35.5557067195682,129.267245164825),
                        new LatLng(35.5557775548787,129.267161687818),
                        new LatLng(35.5558224796265,129.267108856313),
                        new LatLng(35.5558633647459,129.267060732504),
                        new LatLng(35.5558694196708,129.267053659827),
                        new LatLng(35.5558707214118,129.267051965414),
                        new LatLng(35.5558725924853,129.267049611046),
                        new LatLng(35.5558764781006,129.26704524473),
                        new LatLng(35.5558803644934,129.267040525438),
                        new LatLng(35.5558829581592,129.267037500588),
                        new LatLng(35.5558845302677,129.267035829128),
                        new LatLng(35.5558869970343,129.267033123746),
                        new LatLng(35.5558884159068,129.26703145178),
                        new LatLng(35.555892870149,129.267026745391),
                        new LatLng(35.5559500720284,129.266965637175),
                        new LatLng(35.5560355833804,129.266873273284),
                        new LatLng(35.5561314091691,129.266771556151),
                        new LatLng(35.5561605831692,129.266740667328),
                        new LatLng(35.5561872896495,129.266712825831),
                        new LatLng(35.5561972106241,129.266702070583),
                        new LatLng(35.5562128679812,129.266685620375),
                        new LatLng(35.5562295280848,129.266668169677),
                        new LatLng(35.5562796721346,129.266615134183),
                        new LatLng(35.5563323910592,129.266559404597),
                        new LatLng(35.5563555198765,129.266535246463),
                        new LatLng(35.5563575261479,129.266532892514),
                        new LatLng(35.5563586821557,129.266531881502),
                        new LatLng(35.5563614019786,129.266528868064),
                        new LatLng(35.5563994676478,129.266496166226),
                        new LatLng(35.5564591725546,129.266444430513),
                        new LatLng(35.556498809573,129.266410388028),
                        new LatLng(35.5565331638884,129.266380685233),
                        new LatLng(35.5565793852629,129.266340630579),
                        new LatLng(35.5566244769085,129.266301928934),
                        new LatLng(35.556645229813,129.266284237829),
                        new LatLng(35.5566596792282,129.266271897917),
                        new LatLng(35.5566778497254,129.266256216916),
                        new LatLng(35.5566890114721,129.266246877555),
                        new LatLng(35.5566923081517,129.266243877024),
                        new LatLng(35.5566951707113,129.266241536905),
                        new LatLng(35.5566983134279,129.266238866787),
                        new LatLng(35.5567006073622,129.266236866749),
                        new LatLng(35.556707027979,129.266231537987),
                        new LatLng(35.5567106319053,129.266228185483),
                        new LatLng(35.5567139188436,129.266225515839),
                        new LatLng(35.5567160685556,129.266223515325),
                        new LatLng(35.5567190662745,129.266221197711),
                        new LatLng(35.5567213609838,129.266218844692),
                        new LatLng(35.5567247921197,129.266216186552),
                        new LatLng(35.5567267968827,129.266214516481),
                        new LatLng(35.5567343832684,129.266207834776),
                        new LatLng(35.556748543505,129.266195824807),
                        new LatLng(35.5567697395271,129.266177473263),
                        new LatLng(35.5567977805869,129.266153441349),
                        new LatLng(35.5568116704017,129.266141430471),
                        new LatLng(35.5568165384479,129.266137089353),
                        new LatLng(35.5568304500914,129.266123346721),
                        new LatLng(35.5568627455826,129.266091166036),
                        new LatLng(35.5569870240433,129.265966475198),
                        new LatLng(35.5570406935383,129.265912843662),
                        new LatLng(35.5570926376571,129.265860894091),
                        new LatLng(35.5571336776694,129.265820005568),
                        new LatLng(35.5571678343639,129.265785812125),
                        new LatLng(35.5572037066114,129.265750289566),
                        new LatLng(35.5572100213377,129.265743912463),
                        new LatLng(35.5572150343412,129.265739229822),
                        new LatLng(35.5575316243244,129.265548951165),
                        new LatLng(35.5577178038366,129.265435282708),
                        new LatLng(35.5581851432399,129.264902545436),
                        new LatLng(35.5584266417062,129.264631567097),
                        new LatLng(35.5589708931715,129.264007933381),
                        new LatLng(35.5594632943807,129.263715396375),
                        new LatLng(35.5596213835442,129.263627122316),
                        new LatLng(35.5597293710653,129.263560548401),
                        new LatLng(35.5599346711944,129.263432605077),
                        new LatLng(35.5600806859403,129.263342271961),
                        new LatLng(35.5602171620254,129.263236188078),
                        new LatLng(35.5603141695019,129.263161701182),
                        new LatLng(35.5605128011676,129.262991164815),
                        new LatLng(35.5607359250187,129.262761701058),
                        new LatLng(35.5611055362167,129.262327165238),
                        new LatLng(35.5612141494385,129.262166857401),
                        new LatLng(35.5614138604396,129.261871610977),
                        new LatLng(35.5614956567068,129.261707078435),
                        new LatLng(35.5616394322561,129.261271021346),
                        new LatLng(35.5616916154818,129.261010904651),
                        new LatLng(35.5617301295141,129.260676987802),
                        new LatLng(35.5617418175825,129.260376442498),
                        new LatLng(35.5617596974222,129.259933049609),
                        new LatLng(35.5617817899476,129.259445301805),
                        new LatLng(35.5618336060912,129.258979755741),
                        new LatLng(35.5618472823515,129.258978762555),
                        new LatLng(35.5625874201968,129.258930595786),
                        new LatLng(35.5628905833088,129.258885343637),
                        new LatLng(35.562894821077,129.258884772522),
                        new LatLng(35.5629219346464,129.258880711399),
                        new LatLng(35.563427363974,129.258568159083),
                        new LatLng(35.5634331422886,129.258567978977),
                        new LatLng(35.5640457668563,129.258554492037),
                        new LatLng(35.5640524636425,129.258550530992),
                        new LatLng(35.5646744310497,129.258188182645),
                        new LatLng(35.5648203586849,129.258103008377),
                        new LatLng(35.5650184618966,129.258156118627),
                        new LatLng(35.5650506956605,129.25816460565),
                        new LatLng(35.5655175428806,129.258288339469),
                        new LatLng(35.5658658354169,129.258269847424),
                        new LatLng(35.5659787201757,129.258264051886),
                        new LatLng(35.5660395455281,129.258234735508),
                        new LatLng(35.5661465340135,129.258182939796),
                        new LatLng(35.5661770773694,129.258168287485),
                        new LatLng(35.5666043626137,129.257961762905),
                        new LatLng(35.5668492808829,129.257605347094),
                        new LatLng(35.5668980750775,129.257472985038),
                        new LatLng(35.5670357339966,129.257100129785),
                        new LatLng(35.5672805347847,129.256968091699),
                        new LatLng(35.5673208258612,129.256951638341),
                        new LatLng(35.5673442367916,129.256942302262),
                        new LatLng(35.5673941809552,129.256921985179),
                        new LatLng(35.568150075884,129.257183080652),
                        new LatLng(35.568740479299,129.257348533708),
                        new LatLng(35.5687607935207,129.257354268942),
                        new LatLng(35.568779981056,129.25735997853),
                        new LatLng(35.569041375888,129.25743211222),
                        new LatLng(35.5691451732271,129.257460872943),
                        new LatLng(35.5694393717333,129.257442921572),
                        new LatLng(35.5695109872511,129.257438725432),
                        new LatLng(35.5698202881225,129.257749689293),
                        new LatLng(35.5699703731386,129.257900728018),
                        new LatLng(35.5702705426526,129.258376194657),
                        new LatLng(35.5703408296658,129.258487770707),
                        new LatLng(35.5705955031811,129.258520082421),
                        new LatLng(35.5706287912717,129.258524458403),
                        new LatLng(35.5706556272506,129.258527964261),
                        new LatLng(35.5706589974927,129.258528416334),
                        new LatLng(35.570818104649,129.258370871426),
                        new LatLng(35.5709043239671,129.258285743157),
                        new LatLng(35.5712739427957,129.257924543635),
                        new LatLng(35.5712812590475,129.257917506041),
                        new LatLng(35.5713930436034,129.257903420601),
                        new LatLng(35.5713985432546,129.257902875465),
                        new LatLng(35.5714090162777,129.257907652913),
                        new LatLng(35.5715234437937,129.257947746508),
                        new LatLng(35.5719140037379,129.258085202362),
                        new LatLng(35.5723733170763,129.258017425567),
                        new LatLng(35.5723808820096,129.258012131867),
                        new LatLng(35.5729106391576,129.257626456009),
                        new LatLng(35.5734065194993,129.257801341163),
                        new LatLng(35.573992487373,129.257873279468),
                        new LatLng(35.5742558956063,129.257905486227),
                        new LatLng(35.5742672087627,129.257917868328),
                        new LatLng(35.5745547544467,129.258420583068),
                        new LatLng(35.5746874222943,129.258652493445),
                        new LatLng(35.5745811531184,129.259830106518),
                        new LatLng(35.574580432344,129.259838356989),
                        new LatLng(35.5750368298822,129.259836016596),
                        new LatLng(35.5754606355563,129.259596974327),
                        new LatLng(35.5759342478652,129.259397588546),
                        new LatLng(35.576753112244,129.258965563477),
                        new LatLng(35.5771296688643,129.259188817994),
                        new LatLng(35.5772350976329,129.259251064808),
                        new LatLng(35.577261411998,129.259266629158),
                        new LatLng(35.5772772924109,129.259276036475),
                        new LatLng(35.5779659123868,129.259355004673),
                        new LatLng(35.5782100999705,129.259000603958),
                        new LatLng(35.578672585747,129.258890865282),
                        new LatLng(35.579028030862,129.258054221669),
                        new LatLng(35.5788919381663,129.256960058081),
                        new LatLng(35.5797430546756,129.256361704386),
                        new LatLng(35.5802481966689,129.256147316622),
                        new LatLng(35.5804743231387,129.255530738657),
                        new LatLng(35.5808945932703,129.255412557161),
                        new LatLng(35.5812245444961,129.255319776617),
                        new LatLng(35.5812726319979,129.255316298217),
                        new LatLng(35.5813699254143,129.255309013913),
                        new LatLng(35.5817292932803,129.255269796572),
                        new LatLng(35.581781351726,129.255264024523),
                        new LatLng(35.5821124414459,129.255058531906),
                        new LatLng(35.5821174233349,129.255055579425),
                        new LatLng(35.5822930719616,129.25494672931),
                        new LatLng(35.5823575314555,129.254963362438),
                        new LatLng(35.5823978917736,129.254973806661),
                        new LatLng(35.5826875595672,129.255039501974),
                        new LatLng(35.5830179150119,129.255114263888),
                        new LatLng(35.5834014267741,129.255252564416),
                        new LatLng(35.5835753350586,129.255379467904),
                        new LatLng(35.5839006699364,129.255616466257),
                        new LatLng(35.5839148358916,129.255626861318),
                        new LatLng(35.5845536978168,129.255279693832),
                        new LatLng(35.5846429846974,129.255226347928),
                        new LatLng(35.584681721622,129.255202955616),
                        new LatLng(35.5849023054343,129.255183624018),
                        new LatLng(35.5849996189741,129.255175313101),
                        new LatLng(35.5852472514192,129.255109864828),
                        new LatLng(35.5856563502425,129.255001371615),
                        new LatLng(35.5857169210402,129.254985474077),
                        new LatLng(35.5857347513376,129.254980807461),
                        new LatLng(35.5857942686559,129.254900088883),
                        new LatLng(35.5858170941171,129.254869009933),
                        new LatLng(35.5858512008853,129.254822727618),
                        new LatLng(35.5858751739144,129.254790306008),
                        new LatLng(35.5858913549448,129.25476835382),
                        new LatLng(35.5859092716154,129.254744034633),
                        new LatLng(35.5859458191918,129.254694372248),
                        new LatLng(35.5859910449118,129.254632896909),
                        new LatLng(35.586029328037,129.254580889494),
                        new LatLng(35.5860669059744,129.254529872934),
                        new LatLng(35.5861202036983,129.254457597751),
                        new LatLng(35.5861703470481,129.254389362293),
                        new LatLng(35.5861742523995,129.254383956527),
                        new LatLng(35.5862267529215,129.254309239966),
                        new LatLng(35.5862713060646,129.254246018593),
                        new LatLng(35.5863057338408,129.25419698911),
                        new LatLng(35.5863488404298,129.254135804495),
                        new LatLng(35.5863928151848,129.254073254233),
                        new LatLng(35.58642087795,129.25403336346),
                        new LatLng(35.5864477833921,129.253995157344),
                        new LatLng(35.5864729531934,129.253959318228),
                        new LatLng(35.586521264419,129.253973782055),
                        new LatLng(35.586871335674,129.254077704027),
                        new LatLng(35.5871209328195,129.254321542064),
                        new LatLng(35.587211373045,129.254409917881),
                        new LatLng(35.5874861359744,129.254392111284),
                        new LatLng(35.5875218091019,129.254389663413),
                        new LatLng(35.587549730005,129.25438734564),
                        new LatLng(35.5876386390316,129.254376391788),
                        new LatLng(35.587725004857,129.254366047868),
                        new LatLng(35.5878285919721,129.254353440758),
                        new LatLng(35.5878403129706,129.254352043083),
                        new LatLng(35.5879519421847,129.254338622576),
                        new LatLng(35.5880249007689,129.254329979935),
                        new LatLng(35.5881221828679,129.254315123834),
                        new LatLng(35.5882525389913,129.254294997664),
                        new LatLng(35.5883907847157,129.254273704456),
                        new LatLng(35.5884598261151,129.254263217577),
                        new LatLng(35.5884988053831,129.254257403293),
                        new LatLng(35.5885015303242,129.254247502389),
                        new LatLng(35.5887545137421,129.253330973522),
                        new LatLng(35.5887549680094,129.253329264508),
                        new LatLng(35.589404493571,129.25287064726),
                        new LatLng(35.5894408728135,129.252845126314),
                        new LatLng(35.5896007825977,129.252726865545),
                        new LatLng(35.5896092475784,129.252726417489),
                        new LatLng(35.5900294166825,129.252711299267),
                        new LatLng(35.5903851466156,129.25273884064),
                        new LatLng(35.5904772332677,129.252798995092),
                        new LatLng(35.5905599939668,129.252853172473),
                        new LatLng(35.5905641707214,129.252855900226),
                        new LatLng(35.5904967067011,129.253263598881),
                        new LatLng(35.5904659691554,129.253462005891),
                        new LatLng(35.590460302973,129.253516326028),
                        new LatLng(35.5904456504651,129.253561767652),
                        new LatLng(35.5903240348113,129.253815915407),
                        new LatLng(35.5902800799698,129.253907756582),
                        new LatLng(35.5902086213195,129.254069519083),
                        new LatLng(35.5902077336374,129.254071579891),
                        new LatLng(35.5901128984643,129.254286458593),
                        new LatLng(35.5899863265242,129.254496315167),
                        new LatLng(35.5899470159801,129.254655529349),
                        new LatLng(35.5899055138309,129.254819514726),
                        new LatLng(35.5898562620561,129.254990858066),
                        new LatLng(35.5898098918176,129.255159186636),
                        new LatLng(35.5897908301926,129.255222082435),
                        new LatLng(35.589970118857,129.255588775868),
                        new LatLng(35.5901798588341,129.256013546685),
                        new LatLng(35.5899444150497,129.25624000582),
                        new LatLng(35.5898278263686,129.25635222876),
                        new LatLng(35.5898950869918,129.256693364672),
                        new LatLng(35.5899271218265,129.256855265107),
                        new LatLng(35.5898378824375,129.257026182162),
                        new LatLng(35.5897559653505,129.257182820488),
                        new LatLng(35.5895843473383,129.257353827724),
                        new LatLng(35.5893833261096,129.257554358966),
                        new LatLng(35.5892101445823,129.257727048013),
                        new LatLng(35.5891004917465,129.257942545595),
                        new LatLng(35.5889616185299,129.258215839473),
                        new LatLng(35.5888782873883,129.258379676282),
                        new LatLng(35.5887074199934,129.258510701429),
                        new LatLng(35.5883929867121,129.258752179859),
                        new LatLng(35.588228993027,129.258990287095),
                        new LatLng(35.58800666935,129.259312932906),
                        new LatLng(35.5878241388297,129.259577760181),
                        new LatLng(35.5878043471684,129.259769914442),
                        new LatLng(35.5877718038867,129.260086523867),
                        new LatLng(35.5875331728099,129.260865163175),
                        new LatLng(35.5875285252989,129.260880210835),
                        new LatLng(35.5874506625283,129.261240359482),
                        new LatLng(35.587448194656,129.261252004363),
                        new LatLng(35.5873061980424,129.261907878219),
                        new LatLng(35.5872052462301,129.262035357029),
                        new LatLng(35.5870337564359,129.262252209728),
                        new LatLng(35.5869524087114,129.262355066374),
                        new LatLng(35.5868944351058,129.262428248803),
                        new LatLng(35.5868915516391,129.262431958179),
                        new LatLng(35.5868792374726,129.262457474858),
                        new LatLng(35.5868339729013,129.262551686636),
                        new LatLng(35.5866927921065,129.263156552997),
                        new LatLng(35.5866883426643,129.263175728026),
                        new LatLng(35.5867684425294,129.264024002666),
                        new LatLng(35.5867705471071,129.26404682952),
                        new LatLng(35.5867711374949,129.264053044045),
                        new LatLng(35.5865088041066,129.26474378052),
                        new LatLng(35.5864720087211,129.264843072238),
                        new LatLng(35.5862533218442,129.264934120726),
                        new LatLng(35.5859887236859,129.26504734142),
                        new LatLng(35.5857694080015,129.26535143312),
                        new LatLng(35.5857679613176,129.265353469785),
                        new LatLng(35.5858727633022,129.265650823307),
                        new LatLng(35.5859298146096,129.265604521611),
                        new LatLng(35.5859333997287,129.265601509883),
                        new LatLng(35.5859612421146,129.265528187519),
                        new LatLng(35.5859816678679,129.265528067013),
                        new LatLng(35.5859844800383,129.265528142458),
                        new LatLng(35.5859865891539,129.265528204558),
                        new LatLng(35.5860143247134,129.26552829565),
                        new LatLng(35.585939474578,129.265667528339),
                        new LatLng(35.5856121938479,129.266277143417),
                        new LatLng(35.5856029886574,129.266294459564),
                        new LatLng(35.5855404120278,129.266410249565),
                        new LatLng(35.5855382126893,129.266414325134),
                        new LatLng(35.585782786419,129.266504644326),
                        new LatLng(35.5858099133592,129.266515062203),
                        new LatLng(35.5859880125673,129.266583512719),
                        new LatLng(35.5860124625375,129.266593855614),
                        new LatLng(35.5860181904535,129.266596092478),
                        new LatLng(35.586076582129,129.266620826228),
                        new LatLng(35.5861056529123,129.266632674072),
                        new LatLng(35.5861721813238,129.266658681637),
                        new LatLng(35.5861934774627,129.266664456834),
                        new LatLng(35.5861974050154,129.266665595331),
                        new LatLng(35.5862257007226,129.266673291594),
                        new LatLng(35.5863087694971,129.266658403865),
                        new LatLng(35.5863380224324,129.266653016083),
                        new LatLng(35.5863399865731,129.266653419813),
                        new LatLng(35.5863490945039,129.266655745081),
                        new LatLng(35.5864037526312,129.26666900155),
                        new LatLng(35.5864814264568,129.266709457416),
                        new LatLng(35.5865273657316,129.266752468032),
                        new LatLng(35.5865323402241,129.266757096981),
                        new LatLng(35.5865367340897,129.26676342337),
                        new LatLng(35.5865397534796,129.266767637583),
                        new LatLng(35.5866322940654,129.266900912138),
                        new LatLng(35.5868780715771,129.267189158589),
                        new LatLng(35.586891791846,129.267200911883),
                        new LatLng(35.5869839586668,129.267278670026),
                        new LatLng(35.5870424583883,129.267327902283),
                        new LatLng(35.5870739420391,129.26735326516),
                        new LatLng(35.5872230658798,129.267472614902),
                        new LatLng(35.5874243298011,129.267582062818),
                        new LatLng(35.5874938355758,129.267749504808),
                        new LatLng(35.5875013402024,129.267767604841),
                        new LatLng(35.587503805835,129.267773571858),
                        new LatLng(35.5874995949373,129.267802756272),
                        new LatLng(35.5874586297595,129.268086714083),
                        new LatLng(35.5874551145456,129.268131426876),
                        new LatLng(35.5874476624196,129.268228089944),
                        new LatLng(35.5874311777163,129.268617887117),
                        new LatLng(35.5874312754401,129.268634792903),
                        new LatLng(35.5874333365166,129.268936846953),
                        new LatLng(35.5874584603736,129.269240257878),
                        new LatLng(35.587478694808,129.269354591692),
                        new LatLng(35.5875254139743,129.269617918918),
                        new LatLng(35.5876095141047,129.269937472787),
                        new LatLng(35.5876313697136,129.270048060532),
                        new LatLng(35.5876753291234,129.27027098055),
                        new LatLng(35.5876829961181,129.270349453507),
                        new LatLng(35.5877060539095,129.270583515362),
                        new LatLng(35.5876981427687,129.270727395439),
                        new LatLng(35.5876389547085,129.271051160526),
                        new LatLng(35.5875654341017,129.271245945077),
                        new LatLng(35.5875127262286,129.27142062735),
                        new LatLng(35.5873532747186,129.271909124961),
                        new LatLng(35.5872258785995,129.272191332491),
                        new LatLng(35.5871149667204,129.27240607243),
                        new LatLng(35.5871116291802,129.272411148249),
                        new LatLng(35.5870872710256,129.272448386019),
                        new LatLng(35.5869883704045,129.272600730654),
                        new LatLng(35.5869094776825,129.272722266987),
                        new LatLng(35.5867554557496,129.273035080567),
                        new LatLng(35.5865992137987,129.27342058258),
                        new LatLng(35.5865431015442,129.273588606868),
                        new LatLng(35.5864604881641,129.273832427229),
                        new LatLng(35.586329999102,129.274308288879),
                        new LatLng(35.5862793145009,129.274546798242),
                        new LatLng(35.5862646867439,129.274673250761),
                        new LatLng(35.5862289516382,129.274976992692),
                        new LatLng(35.5862078047261,129.275247028802),
                        new LatLng(35.5862011235647,129.275541258055),
                        new LatLng(35.5861743829755,129.275884214347),
                        new LatLng(35.5861017712968,129.276194847465),
                        new LatLng(35.5860694036407,129.276320786332),
                        new LatLng(35.5860690850357,129.276322153547),
                        new LatLng(35.5860355708513,129.276456706494),
                        new LatLng(35.5860344864708,129.276461844957),
                        new LatLng(35.5860119270799,129.276575314858),
                        new LatLng(35.5860116166797,129.27657703521),
                        new LatLng(35.585966483135,129.277050809824),
                        new LatLng(35.5859564517975,129.277156708484),
                        new LatLng(35.5858856467564,129.27740912682),
                        new LatLng(35.5858649007266,129.277486110785),
                        new LatLng(35.5858408265616,129.27757575109),
                        new LatLng(35.5857945080392,129.277739225144),
                        new LatLng(35.5857927748057,129.277756069129),
                        new LatLng(35.5857788911315,129.277894616842),
                        new LatLng(35.5857501587555,129.278230611836),
                        new LatLng(35.5857239575811,129.278559100707),
                        new LatLng(35.5856891412153,129.278702221574),
                        new LatLng(35.5856436004284,129.278899165439),
                        new LatLng(35.585583072595,129.27919634014),
                        new LatLng(35.5855048689205,129.279504741696),
                        new LatLng(35.585311284194,129.280106694001),
                        new LatLng(35.5853000778882,129.28017772903),
                        new LatLng(35.5852767422944,129.280317390287),
                        new LatLng(35.5852424982755,129.280527745353),
                        new LatLng(35.5852270074439,129.280631063636),
                        new LatLng(35.5852050561803,129.280772141868),
                        new LatLng(35.5851629934821,129.281038116767),
                        new LatLng(35.5850429205759,129.281266732711),
                        new LatLng(35.5849421635689,129.281464507465),
                        new LatLng(35.5848961407794,129.281649716524),
                        new LatLng(35.5848347008773,129.281882728397),
                        new LatLng(35.5848149045548,129.281968706653),
                        new LatLng(35.5848087864733,129.282076095454),
                        new LatLng(35.584793566299,129.282143915737),
                        new LatLng(35.5845476071699,129.282618202611),
                        new LatLng(35.584531707488,129.282706687803),
                        new LatLng(35.5845054451284,129.282859357441),
                        new LatLng(35.5844738037889,129.282983947445),
                        new LatLng(35.5844669621811,129.28301098005),
                        new LatLng(35.5844585125873,129.283070371164),
                        new LatLng(35.5844448669542,129.283166179926),
                        new LatLng(35.5842884116858,129.283182073153),
                        new LatLng(35.5841545239393,129.283195507468),
                        new LatLng(35.5841336426668,129.283197685332),
                        new LatLng(35.5841647150938,129.283081347711),
                        new LatLng(35.5841891991812,129.2830379136),
                        new LatLng(35.5842116776323,129.282980988341),
                        new LatLng(35.5842140756614,129.282973129173),
                        new LatLng(35.584243464936,129.282878810231),
                        new LatLng(35.5842836407721,129.282712407722),
                        new LatLng(35.5843180460971,129.282635463356),
                        new LatLng(35.5843636060807,129.282475424208),
                        new LatLng(35.5844169291963,129.282306628547),
                        new LatLng(35.5844883362464,129.282074921958),
                        new LatLng(35.5844925861718,129.281902677372),
                        new LatLng(35.5844618299246,129.281779072143),
                        new LatLng(35.5843617185923,129.281846232039),
                        new LatLng(35.584271827456,129.281879187488),
                        new LatLng(35.5841696594378,129.281830776182),
                        new LatLng(35.584089900409,129.281789913433),
                        new LatLng(35.584038605148,129.281777078118),
                        new LatLng(35.5823975904757,129.281318922268),
                        new LatLng(35.5813986857534,129.280881067951),
                        new LatLng(35.5813173360086,129.281199349478),
                        new LatLng(35.5807566552059,129.282306909708),
                        new LatLng(35.5807528519377,129.282314388496),
                        new LatLng(35.5806811855925,129.282456090196),
                        new LatLng(35.5806772271332,129.282456672199),
                        new LatLng(35.5802242281802,129.282532415002),
                        new LatLng(35.5799544723009,129.282924984052),
                        new LatLng(35.5799200499999,129.283032256161),
                        new LatLng(35.5798521325723,129.283243360789),
                        new LatLng(35.5798356276637,129.283266683689),
                        new LatLng(35.5796868802792,129.283478596804),
                        new LatLng(35.5791786484942,129.283659975055),
                        new LatLng(35.579175238244,129.283661254038),
                        new LatLng(35.5789647321196,129.283736284036),
                        new LatLng(35.5789132742086,129.283754474582),
                        new LatLng(35.5788898371349,129.284047161059),
                        new LatLng(35.5788728308359,129.284261089236),
                        new LatLng(35.5785790866281,129.284656077121),
                        new LatLng(35.5785535003106,129.284654309909),
                        new LatLng(35.5785570050632,129.284662685775),
                        new LatLng(35.5785690203168,129.284681981849),
                        new LatLng(35.5785796892243,129.284698834744),
                        new LatLng(35.5785099962852,129.284966078526),
                        new LatLng(35.5782482642469,129.285737013665),
                        new LatLng(35.5782468699206,129.285751098685),
                        new LatLng(35.5782393812016,129.28582672982),
                        new LatLng(35.5781753945326,129.286839743146),
                        new LatLng(35.5784737071088,129.287377004534),
                        new LatLng(35.5783440155694,129.287570492893),
                        new LatLng(35.5783193268216,129.287699410399),
                        new LatLng(35.5783187402147,129.287745242057),
                        new LatLng(35.5783185149241,129.287771777161),
                        new LatLng(35.5783184125176,129.287776940541),
                        new LatLng(35.5783465660027,129.287851517867),
                        new LatLng(35.5782712918406,129.288078608901),
                        new LatLng(35.5782434421167,129.288232594306),
                        new LatLng(35.5782666892876,129.288588302243),
                        new LatLng(35.5782110483428,129.288871116113),
                        new LatLng(35.5782047479061,129.288988138293),
                        new LatLng(35.5782643189429,129.289106002887),
                        new LatLng(35.5783248501796,129.289225614406),
                        new LatLng(35.578335195082,129.289362755465),
                        new LatLng(35.5783936810366,129.289530919055),
                        new LatLng(35.5783944774644,129.28953334931),
                        new LatLng(35.5784027288972,129.289580812535),
                        new LatLng(35.5784043732667,129.289590517006),
                        new LatLng(35.5784281238175,129.289726658097),
                        new LatLng(35.5784523485387,129.289815256932),
                        new LatLng(35.5785666038568,129.289945356376),
                        new LatLng(35.5785699116731,129.289949241061),
                        new LatLng(35.5785770139525,129.289960818795),
                        new LatLng(35.5785783790086,129.289962931123),
                        new LatLng(35.5786315379523,129.290047860498),
                        new LatLng(35.5786465919381,129.290130336143),
                        new LatLng(35.5786824094435,129.290327504338),
                        new LatLng(35.578685086925,129.290342398403),
                        new LatLng(35.5787060539024,129.290402287365),
                        new LatLng(35.5787323555931,129.290477830275),
                        new LatLng(35.5787825476191,129.290578196672),
                        new LatLng(35.5788292048761,129.290671566145),
                        new LatLng(35.5788547614889,129.290749511928),
                        new LatLng(35.5788632800837,129.290775604203),
                        new LatLng(35.5788647799641,129.290792888396),
                        new LatLng(35.5788705599974,129.290859574901),
                        new LatLng(35.5788574755343,129.29091056978),
                        new LatLng(35.5788518617311,129.290917302209),
                        new LatLng(35.5787214206305,129.291075265582),
                        new LatLng(35.5786948434243,129.291118278512),
                        new LatLng(35.5785250082156,129.291393696135),
                        new LatLng(35.5784053474062,129.291517834702),
                        new LatLng(35.5783840934065,129.29153997982),
                        new LatLng(35.5783553771465,129.291591557842),
                        new LatLng(35.5782805905466,129.291725589464),
                        new LatLng(35.5782728681628,129.291739508107),
                        new LatLng(35.5782716906251,129.291741887122),
                        new LatLng(35.5781771186893,129.291931875747),
                        new LatLng(35.5781494468245,129.291987627976),
                        new LatLng(35.5780964889888,129.292055403714),
                        new LatLng(35.5779837735929,129.292199724118),
                        new LatLng(35.5779686921477,129.292215160764),
                        new LatLng(35.57791713095,129.292268156248),
                        new LatLng(35.5777845559876,129.292405706817),
                        new LatLng(35.5776174032602,129.292547103871),
                        new LatLng(35.5775403071964,129.292580752967),
                        new LatLng(35.577452771886,129.292682021759),
                        new LatLng(35.5773974883857,129.292745937336),
                        new LatLng(35.5773203211904,129.292835084411),
                        new LatLng(35.5772726367146,129.292936110893),
                        new LatLng(35.5772023965124,129.293083020991),
                        new LatLng(35.577224218499,129.293083298714),
                        new LatLng(35.5772227401679,129.293087044741),
                        new LatLng(35.5769880492,129.293677046459),
                        new LatLng(35.5768305001556,129.294076204395),
                        new LatLng(35.5767124883793,129.294106624509),
                        new LatLng(35.5765551745767,129.294278625512),
                        new LatLng(35.5765324327072,129.294319344212),
                        new LatLng(35.5765268922767,129.294329187893),
                        new LatLng(35.5765126056909,129.294354965043),
                        new LatLng(35.5765070652574,129.294364808719),
                        new LatLng(35.5764770355404,129.294514929954),
                        new LatLng(35.5764740783304,129.294530023885),
                        new LatLng(35.5764267437642,129.294649662885),
                        new LatLng(35.5765013800007,129.29456768102),
                        new LatLng(35.576545841221,129.294517585922),
                        new LatLng(35.5766212321668,129.294432870277),
                        new LatLng(35.5767757751561,129.29427354779),
                        new LatLng(35.5768796453484,129.294238927848),
                        new LatLng(35.5769680401835,129.294225943263),
                        new LatLng(35.5771067584415,129.294202317976),
                        new LatLng(35.5772042298589,129.2941857915),
                        new LatLng(35.5772968955115,129.294169821238),
                        new LatLng(35.5773603968549,129.294133365921),
                        new LatLng(35.5773626715537,129.294132050177),
                        new LatLng(35.5775456221589,129.2940262754),
                        new LatLng(35.5777348483265,129.293938253894),
                        new LatLng(35.5778097429304,129.293924182601),
                        new LatLng(35.5778387086349,129.293918804241),
                        new LatLng(35.5779968085055,129.293898150486),
                        new LatLng(35.5781620931778,129.293869766139),
                        new LatLng(35.5782266501659,129.293858856881),
                        new LatLng(35.5786084107458,129.293753229126),
                        new LatLng(35.5787267123508,129.293759352448),
                        new LatLng(35.5788206797416,129.293764107439),
                        new LatLng(35.5788771025933,129.293854998611),
                        new LatLng(35.5788959377618,129.293841738355),
                        new LatLng(35.5789634405869,129.293794373218),
                        new LatLng(35.5789767135196,129.293785097961),
                        new LatLng(35.5789797109524,129.29378311175),
                        new LatLng(35.5789841259638,129.293780137656),
                        new LatLng(35.5789874019418,129.293778516571),
                        new LatLng(35.5790993659654,129.293725509149),
                        new LatLng(35.5791366320462,129.293720712485),
                        new LatLng(35.579138886197,129.293720433799),
                        new LatLng(35.5791438271352,129.293719889033),
                        new LatLng(35.5791480560351,129.293719319611),
                        new LatLng(35.5791785506492,129.293715358968),
                        new LatLng(35.5792387257148,129.293734655014),
                        new LatLng(35.579258542671,129.293751421122),
                        new LatLng(35.5792846031187,129.293773197194),
                        new LatLng(35.5793218904061,129.29380424936),
                        new LatLng(35.5794864134031,129.294015427454),
                        new LatLng(35.5797235218357,129.293934628575),
                        new LatLng(35.5799041664667,129.293727771773),
                        new LatLng(35.5799613113839,129.293662184509),
                        new LatLng(35.5801788293019,129.293604958598),
                        new LatLng(35.5801841848745,129.293604415324),
                        new LatLng(35.5801940577612,129.293603314697),
                        new LatLng(35.580225813365,129.293599744729),
                        new LatLng(35.5802698303833,129.293595137974),
                        new LatLng(35.5802734996227,129.293594897523),
                        new LatLng(35.5802683700622,129.293610039477),
                        new LatLng(35.5802678253811,129.293611626381),
                        new LatLng(35.5802663363346,129.293616067636),
                        new LatLng(35.5803579989023,129.293601096577),
                        new LatLng(35.5803842761097,129.293596679157),
                        new LatLng(35.580395854186,129.293594933719),
                        new LatLng(35.5805363285493,129.293545857451),
                        new LatLng(35.5806155133143,129.293498467326),
                        new LatLng(35.5806167948542,129.293497820977),
                        new LatLng(35.5806634359614,129.293466742168),
                        new LatLng(35.5807609692198,129.29340230481),
                        new LatLng(35.5808288332566,129.293335983144),
                        new LatLng(35.5808727356178,129.293293109921),
                        new LatLng(35.5809433281072,129.293209287013),
                        new LatLng(35.5809921918691,129.293127602989),
                        new LatLng(35.580992916286,129.2931262374),
                        new LatLng(35.5810075534627,129.293097017261),
                        new LatLng(35.5810126800103,129.29308681836),
                        new LatLng(35.5811160521135,129.292982204486),
                        new LatLng(35.5811532451756,129.29289950686),
                        new LatLng(35.5812557273025,129.292752816536),
                        new LatLng(35.58126874158,129.292734911285),
                        new LatLng(35.5812898510366,129.292705526837),
                        new LatLng(35.5812976651888,129.292694708667),
                        new LatLng(35.58130778517,129.292680875515),
                        new LatLng(35.5813926028804,129.292633647927),
                        new LatLng(35.5814435355337,129.292628204963),
                        new LatLng(35.5814678076093,129.292625446053),
                        new LatLng(35.5814953252722,129.292622445108),
                        new LatLng(35.5815365202553,129.292618103386),
                        new LatLng(35.5816118076616,129.292590603157),
                        new LatLng(35.5816305277001,129.292583895993),
                        new LatLng(35.5816959006887,129.292529911069),
                        new LatLng(35.5819348681944,129.292402956573),
                        new LatLng(35.5819902349363,129.292386616703),
                        new LatLng(35.58199603463,129.292385059802),
                        new LatLng(35.5819977398131,129.292384414956),
                        new LatLng(35.5820119022944,129.292379997362),
                        new LatLng(35.5821734860994,129.292331159871),
                        new LatLng(35.5821747668071,129.292330855547),
                        new LatLng(35.5823850697826,129.292237571756),
                        new LatLng(35.5824825001299,129.292260334536),
                        new LatLng(35.5825354181695,129.292276326897),
                        new LatLng(35.5825432637445,129.292278617285),
                        new LatLng(35.5826000905246,129.292310910326),
                        new LatLng(35.5826222438839,129.292323271549),
                        new LatLng(35.5829831258538,129.292479376769),
                        new LatLng(35.5833275739299,129.292677067442),
                        new LatLng(35.5836743432435,129.292686256984),
                        new LatLng(35.5839741509229,129.292795811087),
                        new LatLng(35.5840136919425,129.292841758226),
                        new LatLng(35.5841431917893,129.292991964812),
                        new LatLng(35.5842811684531,129.293170329463),
                        new LatLng(35.5845102390718,129.293378531619),
                        new LatLng(35.584736259653,129.293584241115),
                        new LatLng(35.5849555586438,129.29368460256),
                        new LatLng(35.5850986396506,129.293750049954),
                        new LatLng(35.5852740980586,129.293830545108),
                        new LatLng(35.5853401228917,129.293861053093),
                        new LatLng(35.5857037323775,129.293962084474),
                        new LatLng(35.5857458885088,129.293973978704),
                        new LatLng(35.5859095899279,129.293814196196),
                        new LatLng(35.5860055711563,129.293720750285),
                        new LatLng(35.5863957459898,129.293587081135),
                        new LatLng(35.5864444668603,129.293586750549),
                        new LatLng(35.5866416324102,129.293584785443),
                        new LatLng(35.5868917221034,129.293428845212),
                        new LatLng(35.587224933371,129.293054991321),
                        new LatLng(35.587317472002,129.292994535812),
                        new LatLng(35.5875377078149,129.292845679013),
                        new LatLng(35.5876255749447,129.292786133036),
                        new LatLng(35.5876748946786,129.292769251751),
                        new LatLng(35.5878662278603,129.292704033241),
                        new LatLng(35.5882552001525,129.292085948263),
                        new LatLng(35.5883440570828,129.29194471229),
                        new LatLng(35.5885873009744,129.291741001349),
                        new LatLng(35.5888142644686,129.291578876829),
                        new LatLng(35.588986836357,129.291537257191),
                        new LatLng(35.5891408735381,129.291500271475),
                        new LatLng(35.5892265994662,129.291449973607),
                        new LatLng(35.5893568493968,129.291397827806),
                        new LatLng(35.5895518005977,129.291319607263),
                        new LatLng(35.5895961885626,129.291318112023),
                        new LatLng(35.5896225384937,129.291317136612),
                        new LatLng(35.5896751870678,129.291302782041),
                        new LatLng(35.5899410440744,129.291279672678),
                        new LatLng(35.5901054498034,129.291267806555),
                        new LatLng(35.5902869336515,129.291298487783),
                        new LatLng(35.5903696030101,129.29131221578),
                        new LatLng(35.5907147792667,129.291316539164),
                        new LatLng(35.590736033603,129.291309211082),
                        new LatLng(35.5907673558392,129.291298387983),
                        new LatLng(35.5909071252262,129.291249618986),
                        new LatLng(35.5909130798045,129.291247367165),
                        new LatLng(35.5909901858116,129.291220608434),
                        new LatLng(35.5910653894852,129.291212757451),
                        new LatLng(35.5910782285393,129.291211391197),
                        new LatLng(35.5910962263466,129.291212603747),
                        new LatLng(35.5911022734416,129.2912131111),
                        new LatLng(35.5911061764969,129.291081870189),
                        new LatLng(35.5911880466222,129.291105604343),
                        new LatLng(35.591309225895,129.291140747353),
                        new LatLng(35.5912850687881,129.29119694094),
                        new LatLng(35.5913799970106,129.291180685785),
                        new LatLng(35.591394686255,129.291178344036),
                        new LatLng(35.5915372285562,129.291153443099),
                        new LatLng(35.5916459277837,129.291183089837),
                        new LatLng(35.5921458720817,129.291082526022),
                        new LatLng(35.5923166684497,129.291119459403),
                        new LatLng(35.5925297084842,129.291030717388),
                        new LatLng(35.5925336680165,129.29102220114),
                        new LatLng(35.592585795488,129.290909571999),
                        new LatLng(35.5925984862424,129.290530677292),
                        new LatLng(35.5926029748764,129.29033911542),
                        new LatLng(35.5930408533636,129.290496049035),
                        new LatLng(35.593041752797,129.290508136317),
                        new LatLng(35.5930427357219,129.29052299385),
                        new LatLng(35.5931469478298,129.29052940511),
                        new LatLng(35.5933729233813,129.290537920662),
                        new LatLng(35.5933815130309,129.290538161231),
                        new LatLng(35.593544546638,129.290575904837),
                        new LatLng(35.593553240322,129.290577867359),
                        new LatLng(35.5930418809212,129.291493852955),
                        new LatLng(35.59300083289,129.291571991781),
                        new LatLng(35.5929636593449,129.292786264556),
                        new LatLng(35.5928704839702,129.293139762468),
                        new LatLng(35.5927402770426,129.293278096014),
                        new LatLng(35.5927131630032,129.293378686527),
                        new LatLng(35.5927071157257,129.293400581294),
                        new LatLng(35.59270545128,129.293406733121),
                        new LatLng(35.592685296611,129.293585094705),
                        new LatLng(35.5926378805488,129.293798196469),
                        new LatLng(35.5926380067306,129.293961623181),
                        new LatLng(35.592573122072,129.294241106302),
                        new LatLng(35.592606626117,129.294300677102),
                        new LatLng(35.5926905664139,129.29433650652),
                        new LatLng(35.5927244204471,129.294392988749),
                        new LatLng(35.5927315847665,129.2944307677),
                        new LatLng(35.5927067248348,129.294775186856),
                        new LatLng(35.5927311745688,129.294888269741),
                        new LatLng(35.5928502303003,129.295224728291),
                        new LatLng(35.5929016683247,129.295289287152),
                        new LatLng(35.5929768738757,129.29534728953),
                        new LatLng(35.593084351918,129.295507567172),
                        new LatLng(35.5931648792745,129.295552964545),
                        new LatLng(35.5932736288066,129.295572619692),
                        new LatLng(35.593353537123,129.295598349353),
                        new LatLng(35.5934166370379,129.295641520192),
                        new LatLng(35.5934630090246,129.295698700409),
                        new LatLng(35.5935268941878,129.295811542792),
                        new LatLng(35.5936131181577,129.295986046598),
                        new LatLng(35.5936873495584,129.296073666519),
                        new LatLng(35.5938273382985,129.296138694682),
                        new LatLng(35.5939217917172,129.296184144171),
                        new LatLng(35.593982027014,129.296259651165),
                        new LatLng(35.5940294953575,129.296347537742),
                        new LatLng(35.5940506542378,129.296441927282),
                        new LatLng(35.5940706133526,129.29667281427),
                        new LatLng(35.5941093776914,129.29677390114),
                        new LatLng(35.5942138351544,129.296944799341),
                        new LatLng(35.5942915796029,129.297135960838),
                        new LatLng(35.5944009754161,129.297446624969),
                        new LatLng(35.5944832689676,129.297568962489),
                        new LatLng(35.5945432328975,129.297695830958),
                        new LatLng(35.59459591891,129.297871793444),
                        new LatLng(35.5946048170601,129.298032376126),
                        new LatLng(35.5945933367915,129.298250634324),
                        new LatLng(35.5945651015168,129.298372917832),
                        new LatLng(35.5945547303682,129.298495708702),
                        new LatLng(35.5945740463325,129.298664165351),
                        new LatLng(35.5945007044986,129.298943763524),
                        new LatLng(35.5945448188048,129.299118790046),
                        new LatLng(35.5946130912262,129.299289690568),
                        new LatLng(35.5946141970074,129.299607958206),
                        new LatLng(35.5945618861884,129.300231544411),
                        new LatLng(35.5945864594594,129.300663226508),
                        new LatLng(35.5945748881102,129.300974240388),
                        new LatLng(35.5945568947702,129.301112662406),
                        new LatLng(35.5945107157021,129.301355797822),
                        new LatLng(35.5944692093448,129.301575609577),
                        new LatLng(35.5944633451236,129.301816445143),
                        new LatLng(35.5943398653413,129.302354223466),
                        new LatLng(35.5943352489134,129.302455802071),
                        new LatLng(35.5943741161093,129.302647231809),
                        new LatLng(35.5944491520574,129.302854523426),
                        new LatLng(35.5944726225463,129.302959661709),
                        new LatLng(35.5944694538695,129.303206433545),
                        new LatLng(35.5944266118014,129.303702378138),
                        new LatLng(35.5943946824289,129.303803865074),
                        new LatLng(35.5943307710109,129.303884097974),
                        new LatLng(35.5939247339414,129.303947968362),
                        new LatLng(35.593593324704,129.303989495755),
                        new LatLng(35.5935157597768,129.304032783898),
                        new LatLng(35.5934575564608,129.304079731455),
                        new LatLng(35.5933876789896,129.30417737715),
                        new LatLng(35.5932803862102,129.30433185899),
                        new LatLng(35.5931973658456,129.30446911694),
                        new LatLng(35.5931377907944,129.30460980683),
                        new LatLng(35.5930304672532,129.305126996332),
                        new LatLng(35.5930183998428,129.305169051759),
                        new LatLng(35.5930064794476,129.305202842027),
                        new LatLng(35.5929727424321,129.305273585468),
                        new LatLng(35.5927316129946,129.305616278982),
                        new LatLng(35.5925794985679,129.305611222988),
                        new LatLng(35.5923968541686,129.305413260155),
                        new LatLng(35.5921410917998,129.305092538576),
                        new LatLng(35.5920763405623,129.305069307014),
                        new LatLng(35.5920298526207,129.305063492292),
                        new LatLng(35.5919854028847,129.305060830395),
                        new LatLng(35.5918941537316,129.305075803053),
                        new LatLng(35.5918171452606,129.305127036898),
                        new LatLng(35.5917130764724,129.305275059862),
                        new LatLng(35.591638847723,129.305357059744),
                        new LatLng(35.5913231638176,129.305592796838),
                        new LatLng(35.5911064632416,129.305695522092),
                        new LatLng(35.5910156571245,129.305717061599),
                        new LatLng(35.5908416001611,129.305784468915),
                        new LatLng(35.5906789842414,129.305879441376),
                        new LatLng(35.5905538287196,129.306003423728),
                        new LatLng(35.5904593882599,129.306200321973),
                        new LatLng(35.5903780895135,129.306482771024),
                        new LatLng(35.5903176358456,129.306609977083),
                        new LatLng(35.5902276067925,129.30672323242),
                        new LatLng(35.5901362051069,129.306805429079),
                        new LatLng(35.5897896216281,129.307036470093),
                        new LatLng(35.589757883906,129.307054182351),
                        new LatLng(35.5895372135887,129.307239540052),
                        new LatLng(35.5893882333998,129.307416606287),
                        new LatLng(35.5893784451118,129.307501484531),
                        new LatLng(35.5893787745448,129.307616637595),
                        new LatLng(35.589392149726,129.30773424602),
                        new LatLng(35.5895300709955,129.308502874612),
                        new LatLng(35.5896034957408,129.30880078493),
                        new LatLng(35.5895884726266,129.308916199626),
                        new LatLng(35.5893972672558,129.309400948975),
                        new LatLng(35.5893356024112,129.309679813679),
                        new LatLng(35.5893633189913,129.309842302153),
                        new LatLng(35.5894348855514,129.31009017252),
                        new LatLng(35.5895393740432,129.310354159775),
                        new LatLng(35.5896414178987,129.310569462105),
                        new LatLng(35.5899593812918,129.311089528049),
                        new LatLng(35.5904101875233,129.311533095289),
                        new LatLng(35.5907053761833,129.311735341707),
                        new LatLng(35.5910306325974,129.311962921576),
                        new LatLng(35.5913158646025,129.312243837254),
                        new LatLng(35.5915250846719,129.312516702893),
                        new LatLng(35.5917526559982,129.312852499093),
                        new LatLng(35.5921260454526,129.31346279752),
                        new LatLng(35.5921479564436,129.313494797312),
                        new LatLng(35.5923588213546,129.313813572314),
                        new LatLng(35.5925936379491,129.314131316519),
                        new LatLng(35.5927800037127,129.31436939543),
                        new LatLng(35.5928910974341,129.314516016874),
                        new LatLng(35.5929632776724,129.314621180705),
                        new LatLng(35.5931204479002,129.314869124266),
                        new LatLng(35.5932883020225,129.315212867129),
                        new LatLng(35.5935667425853,129.315692882253),
                        new LatLng(35.5935943738256,129.315757118879),
                        new LatLng(35.5936033981668,129.315815301418),
                        new LatLng(35.5938155253055,129.316273066521),
                        new LatLng(35.5941278265468,129.316866801733),
                        new LatLng(35.5944657226572,129.317285801256),
                        new LatLng(35.5945883845894,129.317460682948),
                        new LatLng(35.5945971246919,129.317657806814),
                        new LatLng(35.5945374531514,129.317956389969),
                        new LatLng(35.5943812239375,129.318282534873),
                        new LatLng(35.5943128508325,129.318557763731),
                        new LatLng(35.5942931766128,129.318621671819),
                        new LatLng(35.5942550375315,129.31880364543),
                        new LatLng(35.5942121378351,129.319006523961),
                        new LatLng(35.594182306963,129.319510411428),
                        new LatLng(35.5941912038739,129.319684437182),
                        new LatLng(35.594587746174,129.320735738262),
                        new LatLng(35.5946823389419,129.321000500441),
                        new LatLng(35.5947874998788,129.32119903477),
                        new LatLng(35.5948879970299,129.32131053296),
                        new LatLng(35.5951772635452,129.321615062066),
                        new LatLng(35.5954558050552,129.32184755187),
                        new LatLng(35.5956220247695,129.322018886205),
                        new LatLng(35.5957479114261,129.322164920257),
                        new LatLng(35.5958698170202,129.322269112293),
                        new LatLng(35.5959568160868,129.322320931659),
                        new LatLng(35.5960563862826,129.322363795901),
                        new LatLng(35.596547996379,129.322484540502),
                        new LatLng(35.5966831757681,129.322491889711),
                        new LatLng(35.5968596663601,129.322495607507),
                        new LatLng(35.5972948458659,129.322468872219),
                        new LatLng(35.5973842235692,129.322463523445),
                        new LatLng(35.5974232687868,129.322461207265),
                        new LatLng(35.597644595404,129.322447600569),
                        new LatLng(35.5978905464897,129.322478502274),
                        new LatLng(35.5979359028326,129.322492567123),
                        new LatLng(35.5981492689824,129.322621474146),
                        new LatLng(35.5985154887597,129.32295099455),
                        new LatLng(35.5985510303425,129.323035465893),
                        new LatLng(35.5987657808634,129.323516454202),
                        new LatLng(35.5988334872737,129.323663565399),
                        new LatLng(35.5989499000317,129.324081728994),
                        new LatLng(35.5989596561549,129.324692647314),
                        new LatLng(35.5989597379727,129.324695748888),
                        new LatLng(35.598844262027,129.325017901827),
                        new LatLng(35.5987793811498,129.325198770618),
                        new LatLng(35.5984874381157,129.325632009276),
                        new LatLng(35.5984835593929,129.325636386117),
                        new LatLng(35.5983738872669,129.325773887476),
                        new LatLng(35.5982789377987,129.325936986047),
                        new LatLng(35.5981724295294,129.326268352955),
                        new LatLng(35.5981169724601,129.326376737506),
                        new LatLng(35.5980568800498,129.326536024819),
                        new LatLng(35.5980469305254,129.326598836505),
                        new LatLng(35.5980305848815,129.326686972752),
                        new LatLng(35.5980220216968,129.32673706512),
                        new LatLng(35.5980360483759,129.326900216822),
                        new LatLng(35.5980959009693,129.327140201621),
                        new LatLng(35.5981706462495,129.327352689396),
                        new LatLng(35.5982610115991,129.327675273492),
                        new LatLng(35.5983506103504,129.327927840425),
                        new LatLng(35.5984750716346,129.32823452864),
                        new LatLng(35.5988904205101,129.329190605426),
                        new LatLng(35.599039084516,129.329512472252),
                        new LatLng(35.5991212489701,129.329756217226),
                        new LatLng(35.5991914568721,129.32998478279),
                        new LatLng(35.5991943380426,129.329995897278),
                        new LatLng(35.599260322929,129.330239168675),
                        new LatLng(35.5992826374079,129.330359469554),
                        new LatLng(35.5993262401816,129.33060932694),
                        new LatLng(35.5994211746653,129.33114652114),
                        new LatLng(35.5994191228632,129.331333007867),
                        new LatLng(35.599369760709,129.331547763462),
                        new LatLng(35.5991665117009,129.331769777441),
                        new LatLng(35.5990624016902,129.331845368788),
                        new LatLng(35.5981948179625,129.332039154491),
                        new LatLng(35.5980272560593,129.331981197784)
                        )
                .strokeColor(Color.argb(105,165,102,255))
                .strokeWidth(20));


        BitmapDrawable bitmapdraw4 = (BitmapDrawable) getResources().getDrawable(R.drawable.female);
        Bitmap b4 = bitmapdraw4.getBitmap();
        Bitmap smallMarker4 = Bitmap.createScaledBitmap(b4, 120, 120, false);


        map = new LatLng(35.57391, 129.34712);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("여성대상범죄 우려지역" +
                        " / CCTV 14대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.57614, 129.34394);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("여성대상범죄 우려지역" +
                        " / CCTV 13대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55582, 129.28203);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("범죄예방강화구역(태화)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("다세대 밀집지역" +
                        " / CCTV 14대, 큐브형 LED 안내판 2대"));

        Polygon polygon12 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57423, 129.34589),
                        new LatLng(35.57424, 129.34351),
                        new LatLng(35.57504, 129.34289),
                        new LatLng(35.5748, 129.34052),
                        new LatLng(35.57398, 129.33932),
                        new LatLng(35.57158, 129.33985),
                        new LatLng(35.57168, 129.34113),
                        new LatLng(35.57039, 129.34135),
                        new LatLng(35.5709, 129.34607))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polygon polygon13 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56019, 129.27027),
                        new LatLng(35.55777, 129.27301),
                        new LatLng(35.5568, 129.27183),
                        new LatLng(35.55901, 129.26893))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polygon polygon14 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.56399, 129.33936),
                        new LatLng(35.5621, 129.33616),
                        new LatLng(35.56054, 129.33752),
                        new LatLng(35.5624, 129.3408))
                .strokeColor(Color.BLUE)
                .strokeWidth(5));

        Polyline polyline1 = mMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55983, 129.31555),
                        new LatLng(35.55824, 129.31645),
                        new LatLng(35.55758, 129.31699),
                        new LatLng(35.5559, 129.31718),
                        new LatLng(35.55581, 129.31785),
                        new LatLng(35.55729, 129.3202)));
        polyline1.setColor(Color.BLUE);
        polyline1.setWidth(5);

        Polyline polyline2 = mMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57675, 129.31298),
                        new LatLng(35.5776, 129.31099),
                        new LatLng(35.575, 129.30938),
                        new LatLng(35.57446, 129.31114),
                        new LatLng(35.57382, 129.31379),
                        new LatLng(35.57364, 129.31457),
                        new LatLng(35.57357, 129.31523)));
        polyline2.setColor(Color.BLUE);
        polyline2.setWidth(5);

        map = new LatLng(35.57287, 129.33955);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(병영)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("선우시장 인근으로 심야시간 여성귀가 인구 多" +
                        " / CCTV 8대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55824, 129.31645);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(학성)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("유흥가 밀집지역 인근" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.55923, 129.27135);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(태화)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("통학로 & 다세대주택 밀집지역" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.57639, 129.31025);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(성안)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("통학로 & 원룸밀집지역(여성1인가구)" +
                        " / CCTV 6대, 큐브형 LED 안내판 2대"));

        map = new LatLng(35.56306, 129.33778);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("여성안심귀갓길(반구)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker4))
                .snippet("여성거주인구 多" +
                        " / CCTV 7대, 큐브형 LED 안내판 2대"));

        //큐브형
        BitmapDrawable bitmapdraw30 = (BitmapDrawable) getResources().getDrawable(R.drawable.bell);
        Bitmap b30 = bitmapdraw30.getBitmap();
        Bitmap smallMarker30 = Bitmap.createScaledBitmap(b30, 70, 70, false);

        map = new LatLng(35.57781, 129.34557);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57551, 129.34381);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57422, 129.34726);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57187, 129.34887);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55418, 129.28224);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55642, 129.28416);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57359, 129.33938);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55904, 129.31598);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55759, 129.31699);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55761, 129.27283);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.55997, 129.27);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.56401, 129.33937);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.56311, 129.33787);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.5771, 129.31209);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));

        map = new LatLng(35.57503, 129.30935);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("큐브형 LED 비상벨 안내판")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker30)));


        BitmapDrawable bitmapdraw21=(BitmapDrawable)getResources().getDrawable(R.drawable.vacc);
        Bitmap b21=bitmapdraw21.getBitmap();
        Bitmap smallMarker21 = Bitmap.createScaledBitmap(b21, 80, 80, false);

        map = new LatLng(35.56242, 129.3504);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("백신접종시설")
                .snippet("관내 백신접종시설(B급)")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker21)));


        BitmapDrawable bitmapdraw=(BitmapDrawable)getResources().getDrawable(R.drawable.ts);
        Bitmap b=bitmapdraw.getBitmap();
        Bitmap smallMarker = Bitmap.createScaledBitmap(b, 60, 60, false);


        map = new LatLng(35.5815738251039,129.337051152836);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.560180022713,129.311213719623);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));


        map = new LatLng(35.5602118274961,129.312347997483);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));


        map = new LatLng(35.5599844015702,129.31078299627);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5604710741001,129.310859201939);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55934,129.29954);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5630242095723,129.330261944155);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5783046219181,129.346567730165);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5608720493881,129.328078005575);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5565723461665,129.34016856192);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5561390342994,129.345634396725);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.556790046075,129.344116727048);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5514618523675,129.34559196086);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5758801545826,129.318913310363);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5541231236588,129.32011929235);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5544723334121,129.348416778077);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5768420302677,129.321964560791);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5668970230712,129.351540167261);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5647057698346,129.344152505496);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5606679617317,129.337328616247);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55451,129.28465);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.5524175633282,129.301625472319);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.56121,129.29971);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.556295632415,129.30645220179);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        map = new LatLng(35.55871,129.30544);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("탄력순찰요청지점")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker)));

        BitmapDrawable bitmapdraw2=(BitmapDrawable)getResources().getDrawable(R.drawable.police_logo);
        Bitmap b2=bitmapdraw2.getBitmap();
        Bitmap smallMarker2 = Bitmap.createScaledBitmap(b2, 80, 80, false);

        //태화강먹거리단지
        Polygon polygon20 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55585, 129.27693),
                        new LatLng(35.55564, 129.2762),
                        new LatLng(35.5551, 129.27584),
                        new LatLng(35.55432, 129.27938),
                        new LatLng(35.55184, 129.28674),
                        new LatLng(35.55127, 129.28833),
                        new LatLng(35.55025, 129.29026),
                        new LatLng(35.55025, 129.29026),
                        new LatLng(35.55047, 129.29082),
                        new LatLng(35.55166, 129.28855),
                        new LatLng(35.55354, 129.28844),
                        new LatLng(35.55349, 129.28683),
                        new LatLng(35.55396, 129.28672),
                        new LatLng(35.5541, 129.2856),
                        new LatLng(35.55349, 129.28539),
                        new LatLng(35.55392, 129.28358),
                        new LatLng(35.55419, 129.28353),
                        new LatLng(35.55474, 129.28133),
                        new LatLng(35.55501, 129.28138),
                        new LatLng(35.55524, 129.28047),
                        new LatLng(35.55496, 129.28037))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //학성6성프로젝트
        Polygon polygon21 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55862, 129.33364),
                        new LatLng(35.55816, 129.33296),
                        new LatLng(35.55746, 129.33262),
                        new LatLng(35.5567, 129.33533))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //군계일학
        Polygon polygon22 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.55612, 129.33721),
                        new LatLng(35.55578, 129.33581),
                        new LatLng(35.55561, 129.33405),
                        new LatLng(35.55182, 129.33361),
                        new LatLng(35.5515, 129.3375),
                        new LatLng(35.55219, 129.33758),
                        new LatLng(35.55201, 129.33934),
                        new LatLng(35.5528, 129.33944),
                        new LatLng(35.55291, 129.33764),
                        new LatLng(35.55408, 129.3378),
                        new LatLng(35.55415, 129.33702))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        //깨어나라 성곽도시
        Polygon polygon23 = mMap.addPolygon(new PolygonOptions()
                .clickable(true)
                .add(
                        new LatLng(35.57894, 129.34649),
                        new LatLng(35.5789, 129.34686),
                        new LatLng(35.57864, 129.34709),
                        new LatLng(35.57831, 129.34706),
                        new LatLng(35.57796, 129.34857),
                        new LatLng(35.57814, 129.34974),
                        new LatLng(35.57746, 129.35012),
                        new LatLng(35.5761, 129.35102),
                        new LatLng(35.57584, 129.35126),
                        new LatLng(35.57507, 129.35153),
                        new LatLng(35.57362, 129.35064),
                        new LatLng(35.5737, 129.3497),
                        new LatLng(35.57402, 129.34957),
                        new LatLng(35.5746, 129.34894),
                        new LatLng(35.57537, 129.34886),
                        new LatLng(35.57673, 129.3477),
                        new LatLng(35.57745, 129.34678),
                        new LatLng(35.57755, 129.3466),
                        new LatLng(35.57816, 129.34669),
                        new LatLng(35.57868, 129.34646))
                .strokeColor(Color.GREEN)
                .strokeWidth(5)
                .fillColor(Color.argb(60, 255, 228, 0)));

        BitmapDrawable bitmapdraw20 = (BitmapDrawable) getResources().getDrawable(R.drawable.cpted);
        Bitmap b20 = bitmapdraw20.getBitmap();
        Bitmap smallMarker20 = Bitmap.createScaledBitmap(b20, 120, 120, false);

        map = new LatLng(35.55364, 129.28313);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("태화동 도시재생활성화 뉴딜사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(22년~24년)" +
                        " 태화강 먹거리단지 일원 / 사업비(200억)"));

        map = new LatLng(35.55765, 129.33379);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성6성 프로젝트 재생사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(18년~22년)" +
                        " 학성동 153-1번지 일원 / 사업비(60억)"));

        map = new LatLng(35.55372, 129.33541);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("군계일학 도시재생사업")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(18년~22년)" +
                        " 옥성초~가구거리 일원 / 사업비(200억)"));

        map = new LatLng(35.57653, 129.34928);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("깨어나라 성곽도시 프로젝트")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker20))
                .snippet("중구청 도시과-사업기간(19년~21년)" +
                        " 병영2동 108번지 일원 / 사업비(100억)"));

//지역관서
        map = new LatLng(35.579119772412184, 129.34599071614767);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("병영지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.55593342111656, 129.3296384983032);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("학성지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.5600786920339, 129.29724881297633);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("태화지구대")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.556183949387965, 129.34140096879955);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("반구파출소")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.5809751544276, 129.32281866880004);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("성안파출소")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        map = new LatLng(35.569447740963646, 129.34938730887058);
        mMap.addMarker(new MarkerOptions()
                .position(map)
                .title("중부경찰서")
                .icon(BitmapDescriptorFactory.fromBitmap(smallMarker2)));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(map));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(map, 6));
        CameraUpdate Zoom =
                CameraUpdateFactory.zoomTo(17);
        mMap.animateCamera(CameraUpdateFactory.zoomTo(17.0f));

    }

    @Override
    public void onMyLocationClick(@NonNull Location location) {
        Toast.makeText(this, "Current location:\n" + location, Toast.LENGTH_LONG).show();
    }





    @Override
    public boolean onMyLocationButtonClick() {
        Toast.makeText(this, "잠시 기다려주세요", Toast.LENGTH_SHORT).show();
        return false;







    }

//문자발송



}



