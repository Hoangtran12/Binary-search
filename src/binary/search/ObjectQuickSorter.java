package binary.search;
public class ObjectQuickSorter {
    private final Comparable[] list;
        public ObjectQuickSorter(Comparable[] list) {
                this.list = list;
        }
        public Comparable[] sortElements() {
                for (int i = 0; i < this.list.length; i++) {
                        for (int y = 0; y < this.list.length; y++) {
                                if (this.list[i].toString().compareTo(this.list[y].toString()) < 0) {
                                        Comparable temp = this.list[i];
                                        this.list[i] = this.list[y];
                                        this.list[y] = temp;
                                }
                        }
                }
                return this.list;
        }
}