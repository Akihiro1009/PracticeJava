public class Collection {
    Element start;
    Element current;

    public Collection(){
        this.start = null;
        this.current = null;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public String  getNext(){
        String data = current.getData();
        current = current.getNext();
        return data;
    }
    public void resetNext(){
        current = start;
    }

    public void addItem(String data) {
        Element newElement = new Element(data);
        if( isEmpty() ) {
            start = newElement;
            current = start;
        } else {
            resetNext();
            while(current.hasNext()){
                current = current.getNext();
            }
            current.setNext(newElement);
        }
    }



    public String toString()
    {	String output = "";
        this.resetNext();
        while( current != null )
        {	output = output + this.getNext() + " ";
        }
        return output;
    }
}
