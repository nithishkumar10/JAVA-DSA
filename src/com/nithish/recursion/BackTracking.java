package com.nithish.recursion;

import java.util.Arrays;

public class BackTracking {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        backtrackPrintDiagonal("", maze, 0, 0, path, 1);
    }
    static void backtrack(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r < maze.length - 1){
            backtrack(p + "D", maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            backtrack(p + "R", maze,  r, c + 1);
        }
        if(r > 0){
            backtrack(p + "U", maze, r - 1, c);
        }
        if(c > 0){
            backtrack(p + "L", maze, r, c - 1);
        }
        maze[r][c] = true;
    }
    static void backtrackPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1){
            backtrackPrint(p + "D", maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            backtrackPrint(p + "R", maze,  r, c + 1, path, step + 1);
        }
        if(r > 0){
            backtrackPrint(p + "U", maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            backtrackPrint(p + "L", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
    static void backtrackPrintDiagonal(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        path[r][c] = step;
        if(r < maze.length - 1 && c < maze[0].length - 1){
            backtrackPrintDiagonal(p + "Diag", maze, r + 1, c + 1, path, step + 1);
        }
        if(r < maze.length - 1){
            backtrackPrintDiagonal(p + "D", maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            backtrackPrintDiagonal(p + "R", maze,  r, c + 1, path, step + 1);
        }
        if(r > 0){
            backtrackPrintDiagonal(p + "U", maze, r - 1, c, path, step + 1);
        }
        if(c > 0){
            backtrackPrintDiagonal(p + "L", maze, r, c - 1, path, step + 1);
        }
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
