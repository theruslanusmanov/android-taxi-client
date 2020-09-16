package com.example.company.taxiclient.animation

import android.location.Location
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.util.*

class MapUtils {

    companion object {

        /**
         * Adds a list of markers to the map.
         */
        fun addMarkersToMap(latLngs: List<LatLng>, markers: ArrayList<Marker>, map: GoogleMap) {
            for (latLng in latLngs) {
                val marker = map.addMarker(MarkerOptions().position(latLng)
                        .title("title")
                        .snippet("snippet")
                        .visible(false))
                markers.add(marker)
            }
        }

        fun getRandomLocation(point: LatLng, radius: Int): LatLng {
            val randomPoints = ArrayList<LatLng>()
            val randomDistances = ArrayList<Float>()
            val startPoint = Location("")
            startPoint.setLatitude(point.latitude)
            startPoint.setLongitude(point.longitude)
            //This is to generate 10 random points
            for (i in 0..9) {
                val x0 = point.latitude
                val y0 = point.longitude

                val random = Random()

                // Convert radius from meters to degrees
                val radiusInDegrees = (radius / 111000f).toDouble()

                val u = random.nextDouble()
                val v = random.nextDouble()
                val w = radiusInDegrees * Math.sqrt(u)
                val t = 2.0 * Math.PI * v
                val x = w * Math.cos(t)
                val y = w * Math.sin(t)

                // Adjust the x-coordinate for the shrinking of the east-west distances
                val new_x = x / Math.cos(y0)

                val foundLatitude = new_x + x0
                val foundLongitude = y + y0
                val randomLatLng = LatLng(foundLatitude, foundLongitude)
                randomPoints.add(randomLatLng)
                val l1 = Location("")
                l1.setLatitude(randomLatLng.latitude)
                l1.setLongitude(randomLatLng.longitude)
                randomDistances.add(l1.distanceTo(startPoint))
            }
            //Get nearest point to the centre
            val indexOfNearestPointToCentre = randomDistances.indexOf(Collections.min(randomDistances))

            return randomPoints.get(indexOfNearestPointToCentre)
        }
    }
}