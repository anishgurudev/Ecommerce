#UI Automation Framework

This is a robust, scalable automation framework built for testing the e-commerce website. It leverages **Java**, **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern to ensure modularity, maintainability, and extensibility.
## Features
- Page Object Model (POM) design for maintainable test scripts.
- Supports multiple browsers (Chrome, Firefox, Edge).
- Headless mode for faster execution.
- ExtentReports for detailed test reporting.
- Email OTP fetching for secure login testing.

## 📁 Project Structure

```

/UI-automation/
│
├── base/                  # Base class (like BaseTest)
├── config/                # Configuration files and reader & WebDriver factory with browser setup
├── listeners/             # TestNG Listeners (ExtentReport & screenshot capture)
├── locators/              # Web locators organized by page
├── pages/                 # Page Object classes for UI interaction
├── reports/               # ExtentReports setup
├── tests/                 # TestNG test classes
├── utils/                 # Utilities (Selenium actions, waits, JS utils, etc.)
│
├── resources/             # Log files (via log4j2)
├── pom.xml                # Maven dependencies and build config
├── testng.xml             # TestNG test suite definition
├── config.properties      # Environment-specific configuration
├── log4j2.xml             # Logging configuration
└── README.md              # Project documentation (this file)

````


## 🔧 Technology Stack

| Layer           | Tool / Library                                    |
|-----------------|---------------------------------------------------|
| Language        | Java                                              |
| Build Tool      | Maven                                             |
| Test Runner     | TestNG                                            |
| Automation tool | Selenium WebDriver                                |
| Design          | Page Object Model (POM)                           |
| Reporting       | ExtentReports                                     |
| Logging         | Log4j2                                            |
| Retry Logic     | TestNG RetryAnalyzer                              |
| Utilities       | JavaScriptExecutor, Waits, Screenshot Utils,etc.. |


## ⚙️ Configuration (`config.properties`)

```properties
browser=chrome
url=https://www.restaurantware.com/
implicitWait=2
maxRetry=0
env=Production
headless=False
````

These values are accessed via `ConfigReader.java` which provides methods like:

* `getBrowser()`
* `getURL()`
* `getImplicitWait()`


## 🏗️ Core Components

### 🔸 BaseTest.java

* Initializes and tears down the WebDriver for each test.

[//]: # (* Supports parallel execution using `ThreadLocal<WebDriver>`.)

### 🔸 DriverFactory.java

* Central browser initialization logic.
* Supports Chrome, Firefox, Edge, Headless-chrome.

[//]: # (* Can be extended to use Selenium Grid or headless mode.)

### 🔸 TestNG Test Execution

* All tests are organized under `/tests/`
* Managed via `testng.xml` with parameterized browser.
* Retry logic is handled via `RetryAnalyzer.java`.

### 🔸 Extent Reports

* Managed using `ExtentReportManager.java`
* Configured via `TestListeners.java` (uses `ITestListener`)
* Captures screenshots on test failure via `ScreenshotUtil.java`

### 🔸 Utilities

* `SeleniumAction.java` – Abstracted WebDriver calls like `click`, `sendKeys`, etc.
* `WaitUtils.java` – Explicit wait wrappers using `WebDriverWait`.
* `JavaScriptUtils.java` – JS interactions for non-interactable elements.
* `ExceptionHandlingUtil.java` – Graceful exception captures with logging.
* `ScreenshotUtil.java` – Captures screenshots on test failure.
* `ConfigReader.java` – Reads configuration properties.
* `DriverFactory.java` – Initializing and providing the WebDriver instance.
* `RetryAnalyzer.java` – Implements retry logic for flaky tests.
* `TestListeners.java` – Custom TestNG listeners for reporting and logging.
* `WaitUtil.java` – Custom wait methods for elements.
* `JavaScriptUtil.java` – Executes JavaScript commands.
* `EmailUtil.java` – Fetches OTP from email for login tests.
* `ExtentReportManager.java` – Manages ExtentReports setup and teardown.

## 🧪 Sample Tests

* **HomePageTests.java** – Validates homepage components.
* **SearchListPageTests.java** – Validates search and product list functionality.


## 📝 Logs

* Logging configured via `log4j2.xml`.
* Console + File-based logs: `logInfo`


## 🚀 Running the Framework

### Run from IntelliJ / Eclipse:

* Right-click `testng.xml` → Run

### Run via Maven:

```
mvn clean test 
```

## 📦 Maven Dependencies

Includes:

* Selenium 4.15
* TestNG 7.7
* WebDriverManager 6.1
* ExtentReports 5.0.9
* Log4j 2.22.1
* Apache POI, OpenCSV, JSON-simple

Full list in `pom.xml`.

## ⚙️ Setup Instructions

**Clone the repository:**
```
git clone \<repository-url\>
```

**Navigate into the project directory:**
```
cd RW-UI-Automation
```

**Install dependencies:**
```
mvn clean install
```

**Run tests using TestNG:**
```
mvn test -DsuiteXmlFile=testng.xml
```



## 🧪 Writing Tests

- Place new test classes under `tests/`
- Use page classes from `pages/` for UI interactions
- Use utilities from `utils/` for waits, JS, Excel, screenshots, etc.


## 📊 Reports

- Test reports are generated using ExtentReports in the `reports/` folder.
- Screenshots of failures are stored in `screenshots/`



## 🤝 Contribution

1. Fork the repo
2. Create a new branch (`git checkout -b feature-branch`)
3. Commit your changes (`git commit -m 'Add new feature'`)
4. Push to the branch (`git push origin feature-branch`)
5. Create a Pull Request


## 🙋 Support

If you're new to automation or need help, feel free to raise issues or ask for guidance!

## 📌 Future Enhancements

* CI/CD integration (Jenkins in Process)


## 👨‍💻 Author

Framework designed and maintained by Anish Kumar (Automation Lead) experienced in Java Selenium TestNG architecture with focus on maintainable, scalable and reusable test design.

## 📜 License

This project is licensed for internal automation use only.
All rights reserved. Redistribution or commercial use is prohibited without prior permission.   
    
    comment outed lines are for future use

[//]: # 🔸 "C:\Program Files\Google\Chrome\Application\chrome.exe" --user-data-dir="C:
\Automation\ChromeTestProfile" --profile-directory="TestProfile
