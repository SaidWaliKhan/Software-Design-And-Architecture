class MonolithicApp {

    login(username, password) {
      // Authentication logic
      console.log(`User authenticated: ${username}`);
    }
  
    getProducts() {
      // Product fetching logic
      console.log('Products fetched: [Product1, Product2, Product3]');
    }
  }
  
  // Simulate the app
  const app = new MonolithicApp();
  app.login('user1', 'password123');
  app.getProducts();
  