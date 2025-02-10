class Controller {
    constructor(model, view) {
      this.model = model;
      this.view = view;
  
      // Initial render
      this.view.renderItems(this.model.getItems());
  
      // Bind view events to controller methods
      this.view.bindAddItem(this.handleAddItem.bind(this));
      this.view.bindDeleteItem(this.handleDeleteItem.bind(this));
    }
  
    handleAddItem(item) {
      this.model.addItem(item);
      this.view.renderItems(this.model.getItems());
      this.view.showMessage('Item added successfully!'); // Show success message
    }
  
    handleDeleteItem(index) {
      this.model.removeItem(index);
      this.view.renderItems(this.model.getItems());
      // No message on delete
    }
  }
  
  const app = new Controller(new Model(), new View());
  