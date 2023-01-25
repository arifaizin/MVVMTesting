package com.dicoding.picodiploma.barvolume

import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock


class MainViewModelTest {

//    @Test
//    fun testGetVolume() {
//        val mainRepository = MainRepository()
//        val mainViewModel = MainViewModel(mainRepository)
//        mainViewModel.save(1.0, 2.0, 3.0)
//        val volume = mainViewModel.getVolume()
//        assertEquals(6.0, volume)
//    }

    @Test
    fun testGetVolume() {
        val mainRepository = mock(MainRepository::class.java)
        val mainViewModel = MainViewModel(mainRepository)
        `when` (mainViewModel.getVolume()).thenReturn(6.0)
        val volume = mainViewModel.getVolume()
        assertEquals(6.0, volume)
    }
}