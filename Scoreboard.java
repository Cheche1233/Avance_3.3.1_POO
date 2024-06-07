import java.util.ArrayList;
import java.util.List;

public class Scoreboard {
    private final List<Score> scores;
    private final String fileName;

    public Scoreboard(String fileName) {
        this.fileName = fileName;
        this.scores = new ArrayList<>();
        // Cargar puntuaciones desde el archivo (implementación futura)
    }

    public void addScore(String playerName, int score) {
        scores.add(new Score(playerName, score));
        // Guardar puntuaciones en el archivo (implementación futura)
    }

    public List<String> getTopScores() {
        List<String> topScores = new ArrayList<>();
        // Obtener las mejores puntuaciones (implementación futura)
        return topScores;
    }

    public static class Score {
        private final String name;
        private final int score;

        public Score(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }
    }
}
