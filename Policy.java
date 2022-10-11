public class Policy
{
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smoker;
   private double height;
   private double weight;
   
   /**
    * no-arg constructor
    */
   public Policy()
   {
      //policyNumber is a string because it should not be used in calculations
      policyNumber = "0000";
      providerName = "Unassigned";
      firstName = "John";
      lastName = "Doe";
      age = 99;
      smoker = "non-smoker";
      height = 70;
      weight = 200;
   }
   
   /**
    * arguments constructor
    * @param policyNum policy number
    * @param provider insurance provider
    * @param fName first name
    * @param lName last name
    * @param howOld age of the person
    * @param smokerStatus whether or not the person smokes tobacco
    * @param howTall height of the person
    * @param howHeavy weight of the person
    */
   public Policy(String policyNum, String provider, String fName, String lName, int howOld, String smokerStatus, double howTall, double howHeavy)
   {
      policyNumber = policyNum;
      providerName = provider;
      firstName = fName;
      lastName = lName;
      age = howOld;
      smoker = smokerStatus;
      height = howTall;
      weight = howHeavy;
   }
   
   //getter and setter methods for every attribute

   /**
    * sets policy number
    * @param p policy number
    */
   public void setPolicyNumber(String p)
   {
      policyNumber = p;
   }
   
   /**
    * returns policy number
    * @return policy number
    */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
    * sets provider name
    * @param p provider name
    */
   public void setProviderName(String p)
   {
      providerName = p;
   }
   
   /**
    * returns provider name
    * @return provider name
    */
   public String getProviderName()
   {
      return providerName;
   }
   
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
   public double calculateBMI()
   {
      return ((weight * 703) / (height * height));
   }

   /**
    * calculates the total price of the policy
    * @return policy price
    */
   public double calculatePolicyPrice()
   {
      double policyPrice = 600;
      double BMI = calculateBMI();
      //declaring BMI as a variable saves 1 method call
      
      if (age > 50)
      {
         policyPrice += 75;
      }
      
      if (smoker.equals("smoker"))
      {
         policyPrice += 100;
      }
      
      if (BMI > 35)
      {
         policyPrice += ((BMI - 35) * 20);
      }
      
      return policyPrice;
   }
}