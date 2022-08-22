package app.kochergin.stat.main.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(
    viewModel: MainScreenViewModel,
    onCardClick: () -> Unit
) {
    val cardItemsState = viewModel.cardItemsFlow().collectAsState()

    LazyColumn {
        items(cardItemsState.value.size) { index ->
            CardItem(
                model = cardItemsState.value[index],
                onCardClick = onCardClick
            )
        }
    }
}

@Composable
fun CardItem(model: CardItem, onCardClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onCardClick() },
        elevation = 0.dp,
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(1.dp, MaterialTheme.colors.secondaryVariant)
    ) {
        Text(
            modifier = Modifier.padding(16.dp),
            text = model.name,
            color = MaterialTheme.colors.primaryVariant
        )
    }
}