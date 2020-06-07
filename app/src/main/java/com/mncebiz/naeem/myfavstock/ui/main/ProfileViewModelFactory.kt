package com.mncebiz.naeem.myfavstock.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mncebiz.naeem.myfavstock.usecase.GetRecommendedStockUseCase
import com.mncebiz.naeem.myfavstock.usecase.*

class ProfileViewModelFactory(
    private val getUserInformationUseCase: GetUserInformationUseCase,
    private val getTotalValueUseCase: GetTotalValueUseCase,
    private val getStocksUseCase: GetStocksUseCase,
    private val recommendedStockUseCase: GetRecommendedStockUseCase
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProfileViewModel(getUserInformationUseCase, getTotalValueUseCase, getStocksUseCase, recommendedStockUseCase) as T
    }
}