# Project 2 - *Flixster*

**Flixster** shows the latest movies currently playing in theaters. The app utilizes the Movie Database API to display images and basic information about these movies to the user.

Time spent: **9** hours spent in total

## User Stories

The following **required** functionality is completed:

* [X] User can **scroll through current movies** from the Movie Database API
* [X] Display a nice default [placeholder graphic](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#advanced-usage) for each image during loading
* [X] For each movie displayed, user can see the following details:
  * [X] Title, Poster Image, Overview (Portrait mode)
  * [X] Title, Backdrop Image, Overview (Landscape mode)
* [X] Allow user to view details of the movie including ratings and popularity within a separate activity

The following **stretch** features are implemented:

* [X] Improved the user interface by experimenting with styling and coloring.
* [X] Apply rounded corners for the poster or background images using [Glide transformations](https://guides.codepath.org/android/Displaying-Images-with-the-Glide-Library#transformations)
* [ ] Apply the popular [View Binding annotation library](http://guides.codepath.org/android/Reducing-View-Boilerplate-with-ViewBinding) to reduce boilerplate code.
* [ ] Allow video trailers to be played in full-screen using the YouTubePlayerView from the details screen.

The following **additional** features are implemented:

* [X] Added two descriptors (Family-Friendly, Language) to movie details page
* [X] Changed app icon from default Android icon to popcorn icon

## Video Walkthrough

Here's a walkthrough of implemented user stories:

Direct Link to 1st submission: https://imgur.com/gHkcPZD
Direct Link to 2nd submission: https://imgur.com/a/7Dx2uMF

GIF created with [Kap](https://getkap.co)

## Notes

Describe any challenges encountered while building the app.

When I first put in the API access functionality, my app wouldn't turn on -- the screen was completely black. I fixed this issue by clearing the user data from the device and restarting the app. 

I also had some trouble completing all of the stretch features I wanted to complete. I spent time on the UI instead of the YouTube API stretch goal, so I wasn't able to complete the latter, unfortunately. Next time I will focus more on stretch goals like the YouTube API stretch goal because I am more comfortable with UI design than with API calls. 

## Open-source libraries used

- [Android Async HTTP](https://github.com/loopj/android-async-http) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2020] [CodePath]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
