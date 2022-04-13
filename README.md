# gradle-pitest-example

A simple example of how to use [Pitest](http://pitest.org)

## Quickstart
### Gradle
- Guide: [gradle-pitest-plugin](https://gradle-pitest-plugin.solidsoft.info)
### Maven
- Guide: [maven-pitest dependency](http://pitest.org/quickstart/maven/)

## Executing Mutation Tests using Pitest
Run via:
```bash
./gradlew build # since build depends on pitest, the mutation tests will also be executed...
./gradlew pitest # to run the mutation tests separately
```

## Reporting
Reports can be found in the `./build/reports/pitest/<timestamp>` directories...