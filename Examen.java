import java.util.Scanner;
class Examen{
    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);
        String pokemon1="Charmander";
        String pokemon2="Bulbasaor";
        String pokemon3="Squartle";
        String ataqueprincipal1="Bola de fuego";
        String ataqueprincipal2="Bola de agua";
        String ataqueprincipal3="Bola de nieve";
        String ataquesecundario1="Golpe";
        String ataquesecundario2="Patada";
        String ataquesecundario3="Cabezazo";
        char letra;
        int id1=1021; 
        int id2=1025;
        int id3=1083;
        float fuerza1=20;
        float fuerza2=25;
        float fuerza3=30;
        float defensa1=30;
        float defensa2=25;
        float defensa3=20;
        float vida1=5000;
        float vida2=4950;
        float vida3=4850;
        int opcion,opcion2,  i=1;
        int j=1;

        do{
            System.out.println("Toral Hernandez Leonardo Javier 3IV8 ");
            System.out.println("Elige entre una de las siguientes opcion: ");
            System.out.println("1. Datos de Charmander");
            System.out.println("2. Datos de Bulbasoar");
            System.out.println("3. Datos de Squartle");
            System.out.println("4. Batalla ");
            System.out.println("Elige una opcion");
            opcion=entrada.nextInt();
            switch(opcion){
                case 1:
                    vida1=3000;
                    System.out.println("ID: "+id1);
                    System.out.println("Nombre: "+pokemon1);
                    System.out.println("Fuerza: "+fuerza1);
                    System.out.println("Defensa: "+defensa1);
                    System.out.println("Vida: "+vida1);
                    System.out.println("Ataque principal: "+ataqueprincipal1);
                    System.out.println("Ataque secundario: "+ataquesecundario1);
                    break;
                case 2:
                    vida2=2950;
                    System.out.println("ID: "+id2);
                    System.out.println("Nombre: "+pokemon2);
                    System.out.println("Fuerza: "+fuerza2);
                    System.out.println("Defensa: "+defensa2);
                    System.out.println("Vida: "+vida2);
                    System.out.println("Ataque principal: "+ataqueprincipal2);
                    System.out.println("Ataque secundario: "+ataquesecundario2);
                    break;
                case 3:
                    vida3=2850;
                    System.out.println("ID: "+id3);
                    System.out.println("Nombre: "+pokemon3);
                    System.out.println("Fuerza: "+fuerza3);
                    System.out.println("Defensa: "+defensa3);
                    System.out.println("Vida: "+vida3);
                    System.out.println("Ataque principal: "+ataqueprincipal3);
                    System.out.println("Ataque secundario: "+ataquesecundario3);
                    break;
                case 4: 
                    System.out.println("Elija su pokemon: ");
                    System.out.println("1, Charmander");
                    System.out.println("2. Bulbasour");
                    System.out.println("3. Squartle");
                    opcion2=entrada.nextInt();
                    vida1=3000;
                    vida2=2950;
                    vida3=2850;
                    switch(opcion2){
                        case 1:
                            if (i%2==0){
                                System.out.println("Usted peleara contra Bulbasour");
                                do {
                                    System.out.println("Vida: "+vida1);
                                    System.out.println("Fuerza: "+fuerza1);
                                    System.out.println("Vida del otro: "+vida2);
                                    System.out.println("Fuerza del otro: "+fuerza2);
                                    System.out.println("Ataca su pokemon");
                                    vida2-=fuerza1*defensa1/3;
                                    if (vida2<=0){
                                        System.out.println("Gano");
                                        
                                    }
                                    else{
                                        System.out.println("Ataque del otro ");
                                    vida1-=fuerza2*defensa2/3;
                                    if (vida1<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida1>0&&vida2>0);
                            }
                            else{
                                System.out.println("Usted peleara contra Squartle");
                                do {
                                    System.out.println("Vida: "+vida1);
                                    System.out.println("Fuerza: "+fuerza1);
                                    System.out.println("Vida del otro: "+vida3);
                                    System.out.println("Fuerza del otro: "+fuerza3);
                                    System.out.println("Ataca su pokemon");
                                    vida3-=(fuerza1*defensa1)/3;
                                    if (vida3<=0){
                                        System.out.println("Gano");
                                       
                                    }
                                    else{
                                         System.out.println("Ataque del otro ");
                                    vida1-=fuerza3*defensa3/3;
                                    if (vida1<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida1>0&&vida3>0);
                            }
                            
                            i++;
                            break;
                        case 2:
                            if (i%2==0){
                                System.out.println("Usted peleara contra Charmander");
                                do {
                                    System.out.println("Vida: "+vida2);
                                    System.out.println("Fuerza: "+fuerza2);
                                    System.out.println("Vida del otro: "+vida1);
                                    System.out.println("Fuerza del otro: "+fuerza1);
                                    System.out.println("Ataca su pokemon");
                                    vida1-=fuerza2*defensa2/3;
                                    if (vida1<=0){
                                        System.out.println("Gano");
                                        
                                    }
                                    else{
                                        System.out.println("Ataque del otro ");
                                    vida2-=fuerza1*defensa1/3;
                                    if (vida2<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida1>0&&vida2>0);
                            }
                            else{
                                System.out.println("Usted peleara contra Squartle");
                                do {
                                    System.out.println("Vida: "+vida2);
                                    System.out.println("Fuerza: "+fuerza2);
                                    System.out.println("Vida del otro: "+vida3);
                                    System.out.println("Fuerza del otro: "+fuerza3);
                                    System.out.println("Ataca su pokemon");
                                    vida3-=fuerza2*defensa2/3;
                                    if (vida3<=0){
                                        System.out.println("Gano");
                                    }
                                    else{
                                        System.out.println("Ataque del otro ");
                                    vida2-=fuerza3*defensa3/3;
                                    if (vida3<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida3>0&&vida2>0);
                            }
                            i++;
                            break;
                        case 3:
                        if (i%2==0){
                                System.out.println("Usted peleara contra Charmander");
                                do {
                                    System.out.println("Vida: "+vida3);
                                    System.out.println("Fuerza: "+fuerza3);
                                    System.out.println("Vida del otro: "+vida1);
                                    System.out.println("Fuerza del otro: "+fuerza1);
                                    System.out.println("Ataca su pokemon");
                                    vida1-=fuerza3*defensa3/3;
                                    if (vida1<=0){
                                        System.out.println("Gano");
                                        
                                    }
                                    else{
                                        System.out.println("Ataque del otro ");
                                    vida3-=fuerza1*defensa1/3;
                                    if (vida3<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida1>0&&vida3>0);
                            }
                            else{
                                System.out.println("Usted peleara contra Bulbasoar");
                                do {
                                    System.out.println("Vida: "+vida3);
                                    System.out.println("Fuerza: "+fuerza3);
                                    System.out.println("Vida del otro: "+vida2);
                                    System.out.println("Fuerza del otro: "+fuerza2);
                                    System.out.println("Ataca su pokemon");
                                    vida2-=fuerza3*defensa3/3;
                                    if (vida2<=0){
                                        System.out.println("Gano");
                                    }
                                    else{
                                        System.out.println("Ataque del otro ");
                                    vida3-=fuerza2*defensa2/3;
                                    if (vida3<=0){
                                        System.out.println("Su pokemon perdio");
                                    }
                                    }
                                    
                                    
                                }while(vida3>0&&vida2>0);
                            }
                            i++;
                            break;
                        default:
                        System.out.println("Usted no eligio nada");
                    }
                    break;
                default:
                    System.out.println("Usted no eligio una opcion");
            }
            System.out.println("Desea usar otra vez la pokedex? Si es asi ingrese una s");
            letra = entrada.next().charAt(0);
        }while(letra=='s');
    }
}