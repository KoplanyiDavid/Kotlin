package com.example.something

class Node(val value: Int) {
    var leftChild: Node? = null
    var rightChild: Node? = null

    fun traverse() {
        leftChild?.traverse()
        println(value)
        rightChild?.traverse()
    }
}

fun main() {
    val root = Node(1)

    root.leftChild = Node(2)

    val three = Node(3)
    three.leftChild = Node(4)
    three.rightChild = Node(5)
    root.rightChild = three

    //   1
    //  / \
    // 2   3
    //    / \
    //   4   5

    root.traverse()
}
