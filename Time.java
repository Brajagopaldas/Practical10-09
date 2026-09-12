class Time {
    public static void main (String [] args){
        int totalTime = 14408;
        
        int hour = totalTime / 3600;
        totalTime = totalTime % 3600;
        
        int minute = totalTime / 60;
        minute = totalTime % 60;
        
        double second = totalTime/ 60;
        
        System.out.println("Hour = " + hour);
        System.out.println("Minute = " + minute);
        System.out.println("Second = " + second);
    }
}
