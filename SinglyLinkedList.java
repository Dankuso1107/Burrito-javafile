public class SinglyLinkedList<E> {
    //cur means the current thing your looking at
    Node<E> head;
    int size;

    public SinglyLinkedList() {
      this.head = null;
      size = 0;
    }

    public void add(E val){
        if (size ==0){
            head = new Node<E>(val);
            size ++;
            return;
        }
        Node<E> cur = head;
        while(cur.getNext() != null){
            cur = cur.getNext();
        }
        cur.setNext(new Node<E>(val));
        size++;
    }

    public E get(int ind){
        int count = 0;
        Node<E> cur = head;
        while (head != null) {
            if (count == ind) {
                return cur.getValue();
            }
            cur = cur.getNext();
            count ++;
        }
        return null;
    }

    public void set(int ind, E val){
        if (ind < 0 || ind >= size) {
            throw new IndexOutOfBoundsException("Index: " + ind + ", Size: " + size);
        }

        Node<E> cur = head;
        int count = 0;

        while (cur != null) {
            if (count == ind) {
                cur.setValue(val);
                return;
            }
            cur = cur.getNext();
            count++;
        }
    }


    public E remove(int ind){
        Node<E> n = this.head;
        E val;
        int j = 0;
        while(n != null){
            if(j == ind-1){
                val = n.getNext().getValue();
                n.setNext(n.getNext().getNext());
                size--;
                return val;
            }
            n = n.getNext();
            j++;
        }
        return null;
    }

    public int size(){
      return size;
    }

    public boolean contains(E val){
      return false;
    }

    public int indexOf(E val){
      return -1;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public String toString() {
        String result = "[";
        Node<E> cur = head;
        if (cur != null){
            while (cur.getNext() != null){
                result += cur.getValue() + ", ";
                cur = cur.getNext();
           }
        }else {
            result += "]";
            return result;
        }
        result += cur.getValue() + "]";
        return result;
    }


}