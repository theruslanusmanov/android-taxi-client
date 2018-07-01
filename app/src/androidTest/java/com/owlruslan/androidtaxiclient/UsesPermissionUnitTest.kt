package com.owlruslan.androidtaxiclient

import android.Manifest
import android.support.v4.content.ContextCompat
import android.support.v4.content.PermissionChecker
import org.junit.Test
import org.junit.Assert.*

/**
 * Unit test for the uses-permission.
 */
class UsesPermissionUnitTest {

    @Test
    fun grantedUsesPermissionInternet() {
        val activity = MainActivity()
        val permission = ContextCompat.checkSelfPermission(
                activity, Manifest.permission.INTERNET)
        assertTrue(permission == PermissionChecker.PERMISSION_GRANTED)
    }
}