// src/Login/LoginDesign.tsx
import { TextField, Button, Typography, Paper, Box } from '@mui/material';

interface LoginDesignProps {
  username: string;
  password: string;
  onUsernameChange: (value: string) => void;
  onPasswordChange: (value: string) => void;
  onSubmit: () => void;
  onNavigateToRegister: () => void;
}

export default function LoginDesign({
  username,
  password,
  onUsernameChange,
  onPasswordChange,
  onSubmit,
  onNavigateToRegister,
}: LoginDesignProps) {
  return (
    <Box
      sx={{
        height: '100vh',
        width: '100vw',
        bgcolor: '#0d1b2a',
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        overflow: 'hidden',
      }}
    >
      <Paper
        sx={{
          maxWidth: 500,
          width: '100%',
          p: 4,
          bgcolor: '#1b263b',
          color: '#e0e1dd',
          borderRadius: 3,
          boxShadow: '0px 0px 15px #0a192f',
        }}
      >
        <Typography variant="h4" gutterBottom align="center" sx={{ color: '#e0e1dd' }}>
          Login
        </Typography>

        <TextField
          fullWidth
          margin="normal"
          label="Usuário"
          value={username}
          onChange={e => onUsernameChange(e.target.value)}
          InputProps={{ style: { color: '#e0e1dd' } }}
          InputLabelProps={{ style: { color: '#a9bcd0' } }}
          sx={{
            '& .MuiOutlinedInput-root': {
              '& fieldset': { borderColor: '#415a77' },
              '&:hover fieldset': { borderColor: '#778da9' },
            },
          }}
        />

        <TextField
          fullWidth
          margin="normal"
          label="Senha"
          type="password"
          value={password}
          onChange={e => onPasswordChange(e.target.value)}
          InputProps={{ style: { color: '#e0e1dd' } }}
          InputLabelProps={{ style: { color: '#a9bcd0' } }}
          sx={{
            '& .MuiOutlinedInput-root': {
              '& fieldset': { borderColor: '#415a77' },
              '&:hover fieldset': { borderColor: '#778da9' },
            },
          }}
        />

        <Button
          fullWidth
          variant="contained"
          sx={{
            mt: 3,
            bgcolor: '#1c7293',
            '&:hover': {
              bgcolor: '#134e6f',
            },
          }}
          onClick={onSubmit}
        >
          Entrar
        </Button>

        <Button
          fullWidth
          variant="text"
          sx={{
            mt: 1,
            color: '#a9bcd0',
            '&:hover': { color: '#fff' },
          }}
          onClick={onNavigateToRegister}
        >
          Cadastrar
        </Button>
      </Paper>
    </Box>
  );
}
