//package de.rogallab.mobile
//
//import androidx.compose.ui.test.assert
//import androidx.compose.ui.test.hasText
//import androidx.compose.ui.test.junit4.createComposeRule
//import androidx.compose.ui.test.onNodeWithTag
//import androidx.compose.ui.test.onNodeWithText
//import androidx.compose.ui.test.performTextInput
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import de.rogallab.mobile.ui.features.people.composables.PersonInputScreen
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(AndroidJUnit4::class)
//class InputNameTest {
//
//   @get:Rule
//   val composeTestRule = createComposeRule()
//
//   @Test
//   fun firstNameTextField_WithCorrectInput() {
//
//      // Start the composition
//      composeTestRule.setContent {
//         PersonInputScreen()
//      }
//
//      // Enter a name in the text field
//      composeTestRule.onNodeWithTag("firstNameTextField")
//         .performTextInput("John")
//      // Verify that the entered name is correctly updated
//      composeTestRule.onNodeWithTag("firstNameTextField")
//         .assert(hasText("John"))
//      // Verify that the error message is not displayed
//      composeTestRule.onNodeWithText("Vorname ist zu lang (maximal 20 Zeichen)")
//         .assertDoesNotExist()
//   }
//
//   @Test
//   fun lastNameTextField_WithCorrectInput() {
//
//      // Start the composition
//      composeTestRule.setContent {
//         PersonInputScreen()
//      }
//
//      // Enter a name in the text field
//      composeTestRule.onNodeWithTag("lastNameTextField")
//         .performTextInput("Doe")
//      // Verify that the entered name is correctly updated
//      composeTestRule.onNodeWithTag("lastNameTextField")
//         .assert(hasText("Doe"))
//      // Verify that the error message is not displayed
//      composeTestRule.onNodeWithText("Nachname ist zu lang (maximal 20 Zeichen)")
//         .assertDoesNotExist()
//   }
//
//
//   @Test
//   fun firstNameTextField_WithToLongInput() {
//
//      // Start the composition
//      composeTestRule.setContent {
//         PersonInputScreen()
//      }
//
//      // Verify that the initial value of the name field is empty
//      composeTestRule.onNodeWithTag("firstNameTextField")
//         .assert(hasText(""))
//
//      // Enter a name that exceeds the character limit in the text field
//      composeTestRule.onNodeWithTag("firstNameTextField")
//         .performTextInput("This is a very long name that exceeds the maximum character limit")
//      // Wait for the error message to appear
//      composeTestRule.onNodeWithText("Vorname ist zu lang (maximal 20 Zeichen)")
//         .assertExists()
//   }
//
//   @Test
//   fun lastNameTextField_WithToLongInput() {
//
//      // Start the composition
//      composeTestRule.setContent {
//         PersonInputScreen()
//      }
//
//      // Verify that the initial value of the name field is empty
//      composeTestRule.onNodeWithTag("lastNameTextField")
//         .assert(hasText(""))
//
//      // Enter a firstName that exceeds the character limit in the text field
//      composeTestRule.onNodeWithTag("lastNameTextField")
//         .performTextInput("This is a very long name that exceeds the maximum character limit")
//      // Wait for the error message to appear
//      composeTestRule.onNodeWithText("Nachname ist zu lang (maximal 20 Zeichen)")
//         .assertExists()
//   }
//
//}