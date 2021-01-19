# spring-boot-github-workflow-example
With GitHub Actions you can easily automate all your software workflows with CI / CD. Build, test, and implement your code right from GitHub.
The only thing you need to do to enable GitHub Actions is add a YAML file (maven-publish.yml) to the .github / workflows folder in the root of your project.
### Sample Workflows file structure:
```
name: Maven Package

on:
  push:
    branches:
      - 'main'

jobs:
  test:
    name: Test
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v1
      - name: Set up JDK 11
        uses: actions/setup-java@v1
        with:
          java-version: 11
      - name: Maven Test
        run: mvn -B clean test
  build:
    name: Build Artifactory
    runs-on: ubuntu-latest
    steps:
      - uses: actions/checkout@v2
      - name: Set up JDK 1.11
        uses: actions/setup-java@v1
        with:
          java-version: 11
      - name: Build with Maven
        run: mvn clean install -DskipTests=true
      - uses: actions/upload-artifact@v2
        with:
          name: demo
          path: target/demo-0.0.1-SNAPSHOT.jar
```
It’s self-explanatory. You can refer to the [official documentation](https://docs.github.com/en/actions/reference/workflow-syntax-for-github-actions) for more details.