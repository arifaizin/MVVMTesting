package com.dicoding.picodiploma.barvolume


class MainViewModel(private val mainRepository: MainRepository) {

    fun save(l: Double, w: Double, h: Double) {
        mainRepository.save(l, w, h)
    }

    fun getVolume() = mainRepository.getVolume()

}