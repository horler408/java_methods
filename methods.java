static void displayAge() {
    int age;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the age: ");
    age = obj.nextInt();
        
    if(age <= 0) {
        try {
            throw new AgeException("Error Occured");
        }
        catch (AgeException err) {
            System.out.println("Exception raised " + err);
        }
    }else {
        System.out.println("Age entered is " + age);
    }
}
    
static void displayAssertionAge() {
    int age;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the age: ");
    age = obj.nextInt();
        
    assert(age > 0) && (age < 100);
    System.out.println("Age entered is " + age);
}
    
    static void sumEvenNums(int []arrayNums) {
        ArrayList<Integer> evenNums = new ArrayList<Integer>();
        int sum = 0;
        int i;
        
        for(i = 0; i < arrayNums.length; i++){
            if(i % 2 != 0) {
                evenNums.add(arrayNums[i]);
            }
        }
        //sum = sum + evenNums.get();
        //System.out.println(sum);
        System.out.println(evenNums);
    }
    
    static final List<Integer> nums = new ArrayList<Integer>() {{ }};
    static void sumEven(int[] ints) {
        int sum = 0;
        for(int i : ints) {
            if(i % 2 == 0){
                nums.add(ints[i]);
                sum += i;   
            }
        }
        //int total = sum(nums);
        System.out.println(sum);
    }
    
    static void wordLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Words: ");
        String temp = "";
        String output = "";
        while(input.hasNextLine()) {
            System.out.println("Enter Some other words: ");
            String read = input.nextLine();
            read = read.trim();
            
            temp += read +" ";
            if(read == null || read.isEmpty()) {
                break;
            }
        }
        for(String s : temp.split(" ")) {
            if(!s.isEmpty()) {
                output += Integer.toString(s.length()) +" ";
            }
        }
        System.out.println(output.trim());
    }
    
    static void maxValueIndex(int[] nums) {
        if(nums.length == 0) {
            return;
        }
        int max = nums[0];
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max){
                maxIndex = i;
                max = nums[i];
            }
        }
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("The index of maximum value is "+ maxIndex);
    }
    
    static void salaryPayroll() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the staff name:");
        String name = input.nextLine();
        System.out.println(("Enter the basic salary: "));
        double basicSalary = input.nextInt();
        double feedingAllowance, housingAllowance, medicalAllowance, 
                transportAllowance, totalAllowance,taxPayment, totalIncome, netIncome;
        feedingAllowance = 0.1* basicSalary;
        housingAllowance = 0.15* basicSalary;
        medicalAllowance = 0.05* basicSalary;
        transportAllowance = 0.1 * basicSalary;
        
        totalAllowance = feedingAllowance+housingAllowance+medicalAllowance+transportAllowance;
        
        totalIncome = basicSalary + totalAllowance;
        taxPayment = 0.05 * totalIncome;
        netIncome = totalIncome - taxPayment;
        
        System.out.println(name + "'s total salary is "+ netIncome);
    }   
     
    static void arrayInputLength() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        
        while(input.hasNextInt()) {
            int num = input.nextInt();
            nums.add(num);
        }
        System.out.println("The array length is " +nums.size());
    }
    
    static void arrayInputSum() {
        int sum = 0, arrayLength;   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        //To accept the length of the array as the user input
        arrayLength = input.nextInt(); 
        //To pass the length to the array declared below
        int array[] = new int[arrayLength];
       
        System.out.println("Enter all the numbers: ");
        // To loop through the array length
        for(int i = 0; i < arrayLength; i++) {
            // To accept the array of numbers from user
            array[i] = input.nextInt();
            // To sum up the arrays accepted
            sum += array[i];
        }
        // To print out the sum of the array
        System.out.println("The sum of the user inputs is: "+ sum);
    }  
    
    static void daysOfMonth() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any month to know the number of days: ");
        String month = input.nextLine().toLowerCase();
        switch(month) {
            case "september":
            case "april":
            case "june":
            case "november":System.out.println("This month has 30 days");
                break;
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":System.out.println("This month has 31 days");
                break;
            case "february":System.out.println("This month has 27 or 28 days");
                break;
            default: System.out.println("You have entered invalid month");
        }
    }
    
    static void secondsInMonth() {
        int days, hours, mins, seconds;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month to know the number of seconds: ");    
        String month = input.nextLine().toLowerCase();
        if(month.equals("january") || month.equals("march") || month.equals("may") || month.equals("july")
                || month.equals("august") || month.equals("october") || month.equals("december")){
            days = 31;hours = days * 24;mins = hours * 60;seconds = mins * 60;
            System.out.println(" the number of seconds in "+month+ " is " +seconds);
        }
        else if(month.equals("april") || month.equals("june") 
                || month.equals("september") || month.equals("november")) {
            days = 30;hours = days * 24;mins = hours * 60;seconds = mins * 60;
            System.out.println(" the number of seconds in "+month+ " is " +seconds);
        }
        else if(month.equals("february")) {
            days = 28;hours = days * 24;mins = hours * 60;seconds = mins * 60;
            System.out.println(" the number of seconds in "+month+ " is " +seconds);
        }
        else {
            System.out.println("You have entered invlid month");
        }
    }
    
    static void quadraticEquation(double a, double b, double c) {
        double x, y, numerator, denominator;
        if(a == 0) {
            System.out.println("Invalid input");
        }else {
            numerator = Math.sqrt((b * b) - (4*a*c));
            denominator = 2*a;
            x = -b + (numerator) / denominator;
            y = -b - (numerator) / denominator;;
            
            // To print out the result
            System.out.println("The roots are: " + x + " and " + y);
        }
    }
    
    static void isInt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check for integer:");
        
        double num = input.nextDouble();
        
        double absolute = Math.abs(num);
        double rounded = Math.floor(absolute);
        
 	if(absolute - rounded == 0){
            System.out.println("The value is an integer");
        }else {
            System.out.println("The value is not an integer");
        }
    }
    
    static void reverseText(String text) {
        String word = "";
	int lastText = text.length() - 1;
	while(lastText >= 0){
            //word += text[lastText];
            lastText--;
	}
        System.out.println(word);
    }
    
    static void wordCount(String[] words, String item) {
       int count = 0;
       // Looping through the array words
       for(int i = 0; i < words.length; i++){
           // Whenever item appears in array words, increase count by 1
            if (words[i].equalsIgnoreCase(item)){
		count += 1;
            }
        }
	System.out.println(item+ " appears " +count+ " times");; 
    }