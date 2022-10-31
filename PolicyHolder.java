public class PolicyHolder
{
   private String firstName;
   private String lastName;
   public static int age;
   public static String smoker;
   public static double height;
   public static double weight;
   
   /**
    * no-arg constructor
    */
   public PolicyHolder()
   {
      //policyNumber is a string because it should not be used in calculations
      firstName = "John";
      lastName = "Doe";
      age = 99;
      smoker = "non-smoker";
      height = 70;
      weight = 200;
   }
   
   /**
    * arguments constructor
    * @param fName first name
    * @param lName last name
    * @param howOld age of the person
    * @param smokerStatus whether or not the person smokes tobacco
    * @param howTall height of the person
    * @param howHeavy weight of the person
    */
   public PolicyHolder(String fName, String lName, int howOld, String smokerStatus, double howTall, double howHeavy)
   {
      firstName = fName;
      lastName = lName;
      age = howOld;
      smoker = smokerStatus;
      height = howTall;
      weight = howHeavy;
   }

   //overriding the default toString() method
   public String toString()
   {
    return 
    (
        "First name: " + firstName + 
        "\nLast name: " + lastName + 
        "\nAge: " + age + 
        "\nSmoking status: " + smoker + 
        "\nHeight: " + height + 
        "\nWeight: " + weight
    );
   }
   
   //getter and setter methods for every attribute
   
   /**
    * sets first name
    * @param f first name
    */
   public void setFirstName(String f)
   {
      firstName = f;
   }
   
   /**
    * returns first name
    * @return first name
    */
   public String getFirstName()
   {
      return firstName;
   }
   
   /**
    * sets last name
    * @param last name
    */
   public void setLastName(String l)
   {
      lastName = l;
   }
   
   /**
    * gets last name
    * @return last name
    */
   public String getLastName()
   {
      return lastName;
   }
   
   /**
    * set age
    * @param a age
    */
   public void setAge(int a)
   {
      age = a;
   }
   
   /**
    * gets age
    * @return age
    */
   public int getAge()
   {
      return age;
   }
   
   /**
    * sets smoking status
    * @param s smoker status
    */
   public void setSmoker(String s)
   {
      smoker = s;
   }
   
   /**
    * gets smoking status
    * @return smoker status
    */
   public String getSmoker()
   {
      return smoker;
   }
   
   /**
    * sets persons height
    * @param h height
    */
   public void setHeight(double h)
   {
      height = h;
   }
   
   /**
    * gets persons height
    * @return height
    */
   public double getHeight()
   {
      return height;
   }
   
   /**
    * sets persons weight
    * @param w weight
    */
   public void setWeight(double w)
   {
      weight = w;
   }
   
   /**
    * gets persons weight
    * @return weight
    */
   public double getWeight()
   {
      return weight;
   }
   
   /**
    * calcualtes BMI based on values set in the fields
    * @return the calcuated BMI
    */
   public static double calculateBMI()
   {
      return ((weight * 703) / (height * height));
   }
}