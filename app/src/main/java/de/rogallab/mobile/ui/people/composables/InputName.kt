package de.rogallab.mobile.ui.people.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.domain.utilities.logVerbose

@Composable
fun InputName(
   name: String,                     // State ↓
   onNameChange: (String) -> Unit,   // Event ↑
   label: String = "Name"
) {

   logVerbose("<-InputName", "Composition")

   TextField(
      modifier = Modifier
         .fillMaxWidth(),
      value = name,                                        // State ↓
      onValueChange = {
         it: String -> onNameChange(it)                    // Event ↑
         //logDebug("<-InputName", "onValueChange: $it")
      },
      label = { Text(text = label) },
      singleLine = true,
      isError =  name.length > 20,
      supportingText = {
         if (name.length > 20) {
            Text("Zu lang (maximal 20 Zeichen)")
         }
      }
   )
}