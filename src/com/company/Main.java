package com.company;

public class Main {

    public static void main(String[] args) {
        printMap(generatorMap(9));
    }


    public static char[][] generatorMap(int x) {
        char[][] map = new char[x][x * 3];
        for(int i = 0; i < map.length; ++i) {
            for(int j = 0; j < map[i].length; ++j) {
                //System.out.print(map[i][j]);
                if((Math.random() * 10) > 9) { // сравнивает double и int
                    map[i][j] = '0';
                } else {
                    map[i][j] = '.';
                }
            }
            //System.out.println();
        }



        return map;
    }

    public static void printMap(char[][] map) {
        for (char[] chars : map) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}

