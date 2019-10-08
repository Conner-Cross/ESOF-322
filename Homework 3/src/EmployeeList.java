// -------------------------LinkedList Code-------------------------
// Our implementation of a LinkedList of type EmployeeRecord

public class EmployeeList {
    private EmployeeRecord head;

    public EmployeeList() {}

    public EmployeeList(EmployeeRecord head) {
        this.head = head;
    }

    public void add(EmployeeRecord e) {
        if (this.head == null){
            this.head = e;
        } else {
            EmployeeRecord temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }

            temp.setNext(e);
        }
    }

    public EmployeeRecord get(int i){
        int count = 0;
        EmployeeRecord e = head;

        while(count < i) {
            e = e.getNext();
            count++;
        }
        return e;
    }

    public EmployeeRecord remove(int i) {
        EmployeeRecord prev = this.get(i -1);
        EmployeeRecord removed = prev.getNext();
        prev.setNext(removed.getNext());

        return removed;
    }

}


class EmployeeRecord {
    private String name;
    private int salary;
    private String SSN;
    private EmployeeRecord next;

    public EmployeeRecord(String name, int salary, String SSN) {
        this.name = name;
        this.salary = salary;
        this.SSN = SSN;
    }

    public void setNext(EmployeeRecord e) {
        this.next = e;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getSSN() {
        return SSN;
    }

    public EmployeeRecord getNext() {
        return next;
    }
}

// -------------------------End LinkedList Code-------------------------