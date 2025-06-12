import { useParams, useNavigate } from 'react-router-dom';
import { useEffect, useState } from 'react';
import { type Product } from '../../types/Product';
import ProductDetailDesign from './ProductDetailDesign';

export default function ProductDetail() {
  const { id } = useParams<{ id: string }>();
  const [product, setProduct] = useState<Product | null>(null);
  const navigate = useNavigate();

  useEffect(() => {
    if (!id) return;

    fetch(`https://fakestoreapi.com/products/${id}`)
      .then(res => res.json())
      .then(setProduct)
      .catch(() => setProduct(null));
  }, [id]);

  if (!product) return <p>Carregando...</p>;

  return <ProductDetailDesign product={product} onBack={() => navigate(-1)} />;
}
