package com.dicoding.picodiploma.barvolume

import junit.framework.TestCase.assertEquals
import org.junit.Test


class MainViewModelTest {

    @Test
    fun testGetVolume() {
        val mainRepository = MainRepository()
        val mainViewModel = MainViewModel(mainRepository)
        mainViewModel.save(1.0, 2.0, 3.0)
        val volume = mainViewModel.getVolume()
        assertEquals(6.0, volume)
    }
}