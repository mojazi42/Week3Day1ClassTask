# Jetpack Compose Navigation Task - Week 3, Day 1

## Overview
This is an Android Jetpack Compose application that implements navigation, a TopAppBar, and a Bottom Navigation Bar, following the class task requirements.

The project consists of:
- **Home Screen**: Users can enter text and navigate to the Second Screen.
- **Second Screen**: Displays the saved text from the Home Screen.
- **Settings Screen**: Accessible via the Bottom Navigation Bar.
- **Navigation Bar**: Allows switching between screens.
- **Dynamic TopAppBar**: Updates the title dynamically and includes a back button on the Second Screen.

This project meets all task requirements and follows best coding practices.

---

## Features Implemented
### 1. Basic Navigation Setup
- Implemented Jetpack Compose Navigation with `NavHost`.
- Navigation between Home Screen, Second Screen, and Settings Screen.
  
### 2. Dynamic TopAppBar Implementation
- TopAppBar title changes dynamically per screen.
- Back button only appears on the Second Screen.

### 3. TopAppBar Navigation Configuration
- No back button on the Home Screen.
- Back button appears on the Second Screen and navigates correctly.

### 4. Bottom Navigation Bar Integration
- Bottom Navigation includes Home and Settings.
- Navigation is handled via `NavController`.

### 5. Saving and Displaying Information
- Users can enter text on the Home Screen.
- Clicking the Save button navigates to the Second Screen, where the input is displayed.

---

## Screenshots
| Home Screen | Second Screen | Bottom Navigation |
|-------------|--------------|-------------------|
| ![Screenshot_20250316-231741_Week3Day1ClassTask](https://github.com/user-attachments/assets/10121832-734f-46c5-b082-964c5aef4993)
 |![Screenshot_20250316-231744_Week3Day1ClassTask](https://github.com/user-attachments/assets/44e53da6-f786-4abf-918f-21c94b619e3f)
 | ![Screenshot_20250316-231758_Week3Day1ClassTask](https://github.com/user-attachments/assets/aa7c4a38-229a-41fc-b5bf-41f081d7806f) |

Ensure that the screenshots are uploaded to the `screenshots/` folder before submission.

---

## How to Run the Project
1. Clone the repository:
   ```sh
   git clone https://github.com/mojazi42/Week3Day1ClassTask/tree/main
