import java.util.Random;

public class RandomTester
{
    Random aleatorio = new Random();
    public void printOneRandom()
    {
        System.out.println(aleatorio.nextInt());
    }

    public void printMultiRandom(int numeros)
    {
        int index = 0;
        while(index < numeros){
            System.out.println(aleatorio.nextInt());
            index ++;
        }
    }
}
