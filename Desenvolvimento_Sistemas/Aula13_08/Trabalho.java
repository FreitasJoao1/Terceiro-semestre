import java.util.Scanner;

public class Trabalho {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Formúla T=F*D Diz a distancia percorrida por um corpo em movimento, sendo T=tempo, F=força e D=distancia, Digite cada um");
        
        System.out.println("Digite a força: ");
        double forca = sc.nextDouble();
        
        System.out.println("Digite a distancia: ");
        double distancia = sc.nextDouble();



        double D=distancia;
        double F=forca;

        double T=F*D;
        System.out.println("O tempo percorrido é: "+T);
    }
}
