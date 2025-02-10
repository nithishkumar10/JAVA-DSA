package com.nithish.recursion;

import java.util.ArrayList;

public class MazeProblems {
    public static void main(String[] args) {
//        System.out.println(pathways(4,4));
//        paths("", 3, 3);
//        System.out.println(pathsRetDiagonal("", 3, 3));
        boolean[][] maze = {
                {true, true, false},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(mazeRiverRet("", maze, 0, 0));
    }

    static int pathways(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = pathways(r - 1, c);
        int right = pathways(r, c - 1);
        return left + right;
    }
    static void paths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            paths(p + "Down", r - 1, c);
        }
        if(c > 1){
            paths(p + "Right", r, c - 1);
        }
    }
    static ArrayList<String> pathsRet(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1){
            list.addAll(pathsRet(p + "Down", r - 1, c));
        }
        if(c > 1){
            list.addAll(pathsRet(p + "Right", r, c - 1));
        }
        return list;
    }
    static ArrayList<String> pathsRetDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1 && c > 1){
            list.addAll(pathsRetDiagonal("D", r - 1, c - 1));
        }
        if(r > 1){
            list.addAll(pathsRetDiagonal(p + "V", r - 1, c));
        }
        if(c > 1){
            list.addAll(pathsRetDiagonal(p + "H", r, c - 1));
        }
        return list;
    }
    static void mazeRiver(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            mazeRiver(p + "V", maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            mazeRiver(p + "H", maze,  r, c + 1);

        }
    }
    static ArrayList<String> mazeRiverRet(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp;
        }
        ArrayList<String> list = new ArrayList<>();
        if(!maze[r][c]){
            return list;
        }
        if(r < maze.length - 1){
            list.addAll(mazeRiverRet(p + "V", maze, r + 1, c));
        }
        if(c < maze[0].length - 1){
            list.addAll(mazeRiverRet(p + "H", maze,  r, c + 1));

        }
        return list;
    }
}
