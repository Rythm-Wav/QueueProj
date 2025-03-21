public class MyQueue extends Main {

    //Pointer to front and back of line
   public Node first, last;

   //pointer to node currently being looked at
   public Node current;


   public MyQueue(){
       first = null;
       last = null;
       current = first;
   }

   /* public boolean istempEmpty(){
        return first == null || last == null;
    }
*/

   //method to check if the line  is empty
    public boolean isEmpty(){
        return first == null && last == null;
    }

    //enqueue to add people to the back of the line
    public void enQueue(String Name){
       if(isEmpty()){
           last = new Node(Name, last);
           first = new Node(Name, first);

       }else {
           last = new Node(Name, last);
       }
    }


    //deque to remove people from the front of the line
    public void deQueue(){
        String output = first.getData();
        first = first.blink;
        first.flink = null;

    }

    public String getNext(String Name){
       if (first != null) {
           if (first.blink != null) {

               current = first.blink;

               return current.getData();
           }else{
               return "Next does not exist.";
           }

       }else{
           return "Queue is empty";

        }

    }

    public String getPrevious(String Name){
       current = last.flink;
       return current.data;
    }



    //In-class class...
    //instance variables
    public class Node {
        private String data;
        private Node flink;
        private Node blink;

        //constructors
        public Node(String Name, Node link){
            this.data = Name;
            this.flink = link;
            this.blink = link;
        }

        //getters & setters
        public String getData(){
            return data;
        }
        public Node flink(){
            return flink;
        }
        public Node blink(){
            return blink;
        }
        // toString
        public String toString()
        {

            return "data: " + data + " links forward to " + flink + "links backwards to " + blink;

        }

    }

}
