package app.kochergin.stat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.tooling.preview.Preview
import app.kochergin.stat.common.di.LocalCommonProvider
import app.kochergin.stat.design.theme.StatTheme
import app.kochergin.stat.di.LocalAppProvider
import app.kochergin.stat.main.presentation.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatTheme {
                Surface {
                    CompositionLocalProvider(
                        LocalAppProvider provides application.appProvider,
                        LocalCommonProvider provides application.appProvider
                    ) {
                        Navigation()
                    }
                }
            }
        }
    }
}