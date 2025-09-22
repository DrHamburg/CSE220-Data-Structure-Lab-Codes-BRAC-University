import java.util.Scanner;
public class WRMTester {
    public static void main(String[] args) {
        WRM wrm = new WRM();
        System.out.println("** Welcome to Waiting Room Management System **");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.print("1.registerPatient()\n2.servePatient()\n3.showAllPatient()\n4.canDoctorGoHome()\n5.cancelAll()\n6.reverseTheLine()\n7.exit\nSelect:\n");
            int s = sc.nextInt();
            switch(s){
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Blood Group: ");
                    String bloodgroup = sc.nextLine();
                    wrm.registerPatient(id, name, age, bloodgroup);
                    System.out.println("Success registering patient.\n");
                    break;
                case 2:
                    wrm.servePatient();
                    break;
                case 3:
                    wrm.showAllPatient();
                    break;
                case 4:
                    wrm.canDoctorGoHome();
                    if(wrm.canDoctorGoHome()){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No.");
                    }
                    break;
                case 5:
                    wrm.cancelAll();
                    break;
                case 6:
                    wrm.reverseTheLine();
                    System.out.println("The line is reversed now.\n");
                    break;
                case 7:
                    flag = false;
                    System.out.printf("Session End! Thank you.");
                    break;
                default:
                    System.out.print("Wrong command.\n");
                    System.out.print("1.registerPatient()\n2.servePatient()\n3.showAllPatient()\n4.canDoctorGoHome()\n5.cancelAll()\n6.reverseTheLine()\n7.exit\nSelect:\n");
            }
        }
    }
}
