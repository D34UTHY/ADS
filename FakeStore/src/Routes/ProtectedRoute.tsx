import { Navigate } from 'react-router-dom';

// Esse componente recebe como filhos (children) outra página
// Ele verifica se o usuário está autenticado, e só libera o acesso se tiver token no localStorage
export default function ProtectedRoute({ children }: { children: JSX.Element }) {
  // Verifica se tem um token salvo (aqui usamos localStorage para armazenar token)
  const isAuth = localStorage.getItem('token');

  // Se tem token, renderiza o conteúdo da rota protegida
  // Se não, redireciona para o login
  return isAuth ? children : <Navigate to="/" />;
}
