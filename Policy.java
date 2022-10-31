public class Policy
{
   private String policyNumber;
   private String providerName;
   
   /**
    * no-arg constructor
    */
   public Policy()
   {
      //policyNumber is a string because it should not be used in calculations
      policyNumber = "0000";
      providerName = "Unassigned";
   }
   
   /**
    * arguments constructor
    * @param policyNum policy number
    * @param provider insurance provider
    */
   public Policy(String policyNum, String provider)
   {
      policyNumber = policyNum;
      providerName = provider;
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
    * calculates the total price of the policy
    * @return policy price
    */
   public double calculatePolicyPrice()
   {
      double policyPrice = 600;
      double BMI = PolicyHolder.calculateBMI();
      //declaring BMI as a variable saves 1 method call
      
      if (PolicyHolder.age > 50)
      {
         policyPrice += 75;
      }
      
      if (PolicyHolder.smoker.equals("smoker"))
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