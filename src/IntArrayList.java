import java.util.ArrayList;
import java.util.List;

public class IntArrayList implements IntList{

    private int[] list = new int[10];
    private int counter=0;
    public IntArrayList() {

    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        list = list;
    }

    public void addElement(int element) {
        if(counter < list.length){
          list[counter] = element;
        }else{
            int[] newList = new int[(int) (list.length *1.5)];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            newList[counter] = element;
            list = newList;
        }
        counter++;
    }


    public int getElement(int id) {
        if(id>list.length){
            return -1;
        }

        return list[id];
    }
}
