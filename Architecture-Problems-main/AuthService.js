class AuthService {
    login(username, password) {
      if (username && password && username !== '' && password !== '') {
        return `User authenticated: ${username}`;
      } else {
        return 'Invalid credentials';
      }
    }
  }
  