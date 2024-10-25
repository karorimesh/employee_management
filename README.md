# Employee Management Website

A web application to manage employee data, designed for easy deployment and use. This project includes various ways to run the application: using source code, pre-built JAR file, or Docker.

## Features

- Add, update, and delete employee records
- View detailed employee profiles
- Basic authentication for secure access
- Built with Java and Spring Boot

## Getting Started

### Prerequisites

- **Java**: Ensure Java 11+ is installed.
- **PostgreSQL**: Install PostgreSQL and set up a database with the following credentials (for easy setup, do not use in production):
    - **Username**: `postgres`
    - **Password**: `postgres`

> **Note**: For production environments, consider securing database credentials through environment variables or a config server.

### Running the Application

#### 1. Source Code Setup

To run the application from source:

1. Clone the repository:
   ```bash
   git clone <repo-url>
   cd <repo-directory>

### 2. Run with Pre-built JAR

To run the application using the provided JAR file:

1. Extract the zipped folder containing the JAR file.
2. In the terminal, navigate to the extracted directory.
3. Run the following command:
   ```bash
   java -jar employee-management.jar  /// Or the name of the jar file
### Docker

To run the application using Docker:

1. Change directory into the project folder:
   ```bash
   cd <project-directory>
docker-compose up
