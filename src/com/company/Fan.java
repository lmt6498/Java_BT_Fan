package com.company;


public class Fan {
        final int SLOW = 1;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        public Fan(){

        }

        public void turnOn(){
            on = true;
        }
        public void turnOff(){
            on = false;
        }

        public int setSpeed (int changeSpeed){
                speed = changeSpeed;
                return speed;
        }

        public  double setRadius (double newRadius){
            radius = newRadius;
            return radius;
        }

        public String setColor (String newColor){
            color = newColor;
            return color;
        }

        public String toString (){
                if (on){
                        return "Speed: " +setSpeed(speed) +"\nRadius: "+ setRadius(radius)+ "\nColor: "+setColor(color)+ "\nFan is on";
                }else {
                        return "Radius: "+ setRadius(radius)+ "\nColor: "+setColor(color)+ "\nFan is off";
                }
        }


}
