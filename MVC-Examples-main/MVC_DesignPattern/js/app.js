// Get references to the HTML elements
const itemInput = document.getElementById('itemInput');
const addItemButton = document.getElementById('addItemButton');
const successMessage = document.getElementById('successMessage');
const warningMessage = document.getElementById('warningMessage');
const itemList = document.getElementById('itemList');

// Add event listener to the add button
addItemButton.addEventListener('click', () => {
  const itemValue = itemInput.value.trim(); // Get the value of the input field

  if (itemValue === '') {
    // Show warning message if input is empty
    showMessage(warningMessage);
  } else {
    // Add item to the list
    const listItem = document.createElement('li');
    listItem.textContent = itemValue;
    itemList.appendChild(listItem);

    // Show success message
    showMessage(successMessage);

    // Clear the input field
    itemInput.value = '';
  }
});

// Function to show a message and hide it after 2 seconds
function showMessage(messageElement) {
  messageElement.classList.remove('hidden');

  setTimeout(() => {
    messageElement.classList.add('hidden');
  }, 2000);
}
