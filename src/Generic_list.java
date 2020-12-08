import java.util.ArrayList;

public class Generic_list<TYPE> {
    public ArrayList<TYPE> list = new ArrayList<>();
    public void addInstance(TYPE ride){
        list.add(ride);
    }
    public void removeInstance(TYPE ride){
        list.remove(ride);
    }
    public void clearHistory(){
        list.removeAll(list);
    }
    public String[] toArray() {
        String[] array2 = list.toArray(new String[list.size()]);
        return array2;
    }

    public void print(){
        for (TYPE single:list) {
            System.out.println(single);
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
