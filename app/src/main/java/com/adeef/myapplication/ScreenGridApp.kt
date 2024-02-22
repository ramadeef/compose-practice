package com.adeef.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adeef.myapplication.data.Datasource
import com.adeef.myapplication.data.Datasource2
import com.adeef.myapplication.model.Affirmation
import com.adeef.myapplication.model.Topic

@Composable
fun ScreenGridApp() {
    TopicGrid(
        topicList = Datasource2.topics,
    )


}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card(modifier = modifier) {
        Row {
            Image(
                painter = painterResource(topic.imageResourceId),
                contentDescription = stringResource(topic.stringResourceId),
                modifier = Modifier
                    .width(68.dp)
                    .height(68.dp),
                contentScale = ContentScale.Crop
            )

            Column {

                Text(
                    text = LocalContext.current.getString(topic.stringResourceId),
                    modifier = Modifier.padding(start = 16.dp,end = 16.dp, top=16.dp, bottom = 8.dp),
                    style = MaterialTheme.typography.bodyMedium
                )

                Row {
                    Icon(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(start = dimensionResource(R.dimen.padding_medium))
                    )
                    Text(
                        text = topic.value.toString(),
                        modifier = Modifier.padding(start = 8.dp,end = 16.dp, top=0.dp, bottom = 0.dp),
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
        }
    }
}

@Composable
fun TopicGrid(topicList: List<Topic>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(  columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        modifier = modifier.padding(8.dp)) {
        items(topicList) { topic ->
            TopicCard(
                topic = topic
            )
        }
    }
}

@Preview
    @Composable
    private fun TopicCardPreview() {
        TopicCard(Topic(R.string.affirmation1,123, R.drawable.image1))
    }