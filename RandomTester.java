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
    
    public int lanzarDado()
    {
        int resultado = 0;
        resultado = aleatorio.nextInt(7);
        if (resultado == 0){
            resultado += aleatorio.nextInt(7);
        }
        return resultado;
    }
    
    public String getRespuesta()
    {
        String respuesta = "";
        if (aleatorio.nextBoolean()){
            respuesta = "Si";
        }
        else if(!aleatorio.nextBoolean()){
            respuesta = "No";
        }
        else{
            respuesta = "Tal vez";
        }
        return respuesta;
    }
    
    public int getNumeroEntre0Y(int max){
        int getNumero = 0;
        getNumero = aleatorio.nextInt(max + 1);
        if (getNumero == 0){
            getNumero += aleatorio.nextInt(max + 1);
        }
        return getNumero;
    }
    
    public int getNumeroEntre(int min, int max){
        int resultado = 0;
        resultado = min + aleatorio.nextInt(max - min);
        return resultado;
        }
    }
