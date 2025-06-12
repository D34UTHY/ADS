// src/Register/Register.tsx
import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import RegisterDesign from './RegisterDesign';

export default function Register() {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigate = useNavigate();

  const handleRegister = () => {
    const users = JSON.parse(localStorage.getItem('users') || '[]');
    if (users.find((u: any) => u.username === username)) {
      alert('Usuário já existe!');
      return;
    }

    users.push({ username, password });
    localStorage.setItem('users', JSON.stringify(users));
    alert('Cadastro realizado com sucesso!');
    navigate('/');
  };

  return (
    <RegisterDesign
      username={username}
      password={password}
      onUsernameChange={setUsername}
      onPasswordChange={setPassword}
      onSubmit={handleRegister}
    />
  );
}
