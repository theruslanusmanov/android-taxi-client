# Taxi client appllication

Simple taxi client application based on Google Maps API and Google Directions API   

![Screenshot](https://raw.githubusercontent.com/owlruslan/taxiclient/master/screenshot.jpg "Screenshot")

How to use
---

### 1. Define API-keys

Inside a file named gradle.properties (just create it if there isn’t any).

```groovy
# (...)
# (...)
(...)
 
GOOGLE_MAPS_API_KEY="Insert your key here"
GOOGLE_DIRECTIONS_API_KEY="Insert your key here"
```

Now you can access to api keys by: "@string/GOOGLE_MAPS_API_KEY" and "@string/GOOGLE_DIRECTIONS_API_KEY"

### 2. Build and run application
