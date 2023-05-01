import java.util.Scanner;

public class TemperaturaMediaTest{

    static Scanner inp = new Scanner(System.in);

    public static void main(String args[]){
	calcularTemperatura();
    }
    public static void calcularTemperatura(){
	try{
	    double media = 0, soma = 0;
	    int maior = 0, menor = 0, con = 0, anual = 0;
	    int[] num1 = new int[6];
	    for(int i = 0; i < num1.length; i++){
		System.out.print("Temperatura do "+(i+1)+"° dia ");
		num1[i] = inp.nextInt();
	    }
	    maior = num1[0];
	    menor = num1[0];
	    for(int i = 0; i < num1.length; i++){
		if(num1[i] > maior){
		    maior = num1[i];
		}else if(num1[i] < menor){
		    menor = num1[i];
		}
		con++;
		soma+=num1[i];
		media = soma / con;
		if(num1[i] < media){
		    anual++;
		}
	    }
	    TemperaturaMedia temperatura = new TemperaturaMedia(num1);
	    System.out.println("Maior temperatura "+ maior);
	    System.out.println("Menor temperatura "+ menor);
	    System.out.printf("Temperatura media %.1f%n", media);
	    System.out.println("Dias com temperatura inferior a media "+ anual);
	}catch(Exception e){
	    System.out.println(e);
	    inp.nextLine();
	}
    }

}
