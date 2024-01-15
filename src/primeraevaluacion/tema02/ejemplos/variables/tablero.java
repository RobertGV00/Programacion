import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tablero {

    private static final int N = 8;
    private static int[][] tablero = new int[N][N];
    private static boolean[][] visitado = new boolean[N][N];
    private static int[] movX = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] movY = {1, 2, 2, 1, -1, -2, -2, -1};

    private static JFrame frame;
    private static JPanel panel;
    private static int movimiento = 1;

    public static void main(String[] args) {
        inicializarTablero();

        SwingUtilities.invokeLater(() -> {
            frame = new JFrame("Salto del Caballo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            panel = new JPanel(new GridLayout(N, N));
            dibujarTablero();

            frame.getContentPane().add(panel);
            frame.setSize(400, 400);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);

            frame.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                        realizarSalto();
                    }
                }
            });
        });
    }

    private static void inicializarTablero() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                tablero[i][j] = -1;
                visitado[i][j] = false;
            }
        }
    }

    private static void realizarSalto() {
        int x = getXFromMovimiento(movimiento);
        int y = getYFromMovimiento(movimiento);

        tablero[x][y] = movimiento;
        visitado[x][y] = true;
        dibujarTablero();
        movimiento++;

        if (movimiento <= N * N) {
            realizarSiguientesSaltos(x, y);
        }
    }

    private static void realizarSiguientesSaltos(int x, int y) {
        for (int i = 0; i < 8; i++) {
            int nuevoX = x + movX[i];
            int nuevoY = y + movY[i];

            if (esMovimientoValido(nuevoX, nuevoY) && !visitado[nuevoX][nuevoY]) {
                realizarSalto();
            }
        }
    }

    private static int getXFromMovimiento(int movimiento) {
        return (movimiento - 1) % N;
    }

    private static int getYFromMovimiento(int movimiento) {
        return (movimiento - 1) / N;
    }

    private static boolean esMovimientoValido(int x, int y) {
        return (x >= 0 && x < N && y >= 0 && y < N);
    }

    private static void dibujarTablero() {
        panel.removeAll();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                JLabel label = new JLabel(String.valueOf(tablero[i][j]));
                label.setHorizontalAlignment(SwingConstants.CENTER);
                label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panel.add(label);
            }
        }

        frame.revalidate();
        frame.repaint();
    }
}
