package com.algorithm.training.depth_first_search.pacific_atlantic_water_flow;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BestSolution2 {
    static int[][] moves = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; //위,아래,왼쪽,오른쪽
    public List<int[]> pacificAtlantic(int[][] matrix) {
        if(matrix.length == 0) return new ArrayList<>();
        boolean pacific[][] = new boolean[matrix.length][matrix[0].length];
        boolean atlantic[][] = new boolean[matrix.length][matrix[0].length];
        Queue<int[]> pacificQueue = new LinkedList<>();
        Queue<int[]> atlanticQueue = new LinkedList<>();
        for(int i = 0; i < matrix.length; i++) {
            pacific[i][0] = atlantic[i][matrix[0].length-1] = true;
            pacificQueue.add(new int[]{i,0});
            atlanticQueue.add(new int[]{i,matrix[0].length-1});
        }
        for(int i = 0; i < matrix[0].length; i++) {
            pacific[0][i] = pacific[matrix.length-1][i] = true;
            pacificQueue.add(new int[]{0,i});
            pacificQueue.add(new int[]{matrix.length-1, i});
        }
        bfs(matrix, pacific, pacificQueue);
        bfs(matrix, atlantic, atlanticQueue);
        List<int[]> canFlowToBoth = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(pacific[i][j] && atlantic[i][j]) canFlowToBoth.add(new int[]{i, j});
            }
        }
        return canFlowToBoth;
    }
    private void bfs(int[][] matrix, boolean[][] check, Queue<int[]> bfsQueue) {
        while(!bfsQueue.isEmpty()) {
            int point[] = bfsQueue.poll();
            for(int move[] : moves) {
                int nextX = point[0]+move[0];
                int nextY = point[1]+move[1];
                if(nextX >= 0 && nextX < matrix.length && nextY >= 0 && nextY < matrix[0].length 
                        && matrix[nextX][nextY] >= matrix[point[0]][point[1]] && !check[nextX][nextY]) {
                    check[nextX][nextY] = true;
                    bfsQueue.add(new int[]{nextX, nextY});
                }                
            }
        }
    }
    public static void main(String[] args) {
        BestSolution2 solution = new BestSolution2();
        List<int[]> points = solution.pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}});
        for(int[] point : points) {
            System.out.print("[" + point[0] + ", " + point[1] + "] ");
        }
        System.out.println();
        points = solution.pacificAtlantic(new int[][]{{1,1},{1,1},{1,1}});
        for(int[] point : points) {
            System.out.print("[" + point[0] + ", " + point[1] + "] ");
        }
        System.out.println();
        points = solution.pacificAtlantic(new int[][]{{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}});
        for(int[] point : points) {
            System.out.print("[" + point[0] + ", " + point[1] + "] ");
        }
        System.out.println();
        points = solution.pacificAtlantic(new int[][]{
            {11,3,2,4,14,6,13,18,1,4,12,2,4,1,16},
            {5,11,18,0,15,14,6,17,2,17,19,15,12,3,14},
            {10,2,5,13,11,11,13,19,11,17,14,18,14,3,11},
            {14,2,10,7,5,11,6,11,15,11,6,11,12,3,11},
            {13,1,16,15,8,2,16,10,9,9,10,14,7,15,13},
            {17,12,4,17,16,5,0,4,10,15,15,15,14,5,18},
            {9,13,18,4,14,6,7,8,5,5,6,16,13,7,2},
            {19,9,16,19,16,6,1,11,7,2,12,10,9,18,19},
            {19,5,19,10,7,18,6,10,7,12,14,8,4,11,16},
            {13,3,18,9,16,12,1,0,1,14,2,6,1,16,6},
            {14,1,12,16,7,15,9,19,14,4,16,6,11,15,7},
            {6,15,19,13,3,2,13,7,19,11,13,16,0,16,16},
            {1,5,9,7,12,9,2,18,6,12,1,8,1,10,19},
            {10,11,10,11,3,5,12,0,0,8,15,7,5,13,19},
            {8,1,17,18,3,6,8,15,0,9,8,8,12,5,18},
            {8,3,6,12,18,15,10,10,12,19,16,7,17,17,1},
            {12,13,6,4,12,18,18,9,4,9,13,11,5,3,14},
            {8,4,12,11,2,2,10,3,11,17,14,2,17,4,7},
            {8,0,14,0,13,17,11,0,16,13,15,17,4,8,3},
            {18,15,8,11,18,3,10,18,3,3,15,9,11,15,15}});
        for(int[] point : points) {
            System.out.print("[" + point[0] + ", " + point[1] + "] ");
        }
    }
}
