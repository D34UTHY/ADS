// src/Products/Products.tsx
import { useEffect, useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { type Product } from '../../types/Product';
import ProductsDesign from './ProductsDesign';

export default function Products() {
  const [products, setProducts] = useState<Product[]>([]);
  const navigate = useNavigate();

  useEffect(() => {
    fetch('https://fakestoreapi.com/products')
      .then(res => res.json())
      .then(setProducts);
  }, []);

  const logout = () => {
    localStorage.removeItem('token');
    navigate('/');
  };

  return (
    <ProductsDesign
      products={products}
      onLogout={logout}
    />
  );
}
