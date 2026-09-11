class percentageAverage {
    public static void main (String[] args){
      
      int english = 98;
      int science = 88;
      int geography = 92;
      int fullMarks = 300;
      
      int totalMarks = english + science + geography;
      float percentage = (float)totalMarks / fullMarks * 100;
      double average =  (double)totalMarks / 3;
      
      System.out.println("Total marks = " + totalMarks);
      System.out.println("Percentage = " + percentage);
      System.out.println("Average = " + average);

    }
}
