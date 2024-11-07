import java.util.ArrayList;

public class Queue {
    private final ArrayList<Integer> List;

    public Queue() {
        List = new ArrayList<>();
    }

    public void dodaj(int element) throws Exception {
        if (List.size() >= element) {
            throw new Exception("Kolejka jest pełna. Nie można dodać elementu: " + element);
        }else{
            List.add(element);
        }
    }

    public int usun() throws Exception{
        if (List.isEmpty()) {
            throw new Exception("Kolejka jest pusta. Nie można usunąć elementu.");
        } else {
            return List.removeFirst();
        }
    }
}
