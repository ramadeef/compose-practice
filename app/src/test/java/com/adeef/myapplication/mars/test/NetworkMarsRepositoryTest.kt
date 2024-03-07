package com.adeef.myapplication.mars.test

import com.adeef.myapplication.mars.data.NetworkMarsPhotosRepository
import com.adeef.myapplication.mars.test.fake.FakeDataSource
import com.adeef.myapplication.mars.test.fake.FakeMarsApiService
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class NetworkMarsRepositoryTest {

//    @Test
//    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList(){
//        val repository = NetworkMarsPhotosRepository(
//            marsApiService = FakeMarsApiService()
//        )
//        assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
//    }

    // becuase get marsPhotos suspend corouting function we cant use above style. So to get corouting scope
    // wen need runTest
    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotoList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            assertEquals(FakeDataSource.photosList, repository.getMarsPhotos())
        }
}