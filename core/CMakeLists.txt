# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

cmake_minimum_required(VERSION 3.18.1)

# Project defaults
project(
    blurredcore # Project name
    LANGUAGES CXX # Project programming language
)

# Creates native library
add_library(
    # Library name
    blurredcore
    # Sets the library as a shared library
    SHARED
    # Provides a relative path to your source file(s)
)

# Finds external prebuilt libraries
find_library(
    # Name of external library path variable
    LIB_ANDROID_NDK_LOG
    # Android NDK logging library
    log
)

# Links libraries to project
target_link_libraries(
    # Target
    blurredcore
    # Links Android NDK logging library
    ${LIB_ANDROID_NDK_LOG}
)
