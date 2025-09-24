package de.rogallab.mobile

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.safeGestures
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.base.BaseActivity
import de.rogallab.mobile.ui.people.composables.PersonScreen1
import de.rogallab.mobile.ui.people.composables.PersonScreen2
import de.rogallab.mobile.ui.people.composables.PersonScreen3
import de.rogallab.mobile.ui.theme.AppTheme

class MainActivity : BaseActivity(TAG) {

   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)

      enableEdgeToEdge()

      setContent {
         logDebug("<-ComposeView", "Composition")

         AppTheme {
            Scaffold(
               contentColor = MaterialTheme.colorScheme.onBackground,
               contentWindowInsets = WindowInsets.safeDrawing,
               modifier = Modifier.padding(horizontal = 20.dp).fillMaxSize()
            ) { innerPadding ->
               PersonScreen3(
                  modifier = Modifier
                        .padding(innerPadding)
                        .fillMaxWidth()
               )
            }
         }
      }
   }
   companion object {
      const val IS_INFO = true
      const val IS_DEBUG = true
      const val IS_VERBOSE = true
      //12345678901234567890123
      private const val TAG = "<-MainActivity"
   }
}