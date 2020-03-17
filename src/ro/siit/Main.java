package ro.siit;

import java.util.*;


public class Main {

    public static void main(String[] args) {
	    Persoana p1=new Persoana("Lori", 22);
	    Persoana p2=new Persoana("Alin", 26);
	    Persoana p3=new Persoana("Maria", 16);

        Set<Persoana> persoane =new TreeSet<>(new ComparatorPersoana());
        persoane.add(p1);
        persoane.add(p2);
        persoane.add(p3);
        for(Persoana p:persoane){
            System.out.println(p);
        }

        System.out.println(p1.equals(p2));
        Persoana p4=new Persoana("Lori", 22);
        System.out.println(p1.equals(p4));

        Adresa a1 = new Adresa("Stelelor", 7, "Timisoara");
        Adresa a2 = new Adresa ("14Octombire", 10, "Targu-Jiu");
        Adresa a3 = new Adresa("Ion Vidu", 20, "Bucuresti");
        Adresa a4 = new Adresa("Dimitrie Cantemir", 5, "Cluj");

        List<Adresa> listaAdrese1 = new ArrayList<>();
        listaAdrese1.add(a1);
        listaAdrese1.add(a2);
        listaAdrese1.add(a3);

        List<Adresa> listaAdrese2 = new ArrayList<>();
        listaAdrese2.add(a1);
        listaAdrese2.add(a2);
        listaAdrese2.add(a4);

        List<Adresa> listaAdrese3 = new ArrayList<>();
        listaAdrese3.add(a4);
        listaAdrese3.add(a2);
        listaAdrese3.add(a3);

        Hobby h1 = new Hobby("innot", 3, listaAdrese1);
        Hobby h2 = new Hobby("ciclism", 1, listaAdrese2);
        Hobby h3 = new Hobby("pictura", 3, listaAdrese3);
        Hobby h4 = new Hobby("voley", 4, listaAdrese3);
        Hobby h5 = new Hobby("fotbal", 5, listaAdrese1);

        List<Hobby> listaHobby1 = new ArrayList<>();
        listaHobby1.add(h1);
        listaHobby1.add(h2);
        listaHobby1.add(h3);

        List<Hobby> listaHobby2 = new ArrayList<>();
        listaHobby2.add(h4);
        listaHobby2.add(h5);

        List<Hobby> listaHobby3 = new ArrayList<>();
        listaHobby3.add(h4);
        listaHobby3.add(h2);
        listaHobby3.add(h3);

        System.out.println(listaHobby2);  //lista cu hobby-urile pe care le are initial p2, dar care este prima in lista de peroane din cauza ordonarii pe care am implementat-o
        // in hashMap o sa apara cealalta lista cu hobby-uri pentru ca se verifica daca exista persona p2 si daca exista, i se adauga chei respective o noua valoare
        System.out.println("............................................................................................................");
        Map<Persoana, List<Hobby>> hm = new HashMap<Persoana, List<Hobby>>();
        hm.put(p1,listaHobby1);
        hm.put(p2,listaHobby2);
        hm.put(p3,listaHobby3);
        hm.put(p2,listaHobby3);

        for(Persoana p : persoane){
            if(hm.containsKey(p)){
                System.out.println(p + " : " + hm.get(p) + "\n" + "....................................................................................................................................");
            }
        }


    }
}
