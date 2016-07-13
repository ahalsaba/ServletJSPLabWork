/**
 * Created by ahalsaba on 7/13/2016.
 */
import java.util.*;
public class ListLike {
    public static class Sequence implements Iterable{
        ArrayList<Object> list = new ArrayList<Object>();

        public void add(Object o){list.add(o);}

        public Object get(int idx){return list.get(idx);}

        public int size(){return list.size();}

        public Iterator<Object> iterator(){
            return new SequenceIterator();
        }
        public class SequenceIterator implements Iterator{
            private int progress = 0;
            public void remove(){
                throw new UnsupportedOperationException();
            }
            public boolean hasNext(){return progress < size();}
            public Object next(){return get(progress++);}
        }

    }


    public static void main(String[] args){
        Sequence s = new Sequence();
        s.add("Hello");
        s.add("there");
        s.add("done");
        Iterator i1 = s.iterator();
        Iterator i2 = s.iterator();
        assert i1.hasNext();
        assert i1.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("there");
        assert i2.hasNext();
        assert i2.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("done");
        assert i1.hasNext() == false;
        assert i2.next().equals("there");
        assert i2.next().equals("done");
        assert i2.hasNext() == false;
        for (Object o : s){
            System.out.println("Hi");
        }
    }
}
