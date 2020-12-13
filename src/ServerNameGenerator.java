import java.util.Random;

public class ServerNameGenerator {

    static String[] adj = {"Noisy","Lame","Awesome","Pretty","Fat","Skinny","Short","Tall","Light","Dark"};
   static String[] noun = {"Duck","Turtle","Slug","Unicorn","Bulldog","Bacon","House","Cat","Ninja","Butterfly"};

    public static void random(){
        Random random = new Random();
        int randomAdjIndex = random.nextInt(adj.length);
        int randomNounIndex = random.nextInt(noun.length);
        System.out.printf("Here is your server name: \n%s-%s ", adj[randomAdjIndex], noun[randomNounIndex]);
    }

    public static void main(String[] args) {
        random();
    }
}
