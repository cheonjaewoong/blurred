# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

cmake_minimum_required(VERSION 3.18.1)

file(GLOB LIB_SRC src/main/cpp/*.h src/main/cpp/*.cpp)

project(blurredcore LANGUAGES CXX)
add_library(blurredcore SHARED ${LIB_SRC})

find_library(JNIGRAPHICS_LIB jnigraphics)
target_link_libraries(blurredcore ${JNIGRAPHICS_LIB})
