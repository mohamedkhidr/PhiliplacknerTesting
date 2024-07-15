package com.khidrew.datatesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Before

import org.junit.Test

class ResourceComparatorTest{

    private lateinit var resourceComparator:ResourceComparator

    @Before
    fun setup(){
        resourceComparator = ResourceComparator()
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context, R.string.app_name, "dataTesting")
        assert(result)
    }

    @Test
    fun stringResourceDifferentFromGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context, R.string.app_name, "d")
        assert(!result)
    }
}