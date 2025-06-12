import { Card, CardMedia, CardContent, Typography, CardActionArea } from '@mui/material';
import { useNavigate } from 'react-router-dom';
import { type Product } from '../types/Product';

export default function ProductCard({ product }: { product: Product }) {
  const navigate = useNavigate();

  // Ao clicar no card, navega para a página de detalhes do produto
  return (
    <Card>
      <CardActionArea onClick={() => navigate(`/products/${product.id}`)}>
        {/* Imagem do produto */}
        <CardMedia
          component="img"
          height="150"
          image={product.image}
          alt={product.title}
        />
        <CardContent>
          {/* Título */}
          <Typography variant="subtitle1" noWrap>{product.title}</Typography>
          {/* Preço */}
          <Typography variant="body2" color="text.secondary">R$ {product.price}</Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  );
}
