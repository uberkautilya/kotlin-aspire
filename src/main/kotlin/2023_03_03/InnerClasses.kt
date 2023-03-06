package `2023_03_03`

fun main() {
    val listView = ListView(arrayOf("Name101", "Name102", "Name103"))
    listView.ListViewItem().displayItem(2)
}


class ListView(val items: Array<String>) {

    inner class ListViewItem() {

        fun displayItem(position: Int) {
            //Inner classes have access to properties of outer class
            println(items[position])
        }

    }
}