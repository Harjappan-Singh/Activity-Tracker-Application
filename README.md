
# Activity Tracker Application

## Overview

The Activity Tracker application helps users monitor and analyze their physical activities. It supports various activities, allows data import through CSV files, and provides detailed statistics and sorting functionalities.

## Functional Requirements

### Data Input

-   Upload activities from a CSV file (duplicates are not stored).

### Data Viewing and Sorting

-   View activities sorted by:
    -   Calories burned (Descending)
    -   Date (Ascending/Descending)
    -   Activity Duration (Ascending/Descending)
    -   Type of Activity
    -   Distance (Ascending/Descending)

### Data Filtering

-   View a subset of activities based on:
    -   Activity type
    -   Minimum distance
    -   Energy expended
    -   Minimum duration

### Search

-   Find specific activities based on their natural ordering using the binary search function of the `Collections` class.

### Statistics

-   View overall performance statistics:
    -   Average distance per activity
    -   Average calories burned

## Data Format

### CSV File

The CSV file should contain:

-   Activity Type: {Running, Swimming, Cycling}
-   Date: Format `dd/mm/yyyy`
-   Duration: Time in minutes
-   Distance: Distance in kilometers
-   Average Heart Rate

### Additional Calculated Fields

-   **Intensity**: {Very Light, Light, Moderate, Vigorous, Very Vigorous} (based on activity type and speed).
-   **Calories Burned**: Calculated as `(Intensity Value * duration in minutes)`.

## Technical Details

-   Java
-   Collection classes
-   Lambda expressions
-   Anonymous inner classes
-   `Comparable` and `Comparator` interfaces
-   Version control (Git)

## Installation

1.  Clone the repository: 
    `git clone https://github.com/Harjappan-Singh/Activity-Tracker-Application` 
    
2.  Navigate to the project directory:
    `cd Activity-Tracker-Application` 
    
3.  Compile the project:
    `javac -d bin src/*.java` 
    
4.  Run the application:
    `java -cp bin com.example.Activity-Tracker-Application.Main` 
    

## Contributing

1.  Fork the repository.
2.  Create a new feature branch:
    `git checkout -b feature/your-feature` 
    
3.  Commit your changes:
    `git commit -m 'Add some feature'` 
    
4.  Push to the branch:
    `git push origin feature/your-feature` 
    
5.  Create a new Pull Request.
