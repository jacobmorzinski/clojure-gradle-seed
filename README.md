clojure-gradle-seed
===================

Seed project demonstrating a way to combine Clojure and Gradle.  

It is recommended to build using the Gradle Wrapper `gradlew`

    ./gradlew build

    ./gradlew run

    ./gradlew uberjar

Theoretically you can use "java -cp ..." to run the jar produced
by the build task, but you need to run it with a specific Clojure
jar.  So you might need something awkward like:

    java -cp $HOME/.gradle/...etc.../clojure-1.6.0.jar:./build/libs/clojure-gradle-seed.jar example a bc`

Which prints:

    Hello, World!  Here's the commandline args we were given:
    "a" "bc"

The uberjar task packages the necessary jars for you, allowing you to:

    java -jar build/libs/clojure-gradle-seed-standalone.jar a bc

    Hello, World!  Here's the commandline args we were given:
    "a" "bc"


