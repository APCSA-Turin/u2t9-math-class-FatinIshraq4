public class Circle {
    private double radius;
    final double pie = Math.PI;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area() {
      /* implement this method */
      double z = pie * (radius * radius);
      return z;
    }
  
    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference() {
      /* implement this method */
      double y = pie * (radius * 2);
      return y;
    }
  
    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius) {
      /* implement this method */
      radius = newRadius;
    }
  
    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings)
       This method should call your other methods as appropriate.
     */
    public String getInfo() {
      /* implement this method */
      String str = "radius = " + radius + "\n" + "area = " + area() + "\n" + "circumference = " + circumference() + "\n";
      setRadius(9.2);
      str += "radius = " + radius + "\n" + "area = " + area() + "\n" + "circumference = " + circumference();
      return str;
    }
    public static void main(String[] args) {
      Circle some = new Circle(5);
      System.out.println(some.getInfo());
    }
  }
  