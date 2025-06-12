import { Button, Grid, Typography, Box } from '@mui/material';
import ProductCard from '../../components/ProductCard';
import { type Product } from '../../types/Product';

interface ProductsDesignProps {
  products: Product[];
  onLogout: () => void;
}

export default function ProductsDesign({ products, onLogout }: ProductsDesignProps) {
  return (
    <Box
      sx={{
        minHeight: '100vh',
        bgcolor: '#0d1b2a',
        color: '#e0e1dd',
        display: 'flex',
        flexDirection: 'column',
        overflowY: 'auto',
        p: 4,
      }}
    >
      {/* Header com botão de logout à direita */}
      <Box
        sx={{
          display: 'flex',
          justifyContent: 'space-between',
          alignItems: 'center',
          mb: 3,
        }}
      >
        <Typography variant="h4" sx={{ color: '#e0e1dd' }}>
          Produtos
        </Typography>

        <Button
          variant="outlined"
          onClick={onLogout}
          sx={{
            borderColor: '#778da9',
            color: '#e0e1dd',
            '&:hover': {
              bgcolor: '#1b263b',
              borderColor: '#e0e1dd',
            },
          }}
        >
          Logout
        </Button>
      </Box>

      {/* Grade de produtos */}
      <Grid container spacing={2}>
        {products.map(product => (
          <Grid item key={product.id} xs={12} sm={6} md={4}>
            <ProductCard product={product} />
          </Grid>
        ))}
      </Grid>
    </Box>
  );
}
