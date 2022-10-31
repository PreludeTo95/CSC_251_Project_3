public class Policy
{
   private String policyNumber;
   private String providerName;
   public static int numberOfPolicies = 0;
   
   /**
    * no-arg constructor
    */
   public Policy()
   {
      //policyNumber is a string because it should not be used in calculations
      policyNumber = "0000";
      providerName = "Unassigned";
      numberOfPolicies += 1;
   }
   
   /**
    * arguments constructor
    * @param policyNum policy number
    * @param provider insurance provider
    * @param numberOfPolicies the number of policy objects that have been created
    */
   public Policy(String policyNum, String provider)
   {
      policyNumber = policyNum;
      providerName = provider;
      numberOfPolicies += 1;
   }

   //overriding the default toString() method
   public String toString()
   {
      return 
      (
         "Policy number: " + policyNumber + 
         "\nProvider Name: " + providerName
      );
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
}