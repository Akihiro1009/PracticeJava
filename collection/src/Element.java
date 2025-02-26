public class Element {
    private String data;
    Element next;

    public Element(String data){
        this.data = data;
        this.next = null;
    }

    public boolean hasNext(){
        return this.next != null;
    }

    public Element getNext(){
        return this.next;
    }

    public String getData(){
        return this.data;
    }

    public void setNext(Element next){
        this.next = next;
    }

    public void setData(String data){
         this.data = data;
    }

    public String toString(){
        return this.data;
    }
}
