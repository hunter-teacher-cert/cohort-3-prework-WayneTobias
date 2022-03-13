
   /**
      determine if given three interger is possible to be the three sides of a triangle
      @return true if can form a triangle
   */      
   public static boolean isTriangle(int side1, int side2, int side3){
      return (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
   }