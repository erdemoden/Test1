package classes.Houses;

import classes.Houses.House;
import classes.Houses.SummerHouse;
import classes.Houses.Villa;

import java.util.LinkedList;
import java.util.List;

public class Generate {





     public List<House> getListOfHouses(){
         House house = new House(3,1,18000000,150);
         House house1 = new House(7,2,28000000,200);
         House house2 = new House(2,1,1800000,80);
         LinkedList<House> houses = new LinkedList<House>();
         houses.add(house);
         houses.add(house1);
         houses.add(house2);
         return houses;
    }
    public List<Villa> getListOfVillas(){
        Villa villa = new Villa(3,1,28000000,450);
        Villa villa1 = new Villa(8,2,28550000,375);
        Villa villa2 = new Villa(5,3,23000000,250);
        LinkedList<Villa> villas = new LinkedList<Villa>();
        villas.add(villa);
        villas.add(villa1);
        villas.add(villa2);
        return villas;
    }
    public List<SummerHouse> getListOfSummerHouses(){
        SummerHouse summerHouse = new SummerHouse(3,1,15000000,160);
        SummerHouse summerHouse1 = new SummerHouse(4,1,16000000,170);
        SummerHouse summerHouse2 = new SummerHouse(3,1,14000000,120);
        LinkedList<SummerHouse> summerHouses = new LinkedList<SummerHouse>();
        summerHouses.add(summerHouse);
        summerHouses.add(summerHouse1);
        summerHouses.add(summerHouse2);
        return summerHouses;
    }
}
