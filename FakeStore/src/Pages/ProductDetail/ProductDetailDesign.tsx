import { Typography, Button, CardMedia, Box } from '@mui/material';

interface ProductDetailDesignProps {
  product: {
    image: string;
    title: string;
    price: number;
    description: string;
  };
  onBack: () => void;
}

export default function ProductDetailDesign({ product, onBack }: ProductDetailDesignProps) {
  return (
    <Box
      sx={{
        height: '100vh',
        bgcolor: '#0d1b2a',
        color: '#e0e1dd',
        p: 4,
        overflowY: 'auto',
        display: 'flex',
        flexDirection: 'column',
        alignItems: 'center',
      }}
    >
      <Button
        variant="outlined"
        onClick={onBack}
        sx={{
          alignSelf: 'flex-start',
          mb: 3,
          borderColor: '#778da9',
          color: '#e0e1dd',
          '&:hover': {
            bgcolor: '#1b263b',
            borderColor: '#e0e1dd',
          },
        }}
      >
        Voltar
      </Button>

      <CardMedia
        component="img"
        image={product.image}
        alt={product.title}
        sx={{ maxWidth: 300, mb: 3, borderRadius: 2 }}
      />

      <Typography variant="h5" gutterBottom sx={{ textAlign: 'center' }}>
        {product.title}
      </Typography>

      <Typography variant="h6" color="#778da9" gutterBottom sx={{ textAlign: 'center' }}>
        R$ {product.price.toFixed(2)}
      </Typography>

      <Typography variant="body1" sx={{ maxWidth: 600, textAlign: 'center' }}>
        {product.description}
      </Typography>
    </Box>
  );
}
