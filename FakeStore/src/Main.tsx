import React from 'react';
import ReactDOM from 'react-dom/client';
// Importa o componente principal da aplicação
import App from './App';
// BrowserRouter permite usar rotas no React
import { BrowserRouter } from 'react-router-dom';

// Renderiza a aplicação dentro do elemento com id "root" no index.html
ReactDOM.createRoot(document.getElementById('root')!).render(
  // Envolve a aplicação com BrowserRouter para permitir navegação
  <BrowserRouter>
    <App />
  </BrowserRouter>
);
