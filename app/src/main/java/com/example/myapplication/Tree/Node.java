package com.example.myapplication.Tree;

import java.util.ArrayList;
import java.util.List;

public class Node<E extends Comparable<E>> {

    E value; // Node value
    Node<E> parent; // Parent node
    Node<E> left, right; // Children nodes

    // Return a list of all leaves a node leads to
    public List<Node<E>> childrenLeaves() {
        List<Node<E>> rtn = new ArrayList<>();

        if (this.value == null) {
            rtn.add(this);
        } else {
            rtn.addAll(this.left.childrenLeaves());
            rtn.addAll(this.right.childrenLeaves());
        }

        return rtn;
    }

    public Node(E value) {
        this.value = value;
        this.parent = null;

        // Initialise children leaf nodes
        this.left = new Node<E>();
        this.right = new Node<E>();
        this.left.parent = this;
        this.right.parent = this;
    }

    // Leaf node
    public Node() {
        this.value = null;
    }
}