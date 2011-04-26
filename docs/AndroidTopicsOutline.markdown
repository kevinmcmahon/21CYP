# Android Overview

## Activities and Intents

### Understanding Activities
- Applying Styles and Themes to Activity
- Hiding the Activity Title
- Displaying a Dialog Window
- Displaying a Progress Dialog

### Linking Activities Using Intents
- Resolving Intent Filter Collision
- Returning Results from an Intent
- Passing Data Using an Intent Object

### Calling Built-In Applications Using Intents
- Understanding the Intent Object
- Using Intent Filters
- Adding Categories

### Displaying Notifications

## Getting to know the Android UI

### Understanding the Components of a Screen
- Views and ViewGroups
- LinearLayout
- AbsoluteLayout
- TableLayout
- RelativeLayout
- FrameLayout
- ScrollView

### Adapting to Display Orientation
- Anchoring Views
- Resizing and Repositioning

### Managing Changes to Screen Orientation
- Persisting State Information during Changes in Configuration
- Detecting Orientation Changes
- Controlling the Orientation of the Activity

### Creating UI programmatically

### Listening to UI notifications
- Overriding Methods Defined in an Activity
- Registering Events for Views

## Designing your User Interface using Views

### Basic Views
- TextView View
- Button, ImageButton, EditText, CheckBox, ToggleButton, RadioButton, and RadioGroup Views
- ProgressBar View
- AutoCompleteTextView View

### Picker Views
- TimePicker View
- DatePicker View

### List Views
- ListView View
- Using Spinner

## Displaying Pictures and Menus with Views

### Using Image Views to Display Pictures
- Gallery and ImageView Views
- ImageSwitcher
- GridView

### Using Menus with Views
- Creating the Helper Methods
- Options Menu
- Context Menu

### Some Additional Views
 - AnalogClock and DigitalClock views
 - WebView

## Data Persistence

### Saving and Loading User Preferences
- Using getSharedPreferences()
- Using getPreference()

### Persisting Data to Files
- Saving to Internal Storage
- Saving to External Storage (SD Card)
- Choosing the Best Storage Option
- Using Static Resources

### Creating and Using Databases
- Creating the DBAdapter Helper Class
- Using the Database Programmatically
	- Adding Contacts
	- Retrieving All the Contacts
	- Retrieving a Single Contact
	- Updating a Contact
	- Deleting a Contact
	- Upgrading the Database
- Pre-Creating the Database
	- Bundling the Database with an Application

## Content Providers

### Sharing Data in Android

### Using a Content Provider
- Predefined Query String Constants
- Projections
- Filtering
- Sorting

### Creating Content Providers
- Using the Content Provider

## Messaging and Networking

### SMS
- Sending SMS Messages Programmatically
- Getting Feedback After Sending the Message
- Sending SMS Messages Using Intent
- Receiving SMS Messages
	- Updating an Activity from a BroadcastReceiver
	- Invoking an Activity from a BroadcastReceiver
- Caveats and Warnings

### Sending E-Mail

### Networking
- Downloading Binary Data
- Downloading Text Files
- Accessing Web Services
- Performing Asynchronous Calls

## Location-Based Services

### Displaying Maps
- Creating the Project
- Obtaining the Maps API Key
- Displaying the Map
- Displaying the Zoom Control
- Changing Views
- Navigating to Specific Location
 
### Getting Location Data
- Monitoring a Location

## Developing Android Services

### Creating your own services
- Performing Long Running Tasks in a Service
- Performing Repeated Tasks in a Service
- Executing Async Tasks on Separate Threads Using IntentService

### Communicating between a Service and an Activity
### Binding Activities to Services

## Publishing Android Applications

### Prep for publish
- Versioning
- Digitally Signing Your Android Applications

### Deploying APK files
- Using adb.exe Tool
- Using a Web Server
- Publishing on the Android Market
	- Creating a Developer Profile
	- Submitting Your Apps