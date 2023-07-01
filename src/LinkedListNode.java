
    public class LinkedListNode<Type> {
        private Type value;
        private LinkedListNode<Type> next;
        public LinkedListNode(Type value, LinkedListNode<Type> next) {
            this.value = value;
            this.next = next;
        }
        public Type getValue() {
            return value;
        }
        public void setValue(Type value) {
            this.value = value;
        }
        public LinkedListNode<Type> getNext(){
            return next;
        }
        public void setNext(LinkedListNode<Type> next){
            this.next = next;
        }
    }

