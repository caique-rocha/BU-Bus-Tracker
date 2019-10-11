package com.fahad.bubustracker_user.helpers;

import com.fahad.bubustracker_user.model.Driver;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.fahad.bubustracker_user.R;

public class GoogleMapHelper {

    private static final int ZOOM_LEVEL = 18;
    private static final int TILT_LEVEL = 25;

    /**
     * @param latLng in which position to Zoom the camera.
     * @return the [CameraUpdate] with Zoom and Tilt level added with the given position.
     */
   // Driver driver;
    public CameraUpdate buildCameraUpdate(LatLng latLng) {
        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(latLng)
                .tilt(TILT_LEVEL)
                .zoom(ZOOM_LEVEL)
                .build();
        return CameraUpdateFactory.newCameraPosition(cameraPosition);
    }

    /**
     * @param position where to draw the [com.google.android.gms.maps.model.Marker]
     * @return the [MarkerOptions] with given properties added to it.
     */

    public MarkerOptions getDriverMarkerOptions(String driverId,LatLng position) {
        MarkerOptions options = getMarkerOptions(driverId,position);
        options.flat(true);
        return options;
    }

    private MarkerOptions getMarkerOptions(String driverId, LatLng position) {
        return new MarkerOptions()
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.car_icon))
                .title(driverId)
                .position(position);

                /*.icon(BitmapDescriptorFactory.fromResource(R.drawable.bigbus_01))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bigbus_02))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.bigbus_03))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_05))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_06))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_07))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_08))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_09))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.brtc_10))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.minibus_02))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.minibus_03))
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.minibus_04))*/
    }



}
