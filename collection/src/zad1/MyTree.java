package zad1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class MyTree implements Iterable<IElement> {
    private IElement root;

    public MyTree(IElement root) {
        this.root = root;
    }

    @Override
    public Iterator<IElement> iterator() {
        return new MyTreeIterator(root);
    }

    private static class MyTreeIterator implements Iterator<IElement> {
        private final List<IElement> nodes;
        private int index;
        
        public MyTreeIterator(IElement root) {
            this.nodes = new ArrayList<IElement>();
            this.index = 0;
            traverse(root);
        }

        private void traverse(IElement s) {
            nodes.add(s);
            for (Object o : s.getChildren()) {
                traverse((IElement)o);
            }
        }

        @Override
        public boolean hasNext() {
            return index < nodes.size();
        }

        @Override
        public IElement next() {
            if (!hasNext()) {
                throw new IndexOutOfBoundsException("Koniec iteracji");
            }
            return nodes.get(index++);
        }
    }
}
