# Katalon_CURA

This repository contains automated test scripts for the [Katalon CURA Healthcare Service demo site](https://katalon-demo-cura.herokuapp.com/) using [Katalon Studio](https://www.katalon.com/).

## Project Structure

- **Test Cases/**: High-level test case definitions (XML).
- **Scripts/**: Groovy scripts implementing test steps for each test case.
- **Object Repository/**: Web element definitions used in test cases.
- **Keywords/**: Custom keywords for reusable actions (Groovy).
- **Profiles/**: Global variables and test data profiles.
- **Include/**: Additional configuration, features, and scripts.
- **Reports/**, **Screenshots/**: Test execution artifacts (output, screenshots).
- **settings/**: Project and execution settings.
- **build.gradle**: Gradle build configuration for dependencies.
- **console.properties**: Execution and integration properties.

## Getting Started

### Prerequisites

- [Katalon Studio](https://www.katalon.com/) installed.
- Java JDK 8 or later.

### Running Tests

1. Clone this repository.
2. Open the project in Katalon Studio (`File > Open Project` and select `Katalon_CURA.prj`).
3. Configure any required [Profiles/default.glbl](Profiles/default.glbl) variables if needed.
4. Run test cases or suites from the Katalon Studio GUI.

### Custom Keywords

Reusable actions are defined in [Keywords/customKeywords/Appointment.groovy](Keywords/customKeywords/Appointment.groovy).

## Example Test Cases

- **Login - Success**: [Test Cases/Login/Login - Success.tc](Test Cases/Login/Login - Success.tc)
- **Make Appointment - Success**: [Test Cases/Appointment/Make Appointment - Success.tc](Test Cases/Appointment/Make Appointment - Success.tc)

## License

This project is for demo and educational purposes.

---
