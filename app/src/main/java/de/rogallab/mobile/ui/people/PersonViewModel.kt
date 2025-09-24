package de.rogallab.mobile.ui.people

import androidx.lifecycle.ViewModel
import de.rogallab.mobile.domain.utilities.logDebug
import de.rogallab.mobile.ui.base.updateState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class PersonViewModel : ViewModel() {

   // StateFlow
   private val _personUiStateFlow: MutableStateFlow<PersonUiState> = MutableStateFlow(PersonUiState())
   val personUiStateFlow: StateFlow<PersonUiState> = _personUiStateFlow.asStateFlow()

   // Processing intents
   fun handlePersonIntent(intent: PersonIntent) {
      when(intent) {
         is PersonIntent.FirstNameChange -> onFirstNameChange(intent.firstName)
         is PersonIntent.LastNameChange -> onLastNameChange(intent.lastName)
      }
   }
   private fun onFirstNameChange(firstName: String) {
//      _personUiStateFlow.update { it: PersonUiState ->
//         logDebug(TAG, "onFirstNameChange: ${firstName.trim()}")
//         it.copy(person = it.person.copy(firstName = firstName.trim()))
//      }
      updateState(_personUiStateFlow) {
         logDebug(TAG, "onFirstNameChange: ${firstName.trim()}")
         copy(person = person.copy(firstName = firstName.trim())) }
   }
   private fun onLastNameChange(lastName: String) {
//      _personUiStateFlow.update { it: PersonUiState ->
//         logDebug(TAG, "onLastNameChange: $lastName")
//         it.copy(person = it.person.copy(lastName = lastName))
//      }

      updateState(_personUiStateFlow) {
         logDebug(TAG, "onLastNameChange: ${lastName.trim()}")
         copy(person = person.copy(lastName = lastName.trim())) }
   }

   companion object {
      const val TAG: String = "<-PeopleViewModel"
   }

}