class View {
    constructor() {
      this.itemInput = document.getElementById('itemInput');
      this.addItemButton = document.getElementById('addItemButton');
      this.itemList = document.getElementById('itemList');
      
      // Create a message box element
      this.messageBox = document.createElement('div');  
      
      // Insert the message box above the input box
      const inputSection = document.querySelector('.input-section');
      inputSection.insertBefore(this.messageBox, this.itemInput);
    }
  
    clearInput() {
      this.itemInput.value = '';
    }
  
    getInputValue() {
      return this.itemInput.value;
    }
  
    renderItems(items) {
      this.itemList.innerHTML = '';
      items.forEach((item, index) => {
        const li = document.createElement('li');
        li.textContent = item;
  
        const deleteButton = document.createElement('button');
        deleteButton.textContent = 'X';
        deleteButton.addEventListener('click', () => this.onDeleteButtonClick(index));
  
        li.appendChild(deleteButton);
        this.itemList.appendChild(li);
      });
    }
  
    showMessage(message, type = 'success') {
      this.messageBox.textContent = `${type === 'success' ? '✅' : '❌'} ${message}`;
      this.messageBox.style.backgroundColor = type === 'success' ? '#2ecc71' : '#e74c3c'; // Green for success, red for error
      this.messageBox.style.color = 'white';
      this.messageBox.style.padding = '10px';
      this.messageBox.style.marginBottom = '20px';
      this.messageBox.style.borderRadius = '5px';
    }
  
    bindAddItem(handler) {
      this.addItemButton.addEventListener('click', () => {
        const item = this.getInputValue();
        if (item) {
          handler(item);
          this.clearInput();
          this.showMessage('Item added successfully!', 'success'); // Display success message
        } else {
          this.showMessage('Please enter a valid item', 'error'); // Show error message if input is empty
        }
      });
    }
  
    bindDeleteItem(handler) {
      this.onDeleteButtonClick = handler;
    }
  }
  