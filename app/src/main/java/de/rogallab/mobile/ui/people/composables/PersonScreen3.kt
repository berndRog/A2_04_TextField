package de.rogallab.mobile.ui.people.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import de.rogallab.mobile.domain.utilities.logVerbose
import de.rogallab.mobile.ui.people.PersonViewModel
import de.rogallab.mobile.ui.people.PersonIntent
import de.rogallab.mobile.ui.people.PersonUiState

@Composable
fun PersonScreen3(
   viewModel: PersonViewModel = viewModel(),
   modifier: Modifier
) {
   // Stateholder = ViewModel
   val personUiState: PersonUiState
      by viewModel.personUiStateFlow.collectAsStateWithLifecycle()

   logVerbose("<-PersonScreen2", "Composition")

   Column(
      modifier = modifier
         .padding(top = 8.dp)
         .fillMaxSize()
   ) {
      InputName(
         name = personUiState.person.firstName,    // State ↓
         onNameChange = { firstName: String ->     // Event ↑
            viewModel.handlePersonIntent(PersonIntent.FirstNameChange(firstName)) },
         label = "Vorname"
      )
      InputName(
         name = personUiState.person.lastName,     // State ↓
         onNameChange = { lastName: String ->      // Event ↑
            viewModel.handlePersonIntent(PersonIntent.LastNameChange(lastName)) },
         label = "Nachname"
      )
   }
}