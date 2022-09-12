import java.util.Scanner;

public class Project_Aaron_Tiger
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        String policyNumber;
        String providerName;
        String firstName;
        String lastName;
        int age;
        String smoker;
        double height;
        double weight;
        
        System.out.println("Please enter the Policy Number: ");
        policyNumber = userInput.nextLine();
        
        System.out.println("Please enter the Provider Name: ");
        providerName = userInput.nextLine();
        
        System.out.println("Please enter the Policyholder's First Name: ");
        firstName = userInput.nextLine();
        
        System.out.println("Please enter the Policyholder's Last Name: ");
        lastName = userInput.nextLine();
        
        System.out.println("Please enter the Policyholder's Age: ");
        age = userInput.nextInt();
        
        System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
        userInput.nextLine();
        smoker = userInput.nextLine();
        
        System.out.println("Please enter the Policyholder's Height (in inches): ");
        height = userInput.nextDouble();
        
        System.out.println("Please enter the Policyholder's Weight (in pounds): ");
        weight = userInput.nextDouble();
        
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smoker, height, weight);
        
        System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmoker());
        System.out.println("Policyholder's Height: " + policy.getHeight());
        System.out.println("Policyholder's Weight: " + policy.getWeight());
        System.out.printf("Policyholder's BMI: %.2f", policy.calculateBMI());
        System.out.printf("\nPolicy Price: $%.2f", policy.calculatePolicyPrice());
    }
}