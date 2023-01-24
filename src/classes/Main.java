package classes;


import classes.Houses.Accommodation;
import classes.Service.Service;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner scanner = new Scanner(System.in);
       String menu = "For Total Price Of Houses Press 1 \n"+
                      "For Total Price Of Villas Press 2 \n"+
                        "For Total Price Of SummerHouses Press 3 \n"+
                        "For Total Price Of All Types Of Houses Press 4 \n"+
                        "For Average Square Meter Of Houses Press 5 \n"+
                        "For Average Square Meter Of Villas Press 6 \n"+
                        "For Average Square Meter Of SummerHouses Press 7 \n"+
                        "For Average Square Meter Of All Types Of Houses Press 8 \n"+
                        "For Filter All Types Of Houses By Room and Living Room Count Press 9 \n"+
                        "For Exit Press q";
       System.out.println("******************************************************************************************");
       System.out.println(menu);
       System.out.println("******************************************************************************************");

        while (true){
            System.out.println("Choose Something : ");
            String islem = scanner.nextLine();
            if(islem.equals("1")){
                System.out.println("Total Price Of Houses : "+service.totalPriceOfHouses());
            }
            else if(islem.equals("2")){
                System.out.println("Total Price Of Villas : "+service.totalPriceOfVillas());
            }
            else if(islem.equals("3")){
                System.out.println("Total Price Of SummerHouses : "+service.totalPriceOfSummerHouses());
            }
            else if(islem.equals("4")){
                System.out.println("Total Price Of All Type Of Houses : "+service.totalPriceOfAllAccommodations());
            }
            else if(islem.equals("5")){
                System.out.println("Average Square Meter Of Houses : "+service.averageSquareMeterOfHouses());
            }
            else if(islem.equals("6")){
                System.out.println("Average Square Meter Of Villas : "+service.averageSquareMeterOfVillas());
            }
            else if(islem.equals("7")){
                System.out.println("Average Square Meter Of SummerHouses : "+service.averageSquareMeterOfSummerHouses());
            }
            else if(islem.equals("8")){
                System.out.println("Average Square Meter Of All Types Of Houses : "+service.averageSquareMeterOfAllAccommodations());
            }
            else if(islem.equals("9")){
                System.out.println("Please Enter Room Count : ");
                int roomCount = scanner.nextInt();
                System.out.println("Please Enter LivingRoom Count : ");
                int livingRoomCount = scanner.nextInt();
                List<Accommodation> accommodations= service.filterByRooms(roomCount,livingRoomCount);
                if(accommodations.size()<=0){
                    System.out.println("We Couldn't Find Any House With These Filter Values");
                }
                else{
                    accommodations.stream().forEach(i->System.out.println("House Type : "+i.getClass().getSimpleName()+" Square Meter : "+i.getSquareMeters()+" Price : "+i.getPrice()+" Living Room Amount : "+i.getLivingRoomCount()+" Room Amount : "+i.getRoomCount()));
                }
            }
            else if(islem.equals("q")){
                break;
            }
            else{
                System.out.println("We Can Not Find The Symbol You Pressed");
            }
        }
    }
}
