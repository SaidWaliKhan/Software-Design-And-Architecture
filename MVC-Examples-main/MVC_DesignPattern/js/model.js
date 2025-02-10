class Model {
    constructor() {
      this.items = JSON.parse(localStorage.getItem('items')) || []; // Load from localStorage
    }
  
    addItem(item) {
      this.items.push(item);
      this.updateLocalStorage();
    }
  
    getItems() {
      return this.items;
    }
  
    removeItem(index) {
      this.items.splice(index, 1);
      this.updateLocalStorage();
    }
  
    updateLocalStorage() {
      localStorage.setItem('items', JSON.stringify(this.items)); // Save to localStorage
    }
  }
  