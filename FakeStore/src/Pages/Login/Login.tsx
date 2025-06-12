// src/Login/Login.tsx
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import LoginDesign from './LoginDesign';

export default function Login() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleLogin = () => {
    const users = JSON.parse(localStorage.getItem('users') || '[]');

    const user = users.find((u: any) => u.username === username && u.password === password);

    if (!user) {
      alert('Credenciais inválidas!');
      return;
    }

    localStorage.setItem('token', 'dummy-token');
    navigate('/products');
  };

  return (
    <LoginDesign
      username={username}
      password={password}
      onUsernameChange={setUsername}
      onPasswordChange={setPassword}
      onSubmit={handleLogin}
      onNavigateToRegister={() => navigate('/register')}
    />
  );
}
