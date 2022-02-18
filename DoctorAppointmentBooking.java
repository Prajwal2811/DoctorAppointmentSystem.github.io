import java.util.ArrayList;
import java.util.Scanner;


class DoctorAppointmentBooking{

    ArrayList<String> doctorName = new ArrayList<String>();
    ArrayList<String> doctorQualification = new ArrayList<String>();
    ArrayList<String> doctorGender = new ArrayList<String>();
    ArrayList<String> doctorPassword = new ArrayList<String>();
    ArrayList<Integer> doctorAge = new ArrayList<Integer>();
    ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
    ArrayList<String> doctorCity = new ArrayList<String>();

    ArrayList<Integer> patientAge = new ArrayList<Integer>();
    ArrayList<String> patientName = new ArrayList<String>();
    ArrayList<String> patientGender = new ArrayList<String>();
    ArrayList<String> patientPassword = new ArrayList<String>();
    ArrayList<String> patientConfirmPassword = new ArrayList<String>();
    ArrayList<Long> patientMobileNumber = new ArrayList<Long>();
    ArrayList<String> patientCity = new ArrayList<String>();
    


    ArrayList<String> patientNameBooking = new ArrayList<String>();
    ArrayList<Integer> patientAgeBooking = new ArrayList<Integer>();
    ArrayList<String> patientGenderBooking = new ArrayList<String>();
    ArrayList<Integer> doctorId = new ArrayList<Integer>();

    /*Add Doctor List Method  */
    void dataAdd() throws Exception{

		doctorName.add("Sumit Kanwar");
        doctorName.add("Abhihita Punnoose");
        doctorName.add("Vibhishan Kalpak");
        doctorName.add("Akhilesh Tarit");
        doctorName.add("Priyanka Varun");
        doctorName.add("Agrima Reema");
        doctorName.add("Tanay Konkar");
        doctorName.add("Aditi Sandipa");
		


        doctorQualification.add("MBBS,MD");
        doctorQualification.add("MBBS");
        doctorQualification.add("MBBS,MD");
        doctorQualification.add("MBBS");
        doctorQualification.add("MBBS,MD");
        doctorQualification.add("MBBS");
        doctorQualification.add("MBBS,MD");
        doctorQualification.add("MBBS");



        doctorGender.add("Male");
        doctorGender.add("Female");
        doctorGender.add("Male");
        doctorGender.add("Male");
        doctorGender.add("Female");
        doctorGender.add("Female");
        doctorGender.add("Male");
        doctorGender.add("Female");


        doctorPassword.add("Sumit123");
        doctorPassword.add("Abhihita123");
        doctorPassword.add("Vibhishan123");
        doctorPassword.add("Akhilesh123");
        doctorPassword.add("Priyanka123");
        doctorPassword.add("Agrima123");
        doctorPassword.add("Tanay123");
        doctorPassword.add("Aditi123");



        doctorAge.add(25);
        doctorAge.add(35);
        doctorAge.add(36);
        doctorAge.add(29);
        doctorAge.add(30);
        doctorAge.add(30);
        doctorAge.add(41);
        doctorAge.add(27);



		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);

    

        doctorCity.add("Nagpur");
        doctorCity.add("Gondia");
        doctorCity.add("Katol");
        doctorCity.add("Wardha");
        doctorCity.add("Chandrapur");
        doctorCity.add("Akola");
        doctorCity.add("Nagpur");
        doctorCity.add("Kolhapur");
}




    /* Admin Method */
    void admin() throws Exception {
		Scanner sc = new Scanner(System.in);
		byte choice;
		boolean flag=true;

		while(flag){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _______________________________");
			System.out.println("\t\t |                               |");
			System.out.println("\t\t |         Welcome Admin         |");
			System.out.println("\t\t |_______________________________|");
			System.out.print("\n\n1. Doctor list \t2. Registered Patients \t3. Pateints with Appointment \t4. Exit ");
            System.out.println("\nEnter Your Choice : ");
			choice=sc.nextByte();
			
            switch(choice){
			case 1:
				for(int i=0; i<=doctorName.size()-1; i++){
					System.out.println("Name of Doctor : " + "\t" + doctorName.get(i)+ "(" + doctorQualification.get(i) + ")");
				}

				int menuCHoice;
                int menuChoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextInt();
				if(menuCHoice==1){
					flag=false;
				} else {
					break;
				}
			break;

			case 2:
					if(patientName.isEmpty()){
						System.out.println("\n\nNo Registered Patients yet.");
						Thread.sleep(1000);
						break;
					} else {
						for(int i=0; i<=patientName.size()-1; i++){
							System.out.println(i+ ". " + patientName.get(i));
						}
                            System.out.println("\n\n1. Main menu\t 2. Previous menu");
                            menuChoice=sc.nextByte();
                                if(menuChoice==1){
                                    flag=false;
                                } else {
                                    break;
                                }
					}
					
				break;
				
			case 3:
				if(patientNameBooking.isEmpty()){
					System.out.println("\n\nNo Appointments yet.");
					Thread.sleep(1000);
					break;
				} else {
					for(int i=0; i<=patientNameBooking.size()-1; i++) {
						System.out.println(i+". "+patientNameBooking.get(i));
					}
                    System.out.println("\n\n1. Main menu\t 2. Previous menu");
                            menuChoice=sc.nextByte();
                                if(menuChoice==1){
                                    flag=false;
                                } else {
                                    break;
                                }
					Thread.sleep(1000);
					flag=false;
				}
			break;

            case 4:
                System.exit(0);
            
			default:
					System.out.println("Wrong choice");
					Thread.sleep(1000);
					flag=true;
			}
		}
	}


    /* Patient Method */
	void patient() throws Exception{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		int menuChoice;

		while(flag){
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Patient Page!|");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			System.out.println("1.Login \t 2.Registration");
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					if(patientMobileNumber.isEmpty()){
						System.out.println("First Register yourself then login..!");
						Thread.sleep(1000);
						break;
					} else {
						patientLogin();
						flag=false;
					}
					
				break;

				case 2:
					patientRegistration();
					flag=false;
					break;


				default:
					System.out.println("\nYou entered wrong choice. enter your choice again....!!!");
					flag= true;
					Thread.sleep(1000);
					break;
			}
            int menuCHoice;
				System.out.println("\n\n1. Main menu\t 2. Previous menu");
				menuCHoice=sc.nextInt();
				if(menuCHoice==1){
					flag=false;
				} else {
					break;
				}
		}
	}


    /* Patient Login  */
	void patientLogin()throws Exception
	{

		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		long mobileNumber;
		byte choice;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t  _________________________");
		System.out.println("\t\t |                         |");
		System.out.println("\t\t |         Login 		   |");
		System.out.println("\t\t |_________________________|");

		System.out.println("Enter your Username (mobile number)");
		mobileNumber=sc.nextLong();
		System.out.println("Enter your Password");
		String password=sc.next();
	
 		
 		boolean flag1=false;
 		int j;
		for(j=0; j<=patientMobileNumber.size()-1;j++)
		{
			
			if((patientMobileNumber.get(j)).equals(mobileNumber)&&(patientPassword.get(j)).equals(password))
			{
				flag1=true;

				break;
			}
			
		}
		if(flag1==true)
		{		
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
			System.out.println("\n Welcome "+patientName.get(j)+", to book appointment.");
			
			for(int i=0; i<=doctorName.size()-1; i++)
			{
				System.out.println((i+1)+". "+doctorName.get(i));
			}
            System.out.println("\n\nChoose your Doctor: ");
			choice=sc.nextByte();
			doctorId.add((int)choice);
			
			while(flag){
				Thread.sleep(1000);
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				System.out.println("\t\t  _________________________");
				System.out.println("\t\t |                         |");
				System.out.println("\t\t |     Book Appointment    |");
				System.out.println("\t\t |_________________________|");
				
				
				for(int i=0; i<=doctorName.size()-1;i++)
				{
					if(choice<=doctorName.size() && choice>0)
					{
						System.out.println("\n\nName: \t "+doctorName.get(choice-1)+"\n\t("+doctorQualification.get(choice-1)+")\nAge: \t "+doctorAge.get(choice-1)+"\nMobile:  "+doctorMobileNumber.get(choice-1)+"\nCity: \t "+doctorCity.get(choice-1));
						System.out.println("\nEnter your name: \t");
						sc.nextLine();
						patientNameBooking.add(sc.nextLine());
						System.out.println("Enter your age: \t");
						patientAgeBooking.add(sc.nextInt());
						System.out.println("Enter your gender: \t");
						patientGenderBooking.add(sc.next());

						System.out.println("\n Booking Successfull..");

						Thread.sleep(1000);
						flag=false;
						break;
					}
					else 
					{
						System.out.println("\n Enter correct input..");
						flag=true;
						Thread.sleep(1000);
					}
				
				}
			}	

		} else {
			System.out.println("Login unsuccessfull..");
			Thread.sleep(1000);
			flag=false;
		}
	}


    /* Patient Registration Method */
	void patientRegistration() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\n");
        System.out.println("\t\t  _______________________________________");
        System.out.println("\t\t |                                       |");
		System.out.println("\t\t | Welcome to Patient Registration Page! |");
        System.out.println("\t\t |_______________________________________|");
		System.out.println("\n");
		System.out.println("Please enter your name: ");
		patientName.add(sc.nextLine());
		System.out.println("Enter your age: ");
		patientAge.add(sc.nextInt());
		System.out.println("Please enter your Mobile number");
		mobileNumber=sc.nextLong();
		
        long mno;
		boolean flag=true, flag1=true;
		if(patientMobileNumber.isEmpty()){
			patientMobileNumber.add((mobileNumber));
			System.out.println("Enter password: ");
			patientPassword.add(sc.next());
			System.out.println("Registration is Successfull.");
			
			Thread.sleep(2000);
			flag1=false;
		}else {
			for(i=0;i<=patientMobileNumber.size()-1;i++){
				mno=patientMobileNumber.get(i);
				if(mno==mobileNumber){
					flag1=false;
					break;
				}
			}
			    if(flag1==true){
			    patientMobileNumber.add(mobileNumber);
			    System.out.println("Enter password");
                patientPassword.add(sc.next());
                System.out.println("Registration is Successfull.");
                Thread.sleep(1000);
                } else {
				System.out.println("Same mobile number is not allowed\n");
				Thread.sleep(1000);
			}
		}
	}
	 

	/* Doctor Login Method */
	void doctor() throws Exception{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		boolean flag=true;
		while(flag){
			Thread.sleep(1000);
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			System.out.println("\t\t  _________________________");
			System.out.println("\t\t |                         |");
			System.out.println("\t\t | Welcome to Doctor Page! |");
			System.out.println("\t\t |_________________________|");
			System.out.println(" ");
			

			System.out.println("1. Login \t 2. Registration \t 3. Exit  ");
			choice=sc.nextInt();

			switch(choice){
			case 1:
				if(doctorMobileNumber.isEmpty()){
					System.out.println("Register first...!");
					flag=false;
					Thread.sleep(2000);
					break;
				}else {
					doctorLogin();
					flag=false;
				}

			break;
            
			case 2:
				doctorRegistration();
				flag= false;
				break;

            case 3:
                System.exit(0);
            break;

        
			default:
				System.out.println("Entered Wrong choice..");
				flag=true;
			}
		}	

	}
	

    /* Doctor Ragistration Method */
	void doctorRegistration() throws Exception{
		Scanner sc=new Scanner(System.in);
		int i=0;
		long mobileNumber;
		boolean flag=true, flag1=true;
					
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

			System.out.println("\t\t ----------------------------------");
			System.out.println("\t\t| This is doctor registration Page |");
			System.out.println("\t\t ----------------------------------");
			System.out.println("\n");
			
			System.out.println("Please enter your name : ");
			doctorName.add(sc.nextLine());

			System.out.println("Please enter your Mobile number : ");
			mobileNumber=(sc.nextLong());
			
			long mno;

				if(doctorMobileNumber.isEmpty())
					{
						doctorMobileNumber.add((mobileNumber));
						System.out.println("Enter password : ");
							doctorPassword.add(sc.next());
							System.out.println("Registration is Successfull.");
							Thread.sleep(2000);
							flag1=false;
                    } else {
					for(i=0;i<=doctorMobileNumber.size()-1;i++){
						mno=doctorMobileNumber.get(i);
						if(mno==mobileNumber)
						{
							flag1=false;
							break;
						}
							
					}
					if(flag1==true){
						doctorMobileNumber.add(mobileNumber);
						System.out.println("Enter age:\t\t ");
						doctorAge.add(sc.nextInt());
						System.out.println("Enter City:\t\t ");
						doctorCity.add(sc.next());
						System.out.println("Enter password:\t\t ");
						doctorPassword.add(sc.next());
						System.out.println("Registration is Successfull.");
                        Thread.sleep(1000);
						// System.out.println("Details: Name: " + doctorName + "\n\t" +" number: "+ doctorMobileNumber);
						// Thread.sleep(10000);
	
                    int menuCHoice;
                                System.out.println("\n\n1. Previous menu\t 2.Exit ");
                                menuCHoice=sc.nextInt();
                                if(menuCHoice==1){
                                    flag=false;
                                    doctor();
                                } else {
                                    // break;
                                    System.exit(1);

                                } 
                            }else {
						System.out.println("Same mobile numebr is not allowed\n");
                        doctor();
						int index=doctorName.size()-1;
						doctorName.remove(index);
						Thread.sleep(1000);
                        
					}

				}
	}


    /* Doctor Login */
	void doctorLogin() throws Exception{
		Scanner sc=new Scanner(System.in);
		Long mobileNumber;
		Thread.sleep(1000);
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		System.out.println("\t\t ---------------------------------");
		System.out.println("\t\t|    This is doctor login page    |");
		System.out.println("\t\t ---------------------------------");
		System.out.println("Enter your Username (mobile number)");
		mobileNumber=sc.nextLong();
        
        // doctorMobileNumber.add(mobileNumber);
		System.out.println("Enter your Password");
        // doctorMobileNumber.add(mobileNumber);
		String password=sc.next();


		int i;
		byte choice;
 		boolean flag=false, flag11=true;
		for(i=0; i<=doctorMobileNumber.size()-1;i++){
			if((doctorMobileNumber.get(i)).equals(mobileNumber) && (doctorPassword.get(i)).equals(password)){
				flag=true;
                System.out.println("\n\tWelcome");
                Thread.sleep(1000);
            }
        	if(flag==true){
				while(flag11){
					new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					System.out.println("\t\t ----------------------------------------");
					System.out.println("\t\t|   Welcome Doctor "+doctorName.get(i) + "|");
					System.out.println("\t\t ----------------------------------------");
					System.out.println("\n\nPress 1 to see your Appointments. \n");
					choice=sc.nextByte();


					byte j=0;
					switch(choice){
					case 1:
						if((doctorId.isEmpty()!=true)){
							while(j<=doctorId.size()-1){
								if((i+1)== doctorId.get(j)){
									System.out.println("Patient name: " + patientNameBooking.get(j) );
									j++;
								}
							    }
							    Thread.sleep(1000);
						        } else {
								System.out.println("\n\nNo Appointments...!");
								Thread.sleep(1000);
								flag11=true;
							    }
                                // System.exit(0);
                                int menuCHoice;
                                System.out.println("\n\n1.Previous menu\t 2.Exit ");
                                menuCHoice=sc.nextInt();
                                if(menuCHoice==1){
                                    flag=false;
                                    doctor();
                                } 
						break;

					} 
                    
                    System.out.println("Login unsuccessfull..");
				    Thread.sleep(2000);
                    doctor();
				}
					
				}
                
			}
        }


		
/*
    void appointment() throws Exception{
        Scanner sc = new Scanner(System.in);


    }
*/



	/* Main Method */
	public static void main(String[] args) throws Exception {
		DoctorAppointmentBooking ap=new DoctorAppointmentBooking();
		Scanner sc = new Scanner(System.in);
		ap.dataAdd();
		boolean flag = true;
		
        try{
        while(flag=true)
		{
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
			System.out.println("---------------------------------------------------------------------");
			System.out.println("\t\t| Welcome to Doctor Appointment Booking |");
			System.out.println("---------------------------------------------------------------------\n\n");
				System.out.println("\n1. Doctor \t 2. Patient \t 3. Admin \t 4. Exit");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					ap.doctor();
					flag=true;
					break;
				
				case 2:
					ap.patient();										
					flag=true;
					break;
		
				case 3:			
					ap.admin();
					flag= true;
					Thread.sleep(1000);
					break;

                case 4:
                    System.exit(0);
				
				default:
                    System.out.println("Wrong Choice, Try Again.");
                    // Thread.sleep(1000);
		}	
    }
    }catch (Exception e){
        System.out.println(e);
    }
    System.exit(0);
	}
}
