# PSU SWENG-888 Age Calculator

## Description
In this assignment, you will create your first Android app named "Age Calculator App.” It will allow the user to input the first name, last name, and date of birth. Once the user fills out the required information and clicks on the "Calculate" button, the app will calculate the age and display it in a Toast.

**Requirements:**
- The app should have a simple user interface with input fields for first name, last name, and date of birth.
- The app should have a button labeled "Calculate Age."
- When the user clicks on the "Calculate Age" button, the app should calculate the user's age based on the date of birth entered.
- The app should display the calculated age in a Toast.
- The app should handle invalid inputs, such as empty fields or invalid dates.
- The app should be well-documented with clear and concise comments.

**Instructions:**
- Create a new Android project and name it "Age Calculator."
- Design the user interface by adding three input fields for first name, last name, and date of birth, and a button labeled "Calculate Age."
- In the MainActivity class, create a reference to the input fields and button.
- In the onClickListener method for the button, get the values entered by the user in the input fields.
- Use the SimpleDateFormat class to parse the date of birth entered by the user into a Date object.
- Calculate the user's age by subtracting the user's birth year from the current year.
- Display the calculated age in a Toast.
- Handle any errors or invalid inputs by displaying an error message in a Toast.
- Test the app by running it on an Android emulator or physical device.
