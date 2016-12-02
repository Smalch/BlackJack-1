package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> players = new LinkedList<>();
        players.add(new Computer(new LimitIntellect(20)));
        players.add(new Computer(new LimitIntellect(14)));
        players.add(new Human("1111"));
        Dealer dealer = new Dealer("Dealer");
        players.add(dealer);

        for (Player player : players) {
            dealer.deal(player);
            dealer.deal(player);
            System.out.print(player.name +":");
            System.out.println(player.hand);
        }
        int a[];
        int i=1;
        a = new int [100];
        for (Player player : players) {
            while (true) {
                System.out.println();
                System.out.println(player.name);
                System.out.println(player.hand.getScore()+":"+player.hand);
                a[i] = player.hand.getScore();
                i=i+1;
                Command command = player.decision();
                if (command == Command.STAND)
                    break;
                if (command == Command.HIT)
                    dealer.deal(player);
            }

        }
        int[] max;
        int ch=0;
        max= new int [100];
        for(i=2;i<=3;i++){
            if((a[i]>a[i])&&(a[i]<=21)){
                max[i]=1;
                ch=i;
            }
        }
        int b=1;
        for (Player player : players) {
            if(max[b]==1) {
                System.out.println();
                System.out.println();
                System.out.println("Игрок " +player.name+" победил");
            }
            else{
                System.out.println();
                System.out.println();
                System.out.println("Игрок " +player.name+" проиграл");
            }
            b++;
        }


    }
}
