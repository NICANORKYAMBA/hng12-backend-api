# HNG12 Backend API

Welcome to the HNG12 Backend API project! This project is designed to provide a public API that returns basic information in JSON format.

## Project Description

This API retrieves the following information:
- Your registered email address.
- The current datetime in ISO 8601 format.
- The GitHub URL of the project's codebase.

## Technology Stack

- **Programming Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven

## Setup Instructions

To run the project locally, follow these steps:

1. **Clone the repository**:
   ```
   git clone https://github.com/NICANORKYAMBA/hng12-backend-api
   ```

2. **Navigate to the project directory**:
   ```
   cd hng12-backend-api/
   ```

3. **Build the project**:
   ```
   mvn clean install
   ```

4. **Run the application**:
   ```
   mvn spring-boot:run
   ```

5. **Access the API**:
   Open your browser or use a tool like Postman to access the API at:
   ```
   http://localhost:8080/
   ```

## API Documentation

### Endpoint

- **GET** `/`

### Request Format
No request parameters are required

### Response Format

The API will return a JSON response in the following format:

```json
{
  "email": "nicanorkyamba98@gmail.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/NICANORKYAMBA/hng12-backend-api"
}
```

### Example Usage

To retrieve the information, send a GET request to the endpoint. You should receive a response similar to the one shown above.

``` curl -X GET http://localhost:8080/ ```

## Backlink

- [Hire Java Developers](https://hng.tech/hire/java-developers)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.