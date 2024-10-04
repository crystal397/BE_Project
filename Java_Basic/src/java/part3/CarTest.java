package java.part3;

import java.model.CarDTO;
import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 이름:");
        String carName = scan.nextLine();

        System.out.println("자동차 가격:");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유주:");
        String carOwner = scan.nextLine();

        System.out.println("자동차 생산년도:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 차종:");
        String carType = scan.nextLine();

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;
        carInfoPrint(car);
    }

    // call by reference
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+ car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}