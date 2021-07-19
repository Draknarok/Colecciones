// shuffle: mezclar el deck
// El metodo debera imprimir en pantalla el siguiente mensaje "Se mezclo el deck"
public class Colecciones {

    public static void shuffle(ArrayList deck){
        // TODO code application logic here
        ArrayList<String> = Values  = deck;
        Collections.shuffle(values);
        System.out.println("\n Se mezclo el Deck.");
        Iterator<String> nombreIterator2 = deck.iterator();
        while(nombreIterator2.hasNext()){
               String elemento = nombreIterator2.next();
               System.out.print(elemento+" / ");
        }
    }
    //Head: mostrar la primera carta del deck, la carta debera removerse del deck.
    //El metodo debera imprimir en pantalla un mensaje con el siguiente formato
    
    /*
        [Palo],{Color},{Valor}
        Quedan {numero de cartas en deck}
    
    */
    public static void head(ArrayList deck){
        System.out.println(deck.get(0));
        deck.remove(index:0);
        System.out.println("Quedan " + deck.size() + "cartas \n");
    }
    //pick: seleccionar una carta al azar, La carta debera removerse del deck.
    //El metodo debera imprimir en pantalla un mensaje con el siguiente formato
    /*
        [Palo],{Color},{Valor}
        Quedan {numero de cartas en deck}
    */
    Public static void pick(ArrayList deck){
        Random aleatorio = new Random();
        System.out.print(deck.get(aleatorio.nextInt(decl.size())));
        deck.remove(aleatorio.nextInt(deck.size()));
        System.out.println("Quedan " + deck.size() + "cartas \n");
    }
    //hand: regresara un arreglo de cinco cartas del deck, las cartas deberan removerse del deck
    //El metodo debera imprimir en pantalla un mensaje con el siguiente formato: 
    /*
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        {Palo},{Color},{Valor}
        Quedan {numero de cartas en deck}
    */
    public static void hand (ArrayList deck){
        for(int i=0; i<=4; i++){
            System.out.prinln(deck.get(i));
        }
        for(int i=0; i<=4; i++){
            deck.remove(i);
        }
        System.out.println("Quedan " + deck.size()+ " cartas");
    }
}

