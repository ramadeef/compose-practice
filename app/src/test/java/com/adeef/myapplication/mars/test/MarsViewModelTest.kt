package com.adeef.myapplication.mars.test

import com.adeef.myapplication.mars.test.fake.FakeDataSource
import com.adeef.myapplication.mars.test.fake.FakeNetworkMarsPhotosRepository
import com.adeef.myapplication.mars.test.rules.TestDispatcherRule
import com.adeef.myapplication.mars.ui.screens.MarsUiState
import com.adeef.myapplication.mars.ui.screens.MarsViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Rule
import org.junit.Test

class MarsViewModelTest {
    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess() =
        runTest {
            val marsViewModel = MarsViewModel(
                marsPhotosRepository = FakeNetworkMarsPhotosRepository()
            )
            assertEquals(
                MarsUiState.Success(FakeDataSource.photosList),
                marsViewModel.marsUiState
            )
        }
}