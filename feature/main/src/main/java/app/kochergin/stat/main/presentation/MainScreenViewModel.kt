package app.kochergin.stat.main.presentation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class MainScreenViewModel @Inject constructor() : ViewModel() {
    private val cardItemsFlow = MutableStateFlow<List<CardItem>>(emptyList())

    init {
        val items = listOf(
            CardItem(
                id = 0,
                name = "Item 0"
            ),
            CardItem(
                id = 1,
                name = "Item 1"
            ),
            CardItem(
                id = 2,
                name = "Item 2"
            ),
            CardItem(
                id = 3,
                name = "Item 3"
            ),
            CardItem(
                id = 4,
                name = "Item 4"
            )
        )
        cardItemsFlow.value = items
    }

    fun cardItemsFlow(): StateFlow<List<CardItem>> = cardItemsFlow
}