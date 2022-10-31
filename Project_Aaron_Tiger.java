import java.util.Scanner;
import java.io.*; //PrintWriter, File, IOException
import java.util.ArrayList;

public class Project_Aaron_Tiger
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("PolicyInformation.txt");

        if(!file.exists())
        {
            System.out.print("Unable to open file");
            System.exit(0);
        }

        ArrayList<Policy> policy = new ArrayList<Policy>();
        ArrayList<PolicyHolder> policyHolder = new ArrayList<PolicyHolder>();

        Scanner inputFile = new Scanner(file); //open the file
        
        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smoker;
        double height;
        double weight;
        
        int numSmoker = 0;
        int numNonSmoker = 0;
        
        while (inputFile.hasNext())
        {
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();

            inputFile.nextLine(); //address buffer shenanigans

            smoker = inputFile.nextLine();   
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine(); //clear the new line
            }
            
            if (inputFile.hasNext())
            {
               inputFile.nextLine(); //skip blank line
            }
            
            if (smoker.equals("smoker"))
            {
               numSmoker++;
            } 
            else if (smoker.equals("non-smoker"))
            {
               numNonSmoker++;
            }
            
            //create a PolicyHolder object then add it to the policyHolder ArrayList
            PolicyHolder person = new PolicyHolder(firstName, lastName, age, smoker, height, weight);
            policyHolder.add(person);

            //create the Policy object second because it requires an existing PolicyHolder object, then add it to the policy ArrayList
            Policy pol = new Policy(policyNumber, providerName, person);
            policy.add(pol);
        }
        
        for (int i = 0; i < policy.size(); i++)
        {
            System.out.println(policy.get(i));
            System.out.println(policy.get(i).getPolicyHolder());
            System.out.printf("Policyholder's BMI: %.2f", policy.get(i).getPolicyHolder().calculateBMI());
            System.out.printf("\nPolicy Price: $%.2f", policy.get(i).getPolicyHolder().calculatePolicyPrice());
            System.out.println();  
        }
        System.out.println();
        System.out.println("There were " + Policy.numberOfPolicies + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + numSmoker);
        System.out.println("The number of policies with a non-smoker is: " + numNonSmoker);
        inputFile.close(); //close the file 
    }
}