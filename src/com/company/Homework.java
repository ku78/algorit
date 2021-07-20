package com.company;

import org.testng.annotations.Test;

public class Homework {

    @Test
    public void findWay() {
        MyGraph graph = new MyGraph(10);
        graph.addEdge(0, 7);
        graph.addEdge(0, 4);
        graph.addEdge(0, 8);
        graph.addEdge(2, 1);
        graph.addEdge(2, 5);
        graph.addEdge(3, 3);
        graph.addEdge(3, 2);
        graph.addEdge(3, 6);
        graph.addEdge(4, 3);
        graph.addEdge(6, 2);
        graph.addEdge(6, 9);
        graph.addEdge(6, 1);

        BreadthFirstPath bfs = new BreadthFirstPath(graph, 0);
        assert bfs.hasPathTo(9);
        System.out.println("Кратчайший путь: "+ bfs.pathTo(9));
    }

}