import java.util.Arrays;

public class GitStatic {
    int number;
    String[] neighbours;
    static final int ROOM = 4;

    GitStatic(int number, String[] neighbours) {
        this.number = number;
        this.neighbours = neighbours;
    }

    @Override
    public String toString() {
        return Arrays.toString(neighbours);
    }

    public static void main(String[] args) {
        GitStatic stat1 = new GitStatic(21, new String[] {"Andrew", "Mike"});
        System.out.println(stat1.toString());
    }
}