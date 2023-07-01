
    public class LinkedList<Type> {
        private LinkedListNode<Type> first;
        public LinkedList(){
            first = null;
        }
        public LinkedListNode<Type> getFirst(){
            return first;
        }
        public void appendAfter(Type posval, Type val) {
            if(first == null)
                first = new LinkedListNode<Type>(val, null);
            else {
                LinkedListNode<Type> cur = first;
                while(cur.getNext() != null && cur.getNext() != posval) {
                    cur = cur.getNext();
                }
                cur.setNext(new LinkedListNode<Type>(val,cur.getNext())); // if pos is not found, append to end.
            }
        }
        public void append(Type val) {
            this.appendAfter(null, val);
        }
        public LinkedListNode<Type> getNode(Type val){
            if(first == null)
                return null;
            else {
                LinkedListNode<Type> cur = first;
                while(cur.getNext() != null && cur.getValue() != val) {
                    cur = cur.getNext();
                }
                return cur;
            }
        }
    }
