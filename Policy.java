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
   
   //no-arg constructor
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
   
   //arg constructor (pirate constructor?)
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
   public void setPolicyNumber(String p)
   {
      policyNumber = p;
   }
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public void setProviderName(String p)
   {
      providerName = p;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public void setFirstName(String f)
   {
      firstName = f;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public void setLastName(String l)
   {
      lastName = l;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public void setAge(int a)
   {
      age = a;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public void setSmoker(String s)
   {
      smoker = s;
   }
   
   public String getSmoker()
   {
      return smoker;
   }
   
   public void setHeight(double h)
   {
      height = h;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public void setWeight(double w)
   {
      weight = w;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   public double calculateBMI()
   {
      return ((weight * 703) / (height * height));
   }
   
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