package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Direction dir=Direction.UP;
        Robot robot=new Robot(0,0,dir);
        System.out.println("koordinaty:"+robot.getX()+";"+robot.getY());
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter new koordinats:");
        int x= scanner.nextInt();;
        int y= scanner.nextInt();
        Move.moveRobot(robot,x,y);
        System.out.println("robot dvigaetsya");
        System.out.println("koordinaty:"+robot.getX()+";"+robot.getY());





    }
}
