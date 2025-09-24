package de.rogallab.mobile.ui.people.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import de.rogallab.mobile.domain.utilities.logDebug

@Composable
fun PersonScreen1(
   modifier: Modifier
) {
   // Stateholder: beobachtbare lokale Zustände
   var firstName by rememberSaveable { mutableStateOf("") }
   var lastName  by rememberSaveable { mutableStateOf("") }

   logDebug("<-PersonScreen", "Composition")
   Column(
      modifier = modifier
         .padding(top = 8.dp)
         .fillMaxSize(),
      verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(16.dp)
   ){
      InputName(
         name = firstName,
         onNameChange = { it ->  firstName = it },
         label = "Vorname"
      )
      InputName(
         name = lastName,
         onNameChange = { it -> lastName = it },
         label = "Nachname"
      )
   }
}