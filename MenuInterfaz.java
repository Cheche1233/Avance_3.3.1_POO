import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInterfaz extends JFrame {
    private final Scoreboard scoreboard;

    public MenuInterfaz(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;

        setTitle("Menú de Videojuego - MathOperations");
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setLayout(new BoxLayout(panelPrincipal, BoxLayout.Y_AXIS));

        JButton jugarButton = new JButton("Jugar");
        JButton scoreboardButton = new JButton("Scoreboard");
        JButton creditosButton = new JButton("Créditos");

        panelPrincipal.add(Box.createVerticalGlue());
        panelPrincipal.add(jugarButton);
        panelPrincipal.add(Box.createVerticalStrut(30));
        panelPrincipal.add(scoreboardButton);
        panelPrincipal.add(Box.createVerticalStrut(30));
        panelPrincipal.add(creditosButton);
        panelPrincipal.add(Box.createVerticalGlue());

        add(panelPrincipal);

        jugarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar "Jugar"
            }
        });

        scoreboardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar "Scoreboard"
            }
        });

        creditosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Acción al presionar "Créditos"
            }
        });
    }

    public static void main(String[] args) {
        Scoreboard scoreboard = new Scoreboard("scoreboard.txt");
        SwingUtilities.invokeLater(() -> {
            MenuInterfaz menuInterfaz = new MenuInterfaz(scoreboard);
            menuInterfaz.setVisible(true);
        });
    }
}
