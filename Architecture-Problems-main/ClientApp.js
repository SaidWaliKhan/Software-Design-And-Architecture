// Simulating Authentication Service
const authService = new AuthService();
const authResponse = authService.login('user1', 'password123');
console.log('Auth Response: ' + authResponse);

// Simulating Product Service
const productService = new ProductService();
console.log('Products: ' + productService.getProducts());
