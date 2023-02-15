package main.kotlin.wednesday

class LaptopComparator: Comparator<Laptop> {
    override fun compare(o1: Laptop?, o2: Laptop?): Int {
        if (null == o1) {
            return -1
        }
        if (null == o2) {
            return 1
        }
        // If this equality case is not handled, 1st occurrence is overwritten
        if (o1.id == o2.id) {
            return o1.price.compareTo(o2.price)
        }
        return o1.id.compareTo(o2.id)
    }
}