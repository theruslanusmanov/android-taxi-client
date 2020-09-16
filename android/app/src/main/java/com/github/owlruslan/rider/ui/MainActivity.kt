package com.github.owlruslan.rider.ui

import android.graphics.Color
import android.os.Bundle
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import android.view.Menu
import android.view.MenuItem
import android.view.WindowManager
import com.github.owlruslan.rider.R
import com.github.owlruslan.rider.ui.modes.driver.complete.CompleteDriverFragment
import com.github.owlruslan.rider.ui.modes.driver.ride.RideDriverFragment
import com.github.owlruslan.rider.ui.modes.driver.search.SearchDriverFragment
import com.github.owlruslan.rider.ui.modes.passanger.complete.CompleteFragment
import com.github.owlruslan.rider.ui.modes.passanger.ride.RideFragment
import com.github.owlruslan.rider.ui.modes.passanger.search.SearchFragment
import dagger.Lazy
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    // PASSANGER
    @set:Inject var searchFragmentProvider: Lazy<SearchFragment>? = null
    @set:Inject var rideFragmentProvider: Lazy<RideFragment>? = null
    @set:Inject var completeFragmentProvider: Lazy<CompleteFragment>? = null

    // DRIVER
    @set:Inject var searchDriverDriverFragmentProvider: Lazy<SearchDriverFragment>? = null
    @set:Inject var rideDriverDriverFragmentProvider: Lazy<RideDriverFragment>? = null
    @set:Inject var completeDriverDriverFragmentProvider: Lazy<CompleteDriverFragment>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Make transparent status bar.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        window.statusBarColor = Color.BLACK

        nav_view.setNavigationItemSelectedListener(this)

        // Add SearchDriverFragment to activity
        // PASSANGER
        /*
        var fragment = completeFragmentProvider!!.get()
        supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, mapFragment)
            .commit()*/
        supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, rideFragmentProvider!!.get())
            .commit()
        /*
        supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, fragment)
            .commit()*/

        // DRIVER
        /*val mapFragment = searchFragmentProvider!!.get()
        supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, mapFragment)
            .commit()*/
        /*val mapFragment = rideFragmentProvider!!.get()
        supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, mapFragment)
            .commit()*/
        /*supportFragmentManager.beginTransaction()
            .add(R.id.content_frame, searchDriverDriverFragmentProvider!!.get())
            .commit()*/

        driveModeSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            /*if (isChecked) {
                supportFragmentManager.beginTransaction()
                    .add(R.id.content_frame, searchFragmentProvider!!.get())
                    .commit()
            } else {
                supportFragmentManager.beginTransaction()
                    .add(R.id.content_frame, completeFragmentProvider!!.get())
                    .commit()
            }*/
        }

    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the map/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
