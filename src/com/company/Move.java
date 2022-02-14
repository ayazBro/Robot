package com.company;

public class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX) {
            robot.turnRight();
            while(robot.getX()!=toX) {
                robot.stepForward();
            }
        }

        if(robot.getX()>toX) {
            robot.turnLeft();
            while(robot.getX()!=toX) {
                robot.stepForward();
            }
        }

        if (robot.getY() < toY) {
            Direction temp=robot.getDirection();
            switch (temp) {
                case UP:  { while(robot.getY()!=toY) {robot.stepForward();}}
                case DOWN: { robot.turnLeft(); robot.turnLeft(); while(robot.getY()!=toY) {robot.stepForward();} }
                case LEFT: {robot.turnRight(); while(robot.getY()!=toY) {robot.stepForward();} }
                case RIGHT: {robot.turnLeft(); while(robot.getY()!=toY) {robot.stepForward();} }
            }
        }

        if (robot.getY() > toY) {
            Direction temp=robot.getDirection();
            switch (temp) {
                case DOWN:  { while(robot.getY()!=toY) {robot.stepForward();}}
                case UP: { robot.turnLeft(); robot.turnLeft(); while(robot.getY()!=toY) {robot.stepForward();} }
                case RIGHT: {robot.turnRight(); while(robot.getY()!=toY) {robot.stepForward();} }
                case LEFT: {robot.turnLeft(); while(robot.getY()!=toY) {robot.stepForward();} }
            }
        }
    }
}
