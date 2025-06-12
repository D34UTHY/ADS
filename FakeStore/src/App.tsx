import { Routes, Route } from 'react-router-dom';

// Importa as páginas que vamos criar
import Login from './Pages/Login/Login';
import Register from './Pages/Register/Register';
import Products from './Pages/Products/Products';
import ProductDetail from './Pages/ProductDetail/ProductDetail';

// Importa um componente para proteger rotas que precisam de login
import ProtectedRoute from './Routes/ProtectedRoute';

export default function App() {
  return (
    // Define as rotas da aplicação
    <Routes>
      {/* Tela de login ("/") */}
      <Route path="/" element={<Login />} />

      {/* Tela de cadastro */}
      <Route path="/register" element={<Register />} />

      {/* Tela de listagem de produtos, protegida por login */}
      <Route path="/products" element={
        <ProtectedRoute>
          <Products />
        </ProtectedRoute>
      } />

      {/* Tela de detalhe do produto, protegida por login */}
      <Route path="/products/:id" element={
        <ProtectedRoute>
          <ProductDetail />
        </ProtectedRoute>
      } />
    </Routes>
  );
}
