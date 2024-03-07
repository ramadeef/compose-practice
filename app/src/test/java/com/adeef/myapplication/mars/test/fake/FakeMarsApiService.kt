package com.adeef.myapplication.mars.test.fake

import com.adeef.myapplication.mars.network.MarsApiService
import com.adeef.myapplication.mars.network.MarsPhoto

class FakeMarsApiService  : MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}