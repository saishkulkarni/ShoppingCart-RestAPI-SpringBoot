# ShoppingCart-RestAPI-SpringBoot

This project is a Shopping Cart REST API built using Spring Boot. It demonstrates a simple e-commerce backend with user management, product handling, and cart operations.

## Features

- User registration and management
- Product management
- Shopping cart operations
- Order processing

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL Database
- Maven

## Project Structure

The project follows a standard Spring Boot application structure:

- `src/main/java/org/jsp/shoppingcart`: Contains the Java source code
  - `controller`: REST API endpoints
  - `dao`: Data Access Objects for database operations
  - `dto`: Data Transfer Objects (User, Product, Item, Cart, Order)
  - `exception`: Custom exception handling
  - `repository`: JPA repository interfaces
  - `service`: Business logic layer

## Setup and Installation

1. Clone the repository:

2. Navigate to the project directory:

3. Update the `application.properties` file in `src/main/resources` with your MySQL database configuration.

4. Build the project:

5. Run the application:

The application will start running at `http://localhost:8080`.

## API Endpoints

### User Management
- POST `/users`: Register a new user
- POST `/users/verify-otp`: Verify user OTP
- POST `/users/login`: User login
- GET `/users`: Get all users (admin only)
- GET `/users/{id}`: Get user by ID
- PUT `/users/{id}`: Update user
- DELETE `/users/{id}`: Delete user

### Product Management
- POST `/products`: Add a new product
- GET `/products`: Get all products
- GET `/products/{id}`: Get product by ID
- PUT `/products/{id}`: Update product
- DELETE `/products/{id}`: Delete product

### Cart Operations
- POST `/carts/add`: Add item to cart
- GET `/carts/{userId}`: Get cart by user ID
- PUT `/carts/remove`: Remove item from cart

### Order Management
- POST `/orders/{userId}`: Create an order for a user

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## License

This project is open source and available under the [MIT License](LICENSE).
