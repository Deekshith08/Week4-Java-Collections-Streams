import java.util.*;
class Patient implements Comparable<Patient>{
    String name;
    int severity;
    Patient(String name, int severity){
        this.name = name;
        this.severity = severity;
    }

    @Override
    public int compareTo(Patient other){
        return Integer.compare(other.severity, this.severity);
    }
    public int getSeverity() {
        return severity;
    }
    public String getName() {
        return name;
    }
}
public class HospitalTriage {
    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("Manoj", 3));
        pq.add(new Patient("Ram", 9));
        pq.add(new Patient("Jaat", 5));
        while(!pq.isEmpty()){
            Patient p = pq.poll();
            System.out.println(p.getName() + " - " + p.getSeverity());
        }
    }
}
