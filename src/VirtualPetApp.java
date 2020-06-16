import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class VirtualPetApp {

    static Timer timer;

    public static void main(String[] args) {
        timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Whats your Pets status?");
            }
        };
        timer.schedule(timerTask, 0, 600000);
        System.out.println("hello world!");

        VirtualPet pet = new VirtualPet("Tony the Tiger", 20, 20, 20, 20);
        String petName = pet.getName();
        System.out.println(petName);

        int hunger = pet.getHunger();
        int boredom = pet.getBoredom();
        int tiredness = pet.getTiredness();

        System.out.println("Your pets hunger is " + hunger);
        System.out.println("Your pets boredom is " + boredom);
        System.out.println("Your pets tiredness level is also " + tiredness);

        pet.increaseHunger();
        hunger = pet.getHunger();
        System.out.println(hunger);
        System.out.println("You should fill your pets belly");
        pet.increaseHunger();
        hunger = pet.getHunger();
        System.out.println(hunger);

        Scanner input = new Scanner(System.in);
        System.out.println("Increment value by how much?");
        int incrementAmount = input.nextInt();
        System.out.println(incrementAmount + hunger);
        System.out.println("Cool looks like your pets needs are all level and full");


    }

    {

        for (int hours = 1; hours < 24; hours++) ;
        {
            for (int minutes = 0; minutes < 60; minutes += 5) ;
            {


            }


        }


    }

}