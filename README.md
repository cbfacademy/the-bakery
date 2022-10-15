# The Bakery

[![Java Language](https://img.shields.io/badge/language-Java-3A75B0.svg?logo=OpenJDK)][1]
[![JVM Platform](https://img.shields.io/badge/platform-JVM-6C93B8.svg?logo=IntelliJIDEA)][2]
[![JUnit5 Testing Framework](https://img.shields.io/badge/testing%20framework-JUnit5-26A162.svg?logo=JUnit5)][3]
[![Maven Dependency Manager](https://img.shields.io/badge/dependency%20manager-Maven-AA215A.svg?logo=ApacheMaven)][4]

A simple design pattern implementation exercise in Java.

- [Prerequisites][10]
- [Development Setup][11]
- [Java Design Pattern Exercise][12]

## Prerequisites

This starter project uses the [Java][1] programming language.

Before getting started, ensure you have Java 17 LTS (or higher) installwed locally. The following commands should output the version of Java installed.

```bash
$ javac -version

javac 17.0.4
```


```bash
$ java -version

openjdk version "17.0.4" 2022-07-19 LTS
OpenJDK Runtime Environment Zulu17.36+13-CA (build 17.0.4+8-LTS)
OpenJDK 64-Bit Server VM Zulu17.36+13-CA (build 17.0.4+8-LTS, mixed mode, sharing)
```

<br/>

If you do not have Java installed, a few options are available:

#### <u>Oracle</u>

Follow the JDK installation guide on the [Oracle website][5].

#### <u>SdkMan</u>

If you are using a Unix based system, we recommend using the [SdkMan tool][6] for managing software development kits.
Once the SdkMan tool [installed][7], follow the instructions on [this page][8] to install the JDK 17.


## Development Setup

Clone this repository locally, then create a branch to work on. 

```bash
git clone git@github.com:CodingBlackFemales/the-bakery.git
cd the-bakery
git checkout -b ${your-branch-name}
```

#### :building_construction: <u>Install dependencies</u>

Next, install the project dependencies and validate your project by running the following command at the root of your project:

```bash
./mvnw clean compile exec:java --quiet
```

If you are on a Windows machine, that will be:

```bash
mvnw clean compile exec:java --quiet
```

You should see the following console output:

```bash
$ ./mvnw clean compile exec:java --quiet

   10  Vanilla cake
   10  Chocolate cake
```

#### :house: <u>Run the application</u>

Everytime you need to run your code, this is the command to execute in your terminal:

```bash
./mvnw clean compile exec:java --quiet
```

If you are on Windows, run the following:

```bash
mvnw clean compile exec:java --quiet
```


#### :writing_hand: <u>Note</u>

The `--quiet` flag allows us to mute maven default (but very verbose) output. \
Thus allowing us to focus on our program's actual output.


## Exercise

The bakery makes two types of cakes: **vanilla** and **chocolate**. \
They now want to make more complex cakes such as a `Multi-layered Vanilla cake with sprinkles that says 'Hello World!'`

Change the code so that an order can contain such complex cakes using the **Decorator Pattern**.

- Create the necessary decorator classes:

    - For multi-layered cakes, add £5 and print `Multi-layered` at the front of the name.
    - For sprinkles, add £2 and print `with sprinkles` at the end of the name.
    - For a cake with the saying `X`, add nothing to the cost, and print `with saying 'X'` at the end of the name.

- Add the new type of cake, a **strawberry cake**, which costs twice as much as a `Cake`.

- Change the client to add the following to an `Order`, and print the `Order`:
    
    - Chocolate cake
    - Vanilla cake with saying `PLAIN!`
    - Vanilla cake with sprinkles with saying `FANCY`
    - Multi-layered Strawberry cake with double sprinkles and two sayings `One of` and `EVERYTHING`

#### <u>Sample output</u>

```bash
    10  Chocolate cake
    10  Vanilla cake with saying "PLAIN!"
    12  Vanilla cake with sprinkles with saying "FANCY!"
    29  Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```

#### <u>Constraints</u>

- Adding a new type of cake does not change any existing code (except to instantiate it)
- Adding a new way to decorate or style the cake (such as multi-layer, or with sprinkles) does not change any existing code (except to instantiate it)

Enjoy working on your exercise! :smiley:


[1]: https://www.java.com/en/download/help/whatis_java.html
[2]: https://www.ibm.com/cloud/blog/jvm-vs-jre-vs-jdk
[3]: https://junit.org/junit5/
[4]: https://maven.apache.org/
[5]: https://www.oracle.com/java/technologies/downloads/#jdk17
[6]: https://sdkman.io
[7]: https://sdkman.io/install
[8]: https://sdkman.io/jdks#zulu
[9]: https://github.com/CodingBlackFemales/tdd-java-starter/generate
[10]: #prerequisites
[11]: #development-setup
[12]: #exercise
