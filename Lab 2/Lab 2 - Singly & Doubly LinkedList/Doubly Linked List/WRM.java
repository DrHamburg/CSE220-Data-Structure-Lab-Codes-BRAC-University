public class WRM {
    Patient dh;
    public WRM() {
        dh = new Patient(null, null, null, null, null, null);
        dh.next = dh;
        dh.prev = dh;
    }

    public void registerPatient(int id, String name, int age, String bloodgroup) {
        Patient newPatient = new Patient(id, name, age, bloodgroup,null,null);
        if(dh.next==dh){
            dh.next = newPatient;
            dh.prev = newPatient;
            newPatient.next = dh;
            newPatient.prev = dh;
        }else{
            Patient temp = dh.next;
            while(temp.next != dh){
                temp = temp.next;
            }
            temp.next = newPatient;
            newPatient.prev = temp;
            newPatient.next = dh;
        }
    }

    public void servePatient() {
        if(dh.next == dh)System.out.println("No patient is in waiting room to serve.\n");
        System.out.printf("%s is served.\n",dh.next.name);
        dh.next = dh.next.next;
        dh.next.prev = dh;
    }

    public void showAllPatient() {
        if(dh.next == dh)System.out.println("No patient is in waiting room.\n");
        Patient temp = dh.next;
        while(temp!=dh){
            System.out.printf("%s\n",temp.name);
            temp = temp.next;
        }
    }

    public boolean canDoctorGoHome() {
        if(dh.next==dh)return true;
        else return false;
    }

    public void cancelAll() {
        if(dh.next == dh)System.out.println("No patient is in waiting room to cancel.\n");
        dh.next = dh;
        System.out.println("All appointments cancelled.\n");
    }


    public void reverseTheLine() {
        Patient current = dh.next;
        Patient temp = null;
        while (current != dh) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            dh.next = temp.prev;
            dh.prev = current;
        }
    }

}