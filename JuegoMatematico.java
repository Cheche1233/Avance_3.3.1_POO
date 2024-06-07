import javax.swing.*;
import java.awt.*;

public class JuegoMatematico extends JFrame {
    private final Scoreboard scoreboard;
    private final String nombreJugador;

    public JuegoMatematico(Scoreboard scoreboard, String nombreJugador) {
        this.scoreboard = scoreboard;
        this.nombreJugador = nombreJugador;

        setTitle("Juego Matemático");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel preguntaLabel = new JLabel("", SwingConstants.CENTER);
        panel.add(preguntaLabel, BorderLayout.NORTH);

        JPanel panelOpciones = new JPanel();
        panelOpciones.setLayout(new GridLayout(2, 2));

        JButton[] opcionesBotones = new JButton[4];
        for (int i = 0; i < 4; i++) {
            opcionesBotones[i] = new JButton();
            panelOpciones.add(opcionesBotones[i]);
        }

        panel.add(panelOpciones, BorderLayout.CENTER);

        JLabel puntuacionLabel = new JLabel("Puntuacion: 0");
        JLabel tiempoLabel = new JLabel("Tiempo: 0");

        JPanel panelInfo = new JPanel();
        panelInfo.setLayout(new BorderLayout());
        panelInfo.add(puntuacionLabel, BorderLayout.WEST);
        panelInfo.add(tiempoLabel, BorderLayout.EAST);

        panel.add(panelInfo, BorderLayout.SOUTH);

        add(panel);

        // Generar pregunta y temporizador (implementación futura)
    }
}
