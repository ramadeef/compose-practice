package com.adeef.myapplication.mars.test.fake

import com.adeef.myapplication.mars.data.MarsPhotosRepository
import com.adeef.myapplication.mars.network.MarsPhoto

class FakeNetworkMarsPhotosRepository : MarsPhotosRepository {
    override suspend fun getMarsPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}