public class IntVector implements IntList{
    private int[] vector = new int[20];
    private int counter=0;

    public IntVector() {

    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
       vector = vector;
    }

    public void addElement(int element) {
        if(counter < vector.length){
            vector[counter] = element;
        }else{
            int[] newList = new int[vector.length *2];
            for (int i = 0; i < vector.length; i++) {
                newList[i] = vector[i];
            }
            newList[counter] = element;
            vector = newList;
        }
        counter++;
    }


    public int getElement(int id) {
        if(id>vector.length){
            return -1;
        }

        return vector[id];
    }

}
