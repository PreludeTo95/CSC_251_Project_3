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

        Scanner inputFile = new Scanner(file); //open the file
        
        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smoker = "";
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
            smoker = inputFile.nextLine();
            
            inputFile.nextLine(); //consume excess buffer so the double isnt read as a string
            
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
            
            policy.add(new Policy(policyNumber, providerName, firstName, lastName, age, smoker, height, weight));
        }
        
        for (int i = 0; i < policy.size(); i++)
        {
            System.out.println("\nPolicy Number: " + policy.get(i).getPolicyNumber());
            System.out.println("Provider Name: " + policy.get(i).getProviderName());
            System.out.println("Policyholder's First Name: " + policy.get(i).getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.get(i).getLastName());
            System.out.println("Policyholder's Age: " + policy.get(i).getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.get(i).getSmoker());
            System.out.println("Policyholder's Height: " + policy.get(i).getHeight());
            System.out.println("Policyholder's Weight: " + policy.get(i).getWeight());
            System.out.printf("Policyholder's BMI: %.2f", policy.get(i).calculateBMI());
            System.out.printf("\nPolicy Price: $%.2f", policy.get(i).calculatePolicyPrice());
            System.out.println();
            
            
        }
        System.out.println();
        System.out.println("The number of policies with a smoker is: " + numSmoker);
        System.out.println("The number of policies with a non-smoker is: " + numNonSmoker);
        inputFile.close(); //close the file 
    }
}